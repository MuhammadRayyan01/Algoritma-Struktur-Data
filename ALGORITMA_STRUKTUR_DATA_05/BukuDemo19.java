import java.util.*;
public class BukuDemo19{

public static void main(String[] args) {
String kodeBuku;
String judulBuku;
String Penulis;
int tahunTerbit;

Scanner sc=new Scanner (System.in);
//input book stock
System.out.println("==================");
System.out.print("Input Jumlah Buku: ");
int jumlahBuku = sc.nextInt();
sc.nextLine();
System.out.println("==================");
//declare array of object
Buku19[] array = new Buku19[jumlahBuku];

for(int i=0;i<jumlahBuku;i++){
    
System.out.println("input kode buku:");
kodeBuku=sc.nextLine();
System.out.println("input judul buku:");
judulBuku=sc.nextLine();
System.out.println("input penulis:");
Penulis = sc.nextLine();
System.out.println("input tahun terbit");
tahunTerbit = sc.nextInt();
sc.nextLine();

array[i] = new Buku19( kodeBuku,judulBuku, Penulis, tahunTerbit);
}
for(int i=0;i<jumlahBuku;i++){
    System.out.println("buku ke "+(i+1));
    System.out.println("============");
    System.out.println(array[i].kodeBuku);
    System.out.println(array[i].judulBuku);
    System.out.println(array[i].Penulis);
    System.out.println(array[i].tahunTerbit);
    System.out.println("===============");
}        
    }
}