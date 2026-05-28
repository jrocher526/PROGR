# Portfolio – Unidad 9: Entrada y Salida de Información

---

## Introducción

La entrada y salida de información (Input/Output o I/O) permite que un programa pueda comunicarse con el exterior.  
Un programa necesita:

* Recibir información → Entrada (Input)  
* Mostrar o guardar información → Salida (Output)


Ejemplos:

* Leer datos desde teclado  
* Guardar datos en un archivo  
* Leer un documento  
* Mostrar información por pantalla  
* Trabajar con XML


En Java, esta comunicación se realiza mediante flujos de datos (Streams).  
---

## **1\. Flujos de datos (Streams)**

#### **Definición**

Un flujo es una secuencia ordenada de datos que viaja desde un origen hacia un destino.  
Ejemplo:

Teclado → Programa → Pantalla  O  Archivo → Programa → Archivo

## Tipos de flujos

### **Flujo de entrada**

Lee información.  
Ejemplos:

* teclado  
* archivos  
* bases de datos  
* 

Scanner sc=new Scanner(System.in);  
Aquí el programa recibe datos.

### **Flujo de salida**

Escribe información.  
Ejemplos:

* pantalla  
* archivos  
* impresora


System.out.println("Hola");

### **Flujo de caracteres**

Trabajan con texto:

* letras  
* palabras  
* frases


Clases:  
FileReader  
FileWriter

Ejemplo:  
FileWriter fw=new FileWriter("texto.txt");

### **Flujo de bytes**

Trabajan con datos binarios:

* imágenes  
* vídeos  
* sonidos  
* objetos serializados


Clases:  
FileInputStream  
FileOutputStream

---

## **2\. Flujos estándar**

Java crea automáticamente tres flujos.

### **System.out**

#### **Definición**

Es el flujo estándar de salida.  
Sirve para mostrar información en pantalla.

Ejemplo:

System.out.println("Hola");

Salida:  
Hola

### **System.in**

#### **Definición**

Es el flujo estándar de entrada.  
Permite leer datos del teclado.

Ejemplo:

int letra=System.in.read();

**System.err**

#### **Definición**

Se utiliza para mostrar errores.

Ejemplo:

System.err.println("Error");

## **3\. Clase Scanner**

#### **Definición**

Scanner añade una capa de abstracción para leer información de manera sencilla.  
Permite leer:

* enteros  
* decimales  
* cadenas  
* líneas completas  
* 

## Métodos importantes

| Método | Función |
| :---- | :---- |
| next() | Lee una palabra |
| nextLine() | Lee línea completa |
| nextdDouble() | Lee decimales |
| nextInt() | Lee enteros |

### 

### **Ejemplos**

Scanner sc=new Scanner(System.in);

System.out.println("Nombre:");

String nombre=sc.nextLine();

System.out.println("Edad:");

int edad=sc.nextInt();

System.out.println("Hola "+nombre);  
---

## Explicación

Scanner sc \= new **Scanner(System.in)**;  
Crea un objeto Scanner para leer desde teclado.

String nombre \= sc.**nextLine()**;  
Lee una línea completa.

int edad \= sc.**nextInt()**;  
Lee un número entero.  
---

## **4\. Ficheros y directorios**

#### **Definición**

Los archivos permiten guardar información para utilizarla posteriormente.  
La clase principal es:

File

**Importante:**  
La clase File representa un archivo pero no lo abre ni lo crea automáticamente.  
---

## Métodos importantes

| Metodo | Funcion |
| :---- | :---- |
| exists() | Comprueba si existe |
| createNewFile() | Crea un archivo |
| mkdir() | Crea un directorio |
| delete() | Elimina |

---

## Ejemplo

File archivo=new File("datos.txt");

if(archivo.exists()){

System.out.println("Existe");

}  
---

## Explicación

new File("datos.txt")  
Representa el archivo.

archivo.exists()  
Comprueba si realmente existe.  
---

