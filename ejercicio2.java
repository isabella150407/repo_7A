import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();  // La variable es de tipo int

        // Verificar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }

        scanner.close();
    }
}

