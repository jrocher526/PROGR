package ejercicios;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio1 {
	public static void main(String[] args) {

		// 1
		List personas = null;
		System.out.println(personas);

		// 2
		personas = new ArrayList();
		System.out.println(personas);

		Persona Paco = new Persona("Paco");
		Persona Adolfo = new Persona("Adolfo");
		Persona Martín = new Persona("Martín");

		// 3
		personas.add(Paco);
		personas.add(Adolfo);
		personas.add(Martín);
		System.out.println(personas);

		// 4
		System.out.println(personas.getLast());

		// 5
		Persona persona;
		persona = (Persona) personas.getFirst();
		persona.setNombre("Fran");

		// Lo mismo pero en una linea
		((Persona) personas.getFirst()).setNombre("Fran");

		// 6
		int indiceCentral = personas.size() / 2 - 1;
		personas.remove(indiceCentral);
		System.out.println(personas);

		// 7
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}

		// 8
		Persona Emilio = new Persona("Emilio");
		personas.add(Emilio);
		System.out.println("Contiene a la persona nueva? " + personas.contains(Emilio));

		// 9
		personas.clear();
		System.out.println(personas);
		System.out.println("¿Está vacía? " + personas.isEmpty());

	}

}
