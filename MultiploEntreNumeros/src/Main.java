/* Pedir al usuario 3 numeros. Inferior, superior y nro.
*  el valor de nro tiene que mostrar los multiplos entre
* superior e inferior   */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitud de 3 numeros.
        System.out.print("Ingrese el numero inferior: ");
        int inferior = scanner.nextInt();

        System.out.print("Ingrese el numero superior: ");
        int superior = scanner.nextInt();

        // Validad que inferior es el menor.
        if (inferior >= superior) {
            System.out.println("El numero inferior debe ser menor a superior.");
            return;  // Salir del programa si la condicion se cumple.
        }

        System.out.print("Ingrese el número para encontrar múltiplos: ");
        int numero = scanner.nextInt();

        // Mostrar los multiplos entre inferior y superior.
        for (int i=inferior; i <= superior; i++) {
            if (i % numero == 0) {
                System.out.print(i + " ");
            }
        }
    }
}