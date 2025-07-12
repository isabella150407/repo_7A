import java.util.Scanner;

public class ejercicio21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        char categoria = Character.toUpperCase(scanner.next().charAt(0));

        System.out.print("Ingrese la antigüedad (años): ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = scanner.nextDouble();

        // Calcular aumento según antigüedad
        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05 * sueldoBruto;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10 * sueldoBruto;
        } else if (antiguedad > 10) {
            aumento = 0.30 * sueldoBruto;
        }

        // Calcular plus por categoría
        double plus = 0;
        switch (categoria) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                scanner.close();
                return;
        }

        // Calcular sueldo neto
        double sueldoNeto = sueldoBruto + aumento + plus;

        // Mostrar resultado
        System.out.println("Sueldo neto del empleado: $" + sueldoNeto);

        scanner.close();
    }
}
