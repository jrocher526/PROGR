package UD9.ejercicio17;

import java.io.Serializable;

public class Persona implements Serializable { // implementamos serializable para poder guardar los datos en un archivo

    // Añadimos erialVersionUID SIEMPRE
    private static final long serialVersionUID = 1L;

    // Creamos atributos
    private String nombre;
    private String direccion;
    private int telefono;

    // Constructor
    public Persona(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona: " + "nombre: " + nombre + ", direccion: " + direccion + ", telefono: " + telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}