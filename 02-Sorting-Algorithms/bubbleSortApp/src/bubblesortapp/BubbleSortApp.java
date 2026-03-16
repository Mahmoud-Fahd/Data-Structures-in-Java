package bubblesortapp;

public class BubbleSortApp {

    public static void main(String[] args) {
        
        ArrayBub arr = new ArrayBub(100);
        
        arr.insert(34);
        arr.insert(45);
        arr.insert(12);
        arr.insert(89);
        arr.insert(90);
        arr.insert(56);
        arr.insert(32);
        arr.insert(67);
        arr.insert(12);
        arr.insert(11);
        
        arr.display();
        
        arr.bubbleSort();
        
        System.out.println("Ater Bubble Sort ");
        
        arr.display();
    }
    
}
