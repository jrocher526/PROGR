package ejercicio1;

import java.util.Scanner;
import java.util.InputMismatchException;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comienzo programa division");

        try {
            // Pedimos dividendo y divisor al usuario
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();
            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            // Intentamos la divisin
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ex) {
            // Captura division por cero
            System.out.println("Imposible dividir por 0");
            System.out.println("excepcion: " + ex.getMessage());
            ex.printStackTrace();

        } catch (InputMismatchException ex) {
            // Captura cuando se introducen letras u otro tipo no numerico
            System.out.println("Error: Debes introducir numeros enteros");
            System.out.println("excepcion: " + ex.getMessage());
            ex.printStackTrace();

        } catch (Exception ex) {
            // Captura cualquier otra excepcion
            System.out.println("excepcion: " + ex.getMessage());
            ex.printStackTrace();

        } catch (Throwable t) {
            // Captura errores y excepciones graves
            System.out.println("excepcion o error: " + t);
            t.printStackTrace();

        } finally {
            // Se ejecuta siempre
        	sc.close();
        	System.out.println("Fujo cerrado");
        }
        System.out.println("Fin programa division");
    }
}

/*
1. Que ocurre al ejecutar el programa original:
   - Division por cero lanza ArithmeticException y el programa se detiene.

2. try-catch-finally:
   - try: division.
   - catch: imprime "Imposible dividir por 0" si hay ArithmeticException.
   - finally: se ejecuta siempre.

3. Flujo:
   - Sin excepcion: se ejecuta try, luego finally, luego fin programa.
   - Con excepcion: se ejecuta catch, luego finally, luego fin programa.

4. Mensaje de la excepcion: ex.getMessage().

5. Traza de la excepcion: ex.printStackTrace().

6. Pedir datos al usuario:
   - El flujo del Scanner se cierra en finally.

7. Letras en vez de nmeros:
   - Lanza InputMismatchException.

8. Prevencion o gestion:
   - Mejor gestionarla con try-catch y validar entradas.

9. Catch para Exception:
   - Captura cualquier otra excepcion no prevista.

10. Capturar Throwable:
    - Si es posible, captura excepciones y errores graves.
*/