public class Lecture18 {

    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    //Default Constructor
    public Lecture18() {
        System.out.println("Lecturer object created using default constructor.");
    }
    //Parameterized Constructor
    public Lecture18(String idLecturer, String name, boolean activeStatus,
                       int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }
    //  Display Lecturer Information
    public void displayInformation() {
        System.out.println("Lecturer ID        : " + idLecturer);
        System.out.println("Name               : " + name);
        System.out.println("Active Status      : " + activeStatus);
        System.out.println("Year Of Entry      : " + yearOfEntry);
        System.out.println("Expertise Field    : " + expertiseCompetency);
        System.out.println("-------------------------------------------");
    }

    //  Set Status
    public void setActiveStatus(boolean status) {
        this.activeStatus = status;

        if (status) {
            System.out.println(name + " is now ACTIVE.");
        } else {
            System.out.println(name + " is now INACTIVE.");
        }
    }

    //  Calculate Working Period
    public int calculateTimeWork(int yearNow) {
        int workingPeriod = yearNow - yearOfEntry;
        return workingPeriod;
    }

    // Change Skill
    public void changeSkill(String skill) {
        this.expertiseCompetency = skill;
        System.out.println("Expertise updated to: " + expertiseCompetency);
    }
}