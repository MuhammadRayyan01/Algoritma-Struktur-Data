package algoritma10.assignment;

public class Stack19 {
    ExcuseLetter19[] stack;
    int top;
    int capacity;

    public void menu() {
        System.out.println("1. Add Excuse Letter");
        System.out.println("2. View Excuse Letter");
        System.out.println("3. View the latest excuse letter");
        System.out.println("4. Search Excuse Letter by Name");
        System.out.println("5. Exit");
    }

    public Stack19(int capacity) {
        this.capacity = capacity;
        this.stack = new ExcuseLetter19[capacity];
        this.top = -1;
    }

    public void push(ExcuseLetter19 item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = item;
    }

    public ExcuseLetter19 pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    
}
