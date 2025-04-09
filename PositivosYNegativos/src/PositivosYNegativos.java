/* Pedir un numero para saber la longitud de la secuencia, luego ingresar los numeros enteros de la secuencia,
* y finalmente mostrar los numeros positivos en una linea y debajo los numeros negativos */

import java.util.Scanner;

public class PositivosYNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la longitud de la secuencia.
        System.out.print("Ingrese la cantidad de números de la secuencia: ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        // Solicitar los valores de la secuencia.
        System.out.println("Ingrese los " + cantidad + "números enteros: ");
        for (int i = 0; i < cantidad; i++)  {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Numeros Positivos: ");
        for (int numero : numeros) {
            if (numero > 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("");
        
        System.out.print("Numeros Negativos: ");
        for (int numero : numeros) {
            if (numero < 0 ) {
                System.out.print(numero + " ");
            }
        }
    }
}