import java.util.Scanner;

public class LoanMain {
    static Student[] students;
    static Book[] books;
    static Loan loan;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        initializeData();
        showMenu();
    }
    
    static void initializeData() {
        students = new Student[3];
        students[0] = new Student("22001", "Abdul", "Informatics Engineering");
        students[1] = new Student("22002", "Bestari", "Informatics Engineering");
        students[2] = new Student("22003", "Gandi", "Business Information System");
        
        books = new Book[4];
        books[0] = new Book("B001", "Algorithm", 2020);
        books[1] = new Book("B002", "Database", 2019);
        books[2] = new Book("B003", "Programming", 2021);
        books[3] = new Book("B004", "Physics", 2024);

        Student[] loanStudents = new Student[5];
        Book[] loanBooks = new Book[5];
        int[] loanDuration = new int[5];
        
        loanStudents[0] = students[0]; loanBooks[0] = books[0]; loanDuration[0] = 7;
        loanStudents[1] = students[1]; loanBooks[1] = books[1]; loanDuration[1] = 3;
        loanStudents[2] = students[2]; loanBooks[2] = books[2]; loanDuration[2] = 10;
        loanStudents[3] = students[2]; loanBooks[3] = books[3]; loanDuration[3] = 6;
        loanStudents[4] = students[0]; loanBooks[4] = books[1]; loanDuration[4] = 4;

        loan = new Loan(loanStudents, loanBooks, loanDuration);
    }
    
    static void showMenu() {
        boolean running = true;
        while (running) {
            System.out.println("=== LIBRARY LOAN MANAGEMENT ===");
            System.out.println("1. Show Student");
            System.out.println("2. Show Books");
            System.out.println("3. Show Loan");
            System.out.println("4. Sorting Based on Fine");
            System.out.println("5. Search Loan by NIM");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            
            String choice = scanner.nextLine();
            switch(choice) {
                case "1": showStudent(); 
                break;
                case "2": showBooks(); 
                break;
                case "3": showLoan(); 
                break;
                case "4": sortingByFine(); 
                break;
                case "5": searchLoanByNIM(); 
                break;
                case "6": System.out.println("Exit!"); running = false; 
                break;
                default: System.out.println("Invalid!");
            }
        }
    }
    
    static void showStudent() {
        System.out.println("=== ALL STUDENTS ===");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i+1) + ": " + students[i].id + " | " + students[i].name + " | " + students[i].studyProgram);
        }
    }
    
    static void showBooks() {
        System.out.println(" books: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i+1) + ": " + books[i].code + " | " + books[i].title + " | " + books[i].year);
        }
    }
    
    static void showLoan() {
        System.out.println("Loan Information");
        for (int i = 0; i < loan.std.length; i++) {
            System.out.println("Loan " + (i+1) + ": " + loan.std[i].id + " | " + loan.std[i].name + " | " + 
            loan.book[i].title + " | " + loan.loanDuration[i] + " days | Late: " + loan.late[i] + " days | Fine: Rp " + loan.fine[i]);
        }
    }
    
    static void sortingByFine() {
        Student[] tempStd = new Student[loan.std.length];
        Book[] tempBook = new Book[loan.book.length];
        int[] tempFine = new int[loan.fine.length];
        int[] tempLate = new int[loan.late.length];
        
        for (int i = 0; i < tempStd.length; i++) {
            tempStd[i] = loan.std[i];
            tempBook[i] = loan.book[i];
            tempFine[i] = loan.fine[i];
            tempLate[i] = loan.late[i];
        }
        
        for (int i = 0; i < tempFine.length - 1; i++) {
            for (int j = 0; j < tempFine.length - i - 1; j++) {
                if (tempFine[j] < tempFine[j + 1]) {
                    int fine = tempFine[j]; 
                    tempFine[j] = tempFine[j + 1];
                    tempFine[j + 1] = fine;
                    int late = tempLate[j]; 
                    tempLate[j] = tempLate[j + 1]; 
                    tempLate[j + 1] = late;
                    Student student = tempStd[j]; 
                    tempStd[j] = tempStd[j + 1]; 
                    tempStd[j + 1] = student;
                    Book book = tempBook[j]; 
                    tempBook[j] = tempBook[j + 1]; 
                    tempBook[j + 1] = book;
                }
            }
        }
        
        System.out.println("SORTED BY FINE (DESCENDING)");
        for (int i = 0; i < tempFine.length; i++) {
        System.out.println((i+1) + ". " + tempStd[i].id + " | " + tempStd[i].name + " | " + tempBook[i].title + " | Late: " + tempLate[i] + " days | Rp " + tempFine[i]);
        }
    }
    
    static void searchLoanByNIM() {
        System.out.print("Enter NIM: ");
        String nim = scanner.nextLine();

        System.out.println("SEARCH RESULT ");
        boolean found = false;
        for (int i = 0; i < loan.std.length; i++) {
            if (loan.std[i].id.equals(nim)) {
                System.out.println(loan.std[i].id + " | " + loan.std[i].name + " | " + 
                                 loan.book[i].title + " | " + loan.loanDuration[i] + " days | " +
                                 "Late: " + loan.late[i] + " days | Rp " + loan.fine[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Not found!");
    }
}
