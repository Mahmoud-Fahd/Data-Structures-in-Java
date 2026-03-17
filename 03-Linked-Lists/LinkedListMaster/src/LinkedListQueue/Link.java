package LinkedListQueue;

public class Link {
    int data;
    Link next;
    
    public Link(int data){
        this.data = data;
        this.next = null;
    }
    
    public void displayLink(){
        System.out.print(data + " ");
    }
}
