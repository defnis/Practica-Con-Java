import java.util.Scanner;

public class CaracterConsecutivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un caracter.
        System.out.print("Ingrese un caracter: ");
        char caracter = scanner.next().charAt(0);

        // Solicitar un numero.
        System.out.print("Ingrese un numero natural: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print((char) (caracter + i) + " ");
        }
    }
}