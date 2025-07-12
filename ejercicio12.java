import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificamos si el número está fuera del rango usando OR
        if (numero < 1 || numero > 36) {
            System.out.println("El número " + numero + " está fuera de rango.");
        } else {
            // Usamos AND para determinar la docena
            if (numero >= 1 && numero <= 12) {
                System.out.println("El número " + numero + " pertenece a la primera docena.");
            } else if (numero >= 13 && numero <= 24) {
                System.out.println("El número " + numero + " pertenece a la segunda docena.");
            } else if (numero >= 25 && numero <= 36) {
                System.out.println("El número " + numero + " pertenece a la tercera docena.");
            }
        }

        scanner.close();
    }
}
