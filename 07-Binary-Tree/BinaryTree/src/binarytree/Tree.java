package binarytree;

public class Tree {
    Node root; // the begining of tree
    
    // Constractor
    public Tree(){
        this.root = null;
    }
    
    // Method to insert node
    public void insert(int value){
        Node newNode = new Node(value); // create new node
        
        if(root == null){  // if tree is empty ?
            root = newNode;
        }
        else{
            Node current = root; // Reference to move 
            Node parent;
            
            while(true){
                parent = current;
                
                if(value < current.iData){  // the value smaller than current Node 
                    current = current.leftChild; // Move left
                    
                    if(current == null){// current node is null  
                        parent.leftChild = newNode; // put the new value
                        return;
                    }
                }else{ // the value bigger than or  equal current Node 
                    current = current.rightChild; // Move Right
                    
                    if(current == null){ // current node is null
                        parent.rightChild = newNode; // put the new value
                        return;
                    }
                }
            }
        }
    }
    
    // Method to find value 
    public Node find(int key){
        Node current = root; // Reference to root
        
        while(current.iData != key){ // check
            if(key < current.iData){ // key smaller than current node
                current = current.leftChild; // move left
            }
            else{ // key bigger than current node
                current = current.rightChild; // move right
            }
            
            if(current == null){ // key is not found
                return null; 
            }
        }
        return current; // key is found 
    }
    
    // Method to delete Node
    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        
        // 1- find the node 
        while(current.iData != key){
            parent = current;
            
            if(key < current.iData){ 
                isLeftChild = true; 
                current = current.leftChild; // Move left
            }
            else{ 
                isLeftChild = false;
                current = current.rightChild; // Move right
            }
            
            if(current == null){ // key is not found
                return false;
            }
        }
        
        // 2- After find Node 
        // Case 1: Node is leaf
        if(current.leftChild == null && current.rightChild == null){ // Condition: Node is leaf
            if(current == root){ // leaf is root
                root = null;
            }
            else if(isLeftChild){ // leaf is left child
                parent.leftChild = null; 
            }
            else{ // leaf is right child
                parent.rightChild = null; 
            }
        }
        
        // Case 2: Node has one child
        else if(current.rightChild == null){ // has left child
            if(current == root){ 
                root = current.leftChild;
            }
            else if(isLeftChild){ // node is left
                parent.leftChild = current.leftChild;
            }
            else{ // node is right
                parent.rightChild = current.leftChild;
            }
        }
        
        else if(current.leftChild == null){ // has right child
            if(current == root){
                root = current.rightChild;
            }
            else if(isLeftChild){ // node is left
                parent.leftChild = current.rightChild;
            }
            else{ // node is right
                parent.rightChild = current.rightChild;
            }
        }
        
        // Case 3: Node has two child
        else{
            Node successor = getSuccessor(current);
            
            if(current == root){
                root = successor;
            }
            else if(isLeftChild){
                parent.leftChild = successor;
            }
            else{
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        
        return true;
    }
    
    // Method to get successor for node is being deleted
    private Node getSuccessor(Node delNode){
        
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        
        // find the minimum of right subtree
        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        
        // if successor in the last of right subtree
        if(successor != delNode.rightChild){
            
            successorParent.leftChild = successor.rightChild;
            
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }
    
    // Method to find minimum value in tree 
    public Node findMin(){
        Node current = root;
        
        if(current == null){ // tree is empty
            return null;
        }
        
        while(current.leftChild != null){ // the min value is the last node in left subtree
            current = current.leftChild;
        }
        
        return current; // Min value
    }
    
    // Method to find Maximum value
    public Node findMax(){
        Node current = root;
        
        if(current == null){ // tree is empty
            return null;
        }
        
        while(current.rightChild != null){ // the max value is the last node in right subtree
            current = current.rightChild;
        }
        
        return current; // Max value
    }
    
    // Methods to traverse
    // Case 1: In-order traversal => left -> root -> right
    public void inOrder(Node loacalRoot){
        if(loacalRoot != null){
            inOrder(loacalRoot.leftChild);  // Go left
            System.out.print(loacalRoot.iData + " "); // print
            inOrder(loacalRoot.rightChild); // Go right
        }
    }
    
    // Case 2: Pre-Order traversal => root -> left -> right
    public void preOrder(Node localRoot){
        if(localRoot != null){
            System.out.print(localRoot.iData + " "); // Print root first
            preOrder(localRoot.leftChild); // Go left
            preOrder(localRoot.rightChild); // Go right
        }
    }
    
    // Case 3: Post-Order traversal => left -> right -> root
    public void postOrder(Node localRoot){
        if(localRoot != null){
            postOrder(localRoot.leftChild); // Go left
            postOrder(localRoot.rightChild); // Go right
            System.out.print(localRoot.iData + " "); // print
        }
    }
}
