package algoritma11.assignment;

public class Student19 {
    String nim, name, studyProgram, className;

    public Student19(String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    public void print() {
        System.out.println("NIM: " + nim + " | Name: " + name + " | Prog: " + studyProgram + " | Class: " + className);
    }
    
}
