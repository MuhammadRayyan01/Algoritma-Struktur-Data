import java.util.*;
public class Loan {
    public Student student;   
    public Book book;
    public int loanDuration;
    public int fine;
    public int late;
    public int loanLimit = 5; 
Scanner sc = new Scanner (System.in);    
// Constructor: 
    public Loan(Student student, Book book, int loanDuration) {
        this.student = student;
        this.book = book;
        this.loanDuration = loanDuration;
        calculateFine(); 
    }
    
    // Method calculateFine
    public void calculateFine() {
        if (loanDuration > loanLimit) {
            late = loanDuration - loanLimit;
            fine = late * 2000; 
        } else {
            late = 0;
            fine = 0;
        }
    }

    // Method showLoan
       public void showLoan() {
        System.out.printf("| %-10s | %-12s | %-15s | %-8d | %-6d | Rp %-8d |\n", 
        student.NIM, student.name, book.title, loanDuration, late, fine);
    }
}