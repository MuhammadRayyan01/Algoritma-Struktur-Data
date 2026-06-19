package algoritma16.assignment;

public class Matkul{
    private String kodeMk;
    private String namaMk;
    private int sks;

    public Matkul(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String getKodeMk() { return kodeMk; }
    public String getNamaMk() { return namaMk; }
    public int getSks() { return sks; }

    @Override
    public String toString() {
        return "[" + kodeMk + "] " + namaMk + " (" + sks + " SKS)";
    }
    
}