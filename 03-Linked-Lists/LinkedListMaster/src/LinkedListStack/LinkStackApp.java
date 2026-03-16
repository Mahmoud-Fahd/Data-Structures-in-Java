package LinkedListStack;

public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();
        
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        
        theStack.display();
        
        theStack.push(60);                   
        theStack.push(80);
        
        theStack.display();
        
        theStack.pop();
        theStack.pop();
        
        theStack.display();
    }
}
