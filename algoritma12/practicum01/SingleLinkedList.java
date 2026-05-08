package algoritma12.practicum01;

public class SingleLinkedList {
    Node19 head;
    Node19 tail;

boolean isEmpty(){
    return (head ==null);
}
void print(){
        if(!isEmpty()){
            Node19 tmp = head;
            System.out.println("LinkedList Data:");
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkedList is empty!!");
        }
    }
void addFirst(Student19 std){
        Node19 newNode = new Node19(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
}
void addLast (Student19 std){
        Node19 newNode = new Node19(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
    }else{
            tail.next = newNode;
            tail = newNode;
    }
}
void insertAfter(Student19 std, String key){
        Node19 newNode = new Node19(std, null);
        Node19 temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
public void insertAt(int index,Student19 std){
    if (index < 0){
        System.out.println("wrong index");
    }else if(index == 0){
        addFirst(std);
    }else{
        Node19 temp = head;
        for( int i = 0; i < index -1 ; i++){
            temp = temp.next;
        }
        temp.next = new Node19(std,temp.next);
        if(temp.next.next == null){
            tail = temp.next;
        }
    }
}

}
