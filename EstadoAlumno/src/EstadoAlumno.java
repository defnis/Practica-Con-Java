import java.util.Scanner;

public class EstadoAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del alumno ('A','B','C','D'): ");
        String nota = scanner.nextLine().toUpperCase(); // Convertimos en mayusculas para evitar errores.

        switch (nota) {
            case "A":
            case "B":
                System.out.println("El alumno aprobo");
                break;
            case "C":
                System.out.println("El alumno debe recuperar");
                break;
            case "D":
                System.out.println("El alumno desaprobo");
                break;
            default:
                System.out.println("Nota Invalida. Ingrese A, B, C o D, por favor.");
                break;
        }

        scanner.close();
    }
}