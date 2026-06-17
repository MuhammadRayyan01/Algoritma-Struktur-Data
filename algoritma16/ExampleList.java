package algoritma16;
import java.util.*;

public class ExampleList {
    public static void main(String[] args) {
        
    

        List<Integer> l= new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        //l.add("Cireng");
    System.out.printf("elemen 0: %d\n total elemen:%d\n elemen terakhir: %s\n", 
        l.get(0), l.size(), l.get(l.size()-1));
    
    LinkedList<String> name= new LinkedList<>();
    name.push("Mei-Mei");
    System.out.printf("elemen 0: %s\n total elemen:%d\n elemen terakhir: %s\n",
        name.getFirst(), name.size(), name.getLast());
    System.out.println("names: "+name.toString());
    /*     name.add("Dimas");
        name.add("Rizky");
        name.add("Fajar");
    System.out.printf("elemen 0: %s\n total elemen:%d\n elemen terakhir: %s\n",
        name.get(0), name.size(), name.get(name.size()-1));
    name.set(0,"My Kid");
    System.out.printf("elemen 0: %s\n total elemen:%d\n elemen terakhir: %s\n",
        name.get(0), name.size(), name.get(name.size()-1));
    System.out.println("names: "+name.toString());*/
}

}