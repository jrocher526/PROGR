# Introducción

Esta unidad trata sobre los fundamentos de Java y los conceptos necesarios antes de entrar en la Programación Orientada a Objetos (POO). Aunque el título menciona POO, primero se explican las bases del lenguaje: variables, operadores, condicionales, bucles y funciones. Estos conocimientos son imprescindibles para después entender clases, objetos y métodos.

Este portafolio explica todos los contenidos del PDF de manera clara, sencilla y con ejemplos básicos para facilitar la comprensión.

---

# Portfolio – UD5 

# Programación Orientada a Objetos (Java)

---

1. ## Introducción a Java

---

### Conceptos previos

Java es un lenguaje orientado a objetos, multiplataforma y muy utilizado en el mundo profesional. Permite que el mismo programa funcione en distintos sistemas operativos sin modificarlo.

Se usa en desarrollo web, aplicaciones Android, sistemas empresariales, juegos y backend.

Ejemplo de programa simple:

public class Hola {  
 	public static void main(String\[ \] args) {  
 		System.out.println("Hola mundo");  
	 }  
 }

Este ejemplo lo que hace es mostrar por consola “Hola mundo”.

### Código fuente vs código máquina

El código fuente es lo que escribe el programador. La máquina no lo entiende directamente. Por eso se compila a un archivo .class, llamado bytecode, que interpreta la JVM (Máquina Virtual de Java).

### Multiplataforma

Java es multiplataforma porque su bytecode se ejecuta en cualquier sistema que tenga instalada la JVM.

### JVM, JDK y JRE

JVM: ejecuta código Java.  
 JRE: permite ejecutar programas Java.  
 JDK: incluye herramientas para programar y compilar, además del JRE.

### Tiempo de compilación y tiempo de ejecución

En compilación se revisa la sintaxis y tipos de datos.  
En ejecución pueden aparecer errores como divisiones por cero o posiciones inválidas.

---

2. ## FUNDAMENTOS DEL LENGUAJE JAVA

---

 

### Palabras reservadas

Son palabras que Java utiliza para su funcionamiento interno. No pueden usarse como nombres de variables ni funciones.  
 Ejemplos: if, else, while, for, class, boolean, return.

Ejemplo:

if (edad \> 18\) {  
 	System.out.println("Mayor de edad");  
 }

Este ejemplo lo que hace es si la persona tiene 18 años mostrar que es mayor de edad.

### Identificadores

Nombres que el programador elige para variables, funciones, clases y objetos, no pueden comenzar por número ni contener espacios.

Ejemplos válidos:  
 nombre, edadUsuario, \_contador  
Ejemplos no válidos:  
 2numero, mi variable, class

### Tipos de datos primitivos

int: número entero.  
 double: número decimal.  
 boolean: verdadero o falso.  
 char: un solo carácter.

Ejemplo:  
 int edad \= 19;  
 double precio \= 2.5;  
 boolean activo \= true;  
 char letra \= 'A';

### Declaración e inicialización de variables

Declaración:  
 int numero;

Inicialización:  
 numero \= 5;

Ambas juntas:  
 int numero \= 5;

### Constantes

Son variables cuyo valor no puede cambiar.

final double PI \= 3.1416;

### Comentarios

// : Sirve para hacer comentarios cortos en una sola línea, útiles para aclarar algo puntual en el código.

/\* … \*/: Sirve para comentar bloques de código o poner explicaciones largas que abarcan varias líneas.

/\*\* … \*/: Sirve para documentar clases, métodos o atributos de forma que luego se pueda generar documentación automática con JavaDoc.

### Paquetes y API de Java

Los paquetes organizan las clases.  
 Ejemplo:

import java.util.Scanner;

Importa solo la clase Scanner desde el paquete java.util.

Eso permite usar la clase Scanner en tu programa para leer datos del usuario, como números o texto.

