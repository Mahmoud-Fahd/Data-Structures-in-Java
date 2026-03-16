package LinkedListStack;

public class LinkList {
    private Link head;
    
    public LinkList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void insertFirst(int id ){
        Link newLink = new Link(id);
        newLink.next = head;
        head = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = head;
        head = head.next;
        return temp;
    }
    
    public void displayLinkList(){
        Link current = head;
        while (current != null){
            current.displayLink();
            System.out.print("->");
            current = current.next;
        }
        System.out.println(" ");
    }
    
    
}
