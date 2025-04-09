import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        int contadorNumeros = 0;
        int contadorVocales = 0;
        int contadorLetras = 0;
        int contadorEspecial = 0;
        int contadorEspacios = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isDigit(caracter)) {
                contadorNumeros++;
            } else if (Character.isLetter(caracter)) {
                contadorLetras++;
                if (esVocal(caracter)) {
                    contadorVocales++;
                }
            } else if (Character.isWhitespace(caracter)) {
                contadorEspacios++;
            } else {
                contadorEspecial++;
            }
        }
        System.out.println("Cantidad de números: " + contadorNumeros);
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println("Cantidad de letras: " + contadorLetras);
        System.out.println("Cantidad de signos especiales: " + contadorEspecial);
        System.out.println("Cantidad de espacios en blanco: " + contadorEspacios);
    }

    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}