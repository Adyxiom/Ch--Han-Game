package fr.adyxiom.cho_han;

import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class stats {
    public stats(int vStats, int dStats, int i, int j, int maxI, int maxJ) {
       try {
           double vS = vStats;
           double dS = dStats;
           double winRate = (vS / (vS + dS)) * 100;
           DecimalFormat df = new DecimalFormat("0.00");
           DecimalFormat df1 = new DecimalFormat("0");
           System.out.println("-------------------------------------------------------------------");
           System.out.println("Statistics :");
           System.out.println("You have played " + df1.format(vStats + dStats) + " games.");
           System.out.println("You have " + df1.format(vStats) + " victories.");
           System.out.println("You have " + df1.format(dStats) + " defeats.");
           System.out.println("Maximum of victories in a row : " + maxI);
           System.out.println("Maximum of defeats in a row : " + maxJ);
           System.out.println("You have " + df.format(winRate) + "% winrate.");
           System.out.println("-------------------------------------------------------------------");
           new game(vStats, dStats, i, j, maxI, maxJ);
       } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Wrong input");
       }
    }
}
