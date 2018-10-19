package fr.adyxiom.cho_han;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reset {
    public Reset(Player player1, Player player2, Boolean nPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you really want to reset your stats ?");
        try {
            if (scanner.nextBoolean()) {
                player1.setvStats(0);
                player1.setdStats(0);
                player1.setI(0);
                player1.setJ(0);
                player1.setMaxI(0);
                player1.setMaxJ(0);
                if (nPlayer) {
                    player2.setvStats(0);
                    player2.setdStats(0);
                    player2.setI(0);
                    player2.setJ(0);
                    player2.setMaxI(0);
                    player2.setMaxJ(0);
                    new Game(player1, player2, nPlayer);
                } else {
                    new Game(player1, player2, nPlayer);
                }
            } else {
                new Game(player1, player2, nPlayer);
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input (true or false)");
            new Reset(player1, player2, nPlayer);
        }
    }
}
