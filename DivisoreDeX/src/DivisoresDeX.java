/*  Pedir un numero al usuario y mostrar sus divisores  */

import java.util.Scanner;

public class DivisoresDeX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el numero al usuario.
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Divisores de " + numero + " son: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}