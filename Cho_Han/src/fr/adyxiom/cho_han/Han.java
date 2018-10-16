package fr.adyxiom.cho_han;

import java.util.ArrayList;
import java.util.Random;

public class Han {
    public Han(int vStats, int dStats, int i, int j, int maxI, int maxJ) {
        int compteur = 1;
        int n = 6;
        ArrayList<Integer> even = new ArrayList<>();
        while (compteur != n) {
            even.add(compteur*2);
            compteur++;
        }
        Random rand = new Random();
        int d1 = rand.nextInt(n) + 1;
        int d2 = +rand.nextInt(n) + 1;
        int d = d1 + d2;

        System.out.println("The first dice = " + d1);
        System.out.println("The second dice = " + d2);

        System.out.println("The sum of the two dices is " + (d1 + d2));
        if (even.contains(d)) {
            System.out.println("Cho !");
            j += 1;
            if (j > maxJ) {
                maxJ = j;
            }
            System.out.println("You have lost ! Defeats in a row : " + j);
            System.out.println("-------------------------------------------------------------------");
            dStats++;
            i = 0;
            new game(vStats, dStats, i, j, maxI, maxJ);

        }
        else {
            System.out.println("Han !");
            i += 1;
            if (i > maxI) {
                maxI = i;
            }
            System.out.println("Congrats you have won ! Victory in a row : " + i);
            System.out.println("-------------------------------------------------------------------");
            vStats++;
            j = 0;
            new game(vStats, dStats, i, j, maxI, maxJ);
        }
    }
}
