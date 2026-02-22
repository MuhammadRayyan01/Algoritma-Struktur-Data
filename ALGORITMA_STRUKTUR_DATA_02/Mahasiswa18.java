class mahasiswa{
    String nama;
    int NIM;
    int kelas;
    double ipk;

void tampilkanInformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("NIM : " + NIM);
    System.out.println("Kelas : " + kelas);
    System.out.println("IPK : " + ipk);

}
void ubahKelas(int kelasBaru){
    kelas = kelasBaru;
}
void ubahIPK(double ipkBaru){
    ipk = ipkBaru;
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
public class Mahasiswa18 {
    public static void main(String[] args) {
        
    }
}
