package algoritma12.practicum01;

import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
SingleLinkedList sll = new SingleLinkedList();
int choice;
do{
    System.out.println("=== input data linked list ===");
    System.out.println("1.input data");
    System.out.println("2.print data");
    choice = sc.nextInt();
    sc.nextLine();
    switch (choice) {
        case 1:
            System.out.println("=======");
            System.out.print ("input your nim: ");
            String nim = sc.nextLine();
            System.out.print ("input your name: ");
            String name = sc.nextLine();
            System.out.print("input your className:");
            String className = sc.nextLine();
            System.out.println("=======");
            System.out.print("input gpa:");
            double gpa = sc.nextDouble();

            Student19 std= new Student19(nim, name, className, gpa);
            sll.addLast(std);
            break;
        case 2:
            sll.print();
            break;
        default:
            System.out.println("error choice");
            break;
    }
}while(choice == 1 || choice == 2 );




    }
}
