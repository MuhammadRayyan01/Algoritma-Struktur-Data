package DLL;

public class Main {
    public static void main(String[] args) {
    DoubleLinkedList dll = new DoubleLinkedList();
    dll.print();
    dll.addFirst(new Student("111", "Anton Semen", "TI-1I", 3.57));
    dll.print();
    dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
    dll.print();
    dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
    dll.print();
    dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
    dll.print();
    dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
    dll.print();
    dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
    dll.print();
    System.out.println("=========");
    dll.removeFirst();
    dll.print();
    dll.removeLast();
    dll.print();
    dll.remove(1);
    dll.print();
    System.out.println("ASSIGNMENT (ADD)");
    dll.add(new Student("117", "Lina", "TI-1I", 3.9), 2);
    dll.print();
    dll.add(null, 0);
    }

}
