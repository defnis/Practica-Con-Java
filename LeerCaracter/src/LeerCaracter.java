// Se pide una frase y cuenta los espacios en blanco.

import java.util.Scanner;

public class LeerCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        int contadorEspacios = contadorEspacios(texto);

        System.out.println("La cantidad de espacios en blanco que se encontro es " + contadorEspacios);
    }

    public static int contadorEspacios(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        } return contador;
    }
}