import java.util.Scanner;

public class EvaluacionConIf {
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

        // Sumar solo las notas pares usando IF
        int sumaPares = 0;
        if (nota1 % 2 == 0) sumaPares += nota1;
        if (nota2 % 2 == 0) sumaPares += nota2;
        if (nota3 % 2 == 0) sumaPares += nota3;

        // Mostrar suma de notas pares (sin leyenda "con if")
        System.out.println("Suma de notas pares: " + sumaPares);

        scanner.close();
    }
}
