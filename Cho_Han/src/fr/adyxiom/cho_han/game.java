package fr.adyxiom.cho_han;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class game {
    public game(Player player1, Player player2) {
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
                Boolean player1Cho;
                Boolean player2Cho;
                Boolean player1Stats;
                System.out.println(player1.getName() + "'s turn");
                System.out.println("Cho(1) | Han(2) | Statistics(0)");
                try {
                    switch (scanner.nextInt()) {
                        case 1:
                            player1Cho = true;
                            player1Stats = false;
                            System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                            switch (scanner.nextInt()) {
                                case 1:
                                    player2Cho = true;
                                    new Result(player1, player2, player1Cho, player2Cho);
                                    cancel();
                                    break;
                                case 2:
                                    player2Cho = false;
                                    new Result(player1, player2, player1Cho, player2Cho);
                                    cancel();
                                    break;
                                case 0:
                                    new stats(player1, player2, player1Stats);
                                    System.out.println("Cho(1) | Han(2)");
                                    switch (scanner.nextInt()) {
                                        case 1:
                                            player2Cho = true;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                        case 2:
                                            player2Cho = false;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                    }
                                    cancel();
                                    break;
                            }
                            cancel();
                            break;
                        case 2:
                            player1Cho = false;
                            player1Stats = false;
                            System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                            switch (scanner.nextInt()) {
                                case 1:
                                    player2Cho = true;
                                    new Result(player1, player2, player1Cho, player2Cho);
                                    cancel();
                                    break;
                                case 2:
                                    player2Cho = false;
                                    new Result(player1, player2, player1Cho, player2Cho);
                                    cancel();
                                    break;
                                case 0:
                                    new stats(player1, player2, player1Stats);
                                    System.out.println("Cho(1) | Han(2)");
                                    switch (scanner.nextInt()) {
                                        case 1:
                                            player2Cho = true;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                        case 2:
                                            player2Cho = false;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                    }
                                    cancel();
                                    break;
                            }
                            cancel();
                            break;
                        case 0:
                            player1Stats = true;
                            new stats(player1, player2, player1Stats);
                            System.out.println("Cho(1) | Han(2)");
                            switch (scanner.nextInt()) {
                                case 1:
                                    player1Cho = true;
                                    player1Stats = false;
                                    System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                                    switch (scanner.nextInt()) {
                                        case 1:
                                            player2Cho = true;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                        case 2:
                                            player2Cho = false;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                        case 0:
                                            new stats(player1, player2, player1Stats);
                                            System.out.println("Cho(1) | Han(2)");
                                            switch (scanner.nextInt()) {
                                                case 1:
                                                    player2Cho = true;
                                                    new Result(player1, player2, player1Cho, player2Cho);
                                                    cancel();
                                                    break;
                                                case 2:
                                                    player2Cho = false;
                                                    new Result(player1, player2, player1Cho, player2Cho);
                                                    cancel();
                                                    break;
                                            }
                                            cancel();
                                            break;
                                    }
                                    cancel();
                                    break;
                                case 2:
                                    player1Cho = false;
                                    player1Stats = false;
                                    System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                                    switch (scanner.nextInt()) {
                                        case 1:
                                            player2Cho = true;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                        case 2:
                                            player2Cho = false;
                                            new Result(player1, player2, player1Cho, player2Cho);
                                            cancel();
                                            break;
                                        case 0:
                                            new stats(player1, player2, player1Stats);
                                            System.out.println("Cho(1) | Han(2)");
                                            switch (scanner.nextInt()) {
                                                case 1:
                                                    player2Cho = true;
                                                    new Result(player1, player2, player1Cho, player2Cho);
                                                    cancel();
                                                    break;
                                                case 2:
                                                    player2Cho = false;
                                                    new Result(player1, player2, player1Cho, player2Cho);
                                                    cancel();
                                                    break;
                                            }
                                            cancel();
                                            break;
                                    }
                                    cancel();
                                    break;
                            }
                            cancel();
                            break;
                    }
                } catch (InputMismatchException e) {
                    cancel();
                    System.out.println("Wrong input");
                    new game(player1, player2);
                }
            }
            timer--;

            }
        }, 1000, 1000);
    }
}
