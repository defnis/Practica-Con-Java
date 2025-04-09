import java.util.Scanner;

public class PorLinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar los dos numeros.
        System.out.print("Ingrese dos numeros enteros separados por espacio. (inferior, superior): ");
        int inferior = scanner.nextInt();
        int superior = scanner.nextInt();

        System.out.println("Los numeros impares entre " + inferior + "y " + superior + " son: ");

        // Variable para contar y controlar los valores de cada linea.
        int cantidadEnLinea = 1;  //Cantidad de valores que se muestran en linea.
        int contador = 0; // cantidad de valores en la linea actual.

        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                contador++; //Incrementa el valor en la linea.

                if (contador == cantidadEnLinea) {
                    System.out.println(); //Salto de linea.
                    cantidadEnLinea++;  // Incrementa la cantidad de valores para la proxima.
                    contador=0; // Reinicia el contador para la nueva linea.
                }
            }
        }

        scanner.close();
    }
}