package algoritmaLatihan;

    // File: Method.java
class SinglyLinkedList {
    Node head;
    Node tail;

    // Single linked list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode; //Deklarasi Head Baru
    }

    public void display() {
        Node current = head;
        
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;// deklarasi node berikutnya
        }
        System.out.println("null");
    }
    void addLast (int data){
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
        current = current.next;
    }   current.next= newNode;

        }

}

class MyStack {
    Node top; // stack

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack Underflow!"); // Cek Underflow 
        int val = top.data;
        top = top.next;
        return val;
    }
}

class MyQueue {
    Node front, rear; // Prinsip FIFO [cite: 10, 30, 455]

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) throw new RuntimeException("Queue Underflow!"); // Cek Underflow 
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }
}

