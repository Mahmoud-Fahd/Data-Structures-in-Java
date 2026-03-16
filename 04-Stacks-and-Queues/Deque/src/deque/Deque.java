package deque;

public class Deque {

    private int[] arrDeque;
    private int maxSize;
    private int nItems;
    private int front;
    private int rear;
    
    public Deque(int s){
        this.maxSize = s;
        arrDeque = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public void insertRear(int value){
        if(isFull()){
            System.out.println("Deque is full");
            return;
        }
        if(rear == maxSize - 1){
           rear = -1;
        }
        arrDeque[++rear] = value;
        nItems++;
    }
    
    public int removeFront(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        if(front == maxSize){
            front = 0;
        }
        int removedFront;
        removedFront = arrDeque[front++];
        nItems--;
        return removedFront;
    }
    
    public void insertFront(int value){
        if(isFull()){
            System.out.println("Deque is full");
            return;
        }
        if(front == 0){
            front = maxSize;
        }
        arrDeque[--front] = value;
        nItems++;
    }
    
    public int removeRear(){
        if(isEmpty()){
            System.out.println("Deque is empty");
            return -1;
        }
        if(rear == -1){
            rear = maxSize;
        }
        int removedRear = arrDeque[--rear];
        nItems--;
        return removedRear;
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize );
    }
    
    public void display(){
        System.out.println("Deque elements: ");
        int tempFront = front;
        for(int i = 0 ; i < nItems ; i++){
            System.out.println(arrDeque[tempFront++]);
            if(tempFront == maxSize){
                tempFront = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        
        Deque d = new Deque(5);
        
        d.insertRear(5);
        d.insertFront(8);
        
        d.display();
        
    }
    
}
