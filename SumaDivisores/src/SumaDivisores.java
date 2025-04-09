/* Pedir un numero y buscar todos los divisores.
    Luego sumarlos y mostrar el resultado por pantalla  */

import java.util.Scanner;

public class SumaDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un numero al usuario.
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int sumaDivisores = 0;

        // Calcular la suma de los divisores.
        for (int i = 1; i <=numero; i++) {
            if (numero % i == 0 ) {
                sumaDivisores += i;
            }
        }

        System.out.print("La suma de los numeros divisores de " + numero + " es: " + sumaDivisores);
    }
}