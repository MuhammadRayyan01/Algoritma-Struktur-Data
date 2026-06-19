package algoritma16;
import java.util.*;
public class Mahasiswa implements Comparable<Mahasiswa>{
    String nim,nama,notelp;
public Mahasiswa() {

}
public Mahasiswa(String nim, String nama, String notelp) {
    this.nim = nim;
    this.nama = nama;
    this.notelp = notelp;
}
@Override
public int compareTo(Mahasiswa mhsLain) {
        // Ini memberi tahu Java agar mengurutkan data berdasarkan NIM secara alfabetis/angka
        return this.nim.compareTo(mhsLain.nim);
    }

}