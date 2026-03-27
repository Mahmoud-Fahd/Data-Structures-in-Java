package DoublyLinkedList;

public class Link {
    int data;
    Link next;
    Link previous;
    
    public Link(int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }
    
    public void displayLink(){
        System.out.print(data+" ");
    }
}
