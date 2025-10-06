
# Declaramos las funciones a utilizar
def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    if b == 0:
        return "Error: división entre 0"
    return a / b

def mcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def pedir_numeros():
    n1 = float(input("Ingresa primer número: "))
    n2 = float(input("Ingresa segundo número: "))
    return n1, n2

# Funcion para mostrar el menu
def menu():
    print("-------------------------------------------------")
    print("=== Calculadora extendida ===")
    print("1. Suma")
    print("2. Resta")
    print("3. Multiplicación")
    print("4. División")
    print("5. MCD")
    print("6. Salir")
    print("-------------------------------------------------")

# Funcion para mostrar el menu siempre que el usuario no salga del programa
def main():
    while True:
        menu()
        opcion = input("Ingresar el número de operación: ")

        if opcion == "6":
            print("Has salido del programa. ¡Hasta luego!")
            break

        if opcion in ["1", "2", "3", "4", "5"]:
            n1, n2 = pedir_numeros()

            match opcion:
                case "1":
                    print("La suma es:", sumar(n1, n2))
                case "2":
                    print("La resta es:", restar(n1, n2))
                case "3":
                    print("La multiplicación es:", multiplicar(n1, n2))
                case "4":
                    print("La división es:", dividir(n1, n2))
                case "5":
                    print("El MCD es:", mcd(int(n1), int(n2)))
        else:
            print("Opción inválida, intenta nuevamente.")

if __name__ == "__main__":
    main()
