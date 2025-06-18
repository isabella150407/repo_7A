import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();

        int mayor;

        if (num1 >= num2) {
            if (num1 >= num3) {
                mayor = num1;
            } else {
                mayor = num3;
            }
        } else {
            if (num2 >= num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
        }

        System.out.println("El mayor de los tres números es: " + mayor);

        scanner.close();
    }
}
