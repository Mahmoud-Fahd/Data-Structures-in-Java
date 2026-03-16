package bubblesortapp;

public class ArrayBub {
    
    private long[] a;
    private int nElems;
    
    public ArrayBub(int max){
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
    
    public void bubbleSort(){
        int out , in;
        for(out = nElems - 1 ; out > 0 ; out--){
            for(in = 0 ; in < out ; in++){
                if(a[in] > a[in +1])
                    swap(in,in+1);
            }
        }
    }
    
    
//    public void bubbleSort(){
//        for (int k = 0 ; k < nElems -1 ; k++){
//            for (int i = 0 ; i < nElems-1-k ; i++){
//                if (a[i] > a[i+1])
//                    swap(i,i+1);
//            }
//        }
//    
//    }
    
    private void swap(int one , int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
