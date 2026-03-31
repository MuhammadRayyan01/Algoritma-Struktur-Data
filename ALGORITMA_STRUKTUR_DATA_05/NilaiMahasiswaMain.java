import java.util.Scanner;

public class NilaiMahasiswaMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = sc.nextInt();

        int uts[] = new int[n];
        int uas[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Input UTS: ");
            uts[i] = sc.nextInt();

            System.out.print("Input UAS: ");
            uas[i] = sc.nextInt();
        }

        NilaiMahasiswa nm = new NilaiMahasiswa();

        int maxUTS = nm.maxDC(uts, 0, n - 1);
        int minUTS = nm.minDC(uts, 0, n - 1);
        double avgUAS = nm.avgBF(uas);

        System.out.println("=== RESULT ===");
        System.out.println("Highest UTS (DC): " + maxUTS);
        System.out.println("Lowest UTS (DC): " + minUTS);
        System.out.println("Average UAS (BF): " + avgUAS);
    }
}