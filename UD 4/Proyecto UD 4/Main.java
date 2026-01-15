package proyecto;

public class Main {
    public static void main(String[] args) {
    	
    	// Creamos libros
        Libro libro1 = new Libro("121", "1984", "George Orwell", 1949, EstadoPrestamo.DISPONIBLE);
        Libro libro2 = new Libro("242", "El Principito", "Antoine de Saint-Exupery", 2015, EstadoPrestamo.DISPONIBLE);
        Libro libro3 = new Libro("353", "Don Quijote", "Miguel de Cervantes", 1605, EstadoPrestamo.DISPONIBLE);
        Libro libro4 = new Libro("464", "Harry Potter", "J.K. Rowling", 2008, EstadoPrestamo.DISPONIBLE);
        Libro libro5 = new Libro("525", "Los 3 cerditos", "Fran Gomez", 2009, EstadoPrestamo.DISPONIBLE);
        // Creamos usuarios
        Usuario usuario1 = new Usuario("12134111A", "Ana", 20);
        Usuario usuario2 = new Usuario("54354222B", "Luis", 22);
        Usuario usuario3 = new Usuario("75456333C", "Oscar", 25);
        
        // Estado del libro
        System.out.println("Estado de los libros:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        libro4.mostrarInformacion();
        libro5.mostrarInformacion();
        
        // Realizamos los prestamos
        Prestamo prestamo1 = new Prestamo(libro1, usuario1, 10);
        Prestamo prestamo2 = new Prestamo(libro2, usuario2, 7);
        Prestamo prestamo3 = new Prestamo(libro3, usuario3, 15);
        
        // Mostramos detalles de los prestamos
        System.out.println("\nDetalles de prestamos:");
        prestamo1.mostrarDetalle();
        prestamo2.mostrarDetalle();
        prestamo3.mostrarDetalle();

        // Mostramos informacion sobre los prestamos
        System.out.println("Estado tras prestamo:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        libro4.mostrarInformacion();
        libro5.mostrarInformacion();

        prestamo3.marcarRetraso();
        
        System.out.println("\nEstado tras retraso:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        libro4.mostrarInformacion();
        libro5.mostrarInformacion();
    }
}
