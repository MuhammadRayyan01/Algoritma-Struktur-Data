import java.util.Scanner;
public class SumMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("input element number");
int element = sc.nextInt();

Sum sm = new Sum (element);
for(int i = 0; i < element ; i++){
    System.out.print ("masukkan keuntungan ke-"+(i+1)+": ");
    sm.profits[i] = sc.nextDouble();
}
System.out.println("profit total using BF" + sm.totalBF());
System.out.println("profit total using DC:" + sm.totalDC(sm.profits, 0 , element-1));
    }
    
}
