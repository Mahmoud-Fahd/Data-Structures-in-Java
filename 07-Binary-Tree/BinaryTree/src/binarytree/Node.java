package binarytree;

public class Node {
    public int iData;
    public Node leftChild; //Reference to small Node
    public Node rightChild; //Reference to big Node
    
    // constractor
    public Node(int data){
        this.iData = data;
    }
    
    public void displayNode(){
        System.out.print(iData+" ");
    }
}
