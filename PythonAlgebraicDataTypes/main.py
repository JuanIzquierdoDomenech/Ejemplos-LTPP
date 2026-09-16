# https://github.com/jspahrsummers/adt

from adt import Case, adt  # Imports


# Marcamos la clase como ADT
@adt
class Colour:
    RGB: Case[int, int, int]
    CMYK: Case[float, float, float, float]

    # RGB Int Int Int | CMYK Float Float Float Float

    @property
    def rgb_components(self):
        return self.match(  # Pattern matching!!
            rgb=lambda r, g, b: (r, g, b), cmyk=lambda: None
        )

    @property
    def cmyk_components(self):
        return self.match(rgb=lambda: None, cmyk=lambda c, m, y, k: (c, m, y, k))

    @property
    def first_component(self):
        return self.match(rgb=lambda r, g, b: r, cmyk=lambda c, m, y, k: c)


if __name__ == "__main__":
    favColorRGB = Colour.RGB(20, 30, 40)
    print(favColorRGB)

    favColorCMYK = Colour.CMYK(20.2, 12.3, 44.2, 994.1)
    print(favColorCMYK)

    print(dir(favColorRGB))
    print(dir(favColorCMYK))

    print(favColorRGB.rgb_components)
    print(favColorCMYK.cmyk_components)

    print(favColorRGB.first_component)
