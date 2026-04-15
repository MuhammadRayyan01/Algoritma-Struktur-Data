public class Student{
    String name;
    int NIM;
    String major;
//Constructor
    public Student(String name, int NIM, String major){
        this.name = name;
        this.NIM = NIM;
        this.major = major;
    }
//Method to show student data
    public void Mahasiswa(){
        System.out.printf("%20s %20d %20s", name, NIM, major);
    }
}