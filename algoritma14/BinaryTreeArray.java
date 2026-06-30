package algoritma14;

public class BinaryTreeArray {
    Student19[] data;
    int idxLast;

    public BinaryTreeArray(){
        data = new Student19[10];
        idxLast = -1;
    }
    public void populateData(Student19[] data, int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(data[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
  
    public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (data[idxStart] != null) {

            data[idxStart].print();

            traversePreOrder(2 * idxStart + 1);

            traversePreOrder(2 * idxStart + 2);
        }
    }
}

    public void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            if(data[idxStart]!=null){

               traversePostOrder(2 * idxStart + 1);

               traversePostOrder(2 * idxStart + 2);
               
               data[idxStart].print();
            }
        }
    }

    public void add(Student19 student) {
        idxLast++;
        if (idxLast < data.length) {
            data[idxLast] = student;
        }else {
            System.out.println("Array is full!");
            idxLast--;
        }
    }
    
}

    

