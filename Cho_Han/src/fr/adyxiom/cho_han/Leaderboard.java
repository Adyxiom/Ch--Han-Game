package fr.adyxiom.cho_han;

public class Leaderboard {
    public Leaderboard(Player player1, Player player2, Boolean nPlayer) {
        System.out.println("-------------------------------------------------------------------");
        if (!nPlayer) {
            System.out.println("U can't view the leaderboard if you play alone.");
            System.out.println("-------------------------------------------------------------------");
        }
        else {
            System.out.println("First place :");
            if (player1.getvStats() > player2.getvStats()) {
                System.out.println(player1.getName() + " with " + player1.getvStats() + " victories !");
            }
            else {
                System.out.println(player2.getName() + " with " + player2.getvStats() + " victories !");
            }
            System.out.println("Second place :");
            if (player1.getvStats() < player2.getvStats()) {
                System.out.println(player1.getName() + " with " + player1.getvStats() + " victories !");
            }
            else {
                System.out.println(player2.getName() + " with " + player2.getvStats() + " victories !");
            }
            System.out.println("-------------------------------------------------------------------");
            new Game(player1, player2, nPlayer);
        }
    }
}
