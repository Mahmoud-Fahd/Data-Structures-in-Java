package selectsortapp;

public class SelectionSort {
    
    private long[] a;
    private int nElems;
    
    public SelectionSort(int max){
        a = new long[max];
        nElems = 0;
    }
    
    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }
    
    public void display(){
        for(int i = 0 ; i < nElems ; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println("");
    }
    
    public void SelectionSort(){
        int min;
        for(int out = 0 ; out < nElems -1 ; out++){
            min = out;
            for(int in = out+1 ; in < nElems  ; in++){
                if(a[in] < a[min]){
                    min = in;
                }
            }
            
            swap(out,min);
        }
    }
    
    private void swap(int out , int min){
        long temp = a[out];
        a[out] = a[min];
        a[min] = temp;
    }
}
