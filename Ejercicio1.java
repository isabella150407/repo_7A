public class EvaluacionAlumno {
    public static void main(String[] args) {
        // Definimos las notas
        double nota1 = 8.5;
        double nota2 = 6.0;
        double nota3 = 7.5;

        // Calculamos el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Mostramos si está Aprobado o Reprobado usando un único if
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
