package fr.adyxiom.cho_han;

import java.util.ArrayList;
import java.util.Random;

public class game {
    public game(int i, int j, int maxI, int maxJ, int totalI, int totalJ, int compteur, int compteurmax, int n) {
        int dMax = 0;
        while (compteur < compteurmax) {
            int compteur2 = 1;
            ArrayList<Integer> even = new ArrayList<>();
            while (compteur2 <= n) {
                even.add(compteur2*2);
                compteur2++;
            }
            Random rand = new Random();
            int d1 = rand.nextInt(n) + 1;
            int d2 = rand.nextInt(n) + 1;
            int d = d1 + d2;
            dMax = dMax + d;

            if (even.contains(d)) {
                totalI++;
                i++;
                j = 0;
                if (i > maxI) {
                    maxI = i;
                }
                System.out.println(compteur + ": PAIRE. d = " + d);
            } else {
                totalJ++;
                j++;
                i = 0;
                if (j > maxJ) {
                    maxJ = j;
                }
                System.out.println(compteur + ": IMPAIRE. d = " + d);
            }
            compteur++;
        }
        double tI = totalI;
        double tJ = totalJ;
        double pourcentI = (tI / (tI + tJ) * 100);
        double pourcentJ = (tJ / (tI + tJ) * 100);
        System.out.println("----------------------------------------------------");
        System.out.println("Nombre de parties : " + (totalI + totalJ));
        System.out.println("Nombre de faces : " + n);
        System.out.println("Nombre total de paires : " + totalI);
        System.out.println("Nombre total d'impaires : " + totalJ);
        System.out.println("Il y a " + pourcentI + "% de paires.");
        System.out.println("Il y a " + pourcentJ + "% d'impaires.");
        System.out.println("----------------------------------------------------");
        System.out.println("Nombre max de paires a la suite : " + maxI);
        System.out.println("Nombre max d'impaires a la suite : " + maxJ);
        System.out.println("----------------------------------------------------");
        System.out.println("Moyenne de d : " + dMax/compteurmax);
    }
}
