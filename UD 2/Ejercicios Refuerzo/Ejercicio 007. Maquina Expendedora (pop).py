#Máquina Expendedora: Tienes una fila de snacks en un array.
#Usa la función de extracción para "servir" el último snack de la fila y luego imprime qué snack serviste.

snacks = ["Kinder Bueno", "Ferrero Rocher", "Tarta de queso", "Caramelo", "CocaCola"]

print("Bienvenido a la tienda de snacks.\n", snacks)

cliente = input("Que desea consumir:? (0 - 4)")

servido = snacks.pop(cliente)

print("Producto servido:", servido)

