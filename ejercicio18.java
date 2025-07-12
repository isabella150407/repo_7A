import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese hasta qué número desea ver las tablas de multiplicar: ");
        int limite = scanner.nextInt();

        // Ciclos for anidados
        for (int i = 1; i <= limite; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // línea en blanco entre tablas
        }

        scanner.close();
    }
}
