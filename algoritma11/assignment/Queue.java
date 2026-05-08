package algoritma11.assignment;

public class Queue {
    Student19[] data;
    int front, rear, size, max;
    int completedProcess = 0; // Tracks students who finished KRS

    public Queue(int n) {
        max = n;
        data = new Student19[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == max; }

    public void enqueue(Student19 dt) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = dt;
            size++;
            System.out.println(dt.name + " joined the queue.");
        } else {
            System.out.println("Queue is full! Maximum 10 students.");
        }
    }

    // Process 2 students at a time as per assignment
    public void dequeueKRS() {
        if (isEmpty()) {
            System.out.println("No students in queue to process.");
            return;
        }
        
        int toProcess = (size >= 2) ? 2 : 1;
        System.out.println("--- Processing KRS Approval for " + toProcess + " student(s) ---");
        
        for (int i = 0; i < toProcess; i++) {
            Student19 dt = data[front];
            System.out.print("Approved: ");
            dt.print();
            front = (front + 1) % max;
            size--;
            completedProcess++;
        }
    }

    public void peekTwo() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("First student in line: ");
            data[front].print();
            if (size >= 2) {
                System.out.println("Second student in line: ");
                data[(front + 1) % max].print();
            }
        }
    }

    public void viewRear() {
        if (!isEmpty()) {
            System.out.print("Last student in line: ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        int count = 0;
        while (count < size) {
            data[i].print();
            i = (i + 1) % max;
            count++;
        }
    }

    public void displayStats(int totalDPAQuota) {
        System.out.println("\n--- KRS Statistics ---");
        System.out.println("Students currently in queue: " + size);
        System.out.println("Students completed approval: " + completedProcess);
        System.out.println("Quota remaining for DPA: " + (totalDPAQuota - completedProcess));
    }
    
}
