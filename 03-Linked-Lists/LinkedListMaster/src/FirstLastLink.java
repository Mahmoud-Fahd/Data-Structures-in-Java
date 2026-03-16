public class FirstLastLink {
    
    public Link first;
    public Link last;
    
    public FirstLastLink(){
        this.first = null;
        this.last = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int value){
        Link newLink = new Link(value);
        
        if(isEmpty()){
            first = newLink;
            last = newLink;
            return;
        }
        
        newLink.next = first;
        first = newLink;
    }
    
    public void insertLast(int value){
        Link newLink = new Link(value);
        
        if(isEmpty()){
            first = newLink;
            last = newLink;
            return;
        }
        
        last.next = newLink;
        last = newLink;
    }
    
    public Link deleteFirst(){
        if(isEmpty()){
            return null;
        }
        
        Link current = first;
        if(first.next == null){
            last = null;
        }
        first = current.next;
        return current;
    }
    
    public void displayLinkList(){
        System.out.print("List: (first --> last): ");
        if(isEmpty()){
            System.out.println("Linked list is empty");
        }
        else{
            Link current = first;
            while(current != null){
                current.displayLink();
                current = current.next;
            }
            System.out.println("");
        }
    }
}
