import java.util.Scanner;

public class ejercicio11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        String entrada = scanner.next();

        if (entrada.length() != 1) {
            System.out.println("Error, solo un carácter a la vez.");
        } else {
            char letra = Character.toLowerCase(entrada.charAt(0));
            if (esVocal(letra)) {
                System.out.println("El carácter '" + letra + "' es una vocal.");
            } else {
                System.out.println("El carácter '" + letra + "' no es una vocal.");
            }
        }

        scanner.close();
    }

    // Función que determina si un carácter es vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
