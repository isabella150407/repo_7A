import java.util.Scanner;

public class ejercicio10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor de los tres números es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor de los tres números es: " + num2);
        } else {
            System.out.println("El mayor de los tres números es: " + num3);
        }

        scanner.close();
    }
}
