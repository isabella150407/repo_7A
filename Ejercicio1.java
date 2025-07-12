import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7)
            System.out.println("Aprobado con promedio: " + promedio);
        else
            System.out.println("Reprobado con promedio: " + promedio);

        scanner.close();
    }
}

