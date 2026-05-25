package casemethod02;
import java.util.Scanner;

public class Main {
    
static void menu() {
        System.out.println("1. Add Queue");
        System.out.println("2. Print Queue");
        System.out.println("3. Remove Queue");
        System.out.println("4. Order Queue");
        System.out.println("5. Exit");
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BuyerDll buyerDll = new BuyerDll();
    OrderDll orderDll = new OrderDll();
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
            System.out.println("================================");

            Buyer buyer = new Buyer(nama, phone);
            buyerDll.addLast(buyer);
            buyer.print();
            System.out.println("================================");
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
            // Remove Queue
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
            System.out.println("Enter order code: ");
            String orderCode = sc.next();
            System.out.println("Enter order: ");
            String order = sc.next();
            System.out.println("Enter price: ");
            int price = sc.nextInt();
            System.out.println("================================");

            Order newOrder = new Order(orderCode, order, price);
            orderDll.addLast(newOrder);
            System.out.println("===============================");
            System.out.println("================================");

            System.out.println("Displaying order queue");
            orderDll.print();
            orderDll.totalPrice();
            System.out.println("================================");
            break;
        case 5:
            // Exit
            System.out.println("Exiting...");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }
    }while(choice != 5);
}
}