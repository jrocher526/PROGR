package ejercicio7;

public class Vehiculo {

	// Atributos 
	private String marca;
	private String modelo;
	private int anio;
	
	// Constructor
	Vehiculo(String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	// Metodo para mostrar detalles del Vehiculo
	void mostrarDetalles() {
		System.out.println("Marca: " + marca +  ", Modelo: " + modelo + ", Año: " + anio);
	}
	
	// Metodo para decir que el vehiculo esta en movimiento 
	void mover() {
		System.out.println("El vehiculo esta en movimiento");
	}

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
