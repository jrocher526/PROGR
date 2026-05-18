package ejercicio14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Declaramos el nombre del archivo
        String archivo = "mochila.bin";

        // Creamos items
        ArrayList<Item> mochila = new ArrayList<>();

        mochila.add(new Item("Bate", 4.5, 150));
        mochila.add(new Item("Pelota", 0.5, 50));
        mochila.add(new Item("Casco", 6.0, 200));
        mochila.add(new Item("Zapatos", 2.0, 120));
        mochila.add(new Item("Telefono", 0.2, 30));

        // Guardamos en el archivo
        try {

            // ObjectOutputStream permite escribir objetos en un archivo
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));

            // writeObject guarda el ArrayList completo
            salida.writeObject(mochila);

            salida.close();

            System.out.println("Mochila guardada");

        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
            e.printStackTrace();
        }

        // 3. RECUPERAR DESDE ARCHIVO
        try {

            // ObjectInputStream permite leer objetos desde un archivo
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));

            // Leemos el objeto y hacemos casting a ArrayList<Item> (read object nos devulve objeto)
            ArrayList<Item> mochilaLeida = (ArrayList<Item>) entrada.readObject();

            entrada.close();

            System.out.println("\nItems recuperados:");

            double valorTotal = 0;

            for (Item item : mochilaLeida) {

                System.out.println(item);

                // Sumamos el valor de cada item
                valorTotal += item.getValor();
            }

            System.out.println("\nValor total de la mochila: " + valorTotal);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
    }
}	
