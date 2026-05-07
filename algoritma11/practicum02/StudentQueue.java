package algoritma11.practicum02;

public class StudentQueue {
Student19 [] data ;
int front,
rear,
size,
max;

public StudentQueue(int n){
max = n;
data = new Student19[max];
size = 0 ;
front = 0;
rear = -1;
}
public Boolean isEmpty(){
    if(size == 0 ){
        return true;
    }else{
        return false;
    }
}
Boolean isFull(){
    if(size == max){
        return true;
    }else{
        return false;
    }
}
void peek(){
    if(!isEmpty()){
        System.out.println("front data:");
        data[front].print();
    }else{
        System.out.println("queue is empty");
    }
}
void print(){
    if(!isEmpty()){
        int i =front;
        while(i !=rear){
            data[i].print();
            i = (i+1)%max;
        }
        data[i].print();
        System.out.println("number of element: "+size);
    }else{
        System.out.println("queue is empty");
    }
}void clear(){
    if (!isEmpty()){
        front = rear =-1;
        size = 0;
        System.out.println("all data has been succesfully removed");
    }else{
        System.out.println("queue is already empty");
    }
}
void enqueue(Student19 dt){
    if (!isFull()){
        if(isEmpty()){
        front = rear = 0;
    }else{
        if(rear==max-1){
            rear = 0 ;
        }else{
            rear++;
        }
    }
    data[rear] = dt;
    size++;
    System.out.printf("%s is succesfully added at index %d\n" ,dt.name,rear);
    }else{
        System.out.println("queue is full");
    }
}
public Student19 dequeue() {

    if (isEmpty()) {
        System.out.println("Queue is empty!!!"); 
        return null; 
    }
    Student19 dt = data[front];
    front = (front + 1) % max;
    size--;
    return dt;
}

public void viewRear() {
    if (!isEmpty()) {
        System.out.println("Rear data: ");
        data[rear].print(); 
    } else {
        System.out.println("Queue is empty");
    }
}
}
