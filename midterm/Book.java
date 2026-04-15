public class Book{
    String title;
    int code;
    int year;
//Constructor
    public Book(String title, int code, int year){
        this.title = title;
        this.code = code;
        this.year = year;
    }
//Method
    public void showBook(){
        System.out.printf("%5s %5d %5d", title, code, year);
        System.out.println();
    }
}