import java.util.Scanner;

public class Main {

    // Funcion 1 verificar si un numero es par.
    public static boolean esPas(int numero) {
        return numero % 2 == 0;
    }

    // Funcion 2 calcula el cuadrado de un numero.
    public static int cuadrado(int numero) {
        return numero * numero;
    }

    // Procedimiento 1: Imprime un mensaje de bienvenida.
    public static void imprimirBienvenida() {
        System.out.println("Bienvenidos al programa.");
    }

    // Procedimiento 2: Imprime todos los numeros pares.
    public static int imprimirNumerosParesHasta(int limite) {
        System.out.println("Numeros pares " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (Main.esPas(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        return limite;
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Main.imprimirBienvenida();

        System.out.println("Ingrese un número para calcular el cuadrado: ");
        int numero = scanner.nextInt();
        System.out.println("El cuadrado de " + numero + "es: " + Main.cuadrado(numero));

        // Llama al procedimiento para imprimir los pares.
        System.out.println("Ingrese un límite para mostrar números pares: ");
        int limite = scanner.nextInt();
        Main.imprimirNumerosParesHasta(limite);

        scanner.close();
}