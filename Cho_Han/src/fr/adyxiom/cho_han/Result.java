package fr.adyxiom.cho_han;

import java.util.ArrayList;
import java.util.Random;

public class Result {
    public Result(Player player1, Player player2, Boolean nPlayer, Boolean player1Cho, Boolean player2Cho) {
        Boolean whichPlayer = false;
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
                whichPlayer = true;
                new Win(player1, player2, nPlayer, whichPlayer);
            }
            else { // If its odd you loose
                System.out.println("Han !");
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = true;
                new Loose(player1, player2, nPlayer, whichPlayer);
            }
        }
        else { // If player1 choose Han
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("Cho !"); // You loose
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = true;
                new Loose(player1, player2, nPlayer, whichPlayer);
            }
            else { // If the sum of the dice is odd(Han)
                System.out.println("Han !"); // You win
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = true;
                new Win(player1, player2, nPlayer, whichPlayer);
            }
        }

        if (player2Cho && nPlayer) { // If player2 choose Cho
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = false;
                new Win(player1, player2, nPlayer, whichPlayer);
            }
            else { // If its odd you loose
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = false;
                new Loose(player1, player2, nPlayer, whichPlayer);
            }
        }
        else { // If player1 choose Han
            if (even.contains(d)) { // If the sum of the dice is even(Cho)
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = false;
                new Loose(player1, player2, nPlayer, whichPlayer);
            }
            else { // If the sum of the dice is odd(Han)
                System.out.println("-------------------------------------------------------------------");
                whichPlayer = false;
                new Win(player1, player2, nPlayer, whichPlayer);
            }
        }
    }
}
