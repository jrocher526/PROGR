# PORTFOLIO: CONTROL Y MANEJO DE EXCEPCIONES EN JAVA

---

#### **CONCEPTO DE EXCEPCIÓN**

 Una excepción es básicamente un error que ocurre mientras el programa se está ejecutando y hace que todo se desvíe del camino normal.

Es decir, todo va bien → pasa algo raro → error → cambia el flujo del programa.

Ejemplo: usar una variable que está en null → eso peta de una.

Antes de que existieran las excepciones, los programadores tenían que devolver códigos de error y revisarlos a mano.

---

## **JERARQUÍA DE EXCEPCIONES**

 Todas las excepciones vienen de Object → luego pasan por Throwable.

Después se divide en:

* Error → errores del sistema (la JVM), estos son graves. (No se pueden controlar)  
* Exception → estos sí los puedes manejar tú.

Dentro de Exception hay dos tipos:

* RuntimeException → errores tuyos (te pelaste programando)  
* Checked → errores que tienes que controlar sí o sí

Ejemplos:

* NullPointerException (el mas comun)  
* IndexOutOfBoundsException  
* IllegalArgumentException  
* FileNotFoundException  
* SQLException

---

## **CLASIFICACIÓN DE EXCEPCIONES**

Checked (verificadas):  
 Son errores que sabes que pueden pasar. No es culpa tuya necesariamente.  
 Tienes que controlarlos obligatoriamente.

Ejemplo: leer un archivo y que no exista.

Unchecked (no verificadas):  
 Son errores de programación. Son errores del la persona que programa.

Ejemplo: acceder a una posición que no existe en un array.

---

## **MIEMBROS DE UNA EXCEPCIÓN**

Las excepciones tienen métodos útiles:

Constructores:  
 Sirven para crear excepciones con mensaje o sin él.

Métodos importantes:

* toString() → muestra la excepción  
* getClass() → tipo de excepción  
* getMessage() → el mensaje del error  
* printStackTrace() → te suelta todo el error completo (Es bueno para depurar)

---

## MANEJO DE EXCEPCIONES

Cuando ocurre una excepción puedes:

* Capturarla (resolverla ahí mismo)  
* Propagarla (mandársela a otro método)

---

## **CAPTURA DE EXCEPCIONES (try-catch-finally)**

**Estructura**

try {  
 // código que puede explotar  
 } catch (TipoExcepcion e) {  
 // Manejo del error  
 } finally {  
 // esto siempre se ejecuta  
 }

Ejemplo:

try {  
 int divisor \= 0;  
 int resultado \= 5 / divisor;  
 } catch (ArithmeticException e) {  
 System.out.println("No se puede dividir entre 0, mi pana");  
 } finally {  
 System.out.println("Fin del programa");  
 }

---

## **PROPAGACIÓN DE EXCEPCIONES**

Aqui el error se manda para arriba, es decir:

**Se usa throws.**

public void metodo() throws Exception {  
 }

El que llame a ese método tiene que resolver el problema.

---

## **LANZAMIENTO DE EXCEPCIONES (throw)**

Son errores que puede lanzar uno mismo

if (x \== null) {  
 throw new IllegalArgumentException("No se admiten nulos");  
 }

---

## **RELANZAMIENTO DE EXCEPCIONES**

Capturas el error pero lo vuelves a lanzar.

try {  
 // código  
 } catch (Exception e) {  
 throw e;  
 }

Es como decir: "yo lo veo, pero que lo resuelva otro"

---

## **EXCEPCIONES PERSONALIZADAS**

Puedes crear tus propios errores.

public class MiExcepcion extends Exception {  
 	public MiExcepcion(String mensaje) {  
 	super(mensaje);  
	 }  
 }

Es buena implementacion cuando se quiere algo unico en el programa

---

## **BUENAS PRÁCTICAS**

* No dejar catch vacío   
* Capturar errores lo antes posible  
* Usar finally para limpiar recursos  
* No usar excepciones genéricas  
* No abusar de excepciones  
* Reutilizar las que ya existen

---

## **ASERCIONES**

Sirven para comprobar cosas mientras programas.

**Ejemplo:**

int x \= \-15;  
 assert x \> 0 : "El valor debe ser positivo";

Si falla → error.

IMPORTANTE:

* Solo es en desarrollo  
* No es en producción  
* Se activan con \-ea 

