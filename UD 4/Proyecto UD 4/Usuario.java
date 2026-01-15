package proyecto;

public class Usuario {

	// Atributos
	String dni;
	String nombre;
	int edad;
	
	public Usuario(String dni, String nombre, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Metodos
    public void mostrarDatos() {
        System.out.println("Usuario: Nombre: " + nombre + ", edad: " + edad + ", DNI: " + dni);
    }
	
}
