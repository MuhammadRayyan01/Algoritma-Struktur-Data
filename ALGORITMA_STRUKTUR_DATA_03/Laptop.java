import java.util.Scanner;
public class Laptop{
    public String nama;
    public int tahun;
    public Laptop arr[];
    public Scanner sc = new Scanner(System.in);
    public int harga;


    public Laptop (int size){
        arr = new Laptop [size];
}

    public Laptop (String nama, int tahun, double harga){
        this.nama=nama;
        this.tahun=tahun;
        this.harga=harga;
}

    public void inputData(){
        for(int i=0;i<arr.length;i++){
            System.out.println("input nama: ");
            nama = sc.nextLine();
            System.out.println("input tahun");
            tahun = sc.nextInt();
            sc.nextLine();
            System.out.print("berapa harganya ?");
            double harga = sc.nextDouble();
        arr[i] = new Laptop ( nama, tahun, harga);   
    
        }
        System.out.println("==============");
}

    public void beli(){
    System.out.println("Do you want to buy ?");
    boolean decision = sc.nextBoolean();
    if(true){
        System.out.println("how many laptop ?");
      
        sc.nextLine();
    }else{
        System.out.println("Ok then");
    }
}

    public int countTotal(){
        for(int i=0;i<arr.length;i++){
        return ;
    }
}

    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].nama);
            System.out.println(arr[i].tahun);
        }
    
    }

}