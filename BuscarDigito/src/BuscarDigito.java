import java.util.Scanner;

public class BuscarDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Pedir al usuario que ingrese un numero.
            System.out.println("Ingrese un número entero (0 para salir):");
            int numero = scanner.nextInt();

            // Si el numero es 0, terminamos el programa.
            if (numero == 0) {
                System.out.println("Fin del programa...");
                break;
            }

            //Pedir al usuario que ingrese un digito.
            System.out.println("Ingrese un dígito: ");
            int digito = scanner.nextInt();

            // Verificar si el dígito esta en el número entero.
            if (contineDigito(numero, digito)) {
                System.out.println("El dígito " + digito + " está en el número.");
            } else {
                System.out.println("El dígito " + digito + " NO esta en el número.");
            }
        }

        scanner.close();
    }

    public static boolean contineDigito(int numero, int digito) {
        String numeroStr = String.valueOf(Math.abs(numero));
        String digitoStr = String.valueOf(digito);

        return  numeroStr.contains(digitoStr);
    }
}