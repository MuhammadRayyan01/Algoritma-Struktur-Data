
import java.util.Scanner;

public class DosenDemo19 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Masukkan Jumlah Dosen : ");
int jumlahDosen = scanner.nextInt();
scanner.nextLine();

//declare array of object
Dosen19[] ArrayofDosen = new Dosen19[jumlahDosen];
String code; 
String name;
Boolean gender;
int age;

//input data dosen
for(int i=0;i<jumlahDosen;i++){
    System.out.println("Masukkan Kode Dosen : ");
    code = scanner.nextLine();

    System.out.println("Masukkan Nama Dosen : ");
    name = scanner.nextLine();

    System.out.println("Masukkan Gender Dosen (true:Laki-laki, false:Perempuan) : ");
    gender = scanner.nextBoolean();
    scanner.nextLine(); 

    System.out.println("Masukkan Usia Dosen : ");
    age = scanner.nextInt();
    scanner.nextLine(); 

    // Create object of Dosen19 and store it in the array
    ArrayofDosen[i] = new Dosen19(code, name, gender, age);
}
// Display lecture information
   for(int i=0;i<jumlahDosen;i++){
    System.out.println("Data Dosen ke-" + (i+1));
    System.out.println("Kode Dosen : " + ArrayofDosen[i].code);
    System.out.println("Nama Dosen : " + ArrayofDosen[i].name);
    System.out.println("Gender Dosen : " + (ArrayofDosen[i].gender));
    System.out.println("Usia Dosen : " + ArrayofDosen[i].age);
    System.out.println("===============================");
   }
//call method from DataDosen19 class
    DataDosen19 dataDosen = new DataDosen19();
    dataDosen.numberOfLecturersPerGender(ArrayofDosen);
    dataDosen.AverageAgeOfLecturersPerGender(ArrayofDosen);
    dataDosen.infoDosenPalingTua(ArrayofDosen);
    dataDosen.infoDosenMostYoungest(ArrayofDosen);



    
}
}