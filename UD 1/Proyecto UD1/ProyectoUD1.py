def main():
    while True:
        mostrar_menu()

        try:
            option = int(input())
        except ValueError:
            print("Entrada invalida. Por favor ingrese un numero.")
            continue

        if option == 0:
            print("Has salido del menu.")
            break

        # CORRECCIÓN: decidir si pedir 1 o 2 números
        if option in [5, 11]:
            pedir_un_numero()
        else:
            pedir_numeros()

        if option == 1:
            realizar_suma()
        elif option == 2:
            realizar_resta()
        elif option == 3:
            realizar_multiplicacion()
        elif option == 4:
            realizar_division()
        elif option == 5:
            realizar_raiz_cuadrada()
        elif option == 6:
            mcd()
        elif option == 7:
            mcm()
        elif option == 8:
            calcular_area_triangulo()
        elif option == 9:
            calcular_area_circulo()
        elif option == 10:
            calcular_area_rectangulo()
        elif option == 11:
            calcular_primo()
        else:
            print("Opcion no valida.")

        # CORRECCIÓN para resultados
        if option not in [4, 5, 6, 7, 11]:
            print("El resultado es:", resultado)
