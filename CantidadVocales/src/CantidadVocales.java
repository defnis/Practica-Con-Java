/* Escribir una frase y el programa debe contar cuantas volaes hay en total */

import java.util.Scanner;

public class CantidadVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el usuario la frase.
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));

            // Verifica si el caracter es una vocal.
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cantidad de vocales dentro de la frase es " + contadorVocales);
    }
}