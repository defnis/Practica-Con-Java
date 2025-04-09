import java.util.Scanner;

public class SecuenciaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir la secuencia de caracteres.
        System.out.println("Introduce la secuenciade caracteres (termine con un .): ");

        StringBuilder secuencia = new StringBuilder();
        char caracter;

        // Leer caracteres hasta encontrar el punto.
        while(true) {
            caracter = scanner.next().charAt(0);

           // Si encontramos un punto, terminamos de leer.
           if (caracter == '.') {
               break;
           }

           // Comprobar si el caracter es una letra o un númenro.
            if (Character.isLetterOrDigit(caracter)) {
                secuencia.append(caracter);
            }
        }

        // Mostrar la secuencia resultante.
        System.out.println("Secuencia de caracteres válida: " + secuencia.toString());

        scanner.close();
    }
}