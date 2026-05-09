package algoritma12.practicum01;

import org.w3c.dom.Node;

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

//PRACTICUM 2

Student19 getData(int idx){
if(isEmpty()){
System.out.println("linked list is empty");
return null;
}
Node19 tmp = head;
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
Node19 tmp = head;
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
        Node19 tmp = head;
        while(tmp.next != tail){
            tmp = tmp.next;
        }
        tmp.next = null;
        tail = tmp;
    }
}

public void remove(String key) {
if (isEmpty()) {
    System.out.println("LinkedList is empty!!");
} else {
    Node19 temp = head;
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
    Node19 temp = head;
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



