a = ["H", "O", "L", "A"]
b = ["h", "o", "j", "a"]
c = ["H", "o", "L", "A"]
d = ["C", "h", "a"]

def compararTamano(lista1, lista2):
    # Comprobamos que se tengan el mismo tamaño
    if len(lista1) != len(lista2):
        return False
    return True
    

def compararContenido(lista1, lista2):
    for i in range(len(lista1)):   # Recorremos letra a letra
        if lista1[i].lower() != lista2[i].lower():    # Convertimos en minuscualas para comprobar
            return False
    return True



print("Comprobar contenido:")
print("A y B:", compararContenido(a, b))
print("A y C:", compararContenido(a, c))
print("B y C:", compararContenido(b, c))
print("A y D:", compararContenido(a, d))


print("\nComprobar tamaño:")
print("A y B:", compararTamano(a, b))
print("A y C:", compararTamano(a, c))
print("B y C:", compararTamano(b, c))
print("A y D:", compararTamano(a, d))





