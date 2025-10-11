# Creamos funcion
def contar_y_reemplazar_vocales(cadena):
    vocales = "aeiouAEIOU"
    contador = 0
    nueva_cadena = ""

    for letra in cadena:
        if letra in vocales:
            contador += 1
            nueva_cadena += "X"
        else:
            nueva_cadena += letra

    return contador, nueva_cadena

# Programa principal
def main():
    texto = input("Introduce una cadena de texto: ")
    num_vocales, texto_modificado = contar_y_reemplazar_vocales(texto)
    print(f"Número de vocales: {num_vocales}")
    print(f"Cadena modificada: {texto_modificado}")

main()
