package fr.adyxiom.cho_han;

import java.util.*;

public class Cho {
    public Cho(int vStats, int dStats, int i, int j, int maxI, int maxJ) {
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
   /*     ArrayList<Integer> even = new ArrayList<>() {{
            add(2);
            add(4);
            add(6);
            add(8);
            add(10);
            add(12);
        }};*/

        System.out.println("The sum of the two dices is " + (d1 + d2));
        if (even.contains(d)) {
            System.out.println("Cho !");
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
        else {
            System.out.println("Han !");
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
    }
}
