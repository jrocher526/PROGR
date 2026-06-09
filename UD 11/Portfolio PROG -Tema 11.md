# **Unidad 11: Interfaces Gráficas**

---

# **Introducción**

Las interfaces gráficas de usuario (GUI, Graphical User Interface) permiten que el usuario interactúe con un programa mediante elementos visuales como ventanas, botones, menús y cuadros de texto.

Antes de la aparición de las interfaces gráficas, la mayoría de aplicaciones utilizaban interfaces de texto (CLI), donde el usuario debía introducir comandos mediante el teclado.

Las GUI facilitan el uso de las aplicaciones y hacen que resulten más intuitivas para cualquier usuario.

---

# **Librerías para crear interfaces gráficas en Java**

Java dispone de diferentes librerías para desarrollar aplicaciones gráficas.

Las principales son:

* AWT  
* Swing  
* JavaFX

Estas librerías proporcionan componentes que permiten construir ventanas e interfaces de usuario.

---

# **AWT**

AWT (Abstract Window Toolkit) fue la primera librería gráfica incluida en Java.

Sus componentes dependen directamente del sistema operativo donde se ejecuta la aplicación.

Por este motivo se consideran componentes **Heavy Weight**, ya que utilizan recursos gráficos proporcionados por el propio sistema operativo.

### **Ejemplos**

* Button \- Boton  
* Label \- Etiqueta  
* TextField \- Campo de texto  
* Frame \- Marco

---

# **Swing**

Swing es una evolución de AWT que amplía considerablemente el número de componentes disponibles.

Sus componentes son **Light Weight**, ya que están implementados completamente en Java y no dependen de la apariencia gráfica del sistema operativo.

### **Ventajas**

* Mayor variedad de componentes.  
* Más flexibilidad.  
* Aspecto uniforme en diferentes sistemas operativos.

---

# **JavaFX**

JavaFX es una tecnología más moderna para el desarrollo de interfaces gráficas.

Permite crear aplicaciones con diseños más avanzados y efectos visuales más elaborados.

Actualmente convive con Swing como una alternativa para el desarrollo de aplicaciones de escritorio en Java.

---

# **Componentes**

Todos los elementos visibles de una interfaz gráfica reciben el nombre de componentes.

Los componentes pueden clasificarse en dos grandes grupos:

* Contenedores.  
* Controles.

---

# **Contenedores**

Son componentes cuya función principal es contener otros componentes.

Permiten organizar la estructura de la interfaz gráfica.

### **Ejemplos**

* Window \- Ventana  
* Frame \- Marco  
* Pane \- Panel

---

# **Controles**

Son componentes que permiten al usuario interactuar con la aplicación o mostrar información.

### **Ejemplos**

* Button \- Boton  
* TextField \- Cuadro de texto  
* Label \- Etiqueta

---

# **Clase Container**

La clase Container es la base para los componentes capaces de contener otros componentes.

Gracias a ella es posible añadir elementos a una ventana y construir interfaces complejas mediante la combinación de distintos controles.

---

# **Eventos**

Un evento es un suceso que ocurre durante la ejecución de un programa y que puede ser detectado por la aplicación.

Los eventos permiten que la interfaz gráfica responda a las acciones realizadas por el usuario.

### **Ejemplos**

* Pulsar un botón.  
* Escribir una tecla.  
* Mover el ratón.  
* Cerrar una ventana.

---

# **Elementos de un evento**

Un evento está formado por tres elementos fundamentales.

## **Fuente**

Es el componente que genera el evento.

Ejemplo:

Un botón que es pulsado por el usuario.

## **Objeto evento**

Es el objeto que contiene la información sobre el suceso ocurrido.

Ejemplo:

ActionEvent

## **Listener**

Es el código encargado de gestionar el evento cuando se produce.

---

# **Funcionamiento de los eventos**

Cuando ocurre una acción:

1. Un componente genera el evento.  
2. Se crea un objeto que representa dicho evento.  
3. Un listener recibe la notificación.  
4. Se ejecuta el código asociado a la acción.

Este mecanismo permite implementar interfaces interactivas que reaccionan a las acciones del usuario.

---

# **Tipos de eventos**

Java dispone de diferentes clases de eventos según la acción realizada.

### **ActionEvent**

Se produce al:

* Pulsar un botón.  
* Seleccionar un menú.  
* Confirmar un campo de texto.

### **WindowEvent**

Se produce cuando ocurre alguna acción sobre una ventana.

### **MouseEvent**

Se genera al mover, arrastrar o hacer clic con el ratón.

### **KeyEvent**

Se produce cuando el usuario pulsa una tecla.

---

# **Listeners**

Los listeners son interfaces encargadas de escuchar y gestionar eventos.

Algunos de los más utilizados son:

| Evento | Listener |
| :---- | :---- |
| ActionEvent | ActionListener |
| WindowEvent | WindowListenerr |
| MouseEvent | MouseListener |
| KeyEvent | KeyListener |

---

# **Registro de listeners**

Para que un listener pueda recibir notificaciones debe registrarse previamente en el componente correspondiente.

### **Ejemplo**

boton.addActionListener(this);

De esta forma el botón notificará los eventos al listener registrado.

---

# **Layout**

Un Layout es el mecanismo encargado de organizar los componentes dentro de un contenedor.

Permite distribuir automáticamente los elementos de la interfaz.

---

# **Posicionamiento absoluto**

Consiste en colocar cada componente indicando manualmente sus coordenadas.

Para ello se utiliza:

**setLayout(null);**

Cada componente debe posicionarse mediante:

**setBounds(x,y,ancho,alto);**  
---

# **BorderLayout**

Divide el contenedor en cinco zonas:

* Norte (North)  
* Sur (South)  
* Este (East)  
* Oeste (West)  
* Centro (Center)

Permite distribuir los componentes de forma organizada.

---

# **FlowLayout**

Organiza los componentes de izquierda a derecha.

Cuando una fila se llena, continúa colocando componentes en la siguiente línea.

---

# **GridLayout**

Distribuye los componentes en una cuadrícula formada por filas y columnas.

Todos los componentes ocupan el mismo espacio.

Resulta especialmente útil para paneles de botones o teclados numéricos.

---

# **Menús**

Los menús permiten agrupar distintas opciones dentro de una aplicación.

Los principales componentes de un menú son:

* MenuBar  
* Menu  
* MenuItem  
* MenuShortcut  
* PopupMenu  
* CheckboxMenuItem

---

# **Ejemplo práctico de eventos**

Un ejemplo típico consiste en asociar un ActionListener a un botón.

Cuando el usuario pulsa dicho botón, se ejecuta automáticamente el método:

**actionPerformed(ActionEvent e)**

Desde este método podemos mostrar mensajes, modificar componentes o realizar cualquier acción necesaria dentro de la aplicación.

