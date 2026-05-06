package algoritma11.practicum01;
import java.util.Scanner;
public class QueueMain19 {
public static void menu(){
    System.out.println("available menu");
    System.out.println("1.enqueue");
    System.out.println("2.dequeue");
    System.out.println("3.print");
    System.out.println("4.peek");
    System.out.println("5.clear");
    System.out.println("============");
}
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("input number of data");
int n = sc.nextInt();
System.out.println("===============");
queue19 Q = new queue19(n);
int choice = -1;
do{
    menu();
    choice = sc.nextInt();
    switch(choice){
        case 1:
            System.out.println("input new data");
            int newData = sc.nextInt();
            Q.enqueue(newData);
            break;
        case 2:
            int outData = Q.dequeue();
            if(outData != 0){
                System.out.println("removed data: "+outData);
                break;
            }
        case 3:
            Q.print();
            break;
        case 4 :
            Q.peek();
            break;
        case 5:
            Q.clear();
            break;
        default:
            System.out.println("error input");
    }
}while(choice > 0 && choice < 6);

}
}
