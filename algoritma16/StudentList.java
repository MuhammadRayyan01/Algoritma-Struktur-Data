package algoritma16;
import java.util.*;
//import java.util.List;
public class StudentList {

List <Mahasiswa> mahasiswa = new ArrayList<>();

public void add(Mahasiswa... mhs){
    mahasiswa.addAll(Arrays.asList(mhs));
}
public void remove(int index){
    mahasiswa.remove(index);
}
public void update(int index, Mahasiswa mhs){
    mahasiswa.set(index, mhs);
}
public void tampil() {
    mahasiswa.stream().forEach(mhs -> {
        System.out.println("" + mhs.toString());
    });
}
int linearsearch(String nim){
    for(int i=0; i<mahasiswa.size(); i++){
        if(mahasiswa.get(i).nim.equals(nim)){
            return i;
        }
    }
    return -1;
}
int binarySearch(String nim) {
    Collections.sort(mahasiswa);
    Mahasiswa kunciPencarian = new Mahasiswa(nim, "", "");
    int index = Collections.binarySearch(mahasiswa, kunciPencarian);

return (index >= 0) ? index : -1;
}
// 1. Sort by NIM (Ascending / Descending)
public void urutkanBerdasarkanNim(String urutan) {
    if (urutan.equalsIgnoreCase("asc")) {
        // Uses the natural order defined in Mahasiswa (by NIM)
        Collections.sort(mahasiswa); 
        System.out.println("List berhasil diurutkan berdasarkan NIM (Ascending).");
    } else if (urutan.equalsIgnoreCase("desc")) {
        // Uses the reverse of the natural order
        Collections.sort(mahasiswa, Collections.reverseOrder());
        System.out.println("List berhasil diurutkan berdasarkan NIM (Descending).");
    } else {
        System.out.println("Pilihan urutan tidak valid! Gunakan 'asc' atau 'desc'.");
    }
}

// 2. Sort by NAMA (Ascending / Descending)
public void urutkanBerdasarkanNama(String urutan) {
    if (urutan.equalsIgnoreCase("asc")) {
        // Compares the 'nama' String of each Mahasiswa object
        mahasiswa.sort(Comparator.comparing(mhs -> mhs.nama));
        System.out.println("List berhasil diurutkan berdasarkan NAMA (Ascending).");
    } else if (urutan.equalsIgnoreCase("desc")) {
        // Compares the 'nama' String in reverse order
        mahasiswa.sort(Comparator.comparing((Mahasiswa mhs) -> mhs.nama).reversed());
        System.out.println("List berhasil diurutkan berdasarkan NAMA (Descending).");
    } else {
        System.out.println("Pilihan urutan tidak valid! Gunakan 'asc' atau 'desc'.");
    }
}
public static void main(String[] args) {
    StudentList list = new StudentList();
    Mahasiswa mhs1 = new Mahasiswa("A11.2020.12345", "Dimas", "08123456789");
    Mahasiswa mhs2 = new Mahasiswa("A11.2020.12346", "Rizky", "08123456780");
    list.add(mhs1, mhs2);
    list.tampil();
    list.update(list.linearsearch("A11.2020.12345"), new Mahasiswa("A11.2020.12345", "Fajar", "08123456789"));
    list.tampil();
    System.out.println("=============");
    System.out.println("Index of student with NIM A11.2020.12346: " + list.binarySearch("A11.2020.12346"));
}
}



