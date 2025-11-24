## Introducción

Este portfolio resume los conceptos fundamentales de los Arrays y Cadenas de caracteres, correspondiente al módulo de Programación 1º DAW. Su objetivo es ofrecer una visión completa sobre el uso de estructuras de datos estáticas, listas y cadenas en Python, incluyendo sus métodos principales, operaciones y ejemplos prácticos.  
---

# Portfolio: Arrays y Cadenas – 1º DAW

---

## **1\. Conceptos básicos de Arrays**

**Array**: Colección ordenada de elementos del mismo tipo, accesibles por un índice.  
**Índice**: Posición numérica (empieza en 0\) que permite acceder a los elementos.  
**Lista**: Estructura equivalente a los arrays tradicionales, pero más flexible (puede contener distintos tipos de datos).

Ejemplo:  
• array \= \[10, 20, 30, 40\]

---

## **2\. Declaración e Inicialización**

Python permite declarar listas vacías o con valores iniciales:  
**Lista vacía**: numeros \= \[ \]  
**Con valores iniciales**: numeros \= \[1, 2, 3, 4, 5\]  
**Inicialización rápida**: ceros \= \[0\] \* 5

---

## **3\. Acceso y modificación**

Los elementos se acceden o modifican usando índices:

**Primer elemento**: array\[0\]  
**Último elemento**: array\[-1\]  
**Modificar un valor**: array\[2\] \= 99

---

## **4\. Recorrido de Arrays**

Existen dos formas principales de recorrer un array:

**Por índice**:

for i in range(len(array)):  
print(array\[i\])

**Por elemento**:

for x in array:  
print(x)

---

## **5\. Métodos básicos de listas**

• **append(x)**: Añade un elemento al final    
Ejemplo: lista.append(5)

• **insert(i, x)**: Inserta x en la posición i    
Ejemplo: lista.insert(2, 'Hola')

• **remove(x)**: Elimina la primera ocurrencia de x    
Ejemplo: lista.remove('Hola')

• **pop(i)**: Elimina y devuelve el elemento en posición i (último si se omite)    
Ejemplo: lista.pop(0)

• **extend(Lista)**: Une otra lista    
Ejemplo:   
numeros \= \[1, 2, 3\]  
extra \= \[4, 5, 6\]  
numeros.extend(extra)

•**len(lista)**: Devuelve la longitud    
Ejemplo: len(lista)

• **lower()**: Convierte todos los caracteres en minuscula    
Ejemplo: texto \= "HOLA MUNDO"  
print(texto.lower())

---

## **6\. Operaciones con Arrays**

**División (Slice)**: Permite obtener una sublista.  
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

---

## **7\. Búsqueda de elementos**

**Búsqueda secuencial:** Recorre todos los elementos hasta encontrar el valor buscado.

for i in range(len(lista)):  
if lista\[i\] \== valor:  
return i

**Con operador** **index:**  
if 'Marta' in lista:  
print(lista.index('Marta'))

**Búsqueda binaria:** Solo funciona con listas ordenadas.

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

---

## **8\. Ordenación de Arrays**

Método sort(): Ordena la lista en su lugar.  
numeros \= \[4, 1, 7, 3\]  
numeros.sort()

Función sorted(): Crea una nueva lista ordenada sin modificar la original.  
ordenados \= sorted(numeros)

Se puede personalizar con parámetros:

palabras.sort(key=len) \# Por longitud

ordenados \= sorted(lista, key=str.lower) \# Ignora mayúsculas

---

## **9\. Comparación de Arrays**

Comparar listas permite verificar si son idénticas (misma longitud y elementos en el mismo orden).

**Manera basica**:  
a \= \[1, 2, 3\]  
b \= \[1, 2, 3\]  
print(a \== b) \# True

**Mediante longitud**:  
if len(lista1) \!= len(lista2):  
return False  
return True

**Mediante contenido**:  
(Aqui se recorre letra por letra ignorando las mayusculas o minusculas y centrandonos en el contenido)  
for i in range(len(lista1)):  
if lista1\[i\].lower() \!= lista2\[i\].lower():  
return False  
return True

---

## **10\. Copia de Arrays**

Copiar listas puede hacerse de varias formas:

**copy()**: nueva\_lista \= original.copy()

**Slicing:** nueva\_lista \= original\[:\]

**Manual:** mediante bucles for  
original \= \[123\]  
copia \= \[ \]  
for i in original:  
    copia.append(i)

---

## **11\. Expresiones Regulares (RegEx o Regexp)**

RegEx: El Lenguaje para Hablar con el Texto

* Las Expresiones Regulares son secuencias de caracteres que forman un patrón de búsqueda.  
* Son universales.  
* En Python, usamos el módulo re.

**Conceptos clave del módulo:**

**re.search(patrón, texto):** Busca el patrón en cualquier parte del texto.  
**re.findall(patrón, texto):** Encuentra todas las coincidencias y las devuelve como una lista.  
**re.match(patrón, texto):** Solo busca si el patrón está al inicio del texto.

---

## **12\. Patrones basicos (“comodines”)**

**Punto (.) :** Cualquier carácter (excepto salto de línea).  
Ejemplo:  
h.la busca "hola", "hela", "hila"...

**\\d (digito) :** Cualquier dígito (0-9)  
Ejemplo:  
\\d\\d busca "12", "05", "99"...

**\\w (palabra):** Cualquier carácter de palabra (letras, números, \_).  
Ejemplo:  
\\w\\w\\w busca "sol", "a1b", "pro"...

**\\s (espacio) :** Cualquier carácter de espacio en blanco (espacio, tabulador, etc.).  
Ejemplo:  
hola\\sadios busca "hola adios"

---

## **13\. Cuantificadores (Cuantas veces)**

**Cero o mas (\*):** Cero o mas veces el caracter anterior.  
Ejemplo: a\*b busca “ab”, “aab”, “aaab”...

**Uno o mas (+):** Uno o mas veces el caracter anterior   
Ejemplo: a+b busca “ab”, “aab”, “aaab”... (no busca ”b”)

**Cero o uno (?):** Cero o una vex el caracter anterior (opcional)  
Ejemplo: colo(u) busca “color” y “colour”

**Repeticion {n}:**  Exactamente n veces  
Ejemplo: \\d{4} busca un numero de 4 digitos

**Rango {n,m}:** Entre n y m veces (Minimo, maximo)  
Ejemplo: \\d{3,5} busca entre 3 y 5 digitos  
