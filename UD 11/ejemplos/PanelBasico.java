package UD11.ejemplos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBasico {
    public static void main(String[] args) {

        // Creacion de la ventana
        // Creamos una ventana con el título "Hola mundo"
        Frame frame = new Frame("Hola mundo");

        // Color de fondo azul
        frame.setBackground(Color.BLUE);

        // Sin Layout Manager
        // Los componentes se colocarán manualmente
        frame.setLayout(null);

        // Tamaño de la ventana
        frame.setSize(300, 300);

        // Creacion del boton
        Button button = new Button("Salir");

        // Posición y tamaño del botón
        // x = 125
        // y = 125
        // ancho = 50
        // alto = 50
        button.setBounds(125, 125, 50, 50);

        // Controlador del botón
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Obtiene la ventana que contiene el botón
                Frame ventana = (Frame) button.getParent();

                // Cierra la ventana
                ventana.dispose();
            }
        });
        // Añadir boton a la ventana
        frame.add(button);

        // Mostrar ventana
        frame.setVisible(true);
    }
}
