# PORTFOLIO – INTERFACES EN JAVA

Módulo: Programación | 1º DAW

---

# 1\. Introducción a las Interfaces

Una interfaz en Java es una plantilla que define un contrato que las clases deben cumplir.

Permite aplicar abstracción y polimorfismo, haciendo el código más modular, reutilizable y fácil de mantener.

Las interfaces son una parte fundamental de la programación orientada a objetos, ya que permiten separar la definición del comportamiento de su implementación.

Gracias a ellas, diferentes clases pueden compartir un mismo conjunto de métodos aunque sean completamente distintas entre sí.

---

# 2\. Definición de una Interfaz en Java

Las interfaces contienen:

* métodos abstractos (sin cuerpo)  
* constantes  
* métodos **default**   
* métodos **static**

Ejemplo:

public interface Vehiculo {

   int **VELOCIDAD\_MAXIMA** \= 120;

   void acelerar(int cantidad);

   void frenar(int cantidad);

}

En este ejemplo:

* **VELOCIDAD\_MAXIMA** es una constante  
* **acelerar()** y **frenar()** son métodos abstractos

Toda clase que implemente esta interfaz deberá desarrollar estos métodos.

---

# 3\. Implementación de Interfaces

Una clase usa la palabra clave **implements** para aplicar la interfaz.

Ejemplo:

public class Coche implements Vehiculo {  
   private int velocidad;

   @Override  
   public void acelerar(int cantidad) {  
       velocidad \+= cantidad;  
   }

   @Override  
   public void frenar(int cantidad) {  
       velocidad \-= cantidad;  
   }  
}

Aquí la clase **Coche** implementa la interfaz **Vehiculo.**

Esto significa que está obligada a programar todos sus métodos.

---

# 4\. Interfaces vs Clases Abstractas

Las interfaces se utilizan cuando varias clases necesitan compartir un comportamiento común aunque no pertenezcan a la misma jerarquía.

Las clases abstractas se usan cuando las clases sí tienen relación entre sí.

| Aspecto | Interfaz | Clase  abstracta |
| :---- | :---- | :---- |
| Herencia | Multiple | Simple |
| Metodos | Abstractos, default, static | Abstractos y concretos |
| Uso | Contrato | Base comun |

---

# 5\. Polimorfismo con Interfaces

El **polimorfismo** permite usar una interfaz como tipo de referencia para diferentes clases.

Ejemplo:

Animal a \= new Perro();

a.hacerSonido();

a \= new Gato();

a.hacerSonido();

Salida:

Guau

Miau

Esto hace el código mucho más flexible.

Permite cambiar el tipo de objeto sin modificar el resto del programa.

---

# 6\. Interfaces y Herencia

Las **interfaces** también pueden **heredar** de otras interfaces mediante la palabra **extends.**

Ejemplo:

public interface Animal {

   void hacerSonido();

}

public interface Mascota extends Animal {

   void jugar();

}

En este caso, cualquier clase que implemente **Mascota** deberá implementar ambos métodos.

public class Perro implements Mascota {

   public void hacerSonido() {

       System.out.println("Guau");

   }

   public void jugar() {

       System.out.println("El perro juega");

   }

}

Una gran ventaja es que Java permite herencia múltiple entre interfaces.

---

# 7\. Métodos en Interfaces

Las interfaces pueden incluir métodos con implementación.

## Método default

public interface Vehiculo {

   default void arrancar() {

       System.out.println("Vehículo arrancado");

   }

}

La clase no está obligada a sobrescribir este método.

## Método static

public interface Vehiculo {

   static void informacion() {

       System.out.println("Información general");

   }

}

Uso:

Vehiculo.informacion();

Esto mejora la reutilización del código.

---

# 8\. Buenas prácticas

Es recomendable:

declarar con interfaz e instanciar con clase

Animal mascota \= new Perro();

Esto favorece:

* flexibilidad  
* mantenimiento  
* reutilización  
* polimorfismo

También es importante usar nombres claros y descriptivos.

Ejemplo:

interface Volador

interface Nadador

---

# 10\. Errores comunes

Al trabajar con interfaces es frecuente cometer errores como:

* olvidar implementar todos los métodos  
* confundir interfaz con clase abstracta  
* intentar crear objetos de una interfaz  
* no usar **@Override**

Ejemplo incorrecto:

Animal a \= new Animal();

Esto dará error porque una interfaz no puede instanciarse.

Otro error habitual es pensar que una interfaz puede tener atributos normales, cuando solo puede tener constantes.

---

# 11\. Resumen y conclusiones

Las interfaces son fundamentales en Java porque mejoran el diseño orientado a objetos, facilitan el mantenimiento y permiten reutilizar código de forma eficiente.

Son muy importantes para trabajar con programas grandes y escalables.

Además, ayudan a entender mejor conceptos como:

* abstracción  
* polimorfismo  
* modularidad  
* herencia múltiple

