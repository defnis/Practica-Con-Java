import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracter;

        while(true) {
            System.out.println("Ingrese un carácter (0 para salir): ");
            caracter = scanner.next().charAt(0);

            // Salir del programa.
            if (caracter == '0') {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (caracter) {
                case 'A': // Rango de mayusculas.
                    if (caracter >= 'A' && caracter <= 'Z') {
                        System.out.println("El carácter es mayúscula.");
                    } break;

                case 'a':
                    if (caracter >= 'a' && caracter <= 'z') {
                        System.out.println("El carácter es minúscula.");
                    } break;
                default:
                    System.out.println("El carácter ingresado no es un letra.");
            }
        }
        scanner.close();
    }
}