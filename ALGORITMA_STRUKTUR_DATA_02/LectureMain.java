public class LectureMain {

    public static void main(String[] args) {

        // 🔹 Object 1 (Default Constructor)
        Lecture18 lecturer1 = new Lecture18();
        lecturer1.idLecturer = "L001";
        lecturer1.name = "Dr. Ahmad";
        lecturer1.activeStatus = true;
        lecturer1.yearOfEntry = 2015;
        lecturer1.expertiseCompetency = "Artificial Intelligence";

        lecturer1.displayInformation();

        lecturer1.setActiveStatus(false);
        System.out.println("Working Period: " +
                lecturer1.calculateTimeWork(2026) + " years");

        lecturer1.changeSkill("Machine Learning");
        lecturer1.displayInformation();


        //Parameterized Constructor 
        Lecture18 lecturer2 = new Lecture18(
                "L002",
                "Dr. Siti",
                true,
                2018,
                "Data Science"
        );

        lecturer2.displayInformation();

        lecturer2.setActiveStatus(true);
        System.out.println("Working Period: " +
                lecturer2.calculateTimeWork(2026) + " years");

        lecturer2.changeSkill("Cyber Security");
        lecturer2.displayInformation();
    }
}