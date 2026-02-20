import java.util.*;

public class studentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Final Score Calculator");
        System.out.println("==============================");

        System.out.print("Enter assignment score (0-100): ");
        double assignment = sc.nextDouble();
        if (assignment < 0 || assignment > 100) {
            System.out.println("invalid value");
        }
        System.out.print("Enter quiz score (0-100): ");
        double quiz = sc.nextDouble();
        if (quiz < 0 || quiz > 100) {
            System.out.println("invalid value");
        }
        System.out.print("Enter UTS score (0-100): ");
        double uts = sc.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("invalid value");
        }
        System.out.print("Enter UAS score (0-100): ");
        double uas = sc.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("invalid value");
        }

        // Check if all inputs are valid
        boolean valid = (assignment >= 0 && assignment <= 100) &&
                        (quiz >= 0 && quiz <= 100) &&
                        (uts >= 0 && uts <= 100) &&
                        (uas >= 0 && uas <= 100);
        if (valid) {
            // Calculate final score
            double finalScore = 0.2 * assignment + 0.2 * quiz + 0.3 * uts + 0.3 * uas;
            // Determine letter grade
            String letterGrade;
            if (finalScore >= 80) {
                letterGrade = "A";
            } else if (finalScore >= 75) {
                letterGrade = "B+";
            } else if (finalScore >= 70) {
                letterGrade = "B";
            } else if (finalScore >= 65) {
                letterGrade = "C+";
            } else if (finalScore >= 60) {
                letterGrade = "C";
            } else if (finalScore >= 50) {
                letterGrade = "D";
            } else {
                letterGrade = "E";
            }
            // Determine pass/fail
            String status;
            if (letterGrade.equals("A") || letterGrade.equals("B+") || letterGrade.equals("B") ||
                letterGrade.equals("C+") || letterGrade.equals("C")) {
                status = "PASS";
            } else {
                status = "NOT PASS";
            }
            // Output results
            System.out.println("==============================");
            System.out.println("Final Score: " + finalScore);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("Status: " + status);
        } else {
            System.out.println("Cannot calculate final score due to invalid inputs.");
        }

    }
}