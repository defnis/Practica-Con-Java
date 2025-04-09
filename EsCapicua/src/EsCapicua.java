import java.util.Scanner;

public class EsCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Llamamos al metodo para verificar si es capicúa.
        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " NO es capicúa.");
        }
        scanner.close();
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        // Invertimos el número.
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;  // numero = numero / 10;
        }
        // Comprobamos si el original es igual a invertido.
        return original == invertido;
    }
}