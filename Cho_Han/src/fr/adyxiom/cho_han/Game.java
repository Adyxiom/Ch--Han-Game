package fr.adyxiom.cho_han;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
    public Game(Player player1, Player player2, Boolean nPlayer) {
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
                Boolean player2Cho = false;
                Boolean player1Stats;
                System.out.println(player1.getName() + "'s turn");
                System.out.println("Cho(1) | Han(2) | Leaderboard(3) | Statistics(0)");
                try {
                    switch (scanner.nextInt()) {
                        case 1:
                            player1Cho = true;
                            player1Stats = false;
                            if (nPlayer) {
                            System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        player2Cho = true;
                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                        cancel();
                                        break;
                                    case 2:
                                        player2Cho = false;
                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                        cancel();
                                        break;
                                    case 0:
                                        new Stats(player1, player2, player1Stats);
                                        System.out.println("Cho(1) | Han(2)");
                                        switch (scanner.nextInt()) {
                                            case 1:
                                                player2Cho = true;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                            case 2:
                                                player2Cho = false;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                        }
                                        cancel();
                                        break;
                                }
                            }
                            else {
                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                cancel();
                                break;
                            }
                            cancel();
                            break;
                        case 2:
                            player1Cho = false;
                            player1Stats = false;
                            if (nPlayer) {
                                System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        player2Cho = true;
                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                        cancel();
                                        break;
                                    case 2:
                                        player2Cho = false;
                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                        cancel();
                                        break;
                                    case 0:
                                        new Stats(player1, player2, player1Stats);
                                        System.out.println("Cho(1) | Han(2)");
                                        switch (scanner.nextInt()) {
                                            case 1:
                                                player2Cho = true;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                            case 2:
                                                player2Cho = false;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                        }
                                        cancel();
                                        break;
                                }
                            }
                            else {
                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                cancel();
                                break;
                            }
                            cancel();
                            break;
                        case 3:
                            new Leaderboard(player1, player2, nPlayer);
                            cancel();
                            break;
                        case 0:
                            player1Stats = true;
                            new Stats(player1, player2, player1Stats);
                            System.out.println("Cho(1) | Han(2)");
                            switch (scanner.nextInt()) {
                                case 1:
                                    player1Cho = true;
                                    player1Stats = false;
                                    if (nPlayer) {
                                        System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                                        switch (scanner.nextInt()) {
                                            case 1:
                                                player2Cho = true;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                            case 2:
                                                player2Cho = false;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                            case 0:
                                                new Stats(player1, player2, player1Stats);
                                                System.out.println("Cho(1) | Han(2)");
                                                switch (scanner.nextInt()) {
                                                    case 1:
                                                        player2Cho = true;
                                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);                                                        cancel();
                                                        break;
                                                    case 2:
                                                        player2Cho = false;
                                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                        cancel();
                                                        break;
                                                }
                                                cancel();
                                                break;
                                        }
                                    }
                                    else {
                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                        cancel();
                                        break;
                                    }
                                    cancel();
                                    break;
                                case 2:
                                    player1Cho = false;
                                    player1Stats = false;
                                    if (nPlayer) {
                                        System.out.println(player2.getName() + "'s turn\nCho(1) | Han(2) | Statistics(0)");
                                        switch (scanner.nextInt()) {
                                            case 1:
                                                player2Cho = true;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                            case 2:
                                                player2Cho = false;
                                                new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                cancel();
                                                break;
                                            case 0:
                                                new Stats(player1, player2, player1Stats);
                                                System.out.println("Cho(1) | Han(2)");
                                                switch (scanner.nextInt()) {
                                                    case 1:
                                                        player2Cho = true;
                                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                        cancel();
                                                        break;
                                                    case 2:
                                                        player2Cho = false;
                                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
                                                        cancel();
                                                        break;
                                                }
                                                cancel();
                                                break;
                                        }
                                    }
                                    else {
                                        new Result(player1, player2, nPlayer, player1Cho, player2Cho);
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
                    new Game(player1, player2, nPlayer);
                }
            }
            timer--;

            }
        }, 1000, 1000);
    }
}
