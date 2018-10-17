package fr.adyxiom.cho_han;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean nPlayer = false;
        int vStats = 0; // Global victories
        int dStats = 0; // Global defeats
        int i = 0;      // Victory in a row
        int j = 0;      // Defeats in a row
        int maxI = 0;   // Maximum of i
        int maxJ = 0;   // Maximum of j
        System.out.println("Enter the number of players :");
        try {
            switch (scanner.nextInt()) {

                case 1:
                    nPlayer = false;
                    break;
                case 2:
                    nPlayer = true;
                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }

        System.out.println("Enter player1's name :");
        Player player1 = new Player(scanner.next(), vStats, dStats, i, j, maxI, maxJ);
        System.out.println("Enter player2's name : ");
        if (!nPlayer) {
            System.out.println("If you want to play solo just enter a random name.");
        }
        Player player2 = new Player(scanner.next(), vStats, dStats, i, j, maxI, maxJ);
        new Game(player1, player2, nPlayer);
    }
}