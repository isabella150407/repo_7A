import java.util.Scanner;

public class ejercicio8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1, ingrese su jugada (0: piedra, 1: papel, 2: tijera): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, ingrese su jugada (0: piedra, 1: papel, 2: tijera): ");
        int jugador2 = scanner.nextInt();

        if (jugador1 == jugador2) {
            System.out.println("Empate.");
        } else {
            if (jugador1 == 0) { // piedra
                if (jugador2 == 1) {
                    System.out.println("Gana jugador 2 (papel vence a piedra).");
                } else { // jugador2 == 2
                    System.out.println("Gana jugador 1 (piedra vence a tijera).");
                }
            } else if (jugador1 == 1) { // papel
                if (jugador2 == 0) {
                    System.out.println("Gana jugador 1 (papel vence a piedra).");
                } else { // jugador2 == 2
                    System.out.println("Gana jugador 2 (tijera vence a papel).");
                }
            } else if (jugador1 == 2) { // tijera
                if (jugador2 == 0) {
                    System.out.println("Gana jugador 2 (piedra vence a tijera).");
                } else { // jugador2 == 1
                    System.out.println("Gana jugador 1 (tijera vence a papel).");
                }
            } else {
                System.out.println("Jugada inválida del jugador 1.");
            }
        }

        scanner.close();
    }
}
