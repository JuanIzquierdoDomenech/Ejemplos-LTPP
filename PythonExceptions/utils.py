def calculateSqrt(a: int) -> float:
    import math

    if a < 0:
        raise ValueError(f"{a} debe ser > 0")

    return math.sqrt(a)
