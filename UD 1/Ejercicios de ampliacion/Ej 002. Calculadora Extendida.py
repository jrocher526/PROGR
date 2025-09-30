# Aplicamos funcion

def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    if b == 0:
        return "Error: division entre 0"
    return a / b

def mcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def pedir_numeros():
    n1 = float(input("ingresa primer numero:"))
    n2 = float(input("ingresa segundo numero:"))
    return n1, n2

def menu():
    print("-------------------------------------------------")
    print("=== Calculadora extendida ===")
    print("1. Suma")
    print("2. Resta")
    print("3. Multiplicacion")
    print("4. Division")
    print("5. MCD")
    print("-------------------------------------------------")

if main():
    while True:
        menu()
        opcion = input("Ingresar el numero de operacion:")

        if opcion == "6":
            print("Haz salido del programa, hasta luego")
            break

        if opcion in ["1", "2", "3", "4", "5"]:
            n1. n2 = pedir_numeros()

        if opcion == "1":
            print("La suma es:", sumar(n1, n2))

        elif opcion == "2":
            print("La resta es:", restar(n1, n2))

        elif opcion == "3":
            print("La multiplicacion es:", multiplicar(n1, n2))

        elif opcion == "4":
            print("La division es:", dividir(n1, n2))

        elif opcion == "5":
            print("El MCD es:", mcd(int(n1), int(n2)))

        else:
            print("Opcio invalida, intenta nuevamente")

if __name__ == "__main__":
    main()

