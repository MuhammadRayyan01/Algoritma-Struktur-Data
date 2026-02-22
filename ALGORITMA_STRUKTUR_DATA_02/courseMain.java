public class courseMain {

    public static void main(String[] args) {

        // 🔹 Object 1 (Default Constructor)
        course course1 = new course();
        course1.kodeCourse = "CS101";
        course1.name = "Introduction to Programming";
        course1.SKS = 3;
        course1.numberOfHours = 42;

        course1.displayInformation();

        course1.changeSKS(4);
        course1.addHours(4);
        course1.reduceHours(10);

        course1.displayInformation();


        // 🔹 Object 2 (Parameterized Constructor)
        course course2 = new course("CS202", "Data Structures", 3, 48);

        course2.displayInformation();

        course2.changeSKS(5);
        course2.addHours(6);
        course2.reduceHours(60); // example of failed reduction

        course2.displayInformation();
    }
}