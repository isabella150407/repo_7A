import java.util.Random;

public class SueldoEmpleadoAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int contador = 0;

        while (contador < 10) {
            // Generar categoría aleatoria válida ('A', 'B' o 'C')
            char categoria;
            while (true) {
                int catNum = (int) (Math.random() * 3); // 0,1 o 2
                if (catNum == 0) {
                    categoria = 'A';
                    break;
                } else if (catNum == 1) {
                    categoria = 'B';
                    break;
                } else if (catNum == 2) {
                    categoria = 'C';
                    break;
                }
                // si no está en 0,1,2 (imposible aquí), repetir
            }

            // Generar antigüedad entre 0 y 20 años (por ejemplo)
            int antiguedad;
            while (true) {
                antiguedad = (int) (Math.random() * 21); // 0 a 20 años
                if (antiguedad >= 0 && antiguedad <= 20) {
                    break;
                }
            }

            // Generar sueldo bruto aleatorio entre 1000 y 10000 (por ejemplo)
            double sueldoBruto;
            while (true) {
                sueldoBruto = 1000 + Math.random() * 9000; // 1000 a 10000
                if (sueldoBruto >= 1000 && sueldoBruto <= 10000) {
                    break;
                }
            }

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
            }

            // Calcular sueldo neto
            double sueldoNeto = sueldoBruto + aumento + plus;

            // Mostrar datos y resultado
            System.out.printf("Empleado %d - Categoria: %c, Antiguedad: %d años, Sueldo Bruto: %.2f%n", contador + 1, categoria, antiguedad, sueldoBruto);
            System.out.printf("Sueldo Neto: %.2f\n\n", sueldoNeto);

            contador++;
        }
    }
}
