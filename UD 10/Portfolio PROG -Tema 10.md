# **Unidad 10: Persistencia de Datos**

---

## ¿Qué es la persistencia?

La persistencia es la capacidad que tiene una aplicación para guardar información de forma permanente, de manera que los datos no se pierdan cuando el programa se cierra.

Por ejemplo, si desarrollamos una aplicación para gestionar eventos musicales, necesitamos que los eventos creados sigan existiendo aunque apaguemos el ordenador o volvamos a ejecutar el programa otro día.

Sin persistencia, todos los datos existirían únicamente en memoria y desaparecerían al finalizar la ejecución.

---

# Ficheros vs Bases de Datos

Existen varias formas de guardar información.

### **Ficheros**

Los datos se almacenan en archivos como TXT, CSV, XML.

Ventajas:

* Son sencillos de crear.  
* No requieren instalar un gestor de bases de datos.

Inconvenientes:

* Más difíciles de organizar cuando hay mucha información.  
* Las búsquedas son más lentas.  
* Gestionar relaciones entre datos resulta complicado.

### **Bases de Datos**

Los datos se almacenan de forma estructurada y organizada.

Ventajas:

* Mayor rapidez en consultas.  
* Mejor organización.  
* Posibilidad de relacionar información.  
* Más seguridad y control.

Ejemplo:

Una tienda con miles de productos sería muy difícil de gestionar mediante archivos de texto, mientras que una base de datos permite buscarlos y modificarlos fácilmente.

---

# Bases de Datos Orientadas a Objetos (OODB)

Las bases de datos orientadas a objetos almacenan directamente objetos de Java en lugar de tablas tradicionales.

### ¿Para qué sirven?

Permiten guardar los objetos exactamente igual que existen dentro del programa.

### Ejemplo

Supongamos una clase:

Evento evento \= new Evento(  
   "Festival Rock",  
   fecha,  
   15000  
);

En una base de datos orientada a objetos, este objeto puede almacenarse prácticamente tal cual.

### Ventaja principal

No es necesario convertir continuamente entre objetos Java y tablas de una base de datos relacional.

---

# ¿Qué es un POJO?

POJO significa Plain Old Java Object.

Es simplemente una clase Java normal y corriente.

### Características

* Atributos privados.  
* Constructor.  
* Getters y Setters.  
* No depende de frameworks especiales.

### Ejemplo

public class Evento {

   private String nombre;  
   private double recaudacion;

   public Evento() {}

   public String getNombre() {  
       return nombre;  
   }

   public void setNombre(String nombre) {  
       this.nombre \= nombre;  
   }  
}

### ¿Por qué se usan?

Porque JPA necesita trabajar con objetos sencillos para poder almacenarlos en la base de datos.

---

# Anotaciones

Las anotaciones permiten añadir información especial a una clase o atributo.

### Ejemplo

@Entity  
public class Evento {  
}

La anotación **@Entity** le dice a JPA:

"Esta clase debe guardarse en la base de datos".

Son una forma de comunicarnos con el framework sin escribir código adicional.

---

# JPA (Java Persistence API)

JPA es una tecnología que facilita guardar objetos Java en una base de datos.

### ¿Para qué sirve?

Permite trabajar con objetos Java sin tener que escribir continuamente SQL.

### **Sin JPA**

SELECT \* FROM eventos;

### **Con JPA**

Evento evento \= entityManager.find(Evento.class, 1);

La idea es que el desarrollador piense en objetos y no en tablas.

---

# Entity (@Entity)

Una entidad representa un objeto que será almacenado en la base de datos.

### Ejemplo

@Entity  
public class Evento {  
}

Podemos imaginar una entidad como el equivalente a una tabla.

| Clase Java | Base de Datos |
| ----- | ----- |
| Evento | Tabla Evento |
| Usuario | Tabla Usuario |

---

# Clave Primaria (@Id)

Toda entidad necesita una forma única de identificarse.

### Ejemplo

@Id  
private int id;

Cada registro tendrá un identificador diferente.

| id | nombre |
| ----- | ----- |
| 1 | Festival Rock |
| 2 | Primavera Sound |

Gracias a este identificador podemos localizar exactamente un registro.

---

# Generación Automática de IDs

JPA puede generar automáticamente los identificadores.

@Id  
@GeneratedValue  
private int id;

### ¿Para qué sirve?

Evita que el programador tenga que asignar manualmente un número único.

Es como hacer en SQL:

id INT AUTO\_INCREMENT

---

# Campos Transitorios (@Transient)

Hay datos que sólo son útiles mientras el programa está funcionando.

### Ejemplo

@Transient  
private int contador;

Este valor existe en memoria pero no se guarda en la base de datos.

### Caso real

