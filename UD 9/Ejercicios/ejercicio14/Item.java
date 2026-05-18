package ejercicio14;

import java.io.*;

class Item implements Serializable { // Implementamos Serializable para poder guardar en un archivo

    // Añadimos erialVersionUID SIEMPRE
    private static final long serialVersionUID = 1L;

    // Atributos 
    private String nombre;
	private double peso;
    private double valor;
    
    // Constructor
	public Item(String nombre, double peso, double valor) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }
    
    // Método toString para mostrar información del objeto
    @Override
    public String toString() {
        return "Item: " + "nombre: " + nombre + ", peso: " + peso + ", valor: " + valor;
    }
    
    // Getters y Setters
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
