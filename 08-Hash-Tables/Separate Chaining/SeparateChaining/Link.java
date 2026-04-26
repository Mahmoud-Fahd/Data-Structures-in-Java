package SeparateChaining;

public class Link {
    public int iData;
    public Link next;
    
    public Link(int data){
        this.iData = data;
        this.next = null;
    }
    
    public int getKey(){
        return iData;
    }
    
    public void displayLink(){
        System.out.print(iData + " ");
    }
}
