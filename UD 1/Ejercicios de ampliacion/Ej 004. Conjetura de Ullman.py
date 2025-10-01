
n = int(input("Ingresa un número entero positivo mayor a 1: "))

contador = 0

# Bucle que se repite mientras n no sea 1
while n != 1:
    print(n)  # Mostrar el número actual
    
    if n % 2 == 0:
        n = n // 2
    else:         
        n = 3 * n + 1
    
    contador += 1  

# Mostrar el último número y la cantidad de pasos realizados
print(1)
print(f"Se alcanzó 1 en", contador, "pasos.")

