package proyectocalculadorajava;

import java.util.Scanner;

public class ProyectoCalculadoraJava {

    static int num1 = 0;
    static int num2 = 0;
    static double resultado = 0.0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;

        do {
            System.out.println("================================================");
            System.out.println("               CALCULADORA AVANZADA             ");
            System.out.println("================================================");

            System.out.println("\n[OPERACIONES BÁSICAS]");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            System.out.println("\n[OPERACIONES INTERMEDIAS]");
            System.out.println("5. Raíz Cuadrada");
            System.out.println("6. Máximo Común Divisor");
            System.out.println("7. Mínimo Común Múltiplo");

            System.out.println("\n[OPERACIONES AVANZADAS]");
            System.out.println("8. Cálculo área Triángulo");
            System.out.println("9. Cálculo área Círculo");
            System.out.println("10. Cálculo área Rectángulo");
            System.out.println("11. Calcular si es primo");
            System.out.println("================================================");
            System.out.println("Introduzca número de operación a realizar (0 para salir):");
            opt = scan.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                    pedirNumeros(scan);
                    realizarSuma(num1, num2);
                    System.out.println("Resultado: " + (int)resultado);
                    break;

                case 2:
                    pedirNumeros(scan);
                    realizarResta(num1, num2);
                    System.out.println("Resultado: " + (int)resultado);
                    break;

                case 3:
                    pedirNumeros(scan);
                    realizarMultiplicacion();
                    System.out.println("Resultado: " + (int)resultado);
                    break;

                case 4:
                    pedirNumeros(scan);
                    realizarDivision();
                    System.out.println("Resultado: " + resultado);
                    break;

                case 5:
                    pedirUnNumero(scan);
                    realizarRaizCuadrada();
                    break;

                case 6:
                    pedirNumeros(scan);
                    mcd();
                    break;

                case 7:
                    pedirNumeros(scan);
                    mcm();
                    break;

                case 8:
                    pedirNumeros(scan);
                    calcularAreaTriangulo();
                    System.out.println("Área del triángulo: " + resultado);
                    break;

                case 9:
                    pedirUnNumero(scan);
                    calcularAreaCirculo();
                    System.out.println("Área del círculo: " + resultado);
                    break;

                case 10:
                    pedirNumeros(scan);
                    calcularAreaRectangulo();
                    System.out.println("Área del rectángulo: " + resultado);
                    break;

                case 11:
                    pedirUnNumero(scan);
                    calcularPrimo();
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opt != 0);
    }

    public static void pedirNumeros(Scanner sc) {
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
    }

    public static void pedirUnNumero(Scanner sc) {
        System.out.print("Introduzca un número: ");
        num1 = sc.nextInt();
    }

    // Ahora estas funciones reciben parámetros
    public static void realizarSuma(int a, int b) {
        resultado = a + b;
    }

    public static void realizarResta(int a, int b) {
        resultado = a - b;
    }

    // Las siguientes siguen igual
    public static void realizarMultiplicacion() {
        resultado = num1 * num2;
    }

    public static void realizarDivision() {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            resultado = Double.NaN;
        } else {
            resultado = (double) num1 / num2;
            System.out.println("El resto de la división es: " + (num1 % num2));
        }
    }

    public static void realizarRaizCuadrada() {
        if (num1 < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double r = Math.sqrt(num1);
            System.out.println("La raíz cuadrada es: " + (int)r);
        }
    }

    public static void mcd() {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        resultado = a;
        System.out.println("El MCD es: " + resultado);
    }

    public static int calcularMcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void mcm() {
        resultado = Math.abs(num1 * num2) / calcularMcd(num1, num2);
        System.out.println("El MCM es: " + resultado);
    }

    public static void calcularAreaTriangulo() {
        resultado = (num1 * num2) / 2.0;
    }

    public static void calcularAreaCirculo() {
        resultado = Math.PI * num1 * num1;
    }

    public static void calcularAreaRectangulo() {
        resultado = num1 * num2;
    }

    public static void calcularPrimo() {
        if (num1 < 2) {
            System.out.println("El número " + num1 + " no es primo.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num1); i++) {
            if (num1 % i == 0) {
                System.out.println("El número " + num1 + " no es primo.");
                return;
            }
        }

        System.out.println("El número " + num1 + " es primo.");
    }
}
