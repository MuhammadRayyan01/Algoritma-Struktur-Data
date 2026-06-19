package algoritma16.assignment;

public class Student implements Comparable<Student> {
    private String nim;
    private String nama;

    public Student(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }

    @Override
    public int compareTo(Student other) {
        return this.nim.compareTo(other.nim);
    }

    @Override
    public String toString() {
        return "NIM: " + nim + " | Nama: " + nama;
    }
}

    

