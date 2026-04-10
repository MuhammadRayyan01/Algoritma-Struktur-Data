public class Student19 {
long NIM;
String name;
double GPA;
int age;    

public Student19(long NIM, String name, double GPA, int age){
    this.NIM = NIM;
    this.name = name;
    this.GPA = GPA;
    this.age = age;
}
public void Display(){
    System.out.println("NIM : " + NIM);
    System.out.println("Name : " + name);
    System.out.println("GPA : " + GPA);
    System.out.println("Age : " + age);
}

}
