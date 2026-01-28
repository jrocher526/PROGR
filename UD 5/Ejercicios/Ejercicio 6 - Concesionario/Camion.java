package ejercicio7;

public class Camion extends Vehiculo{
	
	// Atributos
	private float capacidadCarga;
	
	// Constructor
	Camion(String marca, String modelo, int anio, float capacidadCarga) {
		super(marca, modelo, anio);
		this.capacidadCarga = capacidadCarga;
	}
	// Metodo sobrescrito para mostrar detalles del camion
	@Override
	void mostrarDetalles() {
		System.out.println("Marca: " + getMarca() +  ", Modelo: " + getModelo() + ", Año: " + getAnio() + 
				", Capacidad de carga: " + capacidadCarga + "T");
	}
	// Metodo sobrescrito para decir que el camion esta en movimiento 
	@Override
	void mover() {
		System.out.println("El Camion esta en movimiento");
	}
	
	// Getters y Setters
	public float getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(float capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
}
