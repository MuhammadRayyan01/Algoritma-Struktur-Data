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
        BuyerNode current = head;
        while(current != null){
            current.data.print();
            current = current.next;
        }
    }
    Buyer getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.data;
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
            System.out.println(current.data.buyer.nama + " " + current.data.orderCode + " " + current.data.order + " " + current.data.price);
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
    /*void sort(){
        if(isEmpty()){
            System.out.println("Data is empty!!");
            return;
        }
        OrderNode temp = head;
        while(temp != null){
            OrderNode index = temp.next;
            while(index != null){
                if(temp.data.price < index.data.price){
                    Order tempData = temp.data;
                    temp.data = index.data;
                    index.data = tempData;
                }
                index = index.next;
            }
            temp = temp.next;
        }
    }*/
   void sort(){

    if(isEmpty()){
        System.out.println("Data is empty!!");
        return;
    }

    OrderNode temp = head;
    while(temp != null){
        OrderNode index = temp.next;
        while(index != null){
            if(temp.data.order.compareToIgnoreCase(index.data.order) > 0){
                Order tempData = temp.data;
                temp.data = index.data;
                index.data = tempData;
            }
            index = index.next;
        }
        temp = temp.next;
    }
    }
}