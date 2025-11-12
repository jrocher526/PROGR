
n = int(input("Cuantos numeros desea ingresar:?"))

pares = []

# Bucle para que cuando llegue a 10 se detenga
for i in range(n):
    num = int(input("Ingresa un número: "))
    
    # Solo se agregan los numeros pares 
    pares += [num] * (num % 2 == 0)
    
    # Esto sirve para guardar solo los primeros 5 pares
    pares = pares[:5]

for p in pares:
    print(p)
