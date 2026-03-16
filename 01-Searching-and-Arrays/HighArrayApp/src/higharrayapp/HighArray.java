package higharrayapp;

public class HighArray {
    
    private long[] Arr;
    private int nElems;
    
    public HighArray (int max){
        Arr = new long [max];
        nElems = 0;
    }
    
    public boolean find(long searchKey){
        int j;
        for(j = 0 ; j < nElems; j++){
            if (Arr[j] == searchKey) break;
        }
        
        if (j == nElems) 
            return false;
        else 
            return true;
    }
    
    public void insert (long value){
        Arr[nElems] = value;
        nElems++;
    }
    
    public boolean delete (long value){
        int i;
        for(i= 0 ; i<nElems ; i++){
            if(value==Arr[i]) break;
        }
        
        if (i == nElems) 
            return false;
        else {
            for (int k = i; k< nElems-1;k++){
                Arr[k]=Arr[k+1];
            }
            nElems--;
            return true;
        }
    }
    
    public void display(){
        for (int i = 0; i<nElems;i++){
            System.out.println(Arr[i]);
        }
    }
    
    public long getMax(){
        if (nElems ==0 ) return -1;
        
        long max = Arr[0];
        for (int i = 1 ; i < nElems ; i++){
            if (Arr[i] > max ){
                max = Arr[i];
            }
        }
        return max;
    }
    
    public boolean isEmpty(){
        return (nElems ==0);
    }
}