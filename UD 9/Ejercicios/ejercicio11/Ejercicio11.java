package ejercicio11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		// Creamos objeto File
		File fichero = new File("record.txt");

		// Declarar RandomAccessFile (accede a cualquier parte del archivo sin leerlo
		// completo)
		RandomAccessFile access = null;

		try {
			// Compprobamos si existe
			if (!fichero.exists()) {

				// Creamos fichero
				fichero.createNewFile();

				// Abrimos el fichero en modo lectura y escritura
				access = new RandomAccessFile(fichero, "rw");

				// Escribimos
				access.writeBytes("Nivel:001");

				// Cerrar archivo
				access.close();
				
				System.out.println(fichero.getAbsolutePath()); 
			}

			// Pedir al usuario el nuevo nivel
			System.out.print("Introduce el nuevo nivel: ");
			int nivel = sc.nextInt();

			// Convertir el numero a formato de 3 cifras
			String nivelTexto = String.format("%03d", nivel);

			// Abrir archivo en modo lectura/escritura
			access = new RandomAccessFile(fichero, "rw");

			access.seek(6);

			// Sobrescribir únicamente el número
			access.writeBytes(nivelTexto);

			// Volver al inicio del archivo
			access.seek(0);

			// Mostrar contenido actualizado
			System.out.println("\nContenido actualizado:");

			// Leer línea completa del archivo
			String linea = access.readLine();
			

			// Mostrar linea por consola
			System.out.println(linea);

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {

			access.close();
			sc.close();
		}
	}
}