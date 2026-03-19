package ListInsertionSort;

public class SortedList2 {
    //Attributes
    Link first;
    
    //Constractor
    public SortedList2(){
        this.first = null;
    }
    
    //Constractor: Array as a argument
    public SortedList2(Link []linkArray){
        this.first = null;
        
        for(int i = 0 ; i < linkArray.length ; i++){
            insert(linkArray[i]);
        }
    }
    
    //isEmpty: to check if empty or not
    public boolean isEmpty(){
        return (first == null);
    }
    
    //Insert: to add element in correct place 
    public void insert(Link key){
        
        Link previous = null;
        Link current = first;
        
        while (current != null && key.data > current.data){
            previous = current;
            current = current.next;
        }
        
        if(previous == null){
            first = key;
        }
        else{
            previous.next = key;
        }
        
        key.next = current;
    }
    
    //Remove: remove first link 
    public Link remove(){
        if(isEmpty()){
            return null;
        }
        
        Link removed = first;
        first = first.next;
        
        return removed;
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
