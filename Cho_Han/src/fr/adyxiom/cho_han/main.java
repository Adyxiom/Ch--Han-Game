package fr.adyxiom.cho_han;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vStats = 0; // Global victories
        int dStats = 0; // Global defeats
        int i = 0;      // Victory in a row
        int j = 0;      // Defeats in a row
        int maxI = 0;   // Maximum of i
        int maxJ = 0;   // Maximum of j
        System.out.println("Enter player1's name :");
        Player player1 = new Player(scanner.next(), vStats, dStats, i, j, maxI, maxJ);
        System.out.println("Enter player2's name : ");
        Player player2 = new Player(scanner.next(), vStats, dStats, i, j, maxI, maxJ);
        new game(player1, player2);
    }
}