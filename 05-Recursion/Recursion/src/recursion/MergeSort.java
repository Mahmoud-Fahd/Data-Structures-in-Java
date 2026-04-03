package recursion;

public class MergeSort {
    
    private final int[] theArray;
    private int nElems;
    
    public MergeSort(int maxSize){
        theArray = new int[maxSize];
        nElems = 0;
    }
    
    public void insert(int value){
        theArray[nElems++] = value;
    }
    
    public void mergeSort(){
        int[] workSpace = new int[nElems];
        recMergeSort(workSpace, 0, nElems - 1);
    }
    
    private void recMergeSort(int[] workSpace, int lowerBound, int upperBound){
        // Base case
        if(lowerBound == upperBound){
            return;
        }
        else{
            int mid = lowerBound + (upperBound - lowerBound)/2;
            
            recMergeSort(workSpace, lowerBound, mid);
            
            recMergeSort(workSpace, mid + 1, upperBound);
            
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }
    
    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound){
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;
        
        while(lowPtr <= mid && highPtr <= upperBound){
            if(theArray[lowPtr] <= theArray[highPtr]){
                workSpace[j++] = theArray[lowPtr++];
            }
            else{
                workSpace[j++] = theArray[highPtr++];
            }
        }
        
        while(lowPtr <= mid){
            workSpace[j++] = theArray[lowPtr++];
        }
        
        while(highPtr <= upperBound){
            workSpace[j++] = theArray[highPtr++];
        }
        
        for(j = 0 ; j < n ; j++){
            theArray[lowerBound + j] = workSpace[j];
        }
    }
    
    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        MergeSort arr  = new MergeSort(10);
        
        arr.insert(45);
        arr.insert(69);
        arr.insert(47);
        arr.insert(12);
        arr.insert(23);
        arr.insert(7);
        arr.insert(14);
        arr.insert(9);
        
        System.out.print("Before MergeSort: ");
        arr.display();
        
        arr.mergeSort();
        
        System.out.print("After MergeSort: ");
        arr.display();
        
    }
}
