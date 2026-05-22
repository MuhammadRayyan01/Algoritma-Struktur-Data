package algoritmaLatihan;
import java.util.*;

// File: Main.java
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean input;
        // Uji Linked List
        System.out.println("--- Singly Linked List ---");
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Input data ? (true/false)");
        input = sc.nextBoolean();
        if(input == true){
        list.insertFirst(10);
        list.addLast(20);
        list.display();
        }else{
            System.out.println("no input, have a good day");
        }

        // Uji Stack (LIFO)
        System.out.println("\n--- Stack (LIFO) ---");
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println("Pop: " + stack.pop()); // Menghasilkan 2

        // Uji Queue (FIFO)
        System.out.println("\n--- Queue (FIFO) ---");
        MyQueue queue = new MyQueue();
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Dequeue: " + queue.dequeue()); // Menghasilkan 100
    }
}
