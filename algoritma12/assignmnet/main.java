package algoritma12.assignmnet;

import java.util.*;

public class main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
SingleLinkedList serviceQueue = new SingleLinkedList();
int choice;



do {
System.out.println("=STUDENT SERVICE QUEUE MENU=    ");
System.out.println("==================================");
System.out.println("1. Student Registration (Enqueue)");
System.out.println("2. Call Next Student (Dequeue)");
System.out.println("3. View Queue Status (Front & Rear)");
System.out.println("4. View All Students in Queue");
System.out.println("5. Clear All Queue");
System.out.println("6. Exit");
System.out.println("----------------------------------");
System.out.print("Choose option (1-6): ");
choice = sc.nextInt();
sc.nextLine(); 

switch (choice) {
case 1:
    System.out.print("Enter Student NIM: ");
    String nim = sc.nextLine();
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();
    System.out.print("Enter classNAme:");
    String className = sc.nextLine();
    Student19 newStudent = new Student19(nim, name, className);
    serviceQueue.addLast(newStudent);
    break;

case 2:
    serviceQueue.removeFirst();
    break;

case 3:
    serviceQueue.printFirst();
    serviceQueue.printLast();
    break;

case 4:
    serviceQueue.print();
    break;

case 5:
    serviceQueue.clear();
break;

case 6:
    System.out.println("Closing system. Have a nice day!");
    break;

default:
    System.out.println("Invalid option! Please try again.");
}
} while (choice != 6);

sc.close();
}
    
}
    
