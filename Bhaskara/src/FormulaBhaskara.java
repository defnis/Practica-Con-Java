import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los valores de a, b y c.
        System.out.println("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        // Cerrar el scanner.
        scanner.close();

        /* Casos:
        1. Si el discriminante es positivo, hay dos raices reales.
        2. Si el discriminente es cero, hay una unica raiz real.
        3. Si el discriminante es negativo, hay dos raices complejas.
        */
        // Calcular el discriminante. (b2 - 4.a.c)
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {
            // Dos soluciones reales.
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las soluciones son: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        } else if (discriminante == 0) {
            // Una solucion real
            double x = -b / (2 * a);
            System.out.println("La solucion unica es: ");
            System.out.println("x= " + x);
        } else {
            // Soluciones complejas.
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);

            System.out.println("La soluciones son complejas: ");
            System.out.println("x1= " + parteReal + "+" + parteImaginaria + "i" );
            System.out.println("x2= " + parteReal + "+" + parteImaginaria + "i" );
        }
    }
}