package advancedsorting;

class ArrayPar{
    private int[] theArray;
    private int nElems;
    
    public ArrayPar(int max){
        theArray = new int[max];
        nElems = 0;
    }
    
    public void insert(int value){
        theArray[nElems++] = value;
    }
    
    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println("");
    }
    
    public int partitionIt(int left, int right, int pivot){
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        
        while (true) {
            
            while(leftPtr < right && theArray[++leftPtr] < pivot)
                ;
            
            while(rightPtr > left && theArray[--rightPtr] > pivot)
                ;
            
            if(leftPtr >= rightPtr){
                break;
            }
            else{
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }
    
    public void swap(int dex1, int dex2){
        int temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
    
}

public class Partitioning {
    public static void main(String[] args) {
        int max = 10;
        
        ArrayPar arr = new ArrayPar(max);
        
        for(int i = 0 ; i < max ; i++){
            int n = (int) (java.lang.Math.random()*99);
            arr.insert(n);
        }
        
        System.out.print("Before Partitioning: ");
        arr.display();
        
        int pivot = 45;
        System.out.println("Pivot: "+pivot);
        
        arr.partitionIt(0, max - 1, pivot);
        
        System.out.print("After Partitioning: ");
        arr.display();
        
        
    }
}


