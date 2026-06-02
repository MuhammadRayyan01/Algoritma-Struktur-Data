package casemethod02;
import java.util.Scanner;

public class Main {
    
static void menu() {
        System.out.println("1. Add Queue");
        System.out.println("2. Print Queue");
<<<<<<< HEAD
        System.out.println("3. Remove Queue");
        System.out.println("4. Order Queue");
        System.out.println("5. Cancel queue");
        System.out.println("6.exit");
=======
        System.out.println("3. Remove Queue and order");
        System.out.println("4. Order Queue report");
        System.out.println("5. Exit");
>>>>>>> c6ecf6a3eaebbbd1eded66ea410379acd0172ca7
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BuyerDll buyerDll = new BuyerDll();
    OrderDll orderDll = new OrderDll();
    int queueNumber = 1;
    int choice;

    // Your code here
    do{
        menu();
        choice = sc.nextInt();
        switch (choice) {
            case 1: 
            // Add Queue
            System.out.println("================================");
            System.out.println("Enter buyer name: ");
            String nama = sc.next();
            System.out.println("Enter buyer phone: ");
            String phone = sc.next();
            System.out.println("queueIndex: ");
            int queueIndex = sc.nextInt();
            System.out.println("================================");

<<<<<<< HEAD
            Buyer buyer = new Buyer(nama, phone, queueIndex );
=======
            Buyer buyer = new Buyer(nama, phone, queueNumber);
>>>>>>> c6ecf6a3eaebbbd1eded66ea410379acd0172ca7
            buyerDll.addLast(buyer);
            buyer.print();
            System.out.println("================================");
            queueNumber++;
            break;
        case 2:
            // Print Queue
            System.out.println("================================");            
            System.out.println("Printing queue");
            System.out.println("================================");
            buyerDll.print();
            System.out.println("================================");
            break;
        case 3:
            // Remove Queue and order
             System.out.println("================================");
            if (buyerDll.isEmpty()) {
                System.out.println("No buyers in queue. Please add a buyer first.");
                System.out.println("================================");
                break;
            }
            Buyer currentBuyer = buyerDll.getFirst();
            System.out.println("Enter order code: ");
            String orderCode = sc.next();
            System.out.println("Enter order: ");
            String order = sc.next();
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            
            System.out.println("================================");

            Order newOrder = new Order(currentBuyer, orderCode, order, price);
            orderDll.addLast(newOrder);
            System.out.println("================================");
            System.out.println("Removing queue");
            System.out.println("================================");
            buyerDll.removeFirst();
            buyerDll.print();
            System.out.println("================================");
            break;
        case 4:
            // input and display order queue
            System.out.println("================================");
            System.out.println("Displaying order queue");
            orderDll.sort();
            orderDll.print();
            orderDll.totalPrice();
            System.out.println("================================");
            break;
        case 5:
            // cancel queue
            System.out.println("which queue you want to cancel?");
            int queueNumber = sc.nextInt();
            buyerDll.remove(queueNumber);
            buyerDll.print();
            break;
        case 6:
            //exit menu
            System.out.println("exiting");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }
    }while(choice != 6);
}
}