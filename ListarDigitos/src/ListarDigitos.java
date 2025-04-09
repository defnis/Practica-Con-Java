import java.util.ArrayList;
import java.util.Scanner;

public class ListarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String input;

        //Pedir la secuencia de numeros.
        System.out.println("Ingrese la secuencia de números enteros (ingrese 'Fin' para terminar): ");
        while (true) {
           input = scanner.nextLine();
           if (input.equalsIgnoreCase("Fin")) {
               break;
           }
           try {
               int numero = Integer.parseInt(input);
               numeros.add(numero);
           } catch (NumberFormatException e) {
               System.out.println("Por favor, ingresa un número válido.");
           }
        }

        // Mostrar la secuencia completa.
        System.out.println("\nSecuencia completo de números: ");
        for (int num : numeros) {
            System.out.println(num + " ");
        }

        // Separa por cantidades de digitos.
        ArrayList<Integer> unDigito = new ArrayList<>();
        ArrayList<Integer> dosDigitos = new ArrayList<>();
        ArrayList<Integer> tresDigitos = new ArrayList<>();
        ArrayList<Integer> cuatroDigitos = new ArrayList<>();
        ArrayList<Integer> masDigitos = new ArrayList<>();

        for (int num : numeros) {
            int longitud = String.valueOf(Math.abs(num)).length(); //Usamos Maths.abs para manejar los numeros negativos.
            switch (longitud) {
                case 1:
                    unDigito.add(num);
                    break;
                case 2:
                    dosDigitos.add(num);
                    break;
                case 3:
                    tresDigitos.add(num);
                    break;
                case 4:
                    cuatroDigitos.add(num);
                    break;
                default:
                    masDigitos.add(num);
                    break;
            }
        }

        // Mostrar los numeros por cantidad de digitos.
        if (!unDigito.isEmpty()) {
            System.out.println("\nNúmeros de un dígito:");
            for (int num : unDigito) {
                System.out.println(num + " ");
            }
        }

        if (!dosDigitos.isEmpty()) {
            System.out.println("\nNúmeros de dos dígitos:");
            for (int num : dosDigitos) {
                System.out.println(num + " ");
            }
        }

        if (!tresDigitos.isEmpty()) {
            System.out.println("\nNúmeros de tres dígitos:");
            for (int num : tresDigitos) {
                System.out.println(num + " ");
            }
        }

        if (!cuatroDigitos.isEmpty()) {
            System.out.println("\nNúmeros de cuatro dígitos:");
            for (int num : cuatroDigitos) {
                System.out.println(num + " ");
            }
        }

        if (!masDigitos.isEmpty()) {
            System.out.println("\nNúmeros de más de cuatro dígitos:");
            for (int num : masDigitos) {
                System.out.println(num + " ");
            }
        }
        scanner.close();
    }
}