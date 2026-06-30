package AlgoritmaLatihan;

public class Student {
    String nama, nim;

    public Student(String nim, String nama) {
        this.nim=nim;
        this.nama=nama;
    }
        
    void print(){
            System.out.println(nim + " - " + nama);
    }

}
