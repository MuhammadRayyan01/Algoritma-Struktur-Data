 public class course {

    //  Attributes
    String kodeCourse;
    String name;
    int SKS;
    int numberOfHours;

    //  Default Constructor
    public course() {
        System.out.println("Course object created using default constructor.");
    }

    //  Parameterized Constructor
    public course(String kodeCourse, String name, int SKS, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.SKS = SKS;
        this.numberOfHours = numberOfHours;
    }

    //  Display all course information
    public void displayInformation() {
        System.out.println("Course Code     : " + kodeCourse);
        System.out.println("Course Name     : " + name);
        System.out.println("Credit (SKS)    : " + SKS);
        System.out.println("Number of Hours : " + numberOfHours);
        System.out.println("----------------------------------------");
    }

    //  Change SKS
    public void changeSKS(int sksNew) {
        if (sksNew > 0) {
            SKS = sksNew;
            System.out.println("SKS has been successfully updated to: " + SKS);
        } else {
            System.out.println("Invalid SKS value. SKS must be greater than 0.");
        }
    }

    //  Add hours
    public void addHours(int hours) {
        if (hours > 0) {
            numberOfHours += hours;
            System.out.println("Hours successfully added.");
            System.out.println("New total hours: " + numberOfHours);
        } else {
            System.out.println("Invalid hour value.");
        }
    }

    //  Reduce hours
    public void reduceHours(int hours) {
        if (hours > 0) {
            if (numberOfHours >= hours) {
                numberOfHours -= hours;
                System.out.println("Hours successfully reduced.");
                System.out.println("New total hours: " + numberOfHours);
            } else {
                System.out.println("Reduction failed. Not enough hours to reduce.");
            }
        } else {
            System.out.println("Invalid hour value.");
        }
        
    }
} 
    

