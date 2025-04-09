public class Main {
    public static void main(String[] args) {
        System.out.println("Usando bucle for: ");
        forLoopExample();

        System.out.println("\nUsando bucle while: ");
        whileLoopExemple();

        System.out.println("\nUsando buble do-while: ");
        doWhileLoopExemple();
    }

    public static void forLoopExample() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Numero: " + i);
        }
    }

    public static void whileLoopExemple() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Numero " + i);
            i++;
        }
    }

    public static void doWhileLoopExemple() {
        int i = 1;
        do {
            System.out.println("Numero " + i);
            i++;
        } while (i <= 5);
    }
}