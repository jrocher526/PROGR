texto = "El Python es un lenguaje de programación muy popular. Python se usa en ciencia de datos y desarrollo web."

#Convertimos todo el texto en minuscculas
texto_minus = texto.lower()

#Separamos el texto en palabras
palabras = texto_minus.split()
print(palabras)
#contamos cuantas palabras "python" hay en el texto
conteo = 0

# for para recorrer cada paralaba
for p in palabras:
    # quitamos todos los sifnos para evitar errores
    palabra_limpia = p.strip(".,")
    # Comparar con "python"
    if palabra_limpia == "python":
        conteo += 1

print("La palabra 'Python' aparece:", conteo, "veces")

#convertimos texto en mayuscula
texto_mayus = texto.upper()

# separar las palabras
lista_palabras = texto_mayus.split()

# ponemos la lista revertida
lista_invertida = list(reversed(lista_palabras))

#unimos para formar un texto 
invertido = " ".join(lista_invertida)

# Mostrar resultado
print("Texto en mayúsculas y palabras invertidas:")
print(invertido)
