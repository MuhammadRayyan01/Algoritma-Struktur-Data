package AlgoritmaLatihan;
public class main {
    public static void main(String[] args) {

        Queue s = new Queue(5);

        s.enqueue(new Student("001","Rayyan"));
        s.enqueue(new Student("002","Andi"));
        s.enqueue(new Student("003","Budi"));

        s.printQueue();

        System.out.println("\nSetelah dequeue:");

        s.dequeue();

        s.printQueue();
    }
}