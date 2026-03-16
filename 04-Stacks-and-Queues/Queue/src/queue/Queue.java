package queue;

public class Queue {
    //Attributes:
    private int[] queArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    
    //Constractor:
    public Queue(int size){
        this.maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    //Methods:
    public void insert(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(rear == maxSize - 1){
            rear = -1;
        }
        queArray[++rear] = value;
        nItems++;
    }
    
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        
        int removed = queArray[front++];
        nItems--;
        
        if(front == maxSize){
            front = 0;
        }
        return removed;
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public int peekFront(){
        return queArray[front];
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        System.out.print("Queue elements: ");
        int temp = front;
        for(int i = 0 ; i < nItems ; i++){
            System.out.print(queArray[temp++]+" ");
            if(temp == maxSize){
                temp = 0;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        
        Queue q1 = new Queue(10);
        
        q1.insert(11);
        q1.insert(22);
        q1.insert(33);
        q1.insert(44);
        q1.insert(55);
        q1.insert(66);
        q1.insert(77);
        q1.insert(88);
        q1.insert(99);
        q1.insert(200);
        
        q1.display();
        
        System.out.println("removed: " +q1.remove());
        System.out.println("removed: " +q1.remove());
        
        q1.display();
        
        q1.insert(12);
        
        q1.display();
    }
    
}
