import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clase del auto (a, b o c): ");
        char clase = scanner.next().toLowerCase().charAt(0); // Acepta mayúsculas o minúsculas

        switch (clase) {
            case 'a':
                System.out.println("Clase A: 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado y aire.");
                break;
            case 'c':
                System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire y airbag.");
                break;
            default:
                System.out.println("Clase no válida. Ingrese 'a', 'b' o 'c'.");
                break;
        }

        scanner.close();
    }
}
