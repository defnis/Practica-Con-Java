import java.util.Scanner;

public class PinturaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese la cantidad de latas de pintura de 4 litros cada una: ");
        int latasCompradas = scanner.nextInt();

        System.out.print("Ingrese el área total a pintar en metros cuadrados: ");
        double areaTotal = scanner.nextDouble();

        System.out.print("Ingrese el rendimiento de la pintura (metros cuadrados por litro): ");
        double rendimientoPorLitro = scanner.nextDouble();

        // Cálculo de litros totales necesarios y litros disponibles
        double litrosDisponibles = latasCompradas * 4;
        double litrosNecesarios = areaTotal / rendimientoPorLitro;

        // Verificación y resultado
        if (litrosDisponibles >= litrosNecesarios) {
            System.out.println("La pintura es suficiente para completar el trabajo.");
        } else {
            double litrosFaltantes = litrosNecesarios - litrosDisponibles;
            System.out.printf("Faltan %.2f litros de pintura para completar el trabajo.\n", litrosFaltantes);
        }

        scanner.close();
    }
}
