import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero natural: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " NO es un numero primo.");
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return  false; // Los numeros menores o = a 1 no son primos.
        }
        if (n == 2) {
            return true; // Es el unico primo par.
        }
        if (n % 2 == 0) {
            return false; // Excluye a todos los pares.
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0 ) {
                return false; // Si se encuentra el divisor entonces no es primo.
             }
        }
        return true; // Si no se encuentran divisores entonces es primo.
    }
}