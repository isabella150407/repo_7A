import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1, ingrese su jugada (0: piedra, 1: papel, 2: tijera): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su jugada (0: piedra, 1: papel, 2: tijera): ");
        int jugador2 = scanner.nextInt();

        if (jugador1 == jugador2) {
            System.out.println("Empate.");
        } else if (jugador1 == 0 && jugador2 == 2 || jugador1 == 1 && jugador2 == 0 || jugador1 == 2 && jugador2 == 1) {
            System.out.println("Gana jugador 1.");
        } else if ((jugador1 == 0 && jugador2 == 1) || (jugador1 == 1 && jugador2 == 2) || (jugador1 == 2 && jugador2 == 0)) {
            System.out.println("Gana jugador 2.");
        } else {
            System.out.println("Jugada inválida.");
        }

        scanner.close();
    }
}
