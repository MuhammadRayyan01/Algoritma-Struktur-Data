import java.util.*;
public class MainPower {
   public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("input element number");
    int elemen = sc.nextInt();
    sc.nextLine();

    Power[] png = new Power[elemen];
    for(int i = 0 ; i<elemen ; i++){
      System.out.println("input base number for "+(i+1)+"th element");
      int basis = sc.nextInt();
      sc.nextLine();
      System.out.println("input exponent for "+(i+1)+"th element");
      int exp = sc.nextInt();
      sc.nextLine();
      png[i]= new Power (basis,exp);
      
    }
  System.out.println("power result using bruteforce");
  for (Power p : png){
    System.out.println(p.baseNum+"^"+p.exponent+"="+p.powerBF(p.baseNum, p.exponent));
  }
  System.out.println("power result using divide and conquer");
    for(Power p : png){
      System.out.println(p.baseNum +"^"+p.exponent+"="+p.powerDC(p.baseNum,p.exponent));
    }
   } 
}
