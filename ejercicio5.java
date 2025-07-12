import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la posición obtenida en el torneo (en número): ");
        int puesto = scanner.nextInt();

        if (puesto == 1) {
            System.out.println("El primero obtiene la medalla de oro.");
        } else if (puesto == 2) {
            System.out.println("El segundo obtiene la medalla de plata.");
        } else if (puesto == 3) {
            System.out.println("El tercero obtiene la medalla de bronce.");
        } else {
            System.out.println("Siga participando.");
        }

        scanner.close();
    }
}
