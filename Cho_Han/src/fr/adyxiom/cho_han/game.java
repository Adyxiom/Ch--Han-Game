package fr.adyxiom.cho_han;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class game {
    public game(int vStats, int dStats, int i, int j, int maxI, int maxJ) {
        Scanner scanner = new Scanner(System.in);
        Timer cd = new Timer();
        cd.schedule(new TimerTask() {
        int timer = 3;

        @Override
        public void run() {
            if (timer != 0) {
                System.out.println(timer);
            }
            if (timer == 0) {
                System.out.println("Cho(1) | Han(2) | Statistics(0)");
                try {
                    switch (scanner.nextInt()) {
                        case 1:
                            new Cho(vStats, dStats, i, j, maxI, maxJ);
                            cancel();
                            break;
                        case 2:
                            new Han(vStats, dStats, i, j, maxI, maxJ);
                            cancel();
                            break;
                        case 0:
                            new stats(vStats, dStats, i, j, maxI, maxJ);
                            cancel();
                            break;
                    }
                } catch (InputMismatchException e) {
                    cancel();
                    System.out.println("Wrong input");
                    new game(vStats, dStats, i, j, maxI, maxJ);
                }
            }
            timer--;

            }
        }, 1000, 1000);
    }
}
