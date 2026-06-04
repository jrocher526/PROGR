package UD11.ejemplos;

import java.awt.*;
import java.awt.event.ActionListener;

public class EjemploEvento {
    public void main(String[] args) {
        Frame ventana = new Frame("Eventos");
        ventana.setSize(300, 300);
        ventana.setLayout(new FlowLayout());

        Button miBoton = new Button("Pulsar");
        ventana.add(miBoton, BorderLayout.CENTER);

        ActionListener controlBoton = new MiListener();

        miBoton.addActionListener(controlBoton);


        ventana.setVisible(true);
    }
}
