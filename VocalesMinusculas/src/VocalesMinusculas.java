import java.util.Scanner;

public class VocalesMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el texto al usuario.
        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();

        // Llamar al metodo para procesar el texto.
        String textoModificado = convertirVocalesAMayusculas(texto);

        // Mostrar el texto modificado.
        System.out.println("Texto con vocales mayusculas: " + textoModificado);

        scanner.close();
    }

    public static String convertirVocalesAMayusculas(String texto) {
        StringBuilder resultado = new StringBuilder();

        //Recorrer el texto.
        for (int i = 0; i<texto.length(); i++) {
            char caracter = texto.charAt(i);

            // Verificar si el caracter es vocal.
            if ("aeiouAEIOU".indexOf(caracter) !=-1) {
                // Si es una vocal convertir en mayuscula.
                resultado.append(Character.toUpperCase(caracter));
            } else {
                // Si es una vocal, convertir a minuscula.
                resultado.append(Character.toLowerCase(caracter));
            }
        }

        // Devuelve el texto modificado.
        return resultado.toString();
    }
}