import java.util.Scanner;

public class SemesterIP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== SEMESTER GPA CALCULATOR ===");
        System.out.print("How many courses did you take? ");
        int numCourses = input.nextInt();
        input.nextLine(); // consume newline
        
        String[] courseNames = new String[numCourses];
        int[] credits = new int[numCourses];
        String[] letterGrades = new String[numCourses];
        double[] equivalentValues = new double[numCourses];
        
        // Input data
        for (int i = 0; i < numCourses; i++) {
            System.out.println("\nCourse " + (i + 1) + ":");
            System.out.print("Course name: ");
            courseNames[i] = input.nextLine();
            
            System.out.print("Credit weight: ");
            credits[i] = input.nextInt();
            input.nextLine(); // consume newline
            
            System.out.print("Letter grade (A, B+, B, C+, C, D, E): ");
            letterGrades[i] = input.nextLine().toUpperCase();
            
            // Convert letter grade to equivalent value
            switch (letterGrades[i]) {
                case "A":
                    equivalentValues[i] = 4.0;
                    break;
                case "B+":
                    equivalentValues[i] = 3.5;
                    break;
                case "B":
                    equivalentValues[i] = 3.0;
                    break;
                case "C+":
                    equivalentValues[i] = 2.5;
                    break;
                case "C":
                    equivalentValues[i] = 2.0;
                    break;
                case "D":
                    equivalentValues[i] = 1.0;
                    break;
                case "E":
                    equivalentValues[i] = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade! Setting to E.");
                    equivalentValues[i] = 0.0;
            }
        }
        
        // Calculate GPA
        double totalWeightedScore = 0;
        int totalCredits = 0;
        
        System.out.println("\n=== COURSE DETAILS ===");
        System.out.println("No.\tCourse\t\tCredits\tGrade\tEq.Value\tWeighted");
        
        for (int i = 0; i < numCourses; i++) {
            double weighted = equivalentValues[i] * credits[i];
            totalWeightedScore += weighted;
            totalCredits += credits[i];
            
            System.out.printf("%d\t%s\t\t%d\t%s\t%.1f\t\t%.1f\n", 
                (i+1), courseNames[i], credits[i], letterGrades[i], 
                equivalentValues[i], weighted);
        }
        
        double gpa = totalWeightedScore / totalCredits;
        
        System.out.println("\n=== RESULT ===");
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("GPA: " + gpa);

    }
}