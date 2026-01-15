package proyecto;

public class Prestamo {

	// Atributos
	Libro libro;
	Usuario usuario;
	int diasPrestamo;

	// Constructor
    public Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;
        this.libro.cambiarEstado(EstadoPrestamo.PRESTADO);
    }

    // Metodos
    public void mostrarDetalle() {
        libro.mostrarInformacion();
        usuario.mostrarDatos();
        libro.esAntiguo();
        System.out.println("Dias de prestamo: " + diasPrestamo + "\n");
    }

    public void marcarRetraso() {
        libro.cambiarEstado(EstadoPrestamo.RETRASADO);
    }
}
