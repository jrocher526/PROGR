package ejercicio7;

import java.io.File;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ruta del archivo
        File archivo = new File("prueba.txt");

        // comprobar si el archivo existe
        if (archivo.exists()) {
            System.out.println("Información del Archivo");

            // Nombre del archivo
            System.out.println("Nombre: " + archivo.getName());

            // Ruta absoluta
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            // Tamaño en bytes
            System.out.println("Tamaño: " + archivo.length() + " bytes");

            // Permisos de lectura y escritura
            System.out.println("¿Se puede leer?: " + (archivo.canRead() ? "Sí" : "No"));
            System.out.println("¿Se puede escribir?: " + (archivo.canWrite() ? "Sí" : "No"));

            // Verificar si es un fichero o un directorio
            if (archivo.isFile()) {
                System.out.println("Tipo: Es un fichero.");
            } else if (archivo.isDirectory()) {
                System.out.println("Tipo: Es un directorio.");
            }

        } else {
            System.out.println("El archivo no existe en la ruta especificada.");
        }
    }
}