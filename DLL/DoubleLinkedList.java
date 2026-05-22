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
    public void removeFirst(){
        if(isEmpty()){
                System.out.println("Double linked list is currently empty!!");
            }else if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
    }
    void removeLast(){
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
        }else if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }
    void remove(int index){
        if(index < 0){
            System.out.println("Index must be greater than or equal to 0");
        }else if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
        }else if(index == 0){
            removeFirst();
        }else{
            Node temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            if(temp == tail){
                removeLast();
        }else{
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    // assignment
    void add(Student data, int index){

        if(index < 0 || index > getSize()){
            System.out.println("Index is invalid!!");
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == getSize()){
            addLast(data);
            return;
        }

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        Node newNode = new Node(data);

        newNode.prev = current.prev;
        newNode.next = current;

        current.prev.next = newNode;
        current.prev = newNode;
    }

    void removeAfter(String key){
        Node current = head;
        while(current != null){
            if(current.data.nim.equalsIgnoreCase(key)){
                if(current.next == null){
                    System.out.println("No node after this data!");
                }else if(current.next == tail){
                    removeLast();
                }else{
                    Node deleted = current.next;
                    current.next = deleted.next;
                    deleted.next.prev = current;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Data not found!!");
    }
    Student getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.data;
    }
    Student getLast(){
        if(isEmpty()){
            return null;
        }
        return tail.data;
    }
    Student getIndex(int index){
        if(index < 0 || index >= getSize()){
            return null;
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
    int getSize(){
        int total = 0;
        Node current = head;
        while(current != null){
            total++;
            current = current.next;
        }
        return total;
    }
    int indexOf(String key){
        Node current = head;
        int index = 0;
        while(current != null){
            if(current.data.nim.equalsIgnoreCase(key)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
}

