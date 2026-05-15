package algoritma12.assignmnet;


public class SingleLinkedList {
 Node head;
    Node tail;

boolean isEmpty(){
    return (head ==null);
}
void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("LinkedList Data:");
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkedList is empty!!");
        }
    }
void printFirst(){
    Node tmp = head;
    if(tmp==head){
        System.out.println("display first queue");
        tmp.data.print();
    }else{
        System.out.println("empty");
    }
    }
    
void printLast(){
     Node tmp = tail;

    if(tmp == tail){
        System.out.println("display last queue");
        tmp.data.print();
    }else{
        System.out.println("empty");
    }
}
void addFirst(Student19 std){
        Node newNode = new Node(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
}
void addLast (Student19 std){
        Node newNode = new Node(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
    }else{
            tail.next = newNode;
            tail = newNode;
    }
}
void insertAfter(Student19 std, String key){
        Node newNode = new Node(std, null);
        Node temp = head;
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
        Node temp = head;
        for( int i = 0; i < index -1 ; i++){
            temp = temp.next;
        }
        temp.next = new Node(std,temp.next);
        if(temp.next.next == null){
            tail = temp.next;
        }
    }
}

//PRACTICUM 2

Student19 getData(int idx){
if(isEmpty()){
System.out.println("linked list is empty");
return null;
}
Node tmp = head;
for (int i = 0; i < idx && tmp != null; i++){
    tmp = tmp.next;
}
return tmp.data;
}

int indexOf(String key){
if(isEmpty()){
    System.out.println("LinkedList is empty!!");
    return -1;
}
Node tmp = head;
int idx = 0;
while(tmp != null && !tmp.data.name.equalsIgnoreCase(key)){
    tmp = tmp.next;
    idx++;
}
if(tmp == null){
    return -1;
}else{
    return idx;
}
}

void removeFirst(){
        if(isEmpty()){
            System.out.println("LinkedList is empty!!");
        }else if(head==tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

void removeLast(){
    if(isEmpty()){
        System.out.println("LinkedList is empty!!");
    }else if(head==tail){
        head = tail = null;
    }else{
        Node tmp = head;
        while(tmp.next != tail){
            tmp = tmp.next;
        }
        tmp.next = null;
        tail = tmp;
    }
}
public void clear(){
    head = null;
    tail = null;
}

public void remove(String key) {
if (isEmpty()) {
    System.out.println("LinkedList is empty!!");
} else {
    Node temp = head;
    while (temp != null) {
    if ((temp.data.name.equalsIgnoreCase(key)) && (temp == head)) {
        removeFirst();
        break;
    } else if (temp.next.data.name.equalsIgnoreCase(key)) {
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        break;
    }
    temp = temp.next;
    }
}
}

public void removeAt(int index) {
if (index == 0) {
    removeFirst();
} else {
    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
if (temp.next == null) {
        tail = temp;
    }
}
}
    
}
