public class SortingMain {
    public static void main(String[] args) {
		int [] a = {34, 7, 23, 32, 5, 62}; 
        int [] b = {64, 25, 12, 22, 11};
        int [] c = {12, 11, 13, 5, 6};
		Sorting19 sorting = new Sorting19(a);
            System.out.println("original array");
            sorting.print();
            sorting.bubbleSort();
            System.out.println("sorted array");
            sorting.print();
        Sorting19 sorting2 = new Sorting19(b);
            System.out.println("original array");
            sorting2.print();
            sorting2.selectionSort();
            System.out.println("sorted array (selection sort)");
            sorting2.print(); 
        Sorting19 sorting3 = new Sorting19(c);
            System.out.println("original array");
            sorting3.print();
            sorting3.insertionSort();
            System.out.println("sorted array (insertion sort)");
            sorting3.print();

	}
}