La [API](https://docs.oracle.com/javase/8/docs/api/) de Java es la biblioteca estándar con clases como String, Math, Scanner, ArrayList, etc.

### Entrada y salida

Salida:  
 System.out.println("Hola");

Entrada:  
 Scanner sc \= new Scanner(System.in);  
 System.out.println("Introduce la edad");  
 int edad \= sc.nextInt();

### Operadores

Operadores Aritméticos

\+ → suma  
\- → resta  
\* → multiplicación  
/ → división  
% → módulo (residuo de la división)

Operadores Relacionales

\> → mayor que  
\< → menor que  
\>= → mayor o igual que  
\<= → menor o igual que  
\== → igual a  
\!= → distinto de

Operadores Lógicos

&& → y lógico (AND)  
|| → o lógico (OR)  
\! → negación lógica (NOT)

#### Ejemplos de cada uno:

Aritméticos:  
5 \+ 3 → 8  
5 \- 3 → 2  
5 \* 3 → 15  
5 / 3 → 1  
5 % 3 → 2

Relacionales:  
5 \> 3 → true  
5 \< 3 → false  
5 \== 3 → false  
5 \!= 3 → true  
5 \>= 3 → true  
5 \<= 3 → false

Lógicos:  
true && false → false  
true || false → true  
\!true → false

### Conversión de tipos

Implícita:  
 int n \= 3;  
 double x \= n;

Explícita (casting):  
 double x \= 3.9;  
 int n \= (int) x; // pierde decimales

3. ## CONDICIONALES

---

 

### If

if (edad \>= 18\) {  
 System.out.println("Mayor de edad");  
 }

Esto nos dice que si la persona es mayor o igual a 18 años nos imprime que es mayor de edad.

### If \- else

if (num \> 0\) {  
 System.out.println("Positivo");  
 } else {  
 System.out.println("Negativo");  
 }

Esto nos dice que si el num es mayor a 0 nos imprime positivo sino imprime negativo

### If anidado

Permite evaluar varias condiciones consecutivas.

int numero \= 7;

if (numero \> 0\) {

    if (numero % 2 \== 0\) {

        System.out.println("El número es positivo y par");

    } else {

        System.out.println("El número es positivo e impar");

### Switch

switch (dia) {  
 case 1: System.out.println("Lunes"); break;  
 case 2: System.out.println("Martes"); break;  
 default: System.out.println("Día no válido");  
 }

Este switch lo que hace es:  
Si dia es 1 → imprime "Lunes"  
Si dia es 2 → imprime "Martes"  
Si dia no es 1 ni 2 → imprime "Día no válido"

---

4. ## BUCLES

---

 

### While

Se repite mientras la condición sea verdadera.

while (n \!= 0\) {  
 n \= sc.nextInt();  
 }

### Do-while

Se ejecuta hasta que el numero ingresado sea 0\.

do {  
 n \= sc.nextInt();  
 } while (n \!= 0);

### For

Imprime 5 veces “Eco”

for (int i \= 1; i \<= 5; i++) {  
 System.out.println("Eco");  
 }

### Bucles anidados

for (int i \= 1; i \<= 10; i++) {  
 	for (int j \= 1; j \<= 10; j++) {  
  		System.out.println(i \* j);  
 	 }  
 }

Tiene un bucle externo (i) que va del 1 al 10\.  
Dentro, hay un bucle interno (j) que también va del 1 al 10\.  
En cada iteración del bucle interno, imprime el producto de i por j.  
En resumen, muestra la tabla de multiplicar del 1 al 10, número por número.  
---

5. ## FUNCIONES

---

### Qué es una función

Una función es un bloque de código reutilizable que realiza una tarea.  
Evita repetir código, organiza mejor el programa y permite dividirlo en partes más pequeñas.

Ejemplo básico

public static int doble(int n) {  
 return n \* 2;  
 }

int resultado \= doble(4);

Esto lo que hace es:

Define un método llamado doble que recibe un número n y devuelve n \* 2\.  
Llama al método con doble(4), es decir, pasa el valor 4\.  
El método devuelve 8, que se guarda en la variable resultado.  
En resumen: resultado tendrá el valor 8\.

### Parámetros y argumentos

public static int sumar(int a, int b) {  
 return a \+ b;  
 }

public → el método se puede usar desde cualquier parte del programa.  
static → el método pertenece a la clase, no a un objeto.  
int → el método devuelve un número entero.  
sumar → nombre del método.  
(int a, int b) → parámetros, que son variables que recibe el método para trabajar.  
return a \+ b; → devuelve la suma de los parámetros.  
Esta funcion lo que hace es devolver un numero entero que seria la suma de a y b.

### Sobrecarga de funciones

Varias funciones con el mismo nombre pero con distintos parámetros.

Funcion con dos parametros tipo entero.

int max(int a, int b) {   
…  
 }

Funcion con el mismo nombre pero distintos numeros de parametros o tambien se puede distintos tipos de parametros.

 int max(int a, int b, int c) {  
 …  
 }  
---

# Conclusión

Este portafolio presenta de forma completa todos los contenidos fundamentales del PDF sobre la Unidad Didáctica 5: fundamentos de Java, sintaxis básica, condicionales, bucles y funciones. Estos conocimientos son esenciales antes de comenzar con la Programación Orientada a Objetos, ya que permiten comprender cómo funciona el lenguaje, cómo se organiza la lógica de un programa y cómo reutilizar código de manera eficiente.

