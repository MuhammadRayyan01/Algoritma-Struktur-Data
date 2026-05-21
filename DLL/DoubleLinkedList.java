package DLL;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(Student data){
        Node newNode = new Node (data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Student data){
        Node newNode = new Node (data);
        if(isEmpty()){
            head = tail =newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter()
}
