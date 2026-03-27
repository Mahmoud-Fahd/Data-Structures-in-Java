package DoublyLinkedList;

public class DoublyLinkedList {
    Link first;
    Link last;
    
    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(int value){
        Link newLink = new Link(value);
        
        if(isEmpty()){
            last = newLink;
        }
        else{
            first.previous = newLink;
        }
        
        newLink.next = first;
        first = newLink;
    }
    
    public void insertLast(int value){
        Link newLink = new Link(value);
        
        if(isEmpty()){
            first = newLink;
        }
        else{
            last.next = newLink;
            newLink.previous = last;
        }
        
        last = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        
        if(isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        
        if(first.next == null){
            last = null;
        }
        else{
            first.next.previous = null;
        }
        
        first = first.next;
        return temp;
    }
    
    public Link deleteLast(){
        Link temp = last;
        
        if(isEmpty()){
            System.out.println("List is empty");
            return null;
        }
        
        if(first.next == null){
            first = null;
        }
        else{
            last.previous.next = null;
        }
        
        last = last.previous;
        return temp;
    }
    
    public boolean insertAfter(int key , int data){
        Link current = first;
        
        if(isEmpty()){
            System.out.println("List is empty");
            return false;
        }
        
        while(current.data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }
        
        Link newLink = new Link(data);
        
        if(current == last){
            newLink.next = null;
            last = newLink;
        }
        else{
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        
        current.next = newLink;
        newLink.previous = current;
        return true;
    }
    
    public Link deleteakey(int key){
        if(isEmpty()){
            System.out.println("List is empty ");
            return null;
        }
        
        Link current = first;
        while (current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }
        }
        
        if(current == first){
            first = current.next;
        }
        else{
            current.previous.next = current.next;
        }
        
        if(current == last){
            last = current.previous;
        }
        else{
            current.next.previous = current.previous;
        }
        
        return current;
    }
    
    public void displayforward(){
        System.out.print("List (first --> last): ");
        Link current = first;
        
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    public void dispalayBackward(){
        System.out.print("List (last --> first): ");
        Link current = last;
        
        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }
}
