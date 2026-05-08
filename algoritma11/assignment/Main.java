package algoritma11.assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue myQueue = new Queue(10); // Max queue size 10
        int dpaQuota = 30;
        int choice;

        do {
            System.out.println("\n--- DPA KRS Approval System ---");
            System.out.println("1. Student Registration (Enqueue)");
            System.out.println("2. Process KRS Approval (Dequeue 2 Students)");
            System.out.println("3. Show All Students in Queue");
            System.out.println("4. Show First Two Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Display Stats & Quota");
            System.out.println("0. Exit");
            System.out.print("Option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Program: "); String prog = sc.nextLine();
                    System.out.print("Class: "); String cls = sc.nextLine();
                    myQueue.enqueue(new Student19(nim, name, prog, cls));
                    break;
                case 2:
                    myQueue.dequeueKRS();
                    break;
                case 3:
                    myQueue.printAll();
                    break;
                case 4:
                    myQueue.peekTwo();
                    break;
                case 5:
                    myQueue.viewRear();
                    break;
                case 6:
                    myQueue.displayStats(dpaQuota);
                    break;
            }
        } while (choice != 0);
    }
    
}
