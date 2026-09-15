from utils.more_utils.my_module import MyClass
from utils.more_utils.my_module import (
    give_me_5 as gm5,  # No recomendable, en el lugar de uso, no sabemos de donde viene
)


class MyClass:
    def my_func(self):
        print("mi funcion en el main")


def main():
    a = MyClass()

    a.my_func()  # __main__ o my_module?

    print(gm5())

    ### ----------------------------------- Solucion 1, utilizar el FQN
    # import utils.more_utils.my_module

    # a = utils.more_utils.my_module.MyClass()
    # a.my_func()

    ### ----------------------------------- Solucion 2, usar un alias
    # from utils.more_utils.my_module import MyClass as ClassAlias

    # a = ClassAlias()
    # a.my_func()


if __name__ == "__main__":
    main()
