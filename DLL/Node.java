package DLL;

public class Node {
    Student data;
    Node prev;
    Node next;

    public Node() {
    }
    public Node(Student data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public Node(Student data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    
}
