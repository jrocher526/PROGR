inventario = ["Manzanas", "Peras", "Naranjas", "Platanos", "Uvas"]
print("Inventario:", inventario)

inventario.remove("Peras") # Elimina la Pera

eliminado = inventario.pop(3) # Elimina las uvas y las guarda

del inventario[1] # Elimina la naranja

print("Inventario Actualizado:", inventario)
print("fruta eliminada:", eliminado)
