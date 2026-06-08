package Tema11.Ejercicios.ejercicio7;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio7 extends Frame implements ActionListener {

    // declarar componentes
    private TextField txtUsuario;
    private TextField txtPass;
    private Button btnAceptar;
    private Button btnLimpiar;
    private Button btnFichero;
    private Label lblRuta;

    public Ejercicio7() {
        super("Pantalla de Login");

        // desactivar  layout automático
        setLayout(null);
        setSize(400, 320);

        // crear los componentes
        Label lblUsuario = new Label("Usuario:");
        lblUsuario.setBounds(50, 50, 80, 30);
        txtUsuario = new TextField();
        txtUsuario.setBounds(140, 50, 180, 30);

        Label lblPass = new Label("Contraseña:");
        lblPass.setBounds(50, 100, 80, 30);
        txtPass = new TextField();
        txtPass.setEchoChar('*'); // Oculta el texto
        txtPass.setBounds(140, 100, 180, 30);

        btnAceptar = new Button("Aceptar");
        btnAceptar.setBounds(50, 160, 100, 30);

        btnLimpiar = new Button("Limpiar");
        btnLimpiar.setBounds(160, 160, 100, 30);

        btnFichero = new Button("Seleccionar Fichero");
        btnFichero.setBounds(50, 210, 150, 30);

        lblRuta = new Label("Ningún fichero seleccionado");
        lblRuta.setBounds(50, 250, 320, 30);

        // registarar eventos
        btnAceptar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnFichero.addActionListener(this);

        // evento pra cerrar la ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // añadir al frame
        add(lblUsuario);
        add(txtUsuario);
        add(lblPass);
        add(txtPass);
        add(btnAceptar);
        add(btnLimpiar);
        add(btnFichero);
        add(lblRuta);

        setVisible(true);
    }

    // eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            String usuarioStr = txtUsuario.getText();

            // Instanciamos el diálogo (Padre, Título, Modal=true)
            Dialog dialogoBienvenida = new Dialog(this, "Mensaje", true);
            dialogoBienvenida.setLayout(new FlowLayout());
            dialogoBienvenida.setSize(250, 100);

            // Componentes internos del diálogo
            Label lblMensaje = new Label("¡Bienvenido, " + usuarioStr + "!");
            Button btnCerrarDialogo = new Button("OK");

            // Evento para que el botón OK destruya el diálogo
            btnCerrarDialogo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    dialogoBienvenida.dispose();
                }
            });

            // Añadir y mostrar
            dialogoBienvenida.add(lblMensaje);
            dialogoBienvenida.add(btnCerrarDialogo);
            // centrar con l ventana principl
            dialogoBienvenida.setLocationRelativeTo(this);
            dialogoBienvenida.setVisible(true);
        }

        // borrar todos los campos
        else if (e.getSource() == btnLimpiar) {
            txtUsuario.setText("");
            txtPass.setText("");
        }

        // fichero
        else if (e.getSource() == btnFichero) {
            FileDialog fd = new FileDialog(this, "Elige un archivo", FileDialog.LOAD);
            fd.setVisible(true);

            if (fd.getFile() != null) {
                String rutaCompleta = fd.getDirectory() + fd.getFile();
                lblRuta.setText("Archivo: " + rutaCompleta);
            }
        }
    }

    // iniciaar
    public static void main(String[] args) {
        new Ejercicio7();
    }
}