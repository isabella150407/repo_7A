import java.util.Scanner;

public class EvaluacionSinIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese la tercera nota: ");
        int nota3 = scanner.nextInt();

        double promedio = (nota1 + nota2 + nota3) / 3.0;

        // Mostrar aprobado o reprobado (un único if)
        if (promedio >= 7)
            System.out.println("Aprobado. Promedio: " + promedio);
        else
            System.out.println("Reprobado. Promedio: " + promedio);

        // Sumar solo las notas pares sin usar if
        int sumaPares = 
            nota1 * (1 - nota1 % 2) +
            nota2 * (1 - nota2 % 2) +
            nota3 * (1 - nota3 % 2);

        // Mostrar suma de pares sin leyenda extra
        System.out.println("Suma de notas pares: " + sumaPares);

        scanner.close();
    }
}
