import java.util.*;
public class MainStudent {
public static void main(String[] args) {
   Scanner s = new Scanner (System.in);
   Scanner s1 = new Scanner (System.in);

    SearchStudent search = new SearchStudent();
    int amountStudent = 5;

    System.out.println("----------------------------");
    System.out.println("Input Student Data according from smallest NIM");
    System.out.println("----------------------------");
    for (int i = 0; i < amountStudent; i++) {
        System.out.print("Input NIM : ");
        long NIM = s.nextLong();
        System.out.print("Input Name : ");
        String name = s1.nextLine();
        System.out.print("Input GPA : ");
        double GPA = s.nextDouble();
        System.out.print("Input Age : ");
        int age = s.nextInt();

        Student19 student = new Student19(NIM, name, GPA, age);
        search.add(student);
    }
    System.out.println("----------------------------");
    System.out.println("Display Student Data");
    search.display();

    System.out.println("----------------------------");
    System.out.print("Input NIM to search : ");
    int searchNIM = s.nextInt();
    System.out.println("Search Result : ");
    search.SeqSearch(searchNIM);
    System.out.println("----------------------------"); 
    System.out.print("Input NIM to show position : ");
    search.showPosition(searchNIM, searchNIM);
    System.out.println("----------------------------");
    System.out.print("Input NIM to show data : ");
    search.showData(searchNIM, searchNIM);
}
}
