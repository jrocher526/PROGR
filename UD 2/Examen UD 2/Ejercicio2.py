# Ejercicio 2

m = [
    [10, 20, 30],
    [40, 50, 60],
    [70, 80, 90]
]

# Creamos matruz vacia 3x3
t = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]

# Copiar todo lo de "m" a "t"  
for i in range(3):
    for x in range(3):
        if i == x:
            t[i][x] = m[i][x] # el elemento diagonal se queda igual
        else:
            t[i][x] = m[x][i] # transposicion normal

print("Matriz m transpuesta parcialmente:")
for f in t:
    print(f)


