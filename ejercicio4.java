import java.util.Scanner;

public class CategoriaFamilia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una categoría (a, b o c): ");
        char categoria = scanner.nextLine().toLowerCase().charAt(0); // lee el primer caracter en minúscula

        switch (categoria) {
            case 'a':
                System.out.println("hijo");
                break;
            case 'b':
                System.out.println("padres");
                break;
            case 'c':
                System.out.println("abuelos");
                break;
            default:
                System.out.println("Categoría no válida.");
        }

        scanner.close();
    }
}
