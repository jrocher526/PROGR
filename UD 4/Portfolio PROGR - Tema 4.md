# **Portfolio – UD4 Clases y Objetos**

 1\. Introducción a la Programación Orientada a Objetos (POO)

La Programación Orientada a Objetos intenta imitar el mundo real dentro del código. En lugar de trabajar solo con funciones y datos sueltos, trabajamos con objetos, que tienen datos (atributos) y acciones (métodos).

Ejemplo del mundo real: una *persona* tiene nombre y edad (datos) y puede saludar o cumplir años (acciones).

 

## **Clases**

### ¿Qué es una clase?

Una clase es como un molde o plantilla. Define cómo serán los objetos que creemos a partir de ella.

·       Modela algo real

·       Contiene atributos y métodos

·       Es un tipo de dato

Ejemplo: la clase **Persona** es el **molde**, y *Pepe* o *Ana* son **objetos** creados con ese molde.

### Sintaxis de una clase en Java

class Persona {  
 	// atributos  
 	// constructores  
 	// métodos  
 }

Es decir:  “class” indica que estamos creando una clase. “Persona” es el nombre (siempre en mayuscula)

### Atributos

Los atributos guardan la información del objeto.

Características importantes: Suelen ser sustantivos. Se escriben en lowerCamelCase. Normalmente son private

Ejemplo:

class Persona {  
 	String nombre;  
 	int edad;  
 	double estatura;  
 }

Cada objeto tendrá sus propios valores para estos atributos.

### Inicialización de atributos

Los atributos pueden: No inicializarse (toman valores por defecto). Inicializarse directamente

Valores por defecto:

int \- 0   
double \- 0.0  
String \- null

## **Métodos**

Los métodos son las acciones que puede realizar un objeto.

·       Suelen llevar verbos en el nombre  
·       Definen el comportamiento

Ejemplo:

void saludar() {  
 	System.out.println("Hola, me llamo " \+ nombre);  
 }

Este método usa un atributo del objeto para mostrar un mensaje.

## **Miembros de una clase**

Los miembros de una clase son:

 \- Atributos   
\- Métodos

Todos los miembros son accesibles dentro de la propia clase.

## **Ámbito de las variables**

El ámbito indica desde dónde se puede usar una variable.

Tipos:

 \- Atributo \- toda la clase   
\- Variable local \- solo dentro del método  
 \- Variable de bloque \- solo dentro del bloque (if, while, etc.)

**Importante**: una variable local puede llamarse igual que un atributo y lo oculta.

**Palabra reservada** (this)

this se usa para referirse al propio objeto.  
Sirve para diferenciar atributos de variables locales.

Ejemplo:

this.edad \= edad;

Aquí el primer edad es el atributo y el segundo es el parámetro.

## **Objetos**

Un objeto es una instancia de una clase.

·       La clase es el molde  
·       El objeto es el elemento real  
Ejemplo:

Persona p \= new Persona();

## **Referencias**

Los objetos funcionan mediante referencias a memoria.

·       La variable no guarda el objeto  
·       Guarda la dirección donde está el objeto

Por eso:

Persona p1 \= new Persona();  
 Persona p2 \= p1;

p1 y p2 apuntan al mismo objeto.

## **Valor** (null)

Si una variable de tipo objeto no apunta a nada, vale null.

Si intentamos usarla:  
p.nombre;

Aqui p existe.  
Pero no apunta a ningun lado.  
automaticamente vale null.

## **Constructores**

Los constructores sirven para crear objetos y darles valores iniciales.

·       Tienen el mismo nombre que la clase  
·       No tienen tipo de retorno

Constructor con parámetros:

Persona(String nombre, int edad, double estatura) {  
 	this.nombre \= nombre;  
 	this.edad \= edad;  
 	this.estatura \= estatura;  
 }

Uso:

Persona p \= new Persona("Claudia", 8, 1.20);

### Tipos de constructores

·       Por defecto  
·       Sin parámetros  
·       Con parámetros  
·       Sobrecargados

Si creas uno con parámetros, el constructor por defecto desaparece.

### this()

Se usa para llamar a otro constructor de la misma clase.

Ejemplo:

Persona(String nombre) {  
 	this(nombre, 0, 1.0);  
 }

Siempre debe ir en la primera línea.

## **Operador punto** (.)

Se usa para acceder a los miembros de un objeto.

Ejemplo:

p.nombre \= "Pepe";  
 p.saludar();

## **Enumerados** (enum)

Un enum es un tipo de dato con valores limitados.

Ejemplo:

enum DiaSemana {  
 	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO  
 }

Sirve para evitar errores y controlar valores posibles.

