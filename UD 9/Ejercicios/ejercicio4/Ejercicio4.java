package ejercicio4;

import java.io.IOException;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		byte b[] = new byte[5]; //Crea un array de 5 caracteres
		try {
			System.in.read(b); // Podemos escribir todos los caracteres que queramos
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		String s = new String(b);
		System.out.println(s); // Solo imprime los 5 primeros caracteres
	}

}

/*
 * Crea un array de bytes de tamaño 5
 * Lee caracteres desde teclado usando System.in.read(b)
 * Guarda los bytes introducidos en el array
 * Convierte el array de bytes a String
 * Muestra el contenido por pantalla
 */