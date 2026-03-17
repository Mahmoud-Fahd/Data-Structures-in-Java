package LinkedListQueue;

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

// this is queue
class LinkQueue{
    Node front;
    Node rear;
    
    public LinkQueue(){
        this.front = null;
        this.rear = null;
    }
    
    // Method check if queue is empty or not.
    public boolean isEmpty(){
        return (front == null);
    }
    
    // Enqueue: add new node to the queue
    public void enqueue(int value){
        Node newNode = new Node(value);
        
        if(isEmpty()){
            front = rear = newNode;
            System.out.println(value + " enqueued to queue");
            return;
        }
        
        rear.next = newNode;
        rear = newNode;
        System.out.println(value + " enqueued to queue");
    }
    
    // Dequeue: remove element from queue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty can not dequeue");
            return -1;
        }
        
        int removed = front.data;
        front = front.next;
        
        if (front == null){
            rear = null;
        }
        
        return removed;
    }
    
    // Display data 
    public void display(){
        Node current = front;
        System.out.print("Queue elements: ");
        
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("");
    }
    
    
}

public class QueueMD {
    public static void main(String[] args) {
        LinkQueue q = new LinkQueue();
        
        System.out.println("Is empty: "+q.isEmpty());
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println("Is empty: "+q.isEmpty());
        
        q.display();
        
        System.out.println("Dequeued: "+q.dequeue());
        q.display();
    }
}
