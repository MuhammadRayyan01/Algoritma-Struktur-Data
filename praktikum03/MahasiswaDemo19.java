import java.util.Scanner;
public class MahasiswaDemo19 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Student19[] ArrayofMahasiswa = new Student19[3];

    for(int i=0;i<3;i++){
    ArrayofMahasiswa[i]=new Student19();

        System.out.println("Masukkan Nim : ");
        ArrayofMahasiswa[i].nim = scanner.nextLine();
        System.out.println("Masukkan Nama : ");
        ArrayofMahasiswa[i].name = scanner.nextLine();
        System.out.println("Masukkan Kelas : ");
        ArrayofMahasiswa[i].kelas = scanner.nextLine();
        System.out.println("Masukkan IPK : ");
        ArrayofMahasiswa[i].ipk = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("===============================");
    }
for(int i=0;i<3;i++){
    System.out.println("Data Mahasiswa ke-"+(i+1));
    System.out.println("Nim : " + ArrayofMahasiswa[i].nim);
    System.out.println("Nama : " + ArrayofMahasiswa[i].name);
    System.out.println("Kelas : " + ArrayofMahasiswa[i].kelas);
    System.out.println("IPK : " + ArrayofMahasiswa[i].ipk);
    System.out.println("===============================");

}
}
}
