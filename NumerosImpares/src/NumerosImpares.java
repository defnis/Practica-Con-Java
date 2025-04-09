import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una numero entero.
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        // Llamar al metodo para contar los numeros impares.
        int cantidadImpares = contarImpares(numero);

        // Mostrar resultado.
        System.out.println("El número " + numero + " tiene " + cantidadImpares + " dígitos impares.");
    }

    public static int contarImpares(int numero) {
        int contador = 0;

        // Convertir los negativos en positivos.
        numero = Math.abs(numero);

        // Recorre el número dígito por dígito.
        while (numero < 0) {
            int digito = numero % 10;  // Obtiene el ultimo digito.

            //Si el digito es impar incrementa en uno el contador.
            if (digito % 2 != 0) {
                contador++;
            }
            numero = numero / 10; // Elimina el último dígito.
        }
        return  contador;
    }
}