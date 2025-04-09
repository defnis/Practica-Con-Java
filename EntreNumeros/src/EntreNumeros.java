/*   Pedirle al usuario que ingrese dos numeros y muestre por pantalla
      los enteros impares entre estos numeros   */


import java.util.Scanner;

public class EntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos numeros enteros separados por espacio.
        System.out.println("Ingrese dos numeros [inferior] [superior] : ");
        int inferior = scanner.nextInt();
        int superior = scanner.nextInt();

        System.out.println("Los numeros impares entre " + inferior +
                "y " + superior + ": ");

        //Iterar desde el limite inferior al superior.
        for (int i = inferior; i <= superior; i++){
            // Comprobar si el numero es par.
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}