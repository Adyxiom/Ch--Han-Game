package fr.adyxiom.cho_han;

public class Player {
    private String name;
    private int vStats; // Global victories
    private int dStats; // Global defeats
    private int i;      // Victory in a row
    private int j;      // Defeats in a row
    private int maxI;   // Maximum of i
    private int maxJ;   // Maximum of j



    public Player(String name, int vStats, int dStats, int i, int j, int maxI, int maxJ) {
        this.name = name;
        this.vStats = vStats;
        this.dStats = dStats;
        this.i = i;
        this.j = j;
        this.maxI = maxI;
        this.maxJ = maxJ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getvStats() {
        return vStats;
    }

    public void setvStats(int vStats) {
        this.vStats = vStats;
    }

    public int getdStats() {
        return dStats;
    }

    public void setdStats(int dStats) {
        this.dStats = dStats;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getMaxI() {
        return maxI;
    }

    public void setMaxI(int maxI) {
        this.maxI = maxI;
    }

    public int getMaxJ() {
        return maxJ;
    }

    public void setMaxJ(int maxJ) {
        this.maxJ = maxJ;
    }
}
