public class SearchStudent {
Student19[] listStd = new Student19[5];
int idx;

public void add(Student19 s){
    if(idx < listStd.length){
        listStd[idx] = s;
        idx++;
    } else {
        System.out.println("list is full!");
    }
}
public void display(){
    for (int i = 0; i < idx; i++) {
        listStd[i].Display();
        System.out.println("------------------");
    }
}
public int SeqSearch(long search){
    for (int i = 0; i < idx; i++) {
        if(listStd[i].NIM == search){
            System.out.println("Data found at index " + i);
            listStd[i].Display();
            return i;
        }
    }
    System.out.println("Data not found!");
    return -1;
}

public void showPosition(long x, int pos){
    for (int i = 0; i < idx; i++) {
        if(listStd[i].NIM == x){
            System.out.println("Data found at index " + i);
            return;
        }
    }
    System.out.println("Data not found!");

}
public void showData(long x, int pos){
    for (int i = 0; i < idx; i++) {
        if(listStd[i].NIM == x){
            System.out.println("Data found at index " + i);
            listStd[i].Display();
            return;
        }
    }
    System.out.println("Data not found!");
}
}