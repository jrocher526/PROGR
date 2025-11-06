#Clasificación de Pódium: Tienes los puestos [Oro, Bronce, Plata].
#Inserta el elemento 'Plata' en el índice 2 para corregir el orden a [Oro, Plata, Bronce].

puestos = ["oro", "bronce", "plata"]

puestos.remove("plata")

puestos.insert(1, "plata")

print(puestos)