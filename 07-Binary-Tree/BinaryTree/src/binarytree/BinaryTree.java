package binarytree;

public class BinaryTree {

    public static void main(String[] args) {
        
        Tree myTree = new Tree();
        
        // insert values
        myTree.insert(15);
        myTree.insert(59);
        myTree.insert(30);
        myTree.insert(100);
        myTree.insert(74);
        myTree.insert(47);
        myTree.insert(62);
        myTree.insert(26);
        myTree.insert(37);
        myTree.insert(8);
        
        System.out.println("Before Deleting");
        myTree.inOrder(myTree.root);
        System.out.println("");
        
        System.out.println("After Delete 30");
        myTree.delete(30);
        myTree.inOrder(myTree.root);
        System.out.println("");
        
        System.out.println("Minimum value: " + myTree.findMin().iData);
        System.out.println("Maximum value: " + myTree.findMax().iData);
    }
    
}
