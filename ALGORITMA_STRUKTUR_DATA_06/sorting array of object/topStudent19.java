public class topStudent19 {
   public  Student19 [] listStudents;
    int idx;
 public topStudent19() {
        listStudents = new Student19[5];}

    public void add(Student19 student){
        if(idx < listStudents.length){
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("list is full!");
        }
    }
    public void print(){
        for (int i = 0; i < idx; i++) {
            listStudents[i].Print();
            System.out.println("------------------");
        }
    }
    public void bubbleSort(){
        for (int i = 0; i < listStudents.length-1; i++) {
            for (int j = 0; j < listStudents.length-1-i; j++) {
                if(listStudents[j].gpa < listStudents[j+1].gpa){
                    // swap
                    Student19 temp = listStudents[j];
                    listStudents[j] = listStudents[j+1];
                    listStudents[j+1] = temp;
                }
            }
        }
    }
    public void selectionSort(){
        for (int i = 0; i < listStudents.length-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < listStudents.length; j++) {
                if(listStudents[j].gpa < listStudents[minIdx].gpa){
                    minIdx = j;
                }
            }
            // swap minimum with first element
            Student19 temp = listStudents[minIdx];
            listStudents[minIdx] = listStudents[i];
            listStudents[i] = temp;

        }
          
}
}

