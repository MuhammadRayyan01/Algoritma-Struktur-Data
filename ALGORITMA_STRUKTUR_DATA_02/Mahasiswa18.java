class mahasiswa{
    String nama;
    String NIM;
    String kelas;
    double ipk;

      //  Default Constructor
    mahasiswa() {
        System.out.println("Object Mahasiswa dibuat (Default Constructor)");
    }

    //  Parameterized Constructor
    mahasiswa(String NIM, String nama, String kelas, double ipk) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

void tampilkanInformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + NIM);
    System.out.println("Kelas : " + kelas);
    System.out.println("IPK : " + ipk);

}
void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
}
void ubahIPK(double ipkBaru){
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        this.ipk = ipkBaru;
    } else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
    }
}

String nilaiKinerja(){
    if (ipk >= 3.5){
        return "Sangat Baik";
    } else if (ipk >= 3.0){
        return "Baik";
    } else if (ipk >= 2.5){
        return "Cukup";
    } else {
        return "Kurang";
    }
}
}
