import java.util.*;
public class phoneMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("input total phone");
    int size = sc.nextInt();
    Phone arr = new Phone(size);
    
    arr.addData();
    arr.displayData();
    arr.latestPhone();
    arr.oldestPhone();
    }
}
