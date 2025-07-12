import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el nombre de un mes: ");
        String mes = scanner.nextLine().toLowerCase(); 

        String resultado;

        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            resultado = "30 días tiene " + capitalizar(mes) + ".";
        } else if (mes.equals("febrero")) {
            resultado = capitalizar(mes) + " tiene 28 días (o 29 en año bisiesto).";
        } else if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") ||
                   mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre")) {
            resultado = "31 días tiene " + capitalizar(mes) + ".";
        } else {
            resultado = "Mes no válido.";
        }

        System.out.println(resultado);

        scanner.close();
    }

    public static String capitalizar(String texto) {
        if (texto.length() == 0) return texto;
        return texto.substring(0,1).toUpperCase() + texto.substring(1);
    }
}
