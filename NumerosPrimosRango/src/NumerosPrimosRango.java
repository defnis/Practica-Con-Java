import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class NumerosPrimosRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los valores inferior y superior.
        System.out.print("Ingrese el valor inferior: ");
        int inferior = scanner.nextInt();

        System.out.print("Ingrese el valor superior:");
        int superior = scanner.nextInt();

        System.out.println("Numeros primos entre " + inferior + " y " + superior + ": ");
        for (int i = inferior; i <= superior; i++) {
            if(esPrimo(i)) {   // Se llama al metodo esPrimo.
                System.out.print(i + " ");
            }
        }
    }

    // Se crea el metodo esPrimo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        } return true;
    }
}