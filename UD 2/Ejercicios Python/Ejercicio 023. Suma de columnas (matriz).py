p = [
    [5.0, 10.5],
    [8.2, 15.0],
    [1.5, 3.0]
]

# Suma con while 
print("Usando While:")

suma = 0
i = 0

while i < len(p):
    suma += p[i][1]
    i += 1

print("Suma:", suma)

# Suma con for 
print("\nUsando For:")

sumaf = 0

for fila in p:
    sumaf += fila[1]

print("Sumas:", sumaf)