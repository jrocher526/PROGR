ciudades = ["Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao"]

# Tarea 1: Primer elemento
primera_ciudad = ciudades[0]
print(f"\n1. Primera ciudad: {primera_ciudad}")

# Tarea 2: Último elemento
ultima_ciudad = ciudades[-1]
print(f"2. Última ciudad: {ultima_ciudad}")

# Tarea 3: Modificar el elemento en el índice 3 ("Sevilla" -> "Málaga")
ciudades[3] = "Málaga"

# Tarea 4: Verificar la modificación
print(f"3. Nuevo valor en índice 3: {ciudades[3]}")
print(f"4. Lista actualizada: {ciudades}")
