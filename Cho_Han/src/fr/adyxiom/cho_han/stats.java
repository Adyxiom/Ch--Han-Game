package fr.adyxiom.cho_han;

import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class stats {
    public stats(Player player1, Player player2, Boolean player1Stats) {
        if (player1Stats) {
            try {
                double vS = player1.getvStats();
                double dS = player1.getdStats();
                double winRate = (vS / (vS + dS)) * 100;
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println("-------------------------------------------------------------------");
                System.out.println(player1.getName() + "'s Statistics :");
                System.out.println("You have played " + (player1.getvStats() + player1.getdStats()) + " games.");
                System.out.println("You have " + player1.getvStats() + " victories.");
                System.out.println("You have " + player1.getdStats() + " defeats.");
                System.out.println("Maximum of victories in a row : " + player1.getMaxI());
                System.out.println("Maximum of defeats in a row : " + player1.getMaxJ());
                System.out.println("You have " + df.format(winRate) + "% winrate.");
                System.out.println("-------------------------------------------------------------------");
                //new game(player1, player2);
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Wrong input");
            }
        }
        else {
            try {
                double vS = player2.getvStats();
                double dS = player2.getdStats();
                double winRate = (vS / (vS + dS)) * 100;
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println("-------------------------------------------------------------------");
                System.out.println(player2.getName() + "'s Statistics :");
                System.out.println("You have played " + (player2.getvStats() + player2.getdStats()) + " games.");
                System.out.println("You have " + player2.getvStats() + " victories.");
                System.out.println("You have " + player2.getdStats() + " defeats.");
                System.out.println("Maximum of victories in a row : " + player2.getMaxI());
                System.out.println("Maximum of defeats in a row : " + player2.getMaxJ());
                System.out.println("You have " + df.format(winRate) + "% winrate.");
                System.out.println("-------------------------------------------------------------------");
                //new game(player1, player2);
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Wrong input");
            }
        }
    }
}
