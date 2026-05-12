package ejercicio9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9 {
	public static void main(String[] args) {

		// Crear objeto File
		File miFichero = new File("notas.txt");

		// Declarar FileWriter fuera del try
		FileWriter escritor = null;

		try {

			// Verificar si existe
			if (miFichero.exists()) {

				System.out.println("Archivo encontrado: " + miFichero.getName());

			} else {

				System.out.println("El archivo no existe.");

				// Crear archivo
				if (miFichero.createNewFile()) {

					System.out.println("Archivo creado correctamente.");

				}
			}

			// ESCRIBIR EN EL ARCHIVO
			escritor = new FileWriter(miFichero);

			escritor.write("Hola soy jhonal.\n");
			escritor.write("Estoy escribiendo.");

			System.out.println("Datos escritos correctamente.");

		} catch (IOException e) {

			System.err.println(e.getMessage());
			e.printStackTrace();

		} finally {

			// Cerrar el archivo si fue abierto
			try {

				if (escritor != null) {

					escritor.close();
				}

			} catch (IOException e) {

				System.out.println("Error al cerrar el archivo.");
			}
		}
	}
}