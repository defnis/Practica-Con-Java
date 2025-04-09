import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CruceroInternacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos Iniciales.
        final double PRECIO_ADULTO = 1000.00;
        final double PRECIO_MENOR = 800.00;
        final double PRECIO_COMIDA_DIARIA = 50.0;
        double costoFinal = 0.0;

        // Solicitud de datos al usuario.
        System.out.println("Ingrese la edad del pasajero: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el numero de dias del crucero: ");
        int dias = scanner.nextInt();

        System.out.println("Incluye comidas? (si/no): ");
        String incluyeComidas = scanner.next().toLowerCase();

        System.out.println("Seleccione la forma de pago (efectivo, transferencia o financiamiento.): ");
        String formaPago = scanner.next().toLowerCase();

        // Calcular el costo base del pasaje.
        double costoPasaje = (edad < 18) ? PRECIO_MENOR : PRECIO_ADULTO;

        // Calcular el costo de comidas.
        double costoComidas = 0.0;
        if (incluyeComidas.equals("si")) {
            costoComidas = PRECIO_COMIDA_DIARIA * dias;

        // Calcular el costo final.
        costoFinal = costoPasaje + costoComidas;
        }

        // Aplicar descuentos o recargos segun la forma de pago.
        switch (formaPago){
            case "efectivo": costoFinal *= 0.9; break;
            case "financiamiento": costoFinal *= 1.1; break;
            case "transferencia": /* el precio base no cambia. */  break;
            default:
                System.out.println("Forma de pago invalida. "); break;
        }

        // Mostrar informacion.
        System.out.println("\n---Informacion del pasaje ---");
        System.out.println("Edad del pasajero: " + edad);
        System.out.println("Dias de Crucero: " + dias);
        System.out.println("Incluye comida: " + incluyeComidas);
        System.out.println("Forma de Pago: " + formaPago);
        System.out.printf("Costo total del pasaje: %.2f\n", costoFinal);

        // Cerrar el scanner
        scanner.close();
    }
}