package priorityq;

public class PriorityQ {

    private int[] priQueue;
    private int nItems;
    private int maxSize;
    
    public PriorityQ(int size){
        this.maxSize = size;
        priQueue = new int[maxSize];
        nItems = 0;
    }
    
    public void insert(int value){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (nItems == 0){
            priQueue[nItems++] = value;
        }
        else{
            int i;
            for (i = nItems - 1 ; i >= 0 ; i--){
                if (value > priQueue[i]){
                    priQueue[i+1] = priQueue[i];
                }
                else{
                    break;
                }
            }
            priQueue[i+1] = value;
            nItems++;
        }
    }
    
    public int remove(){
        return priQueue[--nItems];
    }
    
    public int peekMin(){
        return priQueue[nItems - 1];
    }
    
    public boolean isEmpty(){
        return (nItems == 0);
    }
    
    public boolean isFull(){
        return (nItems == maxSize);
    }
    
    public static void main(String[] args) {
        
        PriorityQ p = new PriorityQ(5);
        
        p.insert(5);
        p.insert(9);
        p.insert(7);
        p.insert(3);
        p.insert(10);
        
        while(!p.isEmpty()){
            System.out.println(p.remove());
        }
        
    }
    
}
