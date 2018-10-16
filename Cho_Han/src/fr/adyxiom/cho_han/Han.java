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
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
       /* ArrayList<Integer> even = new ArrayList<>() {{
            add(2);
            add(4);
            add(6);
            add(8);
            add(10);
            add(12);
        }};
 */
        System.out.println("Les 2 dés sont egales a " + (d1 + d2));
        if (even.contains(d)) {
            System.out.println("C'est Cho !");
            j += 1;
            if (j > maxJ) {
                maxJ = j;
            }
            System.out.println("Vous avez perdu ! Defaites d'afiller : " + j);
            System.out.println("-------------------------------------------------------------------");
            dStats++;
            i = 0;
            new game(vStats, dStats, i, j, maxI, maxJ);

        }
        else {
            System.out.println("C'est Han !");
            i += 1;
            if (i > maxI) {
                maxI = i;
            }
            System.out.println("Bravo vous avez gagner ! Victoires d'afiller : " + i);
            System.out.println("-------------------------------------------------------------------");
            vStats++;
            j = 0;
            new game(vStats, dStats, i, j, maxI, maxJ);
        }
    }
}
