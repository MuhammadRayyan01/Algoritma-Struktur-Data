public class Sorting19 {
int [] data;
int size;    
    
public Sorting19(int[]data){
    this.data = data;
    this.size = data.length;
}
public void bubbleSort(){
    for(int i=0; i<size-1; i++){
        for(int j=0; j<size-1-i; j++){
            if(data[j]>data[j+1]){
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
            }

        }
    }
}
public void selectionSort(){
    for(int i=0; i<size-1; i++){
        int minIndex = i;
        for(int j=i+1; j<size; j++){
            if(data[j]<data[minIndex]){
                minIndex = j;
            }
        }
        int temp = data[i];
        data[i] = data[minIndex];
        data[minIndex] = temp;
    }
}
public void print(){
    for(int num : data){
        System.out.print(num +" ");
    }
    System.out.println();
}
}
