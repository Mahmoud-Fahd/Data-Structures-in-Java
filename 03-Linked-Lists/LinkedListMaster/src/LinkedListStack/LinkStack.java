package LinkedListStack;

public class LinkStack {
    private LinkList thelist;
    
    public LinkStack (){
        thelist = new LinkList();
    }
    
    public void push(int j){
        thelist.insertFirst(j);
    }
    
    public Link pop(){
        return thelist.deleteFirst();
    }
    
    public boolean isEmpty(){
        return thelist.isEmpty();
    }
    
    public void display(){
        System.out.print("Stack (top-->bottom): ");
        thelist.displayLinkList();
    }
}
