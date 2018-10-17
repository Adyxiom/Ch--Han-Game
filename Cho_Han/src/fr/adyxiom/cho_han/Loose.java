package fr.adyxiom.cho_han;

public class Loose {
    public Loose(Player player1, Player player2, Boolean nPlayer, Boolean whichPlayer) {
        if (whichPlayer) {
            player1.setJ(player1.getJ() + 1);
            if (player1.getJ() > player1.getMaxJ()) {
                player1.setMaxJ(player1.getJ());
            }
            player1.setdStats(player1.getdStats() + 1);
            player1.setI(0);
            System.out.println("Unlucky " + player1.getName() + " you have lost.. Defeats in a row : " + player1.getJ());
            if (nPlayer) {
                System.out.println("-------------------------------------------------------------------");
            }
            else if (!nPlayer) {
                new Game(player1, player2, nPlayer);
            }
        }
        else if (!whichPlayer && nPlayer) {
            player2.setJ(player2.getJ() + 1);
            if (player2.getJ() > player2.getMaxJ()) {
                player2.setMaxJ(player2.getJ());
            }
            player2.setdStats(player2.getdStats() + 1);
            player2.setI(0);
            System.out.println("Unlucky " + player2.getName() + " you have lost.. Defeats in a row : " + player2.getJ());
            System.out.println("-------------------------------------------------------------------");
            new Game(player1, player2, nPlayer);
        }
    }
}
