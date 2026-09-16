import sys
from io import UnsupportedOperation

import utils


def example_1():
    x = int(input("Introduce un valor numérico: "))
    if x < 0:
        raise Exception("El valor ha de ser mayor a 0")  # Excepción genérica


def example_2():
    a = 0
    b = 0
    c = 0
    try:
        a = utils.calculateSqrt(9)
        b = utils.calculateSqrt(18)
        c = utils.calculateSqrt(-1)  # RAISE!
    except ValueError as err:
        print(f"No se ha podido calcular... {err}")
        print(type(err))
        print(err.args[0])
        print(sys.exc_info())
        print(sys.exc_info()[2].tb_frame)
    else:
        print(f"El valor del sqrt es {a}")
        print(f"El valor del sqrt es {b}")
        print(f"El valor del sqrt es {c}")


def example_3():
    a = 0
    try:
        # with open("some_fail.txt") as f:  # RAISE
        with open("some_file.txt") as f:  # OK
            data = f.read()
            print(f"Contenido del fichero:\n{data}")
        a = utils.calculateSqrt(-4)  # RAISE
    except FileNotFoundError as err:
        print(err)
    except ValueError as err:
        print(f"No se pudo calcular: {err}")
    else:
        print(f"El valor del sqrt es {a}")


def example_4():  # Igual que example_3()
    try:
        with open("some_file.txt") as f:
            data = f.read()
            print(f"Contenido del fichero: {data}")
        utils.calculateSqrt(-4)
    except (FileNotFoundError, ValueError) as err:
        print(f"Error de acceso a fichero o de valor: {err}")


def example_5():
    try:
        with open("some_file.txt") as f:
            data = f.read()
            print(f"Contenido del fichero: {data}")
        utils.calculateSqrt(34)
    except (FileNotFoundError, ValueError) as err:
        print(f"Error de acceso a fichero o de valor: {err}")
    else:
        print("Todo ha ido bien")  # OK


def example_6():
    try:
        raise TabError(
            "Error de indentación imaginario"
        )  # TabError DERIVA de SyntaxError
    except SyntaxError as se:
        print(f"Ha habido un error de sintaxis: {se}")
    except:
        print("No se ejecuta, excepción capturada y manejada")


def example_7():
    try:
        f = open("some_file.txt", "r")  # Abriendo modo LECTURA
        try:
            f.write("1... 2... 3... caramba!!")
            ###
        except UnsupportedOperation as exc:
            info = sys.exc_info()
            print(f"Error escribiendo en el fichero: {exc}")
            print(f"Info: {info}")
        finally:
            print("Cerrando fichero")
            f.close()  # Cierre 'tradicional' en finally (RAII)

    except IOError as exc:  # Si el fichero no existe...
        print(f"Error abriendo fichero: {exc}")


def example_7_v2():
    try:
        with open(
            "some_file.txt", "r"
        ) as f:  # Auto-cierre si ocurre una excepción con with
            f.write("1... 2... 3... caramba!!")

    except (UnsupportedOperation, IOError) as exc:
        print(f"Error: {exc}")
