import java.util.*;
public class Phone {
public int releaseYr;
public String name;
public Phone arr[];
public Scanner sc = new Scanner (System.in);

//constructor
public Phone (int size){
 arr = new Phone[size];
}
//2nd constructor 
public Phone(int releaseYr, String name){
    this.releaseYr=releaseYr;
    this.name=name;


}
//method for addData
public void addData(){
    for(int i=0;i<arr.length;i++){
System.out.println("input the release yr:");
releaseYr = sc.nextInt();
sc.nextLine();
System.out.println("input phone name: ");
name = sc.nextLine();

arr[i]=new Phone (releaseYr, name);
    }
}
public void displayData(){
for(int i=0;i<arr.length;i++){
System.out.println(arr[i].releaseYr);
System.out.println(arr[i].name);

    }
}
public void latestPhone(){
Phone great = arr[0];
System.out.println("display the sort: ");

for(int i=1; i<arr.length; i++){
if(arr[i].releaseYr > great.releaseYr){
    great= arr[i];
}
    }
System.out.println(great.releaseYr);

}
public void oldestPhone(){
    Phone oldest = arr[0];
    System.out.println("display the sort");

    for(int i=0;i<arr.length;i++){
        if(arr[i].releaseYr<oldest.releaseYr){
            oldest=arr[i];
        }
    }
    System.out.println(oldest.releaseYr);
}
}


