package proyecto;

public class Libro {

	// Atributos 
	String isbn;
	String titulo;
	String autor;
	int anioPublicacion;
	EstadoPrestamo estado;
	
	// Constructor
	public Libro(String isbn, String titulo, String autor, int anioPublicacion, EstadoPrestamo estado) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.estado = estado;
	}

	// Metodos 

	// Saber si un libro es antiguo
	public boolean esAntiguo() {
	    if (this.anioPublicacion <= 2006) {
	        System.out.println("El libro es antiguo");
	        return true;
	    } else {
	        System.out.println("El libro no es antiguo");
	        return false;
	    }
	}
	
	// Mostramos la informacion de los libros
	public void mostrarInformacion() {
		System.out.println("Libro: ISBN: " + isbn + ", Titulo: " + titulo + ", Autor: " + autor + 
	        		", Año Publicacion: " + anioPublicacion + ", Estado: " + estado);
	    }
	    
	// Cambiamos el estado del prestamo
	public void cambiarEstado(EstadoPrestamo nuevoEstado) {
		this.estado = nuevoEstado;
	    }
}
