package bracketsapp;

public class StackX {
    private int maxSize;
    private int top;
    private char[] stackArray;
    
    public StackX(int s){
        this.maxSize = s;
        stackArray = new char [maxSize];
        top = -1;
    }
    
    public char pop(){
        return stackArray[top--];
    }
    
    public void push(char j){
        stackArray[++top] = j;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isfull(){
        return (top == maxSize - 1);
    }
    
    public char peek(){
        return stackArray[top];
    }
}
