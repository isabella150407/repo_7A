import java.util.Scanner;

public class DiasDelMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        String nombreMes;
        int dias;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                dias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                dias = 28;
                break;
            case 3:
                nombreMes = "Marzo";
                dias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                dias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                dias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                dias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                dias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                dias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                dias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                dias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                dias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                dias = 31;
                break;
            default:
                nombreMes = "Mes inválido";
                dias = 0;
                break;
        }

        if (dias == 0) {
            System.out.println("Número de mes inválido.");
        } else {
            System.out.println("El mes de " + nombreMes + " tiene " + dias + " días.");
        }

        scanner.close();
    }
}
