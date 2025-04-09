/* Pedir la cantidad de filas y columnas que tendra mi matriz y solicitar un caracter.
*  completar la matriz desde el caracter que he introducido*/

import java.util.Scanner;

public class MatrizCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar filas y columnas de la matriz.
        System.out.print("Ingrese la cantidad de filas y columnas: ");
        int tamanio = scanner.nextInt();

        // Solicitar un caracter.
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Crear y mostrar la matriz.
        int asciiCode = (int) caracter;
        for (int i = 0; i < tamanio; i++) {
            for ( int j = 0; j < tamanio; j++) {
                System.out.print((char) asciiCode + " ");
                asciiCode++;
            }
            System.out.println();  // Nueva linea por cada fila
        }
    }
}