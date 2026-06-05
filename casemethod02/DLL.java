package casemethod02;

class BuyerDll{
    BuyerNode head;
    BuyerNode tail;
    int size;

    public BuyerDll() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    boolean isEmpty(){
        return head == null;
    }
    void addFirst(Buyer data){
        BuyerNode newNode = new BuyerNode(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    void addLast(Buyer data){
        BuyerNode newNode = new BuyerNode(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
   void removeFirst(){
        if(isEmpty()){
            System.out.println("Data is empty!!");  
            return;
        }else if(head == tail){
            head = tail = null; 
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void print(){
        BuyerNode current = head;
        while(current != null){
            current.data.print();
            current = current.next;
        }
    }
    void removeLast(){
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
        }else if(head == tail){
            head = tail = null;
            size--;
        }else{
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }
    void remove(int queueIndex){
        if(queueIndex < 0){
            System.out.println("Index must be greater than or equal to 0");
            return;
        }
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
            return;
        }
        if(queueIndex == 0){
            removeFirst();
            return;
        }
        if(queueIndex >= size){
            System.out.println("Index is invalid!!");
            return;
        }

        BuyerNode temp = head;
        for(int i = 0; i < queueIndex; i++){
            temp = temp.next;
        }

        if(temp == tail){
            removeLast();
        }else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
        }
    }
    }


class OrderDll{
    OrderNode head;
    OrderNode tail;
    int size;

    public OrderDll() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    boolean isEmpty(){
        return head == null;
    }
    void addFirst(Order data){
        OrderNode newNode = new OrderNode(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void addLast(Order data){
        OrderNode newNode = new OrderNode(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
   void removeFirst(){
        if(isEmpty()){
            System.out.println("Data is empty!!");  
            return;
        }else if(head == tail){
            head = tail = null; 

        }else{
            head = head.next;
            head.prev = null;
        }
    }
    void print(){
        OrderNode current = head;
        while(current != null){
            System.out.println(current.data.orderCode + " " + current.data.order + " " + current.data.price);
            current = current.next;
        }
    }
    void totalPrice(){
        OrderNode temp = head;
        int total = 0;
        while(temp != null){
            total += temp.data.price;
            temp = temp.next;
        }
        System.out.println("Total Price: " + total);
    }
}