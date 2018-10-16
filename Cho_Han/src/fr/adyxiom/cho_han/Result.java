package fr.adyxiom.cho_han;

import java.util.ArrayList;
import java.util.Random;

public class Result {
    public Result(Player player1, Player player2, Boolean player1Cho, Boolean player2Cho) {
        int timer = 1;
        int n = 6;
        ArrayList<Integer> even = new ArrayList<>();
        while (timer <= n) {
            even.add(timer*2);
            timer++;
        }
        Random rand = new Random();
        int d1 = rand.nextInt(n) + 1;
        int d2 = rand.nextInt(n) + 1;
        int d = d1 + d2;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("The first dice = " + d1);
        System.out.println("The second dice = " + d2);
        System.out.println("The sum of the two dices is " + (d1 + d2));

        if (player1Cho) { // If player1 choose Cho
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("Cho !"); // You Win
                System.out.println("-------------------------------------------------------------------");
                player1.setI(player1.getI() + 1);
                if (player1.getI() > player1.getMaxI()) {
                    player1.setMaxI(player1.getI());
                }

                System.out.println("Congratulation " + player1.getName() + " ! Victory in a row : " + player1.getI());
                System.out.println("-------------------------------------------------------------------");
                player1.setvStats(player1.getvStats() + 1);
                player1.setJ(0);
            }
            else { // If its odd you loose
                System.out.println("Han !");
                System.out.println("-------------------------------------------------------------------");
                player1.setJ(player1.getJ() + 1);
                if (player1.getJ() > player1.getMaxJ()) {
                    player1.setMaxJ(player1.getJ());
                }
                System.out.println("Unlucky " + player1.getName() + " you have lost.. Defeats in a row : " + player1.getJ());
                System.out.println("-------------------------------------------------------------------");
                player1.setdStats(player1.getdStats() + 1);
                player1.setI(0);
            }
        }
        else { // If player1 choose Han
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("Cho !"); // You loose
                System.out.println("-------------------------------------------------------------------");
                player1.setJ(player1.getJ() + 1);
                if (player1.getJ() > player1.getMaxJ()) {
                    player1.setMaxJ(player1.getJ());
                }
                System.out.println("Unlucky " + player1.getName() + " you have lost.. Defeats in a row : " + player1.getJ());
                System.out.println("-------------------------------------------------------------------");
                player1.setdStats(player1.getdStats() + 1);
                player1.setI(0);
            }
            else { // If the sum of the dice is odd(Han)
                System.out.println("Han !"); // You win
                System.out.println("-------------------------------------------------------------------");
                player1.setI(player1.getI() + 1);
                if (player1.getI() > player1.getMaxI()) {
                    player1.setMaxI(player1.getI());
                }
                System.out.println("Congratulation " + player1.getName() + " ! Victory in a row : " + player1.getI());
                System.out.println("-------------------------------------------------------------------");
                player1.setvStats(player1.getvStats() + 1);
                player1.setJ(0);
            }
        }

        if (player2Cho) { // If player2 choose Cho
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("-------------------------------------------------------------------");
                player2.setI(player2.getI() + 1);
                if (player2.getI() > player2.getMaxI()) {
                    player2.setMaxI(player2.getI());
                }
                System.out.println("Congratulation " + player2.getName() + " ! Victory in a row : " + player2.getI());
                System.out.println("-------------------------------------------------------------------");
                player2.setvStats(player2.getvStats() + 1);
                player2.setJ(0);
                new game(player1, player2); // Check later
            }
            else { // If its odd you loose
                System.out.println("-------------------------------------------------------------------");
                player2.setJ(player2.getJ() + 1);
                if (player2.getJ() > player2.getMaxJ()) {
                    player2.setMaxJ(player2.getJ());
                }
                System.out.println("Unlucky " + player2.getName() + " you have lost.. Defeats in a row : " + player2.getJ());
                System.out.println("-------------------------------------------------------------------");
                player2.setdStats(player2.getdStats() + 1);
                player2.setI(0);
                new game(player1, player2); // Check later
            }
        }
        else { // If player1 choose Han
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("-------------------------------------------------------------------");
                player2.setJ(player2.getJ() + 1);
                if (player2.getJ() > player2.getMaxJ()) {
                    player2.setMaxJ(player2.getJ());
                }
                System.out.println("Unlucky " + player2.getName() + " you have lost.. Defeats in a row : " + player2.getJ());
                System.out.println("-------------------------------------------------------------------");
                player2.setdStats(player2.getdStats() + 1);
                player2.setI(0);
                new game(player1, player2); // Check later
            }
            else { // If the sum of the dice is odd(Han)
                System.out.println("-------------------------------------------------------------------");
                player2.setI(player2.getI() + 1);
                if (player2.getI() > player2.getMaxI()) {
                    player2.setMaxI(player2.getI());
                }
                System.out.println("Congratulation " + player2.getName() + " ! Victory in a row : " + player2.getI());
                System.out.println("-------------------------------------------------------------------");
                player2.setvStats(player2.getvStats() + 1);
                player2.setJ(0);
                new game(player1, player2); // Check later
            }
        }
    }
}
