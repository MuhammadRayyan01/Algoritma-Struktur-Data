package algoritma16.assignment;


public class Nilai {
    private Student mahasiswa;
    private Matkul matakuliah;
    private double nilaiAngka;

    public Nilai(Student mahasiswa, Matkul matakuliah, double nilaiAngka) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiAngka = nilaiAngka;
    }

    public Student getMahasiswa() { return mahasiswa; }
    public Matkul getMatakuliah() { return matakuliah; }
    public double getNilaiAngka() { return nilaiAngka; }

    // Converts numeric score to letter grade
    public String getNilaiHuruf() {
        if (nilaiAngka >= 80) return "A";
        if (nilaiAngka >= 73) return "B+";
        if (nilaiAngka >= 65) return "B";
        if (nilaiAngka >= 60) return "C+";
        if (nilaiAngka >= 50) return "C";
        if (nilaiAngka >= 39) return "D";
        return "E";
    }

    // Converts letter grade to weight points for GPA calculation
    public double getBobotNilai() {
        switch (getNilaiHuruf()) {
            case "A" : return 4.0;
            case "B+": return 3.5;
            case "B" : return 3.0;
            case "C+": return 2.5;
            case "C" : return 2.0;
            case "D" : return 1.0;
            default  : return 0.0;
        }
    }
    
}
