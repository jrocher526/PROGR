package ejercicio2;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import ejercicios.Persona;

public class Ejercicio2 {
    public static void main(String[] args) {

    	//Copia el contructor 
    	List copia = new LinkedList(personas);
    	System.out.println(copia);
    	
    	// Copia con el add
    	List copia2 = new LinkedList();
    	for(Object x: personas) {
    		copia2.add(copia2);
    	}
    	copia2.addAll(personas);
    	System.out.println(copia2);
    	
    	// Intercambiar primera y ultima
    	if(!copia.isEmpty()) {
    		int primero = 0;
    		int ultimo = copia.size() -1;
    		Persona aux = copia.get(ultimo);
    		copia.set(ultimo, copia.get(primero));
    		copia.set(primero, aux);
    	}
    	System.out.println(copia);
    	
    	/*
    	// Parte 1
        // Personas (Ejercicio 1)
        Persona Paco = new Persona("Paco");
        Persona Adolfo = new Persona("Adolfo");
        Persona Martín = new Persona("Martín");

        // Lista original con ArrayList (Ejercicio 1)
        List<Persona> listaOriginal = new ArrayList<>();
        listaOriginal.add(Paco);
        listaOriginal.add(Adolfo);
        listaOriginal.add(Martín);
        System.out.println("Lista original: " + listaOriginal);
        
        // Parte 2
        // Copiar a LinkedList (Ejercicio 2) 
        LinkedList<Persona> lista = new LinkedList<>(listaOriginal);
        System.out.println("Lista copiada" + lista);

        // --- Intercambiar primera y última persona ---
        Persona primera = lista.getFirst();
        Persona ultima = lista.getLast();
        lista.set(0, ultima);
        lista.set(lista.size() - 1, primera);
        System.out.println("Lista tras intercambiar primera y última: " + lista);

        // --- Modificar el nombre de la primera persona ---
        lista.get(0).setNombre("NuevoNombre");
        System.out.println("Lista tras modificar nombre de la primera persona: " + lista);

        // --- Eliminar la persona que ocupa la posición central ---
        int indiceCentral = lista.size() / 2;
        lista.remove(indiceCentral);
        System.out.println("Lista tras eliminar la persona central: " + lista);

        // --- Recorrer con for clásico e imprimir nombres ---
        System.out.println("Recorrido de la lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        // --- Crear nueva persona y añadir a la lista ---
        Persona Emilio = new Persona("Emilio");
        lista.add(Emilio);
        System.out.println("Lista tras añadir nueva persona: " + lista);
        System.out.println("¿Contiene a Emilio? " + lista.contains(Emilio));

        // --- Vaciar la lista y comprobar si está vacía ---
        lista.clear();
        System.out.println("Lista tras vaciarla: " + lista);
        System.out.println("¿Está vacía? " + lista.isEmpty());
    */
    }
}