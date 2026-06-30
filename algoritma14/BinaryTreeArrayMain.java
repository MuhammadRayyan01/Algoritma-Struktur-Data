package algoritma14;
import java.util.Scanner;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();

        Student19[] data = null;
        boolean dataSudahAda = false;

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan InOrder");
            System.out.println("3. Tampilkan PostOrder");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Jumlah Mahasiswa: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    data = new Student19[n];

                    for (int i = 0; i < n; i++) {

                        System.out.println("\nMahasiswa ke-" + (i + 1));

                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();

                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();

                        System.out.print("Kelas : ");
                        String kelas = sc.nextLine();

                        System.out.print("IPK   : ");
                        double ipk = sc.nextDouble();
                        sc.nextLine();

                        data[i] = new Student19(nim, nama, kelas, ipk);
                    }

                    bta.populateData(data, n - 1);
                    dataSudahAda = true;

                    System.out.println("Data berhasil dimasukkan!");
                    break;

                case 2:

                    if (!dataSudahAda) {
                        System.out.println("Input data terlebih dahulu!");
                    } else {
                        System.out.println("\n=== InOrder Traversal ===");
                        bta.traverseInOrder(0);
                    }

                    break;

                case 3:

                    if (!dataSudahAda) {
                        System.out.println("Input data terlebih dahulu!");
                    } else {
                        System.out.println("\n=== PostOrder Traversal ===");
                        bta.traversePostOrder(0);
                    }

                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 4);

        sc.close();
    }
}