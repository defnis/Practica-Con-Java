/* Hacer un programa que le pida al usuario un numero y lo factorice.
    Ejemplo numero 36 = 2^2 * 3^2 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactorizacionNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero natural: ");
        int num = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> factors = factorizacion(num);

        System.out.println("Descomponer en factores primos de " + num + "= ");
        boolean first = true;

        for (Map.Entry<Integer, Integer> entry: factors.entrySet()) {
            if (!first) {
                System.out.println(" * ");
            }
            System.out.print(entry.getKey() + "^" + entry.getValue());
            first = false;
        }
    }

    public static  Map<Integer, Integer> factorizacion(int n) {
        Map<Integer, Integer> factorCount = new HashMap<>();
        int factor = 2;

        while (n > 1) {
            int count = 0;
            while (n % factor == 0 ) {
                n /= factor;
                count++;
            }
            if (count > 0) {
                factorCount.put(factor, count);
            }
            factor++;
        }
        return factorCount;
    }
}