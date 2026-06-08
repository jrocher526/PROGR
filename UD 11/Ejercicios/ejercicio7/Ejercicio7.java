package UD11.ejercicio7;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio7 extends Frame implements ActionListener {

    // Campos de texto
    private TextField campoUsuario;
    private TextField campoContrasena;

    // Botones
    private Button botonAceptar;
    private Button botonLimpiar;
    private Button botonSeleccionarFichero;

    // Etiqueta para mostrar la ruta del fichero
    private Label etiquetaRuta;

    // Método principal
    public static void main(String[] args) {
        new Ejercicio7();
    }

    // Constructor
    public Ejercicio7() {

        super("Pantalla de Login");

        setLayout(null);
        setSize(400, 320);

        // Usuario
        Label etiquetaUsuario = new Label("Usuario:");
        etiquetaUsuario.setBounds(50, 50, 80, 30);

        campoUsuario = new TextField();
        campoUsuario.setBounds(140, 50, 180, 30);

        // Contraseña
        Label etiquetaContrasena = new Label("Contraseña:");
        etiquetaContrasena.setBounds(50, 100, 80, 30);

        campoContrasena = new TextField();
        campoContrasena.setEchoChar('*');
        campoContrasena.setBounds(140, 100, 180, 30);

        // Botón aceptar
        botonAceptar = new Button("Aceptar");
        botonAceptar.setBounds(50, 160, 100, 30);

        // Botón limpiar
        botonLimpiar = new Button("Limpiar");
        botonLimpiar.setBounds(160, 160, 100, 30);

        // Botón seleccionar fichero
        botonSeleccionarFichero = new Button("Seleccionar Fichero");
        botonSeleccionarFichero.setBounds(50, 210, 150, 30);

        // Etiqueta de ruta
        etiquetaRuta = new Label("Ningún fichero seleccionado");
        etiquetaRuta.setBounds(50, 250, 320, 30);

        // Registrar eventos
        botonAceptar.addActionListener(this);
        botonLimpiar.addActionListener(this);
        botonSeleccionarFichero.addActionListener(this);

        // Evento de cierre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Añadir componentes
        add(etiquetaUsuario);
        add(campoUsuario);

        add(etiquetaContrasena);
        add(campoContrasena);

        add(botonAceptar);
        add(botonLimpiar);

        add(botonSeleccionarFichero);
        add(etiquetaRuta);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        // Botón Aceptar
        if (evento.getSource() == botonAceptar) {

            String usuario = campoUsuario.getText();

            Dialog dialogo = new Dialog(this, "Bienvenida", true);
            dialogo.setLayout(new FlowLayout());
            dialogo.setSize(250, 100);

            Label mensaje =
                    new Label("¡Bienvenido, " + usuario + "!");

            Button botonOK = new Button("OK");

            botonOK.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialogo.dispose();
                }
            });

            dialogo.add(mensaje);
            dialogo.add(botonOK);

            dialogo.setLocationRelativeTo(this);
            dialogo.setVisible(true);
        }

        // Botón Limpiar
        else if (evento.getSource() == botonLimpiar) {

            campoUsuario.setText("");
            campoContrasena.setText("");
        }

        // Botón Seleccionar Fichero
        else if (evento.getSource() == botonSeleccionarFichero) {

            FileDialog selector =
                    new FileDialog(this,
                            "Selecciona un fichero",
                            FileDialog.LOAD);

            selector.setVisible(true);

            if (selector.getFile() != null) {

                String ruta =
                        selector.getDirectory()
                                + selector.getFile();

                etiquetaRuta.setText("Archivo: " + ruta);
            }
        }
    }
}