Un contador de visitas temporal o una variable auxiliar para cálculos.

---

# Herencia en Persistencia

Las clases hijas heredan los atributos persistentes de las clases padre.

### Ejemplo

Persona  
└── Artista

Si Persona tiene:

nombre  
edad

Artista heredará esos campos automáticamente.

Esto permite reutilizar código y mantener una estructura más limpia.

---

# Composición

La composición representa una relación del tipo:

"Tiene un".

### Ejemplo

Evento tiene Dirección

public class Evento {  
   private Direccion direccion;  
}

### Situación real

Un evento puede tener una dirección, pero la dirección no existe por sí sola dentro del sistema.

---

# EntityManager

Es el objeto encargado de comunicarse con la base de datos.

Podemos imaginarlo como un intermediario.

### Funciones principales

* Guardar objetos.  
* Buscar objetos.  
* Modificar objetos.  
* Eliminar objetos.

---

# CRUD

CRUD son las cuatro operaciones básicas de cualquier base de datos.

| Operación | Significado |
| ----- | ----- |
| Create | Crear |
| Read | Leer |
| Update | Modificar |
| Delete | Eliminar |

### Ejemplo real

En una aplicación de eventos:

* Crear un evento.  
* Consultar un evento.  
* Modificar el precio de una entrada.  
* Eliminar un evento cancelado.

---

# JPQL

JPQL es el lenguaje de consultas de JPA.

Se parece mucho a SQL, pero trabaja con objetos.

### **SQL**

SELECT \* FROM evento;

### **JPQL**

SELECT e FROM Evento e

La diferencia es que JPQL consulta clases y objetos, no tablas.

---

# JDBC

JDBC significa Java Database Connectivity.

### ¿Para qué sirve?

Permite conectar directamente Java con una base de datos relacional como MariaDB.

### Comparación sencilla

**JDBC:**

Hablas directamente en SQL con la base de datos.

**JPA:**

Hablas en Java y JPA traduce automáticamente a SQL.

---

# Statement

Un Statement permite ejecutar sentencias SQL desde Java.

### Ejemplo

Statement stmt \= conexion.createStatement();

Con él podemos lanzar consultas como:

SELECT \* FROM productos  
---

# ResultSet

Un ResultSet almacena los resultados obtenidos de una consulta.

### Ejemplo

ResultSet rs \= stmt.executeQuery(sql);

### ¿Cómo funciona?

Se recorre fila por fila:

while(rs.next()){  
   System.out.println(rs.getString("nombre"));  
}

Es parecido a leer una tabla línea por línea.

---

# Batch (Ejecución por lotes)

Permite ejecutar varias consultas juntas en una única transacción.

### ¿Por qué es útil?

Porque mejora mucho el rendimiento.

### Ejemplo

Si queremos insertar 1000 productos:

En lugar de hacer 1000 transacciones independientes.

Se hace 1 única transacción con las 1000 inserciones.

La segunda opción es mucho más rápida.

---

# Metadatos

Los metadatos son información sobre la propia base de datos.

### Ejemplos

* Nombre de las tablas.  
* Columnas de una tabla.  
* Usuario conectado.  
* Driver utilizado.  
* Versión del gestor de bases de datos.

Es como consultar el "manual interno" de la base de datos.

---

# Tablas comparativas

| Operacion | SQL | JPA |
| :---- | :---- | :---- |
| Insertar registro | INSERT INTO tabla VALUES (registro) | em.persist(evento) |
| Obtener registros | SELECT \* FROM tabla | SELECT e FROM tabla e |
| Buscar por ID | SELECT \* FROM tabla WHERE id=1 | em.find(tabla.class, 1\) |
| Buscar por campo | SELECT \* FROM  tabla WHERE nombre \= ‘España’ | SELECT e FROM tabla e WHERE e.nombre=’España’ |
| Ordenar resultados | SELECT \* FROM evento WHERE nombre='Rock Fest'  | SELECT e FROM Evento e WHERE e.nombre='Rock Fest'  |
| Contar registros  | SELECT COUNT(\*) FROM tabla | SELECT COUNT(E) FROM tabla e |
| Actualizar datos | UPDATE tabla SET nombre=’españa’ WHERE id=1  | tabla.setNombre(‘españa’) |
| Eliminar regristro | DELETE FROM tabla WHERE id=1 | em.remove(tabla) |
| Obtener resultado | SELECT \* FROM tabla WHERE id=1 | query.getSingleResult(); |
| Obtener varios resultados | SELECT \* FROM tabla  | query.getResultList(); |
| Crear consulta | Sentencia SQL | createQuery(“SELECT e FROM tabla e”) |
| Modo de trabajo | SQL \- mas control | JPQL \- Mas sencillo de programar (similar a sql) |

