public class example {
int angka;
int hasil;
String nama;

public example(int angka, String nama) {
    this.angka = angka;
    this.nama = nama;
}
public example(int angka) {
    this.angka = angka;
}
public static void main(String[] args) {
    example contoh1 = new example(5, "Contoh 1");
    example contoh2 = new example(10);

    System.out.println("Contoh 1 - Angka: " + contoh1.angka + ", Nama: " + contoh1.nama);
    System.out.println("Contoh 2 - Angka: " + contoh2.angka);
}
}