package queue2;

public class Queue2 {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    
    public Queue2(int s){
        this.maxSize = s + 1;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
    }
    
    public boolean isEmpty(){
        return (rear == front + 1 || front + maxSize - 1 == rear);
    }
    
    public boolean isFull(){
        return (rear + 2 == front);
    }
    
    public void insert(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        
        if(rear == maxSize - 1){
            rear = -1;
        }
        
        queArray[++rear] = value;
        System.out.println("Inserted: "+value);
    }
    
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        
        if(front == maxSize){
            front = 0;
        }
        
        int removed = queArray[front++];
        return removed;
    }
    
    public int peekFront(){
        return queArray[front];
    }
    
    public void display(){
        System.out.print("Queue elements: ");
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        for(int i = front ; i <= rear ; i++){
            System.out.print(queArray[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        Queue2 q2 = new Queue2(5);
        
        q2.insert(10);
        q2.insert(20);
        q2.insert(30);
        q2.insert(40);
        q2.insert(50);
        
        q2.display();
        
        System.out.println("Removed: "+q2.remove());
        System.out.println("Removed: "+q2.remove());
        System.out.println("Removed: "+q2.remove());
        
        q2.display();
    }
    
}
