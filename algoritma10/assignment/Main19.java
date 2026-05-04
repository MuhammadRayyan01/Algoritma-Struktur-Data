package algoritma10.assignment;
import java.util.*;

public class Main19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack19 stack = new Stack19(10);
    int choice;
//make option menu
do {
    stack.menu();
    choice = sc.nextInt();
    switch (choice) {
        //case 1: add excuse letter
        case 1:
            System.out.print("Enter ID: ");
            String id = sc.next();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Class: ");
            String className = sc.next();
            System.out.print("Enter Type (S for Sick, P for Permission): ");
            char type = sc.next().charAt(0);
            System.out.print("Enter Duration (in days): ");
            int duration = sc.nextInt();
            ExcuseLetter19 letter = new ExcuseLetter19(id, name, className, type, duration);
            stack.push(letter);
            break;
        //case 2: process the latest excuse letter
        case 2:
            if (stack.isEmpty()) {
                System.out.println("No excuse letters to process.");
            } else {
                ExcuseLetter19 processed = stack.pop();
                System.out.println("Processed Excuse Letter - ID: " + processed.id + ", Name: " + processed.name + ", Class: " + processed.className + ", Type: " + processed.type + ", Duration: " + processed.duration);
            }
            break;
        //case 3: view the latest excuse letter
        case 3:
            if (stack.isEmpty()) {
                System.out.println("No excuse letters to display.");
            } else {
                ExcuseLetter19 latest = stack.stack[stack.top];
                System.out.println("Latest Excuse Letter - ID: " + latest.id + ", Name: " + latest.name + ", Class: " + latest.className + ", Type: " + latest.type + ", Duration: " + latest.duration);
            }
            break;
        //case 4: search excuse letter by name
        case 4:
            System.out.print("Enter Name to search: ");
            String searchName = sc.next();
            boolean found = false;
            for (int i = stack.top; i >= 0; i--) {
                if (stack.stack[i].name.equals(searchName)) {
                    ExcuseLetter19 l = stack.stack[i];
                    System.out.println("Found - ID: " + l.id + ", Name: " + l.name + ", Class: " + l.className + ", Type: " + l.type + ", Duration: " + l.duration);
                    found = true;
                    break;
                }
            }
            default: 
                System.out.println("Invalid choice.");
            
}
    } while (choice <5 && choice > 0);
    
    }

}
