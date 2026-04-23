# PORTFOLIO – UD 8: TAD Y COLECCIONES

---

1. ### INTRODUCCIÓN A LOS TAD

Los Tipos Abstractos de Datos (TAD) son modelos que permiten representar estructuras de datos más complejas que los tipos primitivos.

Un TAD define:

* Qué datos almacena  
* Qué operaciones se pueden realizar  
* Cómo se comporta

Lo importante de un TAD no es su implementación interna, sino su funcionalidad.

Ejemplos de TAD:

* Pila  
* Cola  
* Lista  
* Conjunto  
* Diccionario

---

Evolución de los tipos de datos

La evolución en programación ha sido la siguiente:

1. Tipos primitivos  
* int  
* double  
* char  
* boolean  
    
2. Objetos y wrappers  
* Integer  
* Double  
* String  
    
3. Clases propias  
* Persona  
* Alumno  
* Libro  
    
4. Tipos Abstractos de Datos (TAD)  
* Set  
* List  
* Map

---

2. ### CARACTERÍSTICAS DE LOS TAD

Un TAD se caracteriza por:

* Estar definido mediante una interfaz  
* Tener una o varias implementaciones  
* Combinar datos y operaciones

Ejemplo en Java:

List\<String\> nombres \= new ArrayList\<\>();

En este caso:

* List es el TAD  
* ArrayList es la implementación

---

3. ### COLECCIONES

Las colecciones son estructuras diseñadas para almacenar grupos de objetos.

En Java forman parte del Java Collection Framework (JCF) y se importan mediante:

import java.util.\*;

Las principales interfaces son:

* Collection  
* Set  
* List  
* Map

---

4. ### INTERFAZ COLLECTION

Es la interfaz base de la mayoría de las colecciones.

Métodos principales:

* add() \- Añadir   
* remove() \- Eliminar  
* contains() \- Comprobar si un elemento existe  
* size() \- Cuenta un numero de elementos  
* isEmpty() \- Comprueba si la coleccion esta vacia  
* clear() \- Vaciar la coleccion completamente  
* iterator() \- recorrer la colección elemento por elemento

Ejemplo:

Collection\<String\> datos \= new ArrayList\<\>();

datos.add("Juan");  
 datos.add("Ana");

System.out.println(datos.size());

Salida:  
 2

---

5. ### INTERFAZ SET

Un Set representa un conjunto de elementos.

Su característica principal es que no permite elementos duplicados.

Ejemplo:

Set\<String\> alumnos \= new HashSet\<\>();

alumnos.add("Juan");  
 alumnos.add("Ana");  
 alumnos.add("Juan");

System.out.println(alumnos);

Resultado:  
 \[Juan, Ana\]

---

6. ### HASHSET

Es la implementación más utilizada de Set.

Características:

* No mantiene el orden  
* Acceso muy rápido  
* Permite null  
* No admite duplicados

Ejemplo:

Set\<String\> nombres \= new HashSet\<\>();

nombres.add("Pedro");  
 nombres.add("Lucía");  
 nombres.add("Pedro");

---

Cuándo usar HashSet:

* Cuando quieres evitar elementos repetidos  
* Cuando necesitas rapidez  
* Cuando el orden no es importante

---

7. ### LINKEDHASHSET

Funciona igual que HashSet, pero mantiene el orden de inserción.

Ejemplo:

Set\<String\> lista \= new LinkedHashSet\<\>();

lista.add("Carlos");  
 lista.add("Ana");  
 lista.add("Luis");

System.out.println(lista);

Salida:  
 \[Carlos, Ana, Luis\]

---

8. ### TREESET

Guarda los elementos ordenados automáticamente.

Características:

* Orden natural (alfabético o numérico)  
* No admite duplicados  
* No permite null  
* Más lento que HashSet

Ejemplo:

TreeSet\<Integer\> numeros \= new TreeSet\<\>();

numeros.add(5);  
 numeros.add(1);  
 numeros.add(3);

System.out.println(numeros);

Salida:  
 \[1, 3, 5\]

---

9. ### COMPARACIÓN ENTRE SETS

HashSet

* No permite duplicados  
* No mantiene orden  
* Permite null

LinkedHashSet

* No permite duplicados  
* Mantiene orden de inserción  
* Permite null

TreeSet

* No permite duplicados  
* Mantiene orden natural  
* No permite null

---

10. ### TIPOS GENÉRICOS

Los genéricos permiten especificar el tipo de datos que puede almacenar una colección.

Ejemplo:

Set\<String\> nombres \= new HashSet\<\>();

Esto significa que solo se pueden almacenar Strings.

Ventaja principal:

* Seguridad de tipos (evita errores en tiempo de compilación)

---

11. ### WRAPPERS

Las colecciones no admiten tipos primitivos, por lo que se utilizan clases envoltorio (wrappers).

Incorrecto:  
 ArrayList\<int\> lista;

Correcto:  
 ArrayList\<Integer\> lista;

Wrappers principales:

* int → Integer  
* double → Double  
* char → Character  
* boolean → Boolean

Ejemplo:

Integer numero \= 10;

Esto se denomina autoboxing.

---

12. ### ITERATOR

Permite recorrer colecciones de forma controlada.

Ejemplo:

Iterator\<String\> it \= nombres.iterator();

while(it.hasNext()) {  
 System.out.println(it.next());  
 }

Métodos principales:

* hasNext()  
* next()  
* remove()

---

13. ### INTERFAZ LIST

Una lista se caracteriza por:

* Mantener el orden  
* Permitir elementos repetidos  
* Permitir acceso por posición

Ejemplo:

List\<String\> lista \= new ArrayList\<\>();

lista.add("Ana");  
 lista.add("Ana");

System.out.println(lista.get(0));

---

14. ### ARRAYLIST

Es una lista dinámica basada en arrays.

Características:

* Acceso rápido por índice  
* Muy utilizada  
* Fácil de usar

Ejemplo:

List\<String\> nombres \= new ArrayList\<\>();

nombres.add("Luis");  
 nombres.add("Ana");

System.out.println(nombres.get(1));

Salida:  
 Ana

---

15. ### LINKEDLIST

Es una lista enlazada donde cada elemento apunta al siguiente y al anterior.

Ventajas:

* Inserción rápida  
* Eliminación rápida

Ejemplo:

LinkedList\<String\> tareas \= new LinkedList\<\>();

tareas.addFirst("Urgente");  
 tareas.addLast("Normal");

---

16. ### ARRAYLIST VS LINKEDLIST

ArrayList

* Lectura muy rápida  
* Inserción más lenta  
* Eliminación más lenta

LinkedList

* Lectura más lenta  
* Inserción muy rápida  
* Eliminación muy rápida

