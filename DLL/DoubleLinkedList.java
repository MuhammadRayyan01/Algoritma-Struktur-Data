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
    public void insertAfter(String key,Student data){
        boolean found = false;
        Node newNode = new Node (data);
        Node temp = head;
        while(temp != null){
            if(temp.data.nim.equalsIgnoreCase(key)){
                found = true;
                if(temp == tail){
                    addLast(data);
                }else{
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
            }
            temp = temp.next;
        }
        if(!found){
        System.out.println("Node with key " + key + " not found");
        }else{
        System.out.println("Node with key " + key + " inserted successfully");
        }
    }
    void print(){
        if(!isEmpty()){
            Node temp = head;
            while(temp!=null){
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Double linked list is currently empty!!");
        }
    }

}


