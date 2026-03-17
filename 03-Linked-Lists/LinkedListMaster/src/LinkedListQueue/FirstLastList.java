package LinkedListQueue;

public class FirstLastList {
    private Link first;
    private Link last;
    
    public FirstLastList(){
        this.first = this.last = null;
    }
    
    //Method to check is empty or not
    public boolean isEmpty(){
        return (first == null);
    }
    
    // Insert Last: to add element in the end of list
    public void InsertLast(int value){
        Link newLink = new Link(value);
        
        if(isEmpty()){
            first = newLink;
            last = newLink;
            return;
        }
        
        last.next = newLink;
        last = newLink;
    }
    
    // Delete First: remove from the beginning of list
    public int deleteFirst(){
        int removed = first.data;
        
        if(isEmpty()){
            return -1;
        }
        
        first = first.next;
        
        return removed;
    }
    
    // Display: to print the elements of list
    public void display(){
        Link current = first;
        
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
