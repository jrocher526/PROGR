# Ejercicio 1

inventario = [
    [101, 19.99, 34],
    [102, 5.00, 120],
    [103, 99.90, 5],
    [104, 12.75, 60],
    [105, 45.00, 18]
]

# Preguntamos al usuario
id_buscar = int(input("Introduce un ID de producto: "))

# Buscamos el id y mostramos la informacion
encontrado = False
for producto in inventario:
    if producto[0] == id_buscar:
        print(f"Precio: {producto[1]}, Stock: {producto[2]}")
        encontrado = True
        break

if not encontrado:
    print("ID no encontrado")

# Buscamos el producto mas carp
max_precio = inventario[0][1]
id_mas_caro = inventario[0][0]

for producto in inventario:
    if producto[1] > max_precio:
        max_precio = producto[1]
        id_mas_caro = producto[0]

print("El ID del producto más caro es:", id_mas_caro)

