
public class  StudentMain18 {
    public static void main(String[] args) {
    

        // Instantiation process
        mahasiswa mhs1 = new mahasiswa();

        // Accessing attributes
        mhs1.NIM = "2241720171";
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.2;

        // Calling method
        mhs1.tampilkanInformasi();
        System.out.println("Performance: " + mhs1.nilaiKinerja());

        System.out.println("----------------------");

        // Modify data
        mhs1.ubahKelas("SI 2K");
        mhs1.ubahIPK(3.8);

        // Display updated data
        mhs1.tampilkanInformasi();
        System.out.println("Performance: " + mhs1.nilaiKinerja());

         //  Object 2 → Parameterized Constructor
        mahasiswa mhs2 = new mahasiswa (
                "2241720172",
                "Budi Santoso",
                "SI 2K",
                3.8
        );

        mhs2.tampilkanInformasi();
        System.out.println("Performance: " + mhs2.nilaiKinerja());
    }
} 
    

