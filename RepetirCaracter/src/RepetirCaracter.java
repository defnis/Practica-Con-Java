import java.util.Scanner;

public class RepetirCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un caracter.
        System.out.print("Ingrese un caracter: ");
        char caracter = scanner.next().charAt(0);

        // Solicitar al usuario un numero.
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print(caracter);
        }

        scanner.close();
    }
}