package algoritma16.assignment;

import java.util.*;


public class main {
     static List<Student> daftarMahasiswa = new ArrayList<>();
     static List<Matkul> daftarMatakuliah = new ArrayList<>();
     static List<Nilai> daftarNilai = new ArrayList<>();
    
    // TAMBAHAN: Queue untuk menampung antrean mahasiswa yang akan dihapus
    private static Queue<Student> antreanHapusMahasiswa = new LinkedList<>();

    public static void main(String[] args) {
        // Master Data Mahasiswa
        daftarMahasiswa.add(new Student("20001", "Thalhah"));
        daftarMahasiswa.add(new Student("20002", "Zubair"));
        daftarMahasiswa.add(new Student("20003", "Abdur-Rahman"));

        // Master Data Mata Kuliah
        daftarMatakuliah.add(new Matkul("00001", "Internet of Things", 3));
        daftarMatakuliah.add(new Matkul("00002", "Algoritma dan Struktur Data", 2));    

        // Input Nilai Awal (Sesuai ilustrasi gambar jobsheet)
        daftarNilai.add(new Nilai(daftarMahasiswa.get(0), daftarMatakuliah.get(0), 80.75));
        daftarNilai.add(new Nilai(daftarMahasiswa.get(1), daftarMatakuliah.get(1), 90.00));

        // TAMBAHAN: Masukkan semua mahasiswa ke dalam antrean Queue secara berurutan
        // Thalhah masuk pertama, disusul Zubair, lalu Abdur-Rahman
        for (Student mhs : daftarMahasiswa) {
            antreanHapusMahasiswa.add(mhs);
        }

        // Scanner untuk Menu Interaktif
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("*****************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*****************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa Terdepan (Queue/Antrean)"); // Menu Baru!
            System.out.println("6. Keluar");
            System.out.println("*****************************************************");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    inputNilai(in);
                    break;
                case 2:
                    tampilkanSemuaNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa(in);
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    // TAMBAHAN: Eksekusi fungsi Queue
                    hapusMahasiswaQueue();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 6);
    }
    

    public static void tampilkanSemuaNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("=======================================================================");
        System.out.printf("%-10s %-15s %-30s %-5s %-6s\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("=======================================================================");
        for (Nilai n : daftarNilai) {
            System.out.printf("%-10s %-15s %-30s %-5d %-6.2f\n", 
                n.getMahasiswa().getNim(), 
                n.getMahasiswa().getNama(), 
                n.getMatakuliah().getNamaMk(), 
                n.getMatakuliah().getSks(), 
                n.getNilaiAngka());
        }
        System.out.println("=======================================================================\n");
    }

    public static void inputNilai(Scanner in) {
        System.out.println("\n--- INPUT NILAI MAHASISWA ---");

        System.out.println("Daftar Mahasiswa:");
        for (Student mhs : daftarMahasiswa) {
            System.out.println("- " + mhs.getNim() + " | " + mhs.getNama());
        }

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = in.next();
        Student mahasiswa = cariMahasiswaByNim(nim);

        if (mahasiswa == null) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
            return;
        }

        System.out.println("Daftar Mata Kuliah:");
        for (Matkul mk : daftarMatakuliah) {
            System.out.println("- " + mk.getKodeMk() + " | " + mk.getNamaMk() + " | " + mk.getSks() + " SKS");
        }

        System.out.print("Masukkan kode mata kuliah: ");
        String kodeMk = in.next();
        Matkul matakuliah = cariMatakuliahByKode(kodeMk);

        if (matakuliah == null) {
            System.out.println("Mata kuliah dengan kode tersebut tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan nilai angka: ");
        double nilaiAngka = in.nextDouble();

        daftarNilai.add(new Nilai(mahasiswa, matakuliah, nilaiAngka));
        System.out.println("Nilai berhasil ditambahkan.");
        System.out.println("-------------------------------------------\n");
    }

    public static Student cariMahasiswaByNim(String nim) {
        for (Student mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    public static Matkul cariMatakuliahByKode(String kodeMk) {
        for (Matkul mk : daftarMatakuliah) {
            if (mk.getKodeMk().equals(kodeMk)) {
                return mk;
            }
        }
        return null;
    }

    public static void cariNilaiMahasiswa(Scanner in) {
        System.out.println("\n--- CARI NILAI MAHASISWA ---");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = in.next();

        boolean ditemukan = false;

        System.out.println("=======================================================================");
        System.out.printf("%-10s %-15s %-30s %-5s %-6s %-6s\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai", "Huruf");
        System.out.println("=======================================================================");

        for (Nilai nilai : daftarNilai) {
            if (nilai.getMahasiswa().getNim().equals(nim)) {
                ditemukan = true;
                System.out.printf("%-10s %-15s %-30s %-5d %-6.2f %-6s\n",
                        nilai.getMahasiswa().getNim(),
                        nilai.getMahasiswa().getNama(),
                        nilai.getMatakuliah().getNamaMk(),
                        nilai.getMatakuliah().getSks(),
                        nilai.getNilaiAngka(),
                        nilai.getNilaiHuruf());
            }
        }

        if (!ditemukan) {
            System.out.println("Data nilai untuk mahasiswa dengan NIM tersebut tidak ditemukan.");
        }

        System.out.println("=======================================================================\n");
    }

    public static void urutDataNilai() {
        if (daftarNilai.isEmpty()) {
            System.out.println("\nData nilai masih kosong.");
            return;
        }

        daftarNilai.sort(Comparator
                .comparing((Nilai nilai) -> nilai.getMahasiswa().getNim())
                .thenComparing(nilai -> nilai.getMatakuliah().getKodeMk()));

        System.out.println("\nData nilai berhasil diurutkan berdasarkan NIM mahasiswa dan kode mata kuliah.");
        tampilkanSemuaNilai();
    }

    // TAMBAHAN: Prosedur Penghantaran & Penghapusan menggunakan Queue (FIFO)
    public static void hapusMahasiswaQueue() {
        System.out.println("\n--- PROSES PENGHAPUSAN DATA VIA QUEUE ---");
        
        // Cek apakah antrean kosong menggunakan method bawaan .isEmpty()
        if (antreanHapusMahasiswa.isEmpty()) {
            System.out.println("Antrean kosong! Tidak ada mahasiswa yang bisa dihapus.");
            return;
        }

        // Mengintip siapa yang berada di antrean terdepan tanpa menghapusnya dulu
        Student mhsTerdepan = antreanHapusMahasiswa.peek();
        System.out.println("Mahasiswa terdepan di antrean saat ini: " + mhsTerdepan.getNama() + " (" + mhsTerdepan.getNim() + ")");

        // Mengambil dan menghapus elemen terdepan menggunakan .poll() (Prinsip FIFO)
        Student mhsDihapus = antreanHapusMahasiswa.poll();
        
        if (mhsDihapus != null) {
            String nimTarget = mhsDihapus.getNim();

            // 1. Hapus dari daftar utama mahasiswa
            daftarMahasiswa.remove(mhsDihapus);

            // 2. Hapus juga semua record Nilai akademik milik mahasiswa tersebut agar sinkron
            daftarNilai.removeIf(nilai -> nilai.getMahasiswa().getNim().equals(nimTarget));

            System.out.println("BERHASIL: Data " + mhsDihapus.getNama() + " telah dikeluarkan dari sistem.");
        }
        System.out.println("-------------------------------------------\n");
    }
}