import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar opciones.
            System.out.println("\nSeleccione una opción: ");
            System.out.println("1: Mostrar 'Hola Mundo !!'");
            System.out.println("2: Mostrar abecedario en mayúsculas.");
            System.out.println("3: Sumar numeros naturales hasta n");
            System.out.println("0: Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarHolaMundo();
                    break;
                case 2:
                    mostrarAbecedario();
                    break;
                case 3:
                    System.out.println("Ingrese un número natural: ");
                    int n = scanner.nextInt();
                    int suma = sumarNumerosNaturales(n);
                    System.out.println("La suma de los numeros naturales hasta " + n + " es: " + suma);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
          scanner.close();
    }
    public static void mostrarHolaMundo() {
        System.out.println("Hola Mundo !!!");
    }
    public static void mostrarAbecedario() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static int sumarNumerosNaturales(int n) {
        int suma = 0;
        for (int i = 1; i <=n; i++) {
            suma += i;
        } return suma;
    }
}