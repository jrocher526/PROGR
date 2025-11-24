import re

# Colores de letras
rojo = "\033[91m"
verde = "\033[92m"
reset = "\033[0m"

# matriz de inventario
inventario = [
    [1, "Iphone 15", 30],
    [2, "Redmi 14", 3],
    [3, "Motorla G14", 14],
    [5, "Realme 12", 76]
]

# funcion para buscar por id
def buscar_id():
    id = int(input("Ingrese el ID del producto a buscar: "))
    encontrado = False
    
    for producto in inventario:
        if producto[0] == id:
            
            print(f"Producto encontrado: {producto[1]}, Stock: {producto[2]}")
            encontrado = True
            break
        
    if not encontrado:
        print(f"{rojo}Error: Producto con ID {id} no encontrado.{reset}")

# funcion para comprar stock
def comparar_stock():
    if not inventario:
        print(f"{rojo}El inventario está vacío.{reset}")
        return
    
    producto_max = inventario[0]
    producto_min = inventario[0]
    
    for producto in inventario[1:]:
        
        if producto[2] > producto_max[2]:
            producto_max = producto
            
        if producto[2] < producto_min[2]:
            producto_min = producto
            
    print(f"Producto con stock mas alto: {producto_max[1]} ({producto_max[2]})")
    print(f"Producto con stock mas bajo: {producto_min[1]} ({producto_min[2]})")

# funcion para validacion de nombres
def validar_nombre():
    nombre = input("Ingrese el nombre del nuevo producto: ")
    
    errores = []
    
    if not re.match(r'^[A-Z]', nombre):
        errores.append("El nombre no empieza por mayuscula")
    
    if not re.search(r'\d', nombre):
        errores.append("El nombre no tiene ningun digito")
    
    if not (5 <= len(nombre) <= 20):
        errores.append("El nombre no llega a 5 caracteres")
    
    if errores:
        print(f"{rojo}Nombre invalido. Razones: {', '.join(errores)}{reset}")
    else:
        print(f"{verde}Nombre valido: {nombre}{reset}")
        
    inventario.append(nombre)

# menu 
def menu():
    while True:
        print("\n--- Sistema de Gestion de Productos ---")
        print("1. Buscar producto por ID")
        print("2. Comparar stock")
        print("3. Validar nombre de producto")
        print("4. Salir")
        
        opcion = input("Seleccione una opción: ")
        
        if opcion == "1":
            buscar_id()
        elif opcion == "2":
            comparar_stock()
        elif opcion == "3":
            validar_nombre()
        elif opcion == "4":
            print("Saliendo del programa...")
            break
        else:
            print(f"{rojo}Opción invalida. Intente nuevamente.{reset}")

# inicializar el menu
menu()