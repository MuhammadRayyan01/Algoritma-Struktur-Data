import java.util.Scanner;
public class filmDemo19 {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String kodeFilm;
String judulFilm;
double rating;
int tahunRilis;

System.out.println("input how many film");
int jumlahFilm=sc.nextInt();
sc.nextLine();
//declare array
film19[] array=new film19[jumlahFilm];

//input data
for(int i=0;i<jumlahFilm;i++){
System.out.println("input kode film:");
kodeFilm=sc.nextLine();
System.out.println("input judul film:");
judulFilm=sc.nextLine();
System.out.println("input rating:");
rating= sc.nextDouble();
System.out.println("input tahun rilis");
tahunRilis = sc.nextInt();
sc.nextLine();

array[i] = new film19(kodeFilm, judulFilm, rating, tahunRilis);
}
//display data
for(int i=0;i<jumlahFilm;i++){
System.out.println("data "+(i+1));
System.out.println(array[i].judulFilm);
System.out.println(array[i].kodeFilm);
System.out.println(array[i].rating);
System.out.println(array[i].tahunRilis);
}
}
}
