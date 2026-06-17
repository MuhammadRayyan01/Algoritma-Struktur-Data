package algoritma16;
import java.util.*;
public class LoopCollection {
    public static void main(String[] args) {
    Stack<String> fruit = new Stack<>();
    fruit.push("Apple");
    fruit.push("Banana");
    fruit.push("Cherry");

    for (String fruits : fruit) {
        System.out.println(fruits);
    }
    System.out.println("\n" + fruit.toString());
    while (!fruit.isEmpty()) {
        System.out.println(fruit.pop());
    }
    fruit.push("Apple");
    fruit.push("Strawberry");
    fruit.push("Mango");
    fruit.push("Grapes");
    fruit.push("Pineapple");
    System.out.println("");
    for (Iterator<String> it = fruit.iterator(); it.hasNext();) {
        System.out.println(it.next());
    }
    for (int i = 0; i < fruit.size(); i++) {
        System.out.printf("%s\n", fruit.get(i));
    }
    System.out.println("====");
    Collections.sort(fruit);
    for (String fruits : fruit) {
        System.out.println(fruits);
}
}
}
