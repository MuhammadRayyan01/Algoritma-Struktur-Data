package algoritma11.practicum01;

public class queue19 {
int []data;
int front, 
rear, 
size,
max;

public queue19(int n){
    max = n ;
    data = new int[max];
    size = 0;
    front = rear = -1;
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
        System.out.println("front data:"+data[front]);
    }else{
        System.out.println("queue is empty");
    }
}
void print(){
    if(!isEmpty()){
        int i =front;
        while(i !=rear){
            System.out.println(data[i]+" ");
            i = (i+1)%max;
        }System.out.println(data[i]+" ");
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
void enqueue(int dt){
    if (!isFull()){
        if(isEmpty()){
        front = rear = 0;
    }else{
        if(rear==max-1){
            rear = 0;
        }else{
            rear++;
        }
    }
    data[rear] = dt;
    size++;
    System.out.printf("%d is succesfully added at index %d\n" ,dt,rear);
    }else{
        System.out.println("queue is full");
    }
}
int dequeue(){
    int dt = 0;
    if(!isEmpty()){
        dt = data[front];
        size--;
        if(isEmpty()){
            front=rear=-1;
        }else{
            if(front == max - 1){
                front=0;
            }else{
                front++;
            }
        }
    }else{
        System.out.println("queue is empty");
    }
    return dt;
}
}


