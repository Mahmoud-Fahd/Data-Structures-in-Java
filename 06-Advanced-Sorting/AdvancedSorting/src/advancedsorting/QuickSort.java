package advancedsorting;

class ArrayQuick{
    private int[] theArray;
    private int nElems;
    
    public ArrayQuick(int max){
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
        int rightPtr = right;
        
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
        
        swap(leftPtr, right);
        
        return leftPtr;
    }
    
    public void swap(int dex1, int dex2){
        int temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
    
    public void recQuickSort(int left, int right){
        // Base case
        if(right - left <= 0){
            return;
        }
        else{
            int pivot = theArray[right];
            
            int partition = partitionIt(left, right,(int) pivot);
            
            recQuickSort(left, partition - 1);
            
            recQuickSort(partition + 1, right);
        }
    }
    
    public void quickSort(){
        recQuickSort(0, nElems - 1);
    }
    
}

public class QuickSort {
    public static void main(String[] args) {
        int maxSize = 16;
        
        ArrayQuick arr = new ArrayQuick(maxSize);
        
        for(int i = 0 ; i < maxSize ; i++){
            int n = (int) (java.lang.Math.random()*99);
            arr.insert(n);
        }
        
        System.out.print("Before Quick Sort: ");
        arr.display();
        
        arr.quickSort();
        
        System.out.print("After Quick Sort: ");
        arr.display();
    }
}
