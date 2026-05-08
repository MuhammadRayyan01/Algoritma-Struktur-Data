package algoritma12.practicum01;

public class Student19 {
    String nim,
    name,
    className;
    double gpa;
public Student19(){

}
public Student19(String nim, String name, String className,double gpa){
this.nim= nim;
this.name = name;
this.className=className;
this.gpa=gpa;
}
void print(){
System.out.println(nim+"-"+name+"-"+className+"-"+gpa);
}
}
