import java.util.*;
public class LecturerMain {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData list = new LecturerData();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Lecturer");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Young → Old)");
            System.out.println("4. Sort DSC (Old → Young)");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Gender (true=Male / false=Female): ");
                    boolean gender = sc.nextBoolean();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Lecturer dsn = new Lecturer(id, name, gender, age);
                    list.add(dsn);
                    break;

                case 2:
                    System.out.println("\n=== Lecturer Data ===");
                    list.print();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Sorted ascending!");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Sorted descending!");
                    break;

                case 5:
                    System.out.println("Exit program.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}

