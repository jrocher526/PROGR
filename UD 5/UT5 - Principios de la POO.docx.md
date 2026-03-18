# PROGRAMACIÓN ORIENTADA A OBJETOS (POO)

## **1\. ¿Qué es la Programación Orientada a Objetos (POO)?**

La Programación Orientada a Objetos (POO) es un paradigma de programación basado en el uso de objetos.

Un objeto representa una entidad del mundo real con características (atributos) y comportamientos (métodos).

Sirve para organizar el código de forma clara, modular y reutilizable.  
---

## **2\. Clases y Objetos**

* Una clase es una plantilla que define atributos y métodos.  
* Un objeto es una instancia de una clase.

Ejemplo:  
class Persona { String nombre; int edad; }  
Persona p \= new Persona();

En este ejemplo, se crea una clase Persona y luego un objeto p basado en esa clase.  
---

## **3\. Encapsulación**

* Consiste en proteger los datos de una clase usando modificadores como private.  
* Se accede a los datos mediante métodos públicos (getters y setters).  
* Sirve para evitar modificaciones incorrectas y controlar el acceso.

Ejemplo:

private String nombre;

public String getNombre() {   
return nombre; }

public void setNombre(String nombre) {   
this.nombre \= nombre; }

En este ejemplo, no se accede directamente a 'nombre', sino mediante métodos.  
---

## **4\. Herencia**

La herencia permite que una clase herede propiedades de otra y se usa cuando existe una relación 'es un'.

Ejemplo:  
class Animal {}  
class Perro extends Animal {}

En este ejemplo el perro hereda características de Animal y reutilización de código.  
---

## **5\. Clases Abstractas**

* Son clases que no se pueden instanciar.  
* Se utilizan como base para otras clases.  
* Contienen métodos abstractos que deben ser implementados.

Ejemplo:  
abstract class Figura {  
abstract double area();  
}

En cualquier clase que herede debe definir el método area().  
---

## **6\. Polimorfismo**

* Permite usar una referencia de tipo padre para objetos de tipo hijo.  
* Sirve para hacer el código más flexible.

Ejemplo:  
Figura f \= new Circulo();  
Figura f2 \= new Rectangulo();

En ambos usan el mismo tipo pero se comportan diferente.  
---

## **7\. Sobrescritura (Override)**

* Permite redefinir métodos heredados.  
* Se usa con @Override.

Ejemplo:

@Override  
public String toString() {   
return "Objeto"; }

Aqui se cambia el comportamiento del método original.  
---

## **8\. Static**

Los miembros static pertenecen a la clase y no al objeto y se usan para métodos utilitarios o variables compartidas.

Ejemplo:  
public static int suma(int a, int b) {   
return a \+ b; }  
**Uso:**

Clase.suma(2,3);

Aqui no hace falta crear un objeto.  
---

## **9\. Final**

**Se usa para evitar modificaciones.**

* Clase final: no se puede heredar.  
* Método final: no se puede sobrescribir.  
* Variable final: constante.


Ejemplo:  
public final class Configuracion {}  
Private final String SALUDO \= “Hola”;

Que hace el **Final** \- protege el diseño del programa.  
---

## **10\. Composición**

Es una relación de tipo **'tiene un'**.

Ejemplo: un Libro tiene un Autor.  
Se implementa usando atributos de otras clases.

Esto permite construir objetos complejos a partir de otros.  
---

## **11\. Clase Object**

**Todas las clases en Java heredan de Object.**

Métodos importantes:

* **toString():** convierte objeto a texto.  
* **equals():** compara objetos.  
* **hashCode():** código hash. \- (No explicado completo)

Estos son métodos básicos del lenguaje.  
---

## **12\. Todo lo visto en un ejemplo (Con el ejercicio de examen)**

* **Clase ItemBiblioteca:** define atributos comunes y método abstracto.  
* **Clase Libro:** hereda y añade autores.  
* **Clase Revista**: hereda y añade número.  
* **Clase Autor:** representa autores.  
* **ContadorItems:** usa static para contar objetos.  
* **ConfiguracionSistema:** clase final con constantes.


En este ejercicio se aplican todos los conceptos de POO juntos.