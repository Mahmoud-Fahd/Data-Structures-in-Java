package SeparateChaining;

public class SortedList {
    private Link first;
    
    public SortedList(){
        this.first = null;
    }
    
    // insert Link , in order
    public void insert(Link theLink){
        int key = theLink.getKey();
        Link previous = null; // start at first
        Link current = first;
        
        while(current != null && key > current.getKey()){
            previous = current;
            current = current.next;
        }
        
        if(previous == null){
            first = theLink;
        }
        else{
            previous.next = theLink;
        }
        theLink.next = current;
    }
    
    // Delete Link from list
    public void delete(int key){
        Link previous = null;
        Link current = first;
        
        while(current != null && key != current.iData){
            previous = current;
            current = current.next;
        }
        
        if(current == null){ // can't find Item
            System.out.println("Item not found to delete");
            return;
        }
        
        // found the Item
        if(previous == null){  // Item is first
            first = first.next;
        }
        else{
            previous.next = current.next;
        }
    }
    
    // Find Item in list
    public Link find(int key){
        Link current = first;
        
        while(current != null && current.iData <= key){
            if(current.iData == key){
                return current; // found the item
            }
            
            current = current.next; // move step
        }
        
        return null;  // can't find Item
    }
    
    // Display List (first --> last)
    public void display(){
        System.out.print("List (first --> last): ");
        
        Link current = first;
        
        while(current != null){
            current.displayLink(); // display current
            current = current.next; // move step
        }
        
        System.out.println("");
    }
}
