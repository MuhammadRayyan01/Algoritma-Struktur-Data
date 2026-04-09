public class SortingMain {
    public static void main(String[] args) {
		int [] a = {34, 7, 23, 32, 5, 62};    
		Sorting19 sorting = new Sorting19(a);
            System.out.println("original array");
            sorting.print();
            sorting.bubbleSort();
            System.out.println("sorted array");
            sorting.print();
	}
}



