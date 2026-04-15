import java.util.*;

public class LoanMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Loan[] loans;
loans = new Loan[100];
int count = 0;

Book[] books = new Book[4];
books = new Book[4];
  
books[0] = new Book("Algorithm", 1001, 2020);
books[1] = new Book("Database", 1002, 2019);
books[2] = new Book("Programming", 1003, 2021);
books[3] = new Book("Physics", 1004, 2024);

//showMenu
int option;
do {
    System.out.println("Menu:");
    System.out.println("1. Input Loan Data");
    System.out.println("2. Show Loan Data");
    System.out.println("3. Sort Loan Data by Fine");
    System.out.println("4. Search Loan Data by Student NIM");
    System.out.println("5. Exit");
    System.out.print("Choose an option: ");
    option = sc.nextInt();

    switch (option) {
        case 1:
            System.out.print("Enter the number of loans: ");
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) {
                System.out.println("Enter data for loan " + (i + 1) + ":");
                System.out.print("Student Name: ");
                String name = sc.next();

                System.out.print("Student NIM: ");
                int NIM = sc.nextInt();

                System.out.print("Student Major: ");
                String major = sc.next();

                Student student = new Student(name, NIM, major);

                System.out.println("Book List:");
                for (int j = 0; j < books.length; j++) {
                    System.out.print(j + ". ");
                    books[j].showBook();
                    System.out.println();
                }
                System.out.print("Choose book index: ");
                int idx = sc.nextInt();
                System.out.print("Loan Duration (days): ");
                int loanDuration = sc.nextInt();
                loans[count++] = new Loan(student, books[idx], loanDuration

                );
            }
            break;
        case 2:
            if (count == 0) {
                System.out.println("No data");
            } else {
                System.out.println("| NIM        | Name         | Book Title      | Duration | Late  | Fine       |");
                System.out.println("--------------------------------------------------------------------------------");

                for (int i = 0; i < count; i++) {
                    loans[i].showLoan();
                }
            }
            break;
        case 3:
            if (count == 0) {
                System.out.println("No data to sort");
            } else {
                sortLoan(loans, count);
                System.out.println("Data sorted by fine:");
                System.out.println("| NIM        | Name         | Book Title      | Duration | Late  | Fine       |");
                System.out.println("--------------------------------------------------------------------------------");

                for (int i = 0; i < count; i++) {
                    loans[i].showLoan();
                }
            }
            break;
        case 4:
            if (count == 0) {
                System.out.println("No data to search");
            } else {
                System.out.print("Enter NIM to search: ");
                int searchNIM = sc.nextInt();
                searchLoan(loans, count, searchNIM);
            }
            break;
        case 5:
            System.out.println("Exit program");
            break;
        default:
            System.out.println("Invalid choice!");
    }

} while (option != 5);
}
   
//sorting loan data by fine
public static void sortLoan(Loan[] loans, int count) {
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (loans[j].fine > loans[j + 1].fine) {
                Loan temp = loans[j];
                loans[j] = loans[j + 1];
                loans[j + 1] = temp;
                  }
            }
      }
}
//search loan data by student NIM
public static void searchLoan(Loan[] loans, int count, int NIM) {
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (loans[i].student.NIM == NIM) {
            System.out.println("Data found for NIM at index " + i);
            System.out.println("| NIM        | Name         | Book Title      | Duration | Late  | Fine       |");
            System.out.println("--------------------------------------------------------------------------------");
            loans[i].showLoan();
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Data not found for NIM: " + NIM);
    }
}
   

      }

