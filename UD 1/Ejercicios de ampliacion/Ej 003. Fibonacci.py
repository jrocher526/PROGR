# Leer el número de términos desde el teclado
n = int(input("Ingrese la cantidad de terminos de la serie de Fibonacci: "))

# Variables a utilizar
a, b = 0, 1

print("Serie de Fibonacci:")

for i in range(n):
    print(a, end=" ")
    # El siguiente término es la suma de los dos anteriores
    a, b = b, a + b
