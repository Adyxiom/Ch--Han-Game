package fr.adyxiom.cho_han;

public class Win {
    public Win(Player player1, Player player2, Boolean nPlayer, Boolean whichPlayer) {
        if (whichPlayer) {
            player1.setI(player1.getI() + 1);
            if (player1.getI() > player1.getMaxI()) {
                player1.setMaxI(player1.getI());
            }
            player1.setvStats(player1.getvStats() + 1);
            player1.setJ(0);
            System.out.println("Congratulation " + player1.getName() + " ! Victory in a row : " + player1.getI());
            if (nPlayer) {
                System.out.println("-------------------------------------------------------------------");
            }
            else if (!nPlayer) {
                new Game(player1, player2, nPlayer);
            }
        }
        else if (!whichPlayer && nPlayer){
            player2.setI(player2.getI() + 1);
            if (player2.getI() > player2.getMaxI()) {
                player2.setMaxI(player2.getI());
            }
            player2.setvStats(player2.getvStats() + 1);
            player2.setJ(0);
            System.out.println("Congratulation " + player2.getName() + " ! Victory in a row : " + player2.getI());
            System.out.println("-------------------------------------------------------------------");
            new Game(player1, player2, nPlayer);
        }
    }
}
