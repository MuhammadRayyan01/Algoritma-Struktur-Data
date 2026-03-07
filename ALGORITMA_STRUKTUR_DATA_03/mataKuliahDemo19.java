import java.util.Scanner;

public class mataKuliahDemo19 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    mataKuliah19[] ArrayofMataKuliah = new mataKuliah19[3];
    String kode, nama;
    int sks, jumlahJam;

        for(int i=0;i<3;i++){

            System.out.println("Masukkan Kode Mata Kuliah : ");
            kode = scanner.nextLine();

            System.out.println("Masukkan Nama Mata Kuliah : ");
            nama = scanner.nextLine();

            System.out.println("Masukkan SKS : ");
            sks = scanner.nextInt();

            System.out.println("Masukkan Jumlah Jam : ");
            jumlahJam = scanner.nextInt();
            scanner.nextLine();

            ArrayofMataKuliah[i] = new mataKuliah19(kode, nama, sks, jumlahJam);
        }
        for(int i=0;i<3;i++){
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode Mata Kuliah : " + ArrayofMataKuliah[i].kode);
            System.out.println("Nama Mata Kuliah : " + ArrayofMataKuliah[i].nama);
            System.out.println("SKS : " + ArrayofMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + ArrayofMataKuliah[i].jumlahJam);
        }
      
    }
}