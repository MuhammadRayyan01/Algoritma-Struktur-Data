package DLL;

public class DoubleLinkedList {
    Node head;
    Node tail;
    //declare head and tail is null
    public DoubleLinkedList() {
        head = null;
        tail = null;
    }
    //check if the list isEmpty or not
    public boolean isEmpty() {
        return head == null;
    }
    //know this to learn addFirst concept
    public void addFirst(Student data){
        //declare new object of node
        Node newNode = new Node (data);
        // if list is empty, then the first node will be called head, and also tail
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        //if its not empty
        } else {
        //first, declare the newNode next pointer is head
            newNode.next = head;
        //second, you declare the head previous pointer is newNode
            head.prev = newNode;
        //third, we declare the new Head is newNode
            head = newNode;
        }
    }
    // learn this to know add new node in the last index
    public void addLast(Student data){
        //declare new Node
        Node newNode = new Node (data);
        //if its empty, the new node will be declared as head and also tail
        if(isEmpty()){
            head = tail =newNode;
        //if its not empty
        }else{
        //first we declare tail next pointer is new Node
            tail.next = newNode;
        // second, we declare newNode prev pointer is tail
            newNode.prev = tail;
            tail = newNode;
        }
    }
    // learn this to know insert After key search that we input
    public void insertAfter(String key,Student data){
        //boolean found is to select statement wether the key is found or not
        boolean found = false;
        //declare new node
        Node newNode = new Node (data);
        //declare the temp (Patokan) start from head
        Node temp = head;
        //while iteration, when inside temp is not null
        while(temp != null){
        //inside temp is not null, is the nim inside temp is equal to key or not
            if(temp.data.nim.equalsIgnoreCase(key)){
        // we declare the boolean found is true
                found = true;
        // if the Patokan just found in the tail, then we can use addLast
                if(temp == tail){
                    addLast(data);
        // if its not on tail
                }else{
        //first, we declare the new node next pointer is temp next pointer
                    newNode.next = temp.next;
        //second, we declare the new node previous pointer is temp
                    newNode.prev = temp;
        //third we declare the previous of origin next temp is ne node
        // A-B-C, A is temp, B is new node, and C is temp.next
                    temp.next.prev = newNode;
        //last thing, temp.next is declared as newnode
                    temp.next = newNode;
                }
            }
        //iteration start from here
            temp = temp.next;
        }
        //if key not found, there will be statement
        if(!found){
        System.out.println("Node with key " + key + " not found");
        }else{
        System.out.println("Node with key " + key + " inserted successfully");
        }
    }
    //learn this to know print concept
    void print(){
        //if the node is not null
        if(!isEmpty()){
        //declare temp(patokan) start from head
            Node temp = head;
        //while inside temp is not null
            while(temp!=null){
        //print the data of temp
                temp.data.print();
        //second, we declare and check to the next node (temp.next)
                temp = temp.next;
            }
            System.out.println(" ");
        //if the list is empty
        }else{
            System.out.println("Double linked list is currently empty!!");
        }
    }
    // learn this to know remove in first index concept
    public void removeFirst(){
        // if the list is already empty, it will give us statement
        if(isEmpty()){
                System.out.println("Double linked list is currently empty!!");
        // else, if node is head and also tail, then it mean we remove the only one node that existed
            }else if(head == tail){
                head = tail = null;
        // else, then we declare the new head will be on the second node (head.next)
            }else{
                head = head.next;
        //then we declare the new head previous pointer become null
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

