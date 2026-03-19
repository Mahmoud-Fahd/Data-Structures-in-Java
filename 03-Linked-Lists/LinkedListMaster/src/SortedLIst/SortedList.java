package SortedLIst;

public class SortedList {
    //Attributes
    Link first;
    
    //Constractor
    public SortedList(){
        this.first = null;
    }
    
    //isEmpty: to check if empty or not
    public boolean isEmpty(){
        return (first == null);
    }
    
    //Insert: to add element in correct place 
    public void insert(int key){
        Link newLink = new Link(key);
        
        Link previous = null;
        Link current = first;
        
        while (current != null && key > current.data){
            previous = current;
            current = current.next;
        }
        
        if(previous == null){
            first = newLink;
        }
        else{
            previous.next = newLink;
        }
        
        newLink.next = current;
    }
    
    //Remove: remove first link 
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        
        Link removed = first;
        first = first.next;
        
        return removed.data;
    }
    
    //Display: to print all elements
    public void display(){
        System.out.print("List (first --> last):");
        
        Link current = first;
        
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
