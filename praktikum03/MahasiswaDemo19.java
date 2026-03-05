
public class MahasiswaDemo19 {
public static void main(String[] args) {
    Student19[] arrayOfMahasiswa = new Student19[3];
    arrayOfMahasiswa[0] = new Student19();
    arrayOfMahasiswa[0].nim = "2241720171";
    arrayOfMahasiswa[0].name = "AGNES";
    arrayOfMahasiswa[0].kelas = "SIB 1E";
    arrayOfMahasiswa[0].ipk = (float) 3.75;

    arrayOfMahasiswa[1] = new Student19();
    arrayOfMahasiswa[1].nim = "2241720172";
    arrayOfMahasiswa[1].name = "BUDI";
    arrayOfMahasiswa[1].kelas = "SIB 1E";
    arrayOfMahasiswa[1].ipk = (float) 3.36;

    arrayOfMahasiswa[2] = new Student19();
    arrayOfMahasiswa[2].nim = "2241720173";
    arrayOfMahasiswa[2].name = "CINTA";
    arrayOfMahasiswa[2].kelas = "SIB 1E";
    arrayOfMahasiswa[2].ipk = (float) 3.90;

    System.out.println("Data Mahasiswa:");
    System.out.println("-----------------");
    System.out.println("Nim : " + arrayOfMahasiswa[0].nim);
    System.out.println("Nama : " + arrayOfMahasiswa[0].name);
    System.out.println("Kelas : " + arrayOfMahasiswa[0].kelas);
    System.out.println("IPK : " + arrayOfMahasiswa[0].ipk);
    System.out.println();
    System.out.println("Nim : " + arrayOfMahasiswa[1].nim);
    System.out.println("Nama : " + arrayOfMahasiswa[1].name);
    System.out.println("Kelas : " + arrayOfMahasiswa[1].kelas);
    System.out.println("IPK : " + arrayOfMahasiswa[1].ipk);
    System.out.println();
    System.out.println("Nim : " + arrayOfMahasiswa[2].nim);
    System.out.println("Nama : " + arrayOfMahasiswa[2].name);
    System.out.println("Kelas : " + arrayOfMahasiswa[2].kelas);
    System.out.println("IPK : " + arrayOfMahasiswa[2].ipk);
}
}
