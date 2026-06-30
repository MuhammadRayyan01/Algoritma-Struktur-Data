
public class function {
    node root;

    function(){

    }
    function(node root){
        this.root=null;
    }
    boolean isEmpty(){
    return root == null;
    }

    //goal: find,insert,delete,display
    public void add(tree data){
        if (isEmpty()) {
            root = new node();
        } else {
            node currNode = root;
            while (true){
            if(data.value < currNode.data.value){
                if(currNode.left != null){
                    currNode = currNode.left;
                }else{
                    currNode.left = new node();
                break;
                }
            }else if(data.value > currNode.data.value){
                if(currNode.right != null){
                    currNode = currNode.right;
                }else{
                    currNode.right = new node();
                    break;
                }
            }else{
                break;
                }
            }
        }
    }
    public boolean find(double find){
        boolean result = false;
        node currNode= root;
        while (currNode != null) {
            if(currNode.data.value == find){
                result = true;
                break;
            }else if(find < currNode.data.value){
                currNode = currNode.left;
            }else{
                currNode = currNode.right;
            }
        }
        return result;
    }

    }
    

