public class StudentDemo19 {
    public static void main(String[] args) {
        //adding student data
        topStudent19 top = new topStudent19();
        top.add (new Student19("001", "Alice", "A", 3.5));
        top.add (new Student19("002", "Bob", "B", 3.8));
        top.add (new Student19("003", "Charlie", "A", 3.2));
        top.add (new Student19("004", "Diana", "C", 3.9));
        top.add (new Student19("005", "Eve", "B", 3.6));
        // display original list
        System.out.println("Original List:");
        top.print();
        // sort students by GPA
        top.bubbleSort();
        // display sorted list
        System.out.println("Sorted List (by GPA):");
        top.print();
    }
}