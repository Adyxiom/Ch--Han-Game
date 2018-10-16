package fr.adyxiom.testcho_han;

import java.util.Scanner;

public class main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int compteur = 0;
        int compteurmax;
        int n; //n faces
        int i = 0; //paire
        int j = 0; //impaire
        int maxI = 0; //max paire a la suite
        int maxJ = 0; //max impaire a la suite
        int totalI = 0; //total paire
        int totalJ = 0; //total impaire

        System.out.println("Lancement du programme");
        System.out.println("Nombres de faces : ");
        n = scanner.nextInt();
        System.out.println("Nombres de parties : ");
        compteurmax = scanner.nextInt();
        long tempsDebut = System.nanoTime();
        new game(i, j, maxI, maxJ, totalI, totalJ, compteur, compteurmax, n);
        long tempsFin = System.nanoTime();
        double seconds = (tempsFin - tempsDebut) / 1e9;
        System.out.println("----------------------------------------------------");
        if (seconds > 60) {
            seconds /= 60;
            System.out.println("Le programme s'execute en " + seconds + " minutes.");
        }
        else {
            System.out.println("Le programme s'execute en " + seconds + " secondes.");
        }
    }
}
