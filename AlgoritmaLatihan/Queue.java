package AlgoritmaLatihan;

public class Queue {
    Student [] data;
    int front, rear, size, max;

    public Queue (int max){
        this.max=max;
        data= new Student [max];
        front = 0 ;
        rear = -1;
        size = 0;
    }
    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == max;
    }

    public void enqueue(Student s){
        if(isFull()){
            System.out.println("queue full");
            return ;
        }
    
        if(isEmpty()){
            rear++;
            data[rear]=s;
            size++;
        }
    }
        Student dequeue(){
            if(isEmpty()){
                return null;
            }
            Student temp = data[front];
            front++;
            size--;
            return temp;
        }
    void printQueue(){
        for(int i= front ; 1 <= rear ;i++){
            data[i].print();
            
        }
    }
}
