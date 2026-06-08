package UD11.ejercicio4;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio4 extends Frame {

    public static void main(String[] args) {
        new Ejercicio4();
    }

    public Ejercicio4() {

        super("Panel Ascensor");

        // Cuadricula de 2 filas y 2 columnas
        setLayout(new GridLayout(2, 2)); // 2 fils, 2 columnas del mismo tamaño

        // Botones de los pisos
        add(new Button("Piso 1"));
        add(new Button("Piso 2"));
        add(new Button("Piso 3"));
        add(new Button("Piso 4"));

        setSize(300, 300);

        // Evento para cerrar la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evento) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}