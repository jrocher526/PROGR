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

def main():
    while True:
        menu()
        opcion = input("Ingresar el número de operación: ")

        if opcion == "6":   
            print("Has salido del programa. ¡Hasta luego!")
            break

        if opcion in ["1", "2", "3", "4", "5"]:
            n1, n2 = pedir_numeros()
            modo_resultado = (input("Deseas redondear el resultado (r) o mostrar con desimales (d)"))
            
            if modo_resultado == "d":
                num_decimales = int(input("Cuantos decimales desea mostrar"))
            
            match opcion:
                case "1":
                    resultado = sumar(n1, n2)
                case "2":
                    resultado = restar(n1, n2)
                case "3":
                    resultado = multiplicar(n1, n2)
                case "4":
                    resultado = dividir(n1, n2)
                case "5":
                    resultado = mcd(int(n1), int(n2))

            if modo_resultado == "r":
                resultado = round(resultado)
            elif modo_resultado == "d":
                resultado = round(resultado, num_decimales)
            else:
                print ("opcion incorrecta")

            print ("El resultado es:", resultado)

        else:
            print("Opción inválida, intenta nuevamente.")

if __name__ == "__main__":
    main()
