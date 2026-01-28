package ejercicio7;

public class Coche extends Vehiculo{
	
	// Atributos
	private int numPuertas;
	
	Coche(String marca, String modelo, int anio, int numPuertas) {
		super(marca, modelo, anio);
		this.numPuertas = numPuertas;
	}
	// Metodo sobrescrito para mostrar detalles del coche
	@Override
	void mostrarDetalles() {
		System.out.println("Marca: " + getMarca() +  ", Modelo: " + getModelo() + ", Año: " + getAnio() + ", Puertas: " + numPuertas);
	}
	// Metodo sobrescrito para decir que el coche esta en movimiento 
	@Override
	void mover() {
		System.out.println("El Coche esta en movimiento");
	}
	
	// Getters y Setters
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
}
