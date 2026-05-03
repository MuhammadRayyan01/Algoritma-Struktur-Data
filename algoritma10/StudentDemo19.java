package algoritma10;
import java.util.*;
public class StudentDemo19 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
StudentAssignmentStack Stack = new StudentAssignmentStack(5);
int choice;
do{
    System.out.println("\nMenu:");
    System.out.println("1.mengumpulkan tugas");
    System.out.println("2.menilai tugas");
    System.out.println("3.melihat tugas teratas");
    System.out.println("4.melihat daftar tugas");
    System.out.println("5.melihat tugas pertama");
    System.out.println("pilih");
    choice = sc.nextInt();
    sc.nextLine();
    switch (choice) {
        case 1:
        System.out.println("nim:");
        String nim = sc.nextLine();
        System.out.println("nama:");
        String name = sc.nextLine();
        System.out.println("class:");
        String className = sc.nextLine();
        student19 mhs = new student19(nim, name, className); 
        Stack.push(mhs);  
        System.out.printf("Tugas %s berhasil dikumpulkan \n", mhs.name);
        break;
        case 2:
            student19 dinilai = Stack.peek();
            if (dinilai != null) {
            System.out.println("menilai tugas dari "+ dinilai.name);
            System.out.println("masukkan nilai (0-100)");
            int grade = sc.nextInt();
            dinilai.grading(grade);
            System.out.printf("nilai tugas %s adalah %d\n", dinilai.name, grade);
            String binary = Stack.ConversiontoBinary(grade);
            System.out.printf("nilai tugas %s dalam biner adalah %s\n", dinilai.name, binary);
            }
            break;
        case 3:
            student19 lihat = Stack.peek();
            if(lihat != null){
            System.out.println("tugasdikumpulkan oleh "+ lihat.name);
            }
            break;
        case 4:
            System.out.println("daftar semua tugas");
            System.out.println(Stack.top + 1 + " tugas di dalam stack");
            System.out.println("nama\tNIM\tKelas");
            Stack.print();
            break;
        case 5:
            System.out.println("lihat pengumpul pertama");
            student19 lihatPertama = Stack.Stack[0];
            if(lihatPertama != null){
            System.out.println("tugas dikumpulkan oleh "+ lihatPertama.name);
            }
            break;
        default:
            System.out.println("pilihan tidak valid");
        break;
    }
}while (choice >= 1 && choice <= 5);

}
}
