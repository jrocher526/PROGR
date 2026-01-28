package ejercicio7;

public class Moto extends Vehiculo{
	
	// Atributos
	private boolean tieneSidecar;
	
	// Constructor
	Moto(String marca, String modelo, int anio, boolean tieneSidecar) {
		super(marca, modelo, anio);
		this.tieneSidecar = tieneSidecar;
	}
	// Metodo sobrescrito para mostrar detalles de la moto
	@Override
	void mostrarDetalles() {
		System.out.println("Marca: " + getMarca() +  ", Modelo: " + getModelo() + ", Año: " + getAnio() + ", Sidecar: " + tieneSidecar);
	}
	// Metodo sobrescrito para decir que la moto esta en movimiento 
	@Override
	void mover() {
		System.out.println("La Moto esta en movimiento");
	}
	
	// Getters y Setters
	public boolean isTieneSidecar() {
		return tieneSidecar;
	}
	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
}
