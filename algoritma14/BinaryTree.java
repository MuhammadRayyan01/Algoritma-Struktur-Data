package algoritma14;

public class BinaryTree {
 Node19 root;
 
    public BinaryTree() {
        this.root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void add(Student19 data){
        if (isEmpty()) {
            root = new Node19(data);
        } else {
            Node19 current = root;
            while (true){
            if(data.ipk < current.data.ipk){
                if(current.left != null){
                    current = current.left;
                }else{
                    current.left = new Node19(data);
                break;
                }
            }else if(data.ipk > current.data.ipk){
                if(current.right != null){
                    current = current.right;
                }else{
                    current.right = new Node19(data);
                    break;
                }
            }else{
                break;
                }
            }
        }
    }

    void addRecursive(Student19 data){
        root = addRecursive(root, data);
    }
    Node19 addRecursive(Node19 current, Student19 data){
    if (current == null) {
        return new Node19(data);
    }
    if (data.ipk < current.data.ipk) {
        current.left = addRecursive(current.left, data);
    } else if (data.ipk > current.data.ipk) {
        current.right = addRecursive(current.right, data);
    }
    return current;
    }


    public boolean find(double ipk){
        boolean result = false;
        Node19 current = root;
        while (current != null) {
            if(current.data.ipk == ipk){
                result = true;
                break;
            }else if(ipk < current.data.ipk){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    public Student19 getMinIPK(){
    if (isEmpty()) {
        return null;
    }
    Node19 current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current.data;
    }

    public Student19 getMaxIPK(){
    if (isEmpty()) {
        return null;
    }
    Node19 current = root;
    while (current.right != null) { 
        current = current.right;
    }
    return current.data;
    }

    void displayStudentsWithIPKAbove(double threshold) {
    displayStudentsWithIPKAbove(root, threshold);
    }
    void displayStudentsWithIPKAbove(Node19 node, double threshold) {
    if (node != null) {
        if (node.data.ipk > threshold) {
        node.data.print();
        }
        displayStudentsWithIPKAbove(node.left, threshold);
        displayStudentsWithIPKAbove(node.right, threshold);
    }
    }


    public void traversePreOrder (Node19 node){
    if(node != null){
        node.data.print();
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
    }
    public void traverseInOrder(Node19 node){
        if(node != null){
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }
    public void traversePostOrder(Node19 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }
    Node19 getSuccessor(Node19 del){
        Node19 successor = del.right;        
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    public void delete (double ipk){
        if(isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        Node19 parent = root;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if(ipk < current.data.ipk){
                isLeftChild = true;
                current = current.left;
            }else{
                isLeftChild = false;
                current = current.right;
            }
            if(current == null){
                System.out.println("Data not found");
                return;
            }
        }
        //delete node with no children
        if(current.left == null && current.right == null){
            if(current == root){
                root = null;
            } else if(isLeftChild){
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if(current.right == null){//delete node with a left child
            if(current == root){
                root = current.left;
            } else if(isLeftChild){
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if(current.left == null){//delete node with a right child
            if(current == root){
                root = current.right;
            } else if(isLeftChild){
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {//delete node with 2 children
            Node19 successor = getSuccessor(current);
            if(current == root){
                root = successor;
            } else if(isLeftChild){
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

}
