import java.util.*;
public class StudentDemo19 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        topStudent19 list = new topStudent19();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent data " + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String studentClass = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine(); // clear buffer

            Student19 s = new Student19(nim, name, studentClass, gpa);
            list.add(s);
        }

        System.out.println("\n=== Before Sorting ===");
        list.print();

        list.bubbleSort();

        System.out.println("\n=== After Sorting (Descending GPA) ===");
        list.print();

        list.selectionSort();
        System.out.println("\n=== After Sorting (Ascending GPA) ===");
        list.print();
    }
}