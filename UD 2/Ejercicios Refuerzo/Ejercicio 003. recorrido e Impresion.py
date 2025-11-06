precios = [12.50, 45.99, 5.00, 22.75, 10.00]

# Tarea 1: Recorrido Simple
print("\n--- 1. Recorrido Simple ---")
for precio in precios:
    print(f"Precio: {precio}€")

# Tarea 2: Recorrido con Índice (Usando enumerate)
print("\n--- 2. Recorrido con Índice ---")
for indice in range(len(precios)):
    print(f"El precio del Producto #{indice} es {precios[indice]}€")

# Tarea 3: Cálculo de la Suma
suma_total = 0
for precio in precios:
    suma_total = suma_total + precio # O de forma abreviada: suma_total += precio

print("\n--- 3. Cálculo de la Suma ---")
print(f"La suma total de todos los precios es: {suma_total:.2f}€")
