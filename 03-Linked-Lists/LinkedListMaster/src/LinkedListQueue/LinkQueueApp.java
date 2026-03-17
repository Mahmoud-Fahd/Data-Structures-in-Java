package LinkedListQueue;

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkedQueue theQueue = new LinkedQueue();
        
        System.out.println("Queue is empty ? "+theQueue.isEmpty());
        
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);
        
        theQueue.display();
        
        theQueue.isEmpty();
        
        System.out.println("Enqueued: "+theQueue.remove());
        System.out.println("Enqueued: "+theQueue.remove());
        
        theQueue.display();
        
    }
}
