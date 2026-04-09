package ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Punto 1
		// Creamos la lista 
		List<String> nombres = new ArrayList<>();
		
		// Crear Variable edad
		int edad;
		
		// Añadimos nombres a la lista 
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Marta");
		nombres.add("Carlos");
		nombres.add("Carlos");
		
		// Punto 2
		// Mostrar lista inicial
		System.out.println("Lista inicial: ");
		mostrarNombres(nombres);
		
		// Punto 3
		// Añadir nuevos nombres
		System.out.println("\nIntroduce un nuevo nombre: ");
		String nuevoNombre = sc.nextLine();
		
		nombres.add(nuevoNombre); // añadimos a la lista 
		
		System.out.println("Lista actualizada: ");
		mostrarNombres(nombres);
		
		// Punto 4
		// Eliminar un nombre
		System.out.println("Mete el nombre que quieres eliminar: ");
		String nombreEliminar = sc.nextLine();
		
		if (!nombres.remove(nombreEliminar)) {
			System.out.println("Nombe eliminado");
		} else {
			System.out.println("Nombre no esta en la lusta");
		}
		
		// Punto 5
		// Mostrar Lista final
		System.out.println("\nLista final: ");
		mostrarNombres(nombres);
		
	}
	
    private static void mostrarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}