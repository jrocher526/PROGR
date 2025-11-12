# Ejercicio 19: Comparación de arrays

# 1. Definición de listas
lista_a = [10, 20, 30]
lista_b = [10, 20, 30]
lista_c = [30, 20, 10]  # Mismos elementos, diferente orden
lista_d = [10, 20]      # Longitud diferente

# 2. Comparaciones directas
print("=== Comparación directa de listas ===")
print(f"A == B: {lista_a == lista_b}")  # True
print(f"A == C: {lista_a == lista_c}")  # False (el orden importa)
print(f"A == D: {lista_a == lista_d}")  # False (la longitud importa) 

# 3. Ampliación: función que retorna un valor booleano
def comparar_arrays(arr1, arr2):
    """Devuelve True si los arrays son exactamente iguales (mismo orden y valores)."""
    return arr1 == arr2

# 4. Pruebas de la función
print("\n=== Comparación usando la función ===")
print(f"Comparar A y B -> {comparar_arrays(lista_a, lista_b)}")  # True
print(f"Comparar A y C -> {comparar_arrays(lista_a, lista_c)}")  # False
print(f"Comparar A y D -> {comparar_arrays(lista_a, lista_d)}")  # False

# 5. Extra: comparación ignorando el orden (opcional)
def comparar_sin_orden(arr1, arr2):
    """Devuelve True si los arrays tienen los mismos elementos sin importar el orden."""
    return sorted(arr1) == sorted(arr2)

print("\n=== Comparación sin importar el orden ===")
print(f"A y C (mismos elementos distinto orden) -> {comparar_sin_orden(lista_a, lista_c)}")  # True