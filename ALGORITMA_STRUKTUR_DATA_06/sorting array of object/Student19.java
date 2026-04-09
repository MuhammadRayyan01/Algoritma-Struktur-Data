public class Student19 {
    String nim, name,studentClass;
    double gpa;

public Student19(){}
public Student19(String nim, String name, String studentClass, double gpa){
    this.nim = nim;
    this.name = name;
    this.studentClass = studentClass;
    this.gpa = gpa;
}
public void Print(){
    System.out.println("NIM: " + nim);
    System.out.println("Name: " + name);
    System.out.println("Class: " + studentClass);
    System.out.println("GPA: " + gpa);
}}