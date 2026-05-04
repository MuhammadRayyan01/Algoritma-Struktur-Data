package algoritma10;
public class StudentAssignmentStack{
student19[] Stack;
int top, size;
public StudentAssignmentStack(int size){
    this.size = size;
    top = -1;
    Stack = new student19[size];
}
boolean isFull(){
    if(top == size - 1){
        return true;
    }else{
        return false;
    }
}
boolean isEmpty(){
    if(top == -1){
        return true;
    }else{
        return false;
    }
}
void push (student19 std){
if(!isFull()){
    top++;
    Stack[top] = std;
}else{
    System.out.println("stack is already full");
}
}
student19 pop(){
    if(!isEmpty()){
        student19 std = Stack[top];
        top--;
        return std;
    }else{
        System.out.println("there is no data in stack");
        return null;
    }
}
student19 peek(){
    if(!isEmpty()){
        return Stack[top];
    }else{
        System.out.println("there is no data in stack");
        return null;
    }
}
public void print(){
    if(isEmpty()){
        System.out.println("tidak ada tugas di dalam stack");
        return ;
    }
    for(int i = top ; i >= 0 ; i--){
        System.out.println(Stack[i].nim + "\t" + Stack[i].name + "\t" + Stack[i].className);
    }
System.out.println("");
}

//convert to binary method (practicum 2)
String ConversiontoBinary(int grade){
        ConversionStack stack = new ConversionStack(32);
        while (grade != 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }

        return binary;
}}