## **5\. Escritura y lectura de archivos de texto**

## FileWriter

#### **Definición**

Permite escribir texto en un archivo.

Ejemplo:  
FileWriter escritor=new FileWriter("ejemplo.txt");

escritor.write("Hola mundo");

escritor.close();  
---

## Explicación

write()  
Escribe información.

close()  
Cierra el flujo y guarda los cambios.  
---

## FileReader

#### **Definición**

Permite leer archivos de texto.

Ejemplo:  
FileReader lector=new FileReader("ejemplo.txt");

int caracter;

while((caracter=lector.read())\!=-1){

System.out.print((char)caracter);

}  
---

## Explicación

read()

Lee carácter por carácter.  
\!=-1  
Indica que aún quedan datos.  
---

## **6\. Ficheros binarios**

#### **Definición**

Permiten guardar información en formato binario.  
Se usan para:

* imágenes  
* vídeos  
* objetos  
* sonidos

---

## FileOutputStream

Permite escribir bytes.

Ejemplo:  
FileOutputStream salida=new FileOutputStream("datos.bin");

byte\[\] datos={72,111,108,97};

salida.write(datos);

salida.close();  
---

## Explicación

Los números:  
72,111,108,97

Representan:  
Hola  
en código ASCII.  
---

## **7\. Acceso directo**

## RandomAccessFile

#### **Definición**

Permite acceder a cualquier posición del archivo sin leerlo entero.  
Funciona como un array gigante de bytes.  
---

## Métodos importantes

| Método | Función |
| ----- | ----- |
| seek() | Mueve el puntero |
| read() | Lee |
| write() | Escribe |
| length() | Longitud |

---

## Ejemplo

RandomAccessFile archivo=  
new RandomAccessFile("datos.txt","rw");

archivo.seek(5);

archivo.writeBytes("P");  
---

## Explicación

seek(5)

Mueve el puntero a la posición 5\.  
writeBytes()  
Escribe información en esa posición.  
---

## **8\. Serialización**

#### **Definición**

Proceso que convierte objetos en bytes para poder guardarlos en archivos o enviarlos.  
---

## Requisitos

La clase debe:

* implementar Serializable  
* tener atributos serializables  
* incluir serialVersionUID

---

#### **Ejemplo**

public class Persona implements Serializable{

private static final long serialVersionUID=1L;

String nombre;  
int edad;

}  
---

## ObjectOutputStream

Guarda objetos.  
ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("datos.dat")  
);

salida.writeObject(persona);  
---

## ObjectInputStream

Recupera objetos.

ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("datos.dat"));

Persona p=(Persona)entrada.readObject();  
---

## **9\. XML**

#### **Definición**

XML es un lenguaje de marcado utilizado para almacenar y estructurar datos.  
Características:

* independiente del lenguaje  
* legible para personas  
* permite intercambiar información

---

Ejemplo XML:  
\<videojuego\>

\<pantalla resolucion="1920x1080"\>  
true  
\</pantalla\>

\<audio volumen="80"\>  
false  
\</audio\>

\</videojuego\>  
---

## **10\. DOM**

#### **Definición**

DOM significa:  
Document Object Model  
Representa el XML como un árbol de nodos.  
---

Ejemplo:  
videojuego  
     |  
     |pantalla  
     |  
     |audio  
---

## Principales clases

### Document

Representa el XML completo.  
Document documento=  
builder.newDocument();  
---

### Element

Representa una etiqueta XML.  
Element raiz=  
documento.createElement("videojuego");  
---

### appendChild()

Añade un nodo hijo.  
raiz.appendChild(audio);  
---

### setAttribute()

Añade atributos.  
audio.setAttribute("volumen","80");  
---

### setTextContent()

Añade contenido interno.  
audio.setTextContent("false");  
---

## Resultado XML generado

\<videojuego\>

\<pantalla resolucion="1920x1080"\>

true

\</pantalla\>

\<audio volumen="80"\>

false

\</audio\>

\</videojuego\>  
