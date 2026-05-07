package algoritma11.practicum02;

public class Student19{
String nim, 
name, 
studyProgram,
className;

public Student19(String nim,String name,String studyProgram, String className){
this.nim = nim;
this.name = name;
this.studyProgram = studyProgram;
this.className = className;
}

public void print(){
    System.out.println(nim+"-"+name+"-"+studyProgram+"-"+className);
}


}