package fr.adyxiom.cho_han;


public class main {
    public static void main(String[] args) {
        int vStats = 0; // Global victories
        int dStats = 0; // Global defeats
        int i = 0;      // Victory in a row
        int j = 0;      // Defeats in a row
        int maxI = 0;   // Maximum of i
        int maxJ = 0;   // Maximum of j
        new game(vStats, dStats, i, j, maxI, maxJ);
    }
}
