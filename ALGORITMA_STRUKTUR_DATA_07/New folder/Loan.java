public class Loan {
    Student [] std;   
    Book [] book;
    int [] loanDuration;
    int loanLimit ; 
    int [] fine;
    int [] late;
    
    public Loan(Student [] std, Book [] book, int [] loanDuration){
        this.std = std;
        this.book = book;
        this.loanDuration = loanDuration;
        this.loanLimit = 5;  
        this.fine = new int[std.length];
        this.late = new int[std.length];
        calculateFine();
    }  
    public void calculateFine(){
        for (int i = 0; i < std.length; i++) {
            if(loanDuration[i] > loanLimit){
                late[i] = loanDuration[i] - loanLimit;
                fine[i] = late[i] * 2000;
            } else {
                late[i] = 0;
                fine[i] = 0;
            }
        }
    }
    public void showLoan(){
        for (int i = 0; i < std.length; i++) {
            System.out.print("Student: ");
            std[i].showStudent();
            System.out.print("Book: ");
            book[i].Display();
            System.out.println("Loan Duration: " + loanDuration[i] + " days | Late: " + late[i] + " days | Fine: Rp " + fine[i]);
            System.out.println("------------------");
        }
    }
    public void searchBinary(String title){
        int left = 0;
        int right = book.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (book[mid].title.equalsIgnoreCase(title)) {
                System.out.println("Book found at index " + mid);
                book[mid].Display();
                return;
            } else if (book[mid].title.compareToIgnoreCase(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Book not found!");
    }
}
