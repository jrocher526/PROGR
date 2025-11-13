## Introducción

## Este portfolio resume los conceptos fundamentales de los Arrays y Cadenas de caracteres, correspondiente al módulo de Programación 1º DAW. Su objetivo es ofrecer una visión completa sobre el uso de estructuras de datos estáticas, listas y cadenas en Python, incluyendo sus métodos principales, operaciones y ejemplos prácticos.

---

# Portfolio: Arrays y Cadenas – 1º DAW

### 1\. Conceptos básicos de Arrays

**Array**: Colección ordenada de elementos del mismo tipo, accesibles por un índice.  
**Índice**: Posición numérica (empieza en 0\) que permite acceder a los elementos.  
**Lista en Python**: Estructura equivalente a los arrays tradicionales, pero más flexible (puede contener distintos tipos de datos).  
**Ejemplo**:  
    • array \= \[10, 20, 30, 40\]

### 2\. Declaración e Inicialización

Python permite declarar listas vacías o con valores iniciales:  
Lista **vacía**: numeros \= \[ \]  
Con valores **iniciales**: numeros \= \[1, 2, 3, 4, 5\]  
Inicialización **rápida**: ceros \= \[0\] \* 5

### 3\. Acceso y modificación

Los elementos se acceden o modifican usando índices:  
Primer elemento: array\[0\]  
Último elemento: array\[-1\]  
Modificar un valor: array\[2\] \= 99

### 4\. Recorrido de Arrays

Existen dos formas principales de recorrer un array:  
**Por índice:**  
for i in range(len(array)):  
    print(array\[i\])

**Por elemento:**  
for elemento in array:  
    print(elemento)

### 5\. Métodos básicos de listas

    • **append**(x): Añade un elemento al final  
Ejemplo: lista.append(5)

    • **insert**(i, x): Inserta x en la posición i  
Ejemplo: lista.insert(2, 'Hola')

    • **remove**(x): Elimina la primera ocurrencia de x  
Ejemplo: lista.remove('Hola')

    • **pop**(i): Elimina y devuelve el elemento en posición i (último si se omite)  
Ejemplo: lista.pop(0)

    • **extend**(l2): Une otra lista  
Ejemplo: lista.extend(\[6,7,8\])

    • **len**(lista): Devuelve la longitud  
Ejemplo: len(lista)

    • **lower**(): Convierte todos los caracteres en minuscula  
Ejemplo: texto \= "HOLA MUNDO"  
    print(texto.**lower**())  

### 6\. Operaciones con Arrays

**División** (Slice): Permite obtener una sublista.  
sublista= lista\[inicio:fin:paso\]

Ejemplo:  
nombres \= \['Ana', 'Luis', 'Marta', 'Juan'\]  
print(nombres\[1:3\])  
\# \['Luis', 'Marta'\]

**Unión y adición:**  
alumnos \= \['Ana', 'Luis'\]  
alumnos.**append**('Marta')

otros \= \['Juan', 'Sara'\]  
alumnos.**extend**(otros)

**Eliminación y extracción:**  
frutas \= \['Manzana', 'Plátano', 'Cereza'\]

frutas.**remove**('Plátano')  
ultimo \= frutas.**pop**()

### 7\. Búsqueda de elementos

**Búsqueda secuencial**: Recorre todos los elementos hasta encontrar el valor buscado.

for i in range(**len**(lista)):  
    if lista\[i\] **\==** valor:  
        return i

**Con operadores de Python**:  
if 'Marta' in lista:  
    print(lista.**index**('Marta'))

**Búsqueda binaria:** Solo funciona con **listas ordenadas**.

def busqueda\_binaria(lista, objetivo):  
    inicio, fin \= 0, len(lista) \- 1  
    while inicio \<= fin:  
        medio \= (inicio \+ fin) // 2  
        if lista\[medio\] \== objetivo:  
            return medio  
        elif lista\[medio\] \< objetivo:  
            inicio \= medio \+ 1  
        else:  
            fin \= medio \- 1  
    return \-1

### 8\. Ordenación de Arrays

**Método sort():** Ordena la lista en su lugar.  
numeros \= \[4, 1, 7, 3\]  
numeros.**sort**()

**Función sorted():** Crea una nueva lista ordenada sin modificar la original.  
ordenados \= **sorted**(numeros)

Se puede personalizar con parámetros:

palabras.**sort(key=len)**  \# Por longitud

ordenados \= **sorted**(lista, **key=str.lower**)  \# Ignora mayúsculas

### 9\. Comparación de Arrays

Comparar listas permite verificar si son idénticas (misma longitud y elementos en el mismo orden).

**Manera basica:**  
a \= \[1, 2, 3\]  
b \= \[1, 2, 3\]  
print(a **\==** b)  \# True

**Mediante longitud:**  
if **len**(lista1) \!= **len**(lista2):  
        return False  
    return True

**Mediante contenido:**  
**(Aqui se recorre letra por letra ignorando las mayusculas o minusculas y centrandonos en el contenido)**  
for i in range(**len**(lista1)):    
        if lista1\[i\].**lower**() \!= lista2\[i\].**lower**():      
            return False  
    return True

### 10\. Copia de Arrays

Copiar listas puede hacerse de varias formas:

**copy():** nueva\_lista \= original.copy()  
**Slicing:** nueva\_lista \= original\[:\]  
**Manual:** mediante bucles for  
copia \= \[ \]  
for i in original:  
    copia3.**append**(i)