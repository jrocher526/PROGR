package ejercicio7;

public class Concesionario {
	public static void main(String[] args) {

		// Creamos 2  Vehiculos
		Vehiculo raptor = new Vehiculo("Ford", "Raptor", 2024);
		Vehiculo sequoia = new Vehiculo("Toyota", "Sequoia", 2025);
		
		// Creamos 2 Coches
		Coche camaro = new Coche("Chevrolet", "Camaro", 2012, 2);
		Coche aveo = new Coche("Chevrolet", "Aveo", 2015, 4);
		
		// Creamos 2 Camiones
		Camion f150 = new Camion("Chevrolet", "F-150", 2006, 6);
		Camion silverado = new Camion("Chevrolet", "Silverado", 2015, 8);
		
		// Creamos 2 Motos
		Moto mt09 = new Moto("Yamaha", "MT-09", 2023, false);
		Moto z900 = new Moto("Kawasaki", "Z900", 2025, false);
		
		// Mostramos informacion
		System.out.println("Informacion de los vehiculos:");
		raptor.mostrarDetalles();
		sequoia.mostrarDetalles();
		camaro.mostrarDetalles();
		aveo.mostrarDetalles();
		f150.mostrarDetalles();
		silverado.mostrarDetalles();
		mt09.mostrarDetalles();
		z900.mostrarDetalles();
		
		// Modificamos datos usando Set
		mt09.setTieneSidecar(true);
		sequoia.setModelo("Sequoia TDR");
		aveo.setNumPuertas(2);
		f150.setAnio(2025);
		
		// Mostramos informacion (Modificada)
		System.out.println("\nInformacion Actualizada:");
		raptor.mostrarDetalles();
		sequoia.mostrarDetalles();
		camaro.mostrarDetalles();
		aveo.mostrarDetalles();
		f150.mostrarDetalles();
		silverado.mostrarDetalles();
		mt09.mostrarDetalles();
		z900.mostrarDetalles();
		
		// Estado del los vehiculos
		System.out.println("\nEstado del vehiculo:");
		raptor.mover();
		z900.mover();
		silverado.mover();
		
	}
}
