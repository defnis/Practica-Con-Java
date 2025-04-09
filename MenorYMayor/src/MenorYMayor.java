/*  Pedir una serie de 5 numero y mostrar el menor y el mayor de esos numeros  */

import java.util.Scanner;

public class MenorYMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;

        System.out.println("*** Ingrese 5 números ***");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El menor número es: " + menor);
        System.out.println("El mayor número es: " + mayor);
    }
}