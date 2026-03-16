package LinkedListStack;

class Node{
    public int data;
    public Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public void displayLink(){
        System.out.print(data+" ");
    }
}

class Stack{
    private Node top;
    
    public Stack(){
        this.top = null;
    }
    
    public boolean isEmpty(){
        return (top == null);
    }
    
    public void push(int value){
        Node newNode = new Node(value);
        
        if(isEmpty()){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        
        System.out.println(newNode.data+" Pushed to stack");
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        Node temp = top;
        top = top.next;
        
        return temp.data;
    }
    
    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.print("Stack elements: ");
        Node current = top;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

public class StackMD {
    public static void main(String[] args) {
        
        Stack thelist = new Stack();
        
        thelist.push(5);
        thelist.push(10);
        thelist.push(20);
        thelist.push(30);
        thelist.push(40);
        
        thelist.display();
        
        System.out.println("The top: " + thelist.top());
        
        System.out.println("Deleted element: " + thelist.pop());
        
        thelist.display();
    }
}
