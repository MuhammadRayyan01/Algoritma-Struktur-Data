package DLL;

public class Student {
    String nim, name, className;
    double gpa;

    public Student(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }
    public void print() {
        System.out.println(nim + " " + name + " " + className + " " + gpa);
        
    }
}
