package Tema11.Ejercicios.ejercicio6;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio6 extends Frame implements ActionListener {

    // declarar los componentes y variables a nivel de clase
    private Button btnRestar;
    private Button btnSumar;
    private Label lblNumero;
    private int contador;

    // Constructor de clase que monta la interfaz
    public Ejercicio6() {
        super("Contador Interactivo");
        this.contador = 0;

        // Crerar FlowLayout
        setLayout(new FlowLayout());
        setSize(300, 100);

        // crer los componentes
        btnRestar = new Button("-1");
        lblNumero = new Label("0", Label.CENTER);
        btnSumar = new Button("+1");

        // conectar botones al this
        btnRestar.addActionListener(this);
        btnSumar.addActionListener(this);

        // añadir
        add(btnRestar);
        add(lblNumero);
        add(btnSumar);

        // Evento para cerrar la ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    // metodo para cundo se pulsa en el boton
    @Override
    public void actionPerformed(ActionEvent e) {
        // devuelve el objeto que provocó el evento
        if (e.getSource() == btnRestar) {
            contador--;
        } else if (e.getSource() == btnSumar) {
            contador++;
        }

        // actualizar el texto de la etiqueta transformando el int a String
        lblNumero.setText(String.valueOf(contador));
    }

    // metodo para iniciar
    public static void main(String[] args) {
        new Ejercicio6();
    }
}