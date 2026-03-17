package LinkedListQueue;

public class LinkedQueue {
    private FirstLastList theList;
    
    public LinkedQueue(){
        theList = new FirstLastList();
    }
    
    //IsEmpty: to check if empty or not
    public boolean isEmpty(){
        return (theList.isEmpty());
    }
    
    //Insert: to enqueue element in the end of queue
    public void insert(int value){
        theList.InsertLast(value);
    }
    
    //Remove: to dequeue element from queue
    public int remove(){
        return theList.deleteFirst();
    }
    
    //Display: to print elements of queue
    public void display(){
        System.out.print("Queue (front-->rear): ");
        theList.display();
    }
}
