import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;

        System.out.println("Ingrese una secuencia de numeros naturales (0 para finalizar):");

        while (true) {
            System.out.print("Numero: ");
            double numero = scanner.nextDouble();

            if (numero == 0) {
                break;  // Termina la entrada cuando se encuentre 0.
            }

            suma += numero;
            contador++;
        }
        scanner.close();

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}