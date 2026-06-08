package UD11.ejercicio6;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio6 extends Frame implements ActionListener {

    // Componentes de la interfaz y variable contador
    private Button botonRestar;
    private Button botonSumar;
    private Label etiquetaNumero;
    private int contador;

    // Constructor
    public Ejercicio6() {
        super("Contador Interactivo");

        contador = 0;

        // Configuración de la ventana
        setLayout(new FlowLayout());
        setSize(300, 100);

        // Creación de componentes
        botonRestar = new Button("-1");
        etiquetaNumero = new Label("0", Label.CENTER);
        botonSumar = new Button("+1");

        // Asociación de eventos
        botonRestar.addActionListener(this);
        botonSumar.addActionListener(this);

        // Añadir componentes a la ventana
        add(botonRestar);
        add(etiquetaNumero);
        add(botonSumar);

        // Evento para cerrar la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Mostrar la ventana
        setVisible(true);
    }

    // Se ejecuta al pulsar un botón
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == botonRestar) {
            contador--;
        } else if (evento.getSource() == botonSumar) {
            contador++;
        }

        // Actualizar el número mostrado
        etiquetaNumero.setText(String.valueOf(contador));
    }

    // Método principal
    public static void main(String[] args) {
        new Ejercicio6();
    }
}
