package stackapp;

public class StackX {
    private int maxSize;
    private int top;
    private int[] stackArray;
    
    public StackX(int size){
        this.maxSize = size;
        stackArray = new int [maxSize];
        top = -1;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize -1);
    }
    
    public void push(int value){
        if(isFull()){
            System.out.println("Stack overflow!, can't push "+value);
        }
        else{
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow! , stack is empty");
            return -1;
        }
        else{
            int poppedValue = stackArray[top--];
            return poppedValue;
        }
    }
    
    public int top(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return stackArray[top];
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.print("Stack element: ");
            for(int i = 0 ; i <= top ; i++){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        StackX stack = new StackX(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        stack.display();
        
        System.out.println("popped value "+stack.pop());
        
        System.out.println("top element "+stack.top());
        
        stack.display();
    }
    
}
