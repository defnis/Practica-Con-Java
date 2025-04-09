import java.util.Scanner;

public class EsBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        int anio = scanner.nextInt();

        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " es Bisiesto.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
    }

    // Funcion para determinar si es Bisiesto.
    public static boolean esBisiesto(int anio) {
        // Condicion para determinar si es bisiesto.
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}