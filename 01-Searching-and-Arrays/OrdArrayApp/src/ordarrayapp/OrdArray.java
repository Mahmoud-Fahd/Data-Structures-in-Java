package ordarrayapp;

public class OrdArray {
    
    private int [] a;
    private int nElems;
    
    public OrdArray(int maxSize){
        a = new int[maxSize];
        nElems = 0;
    }
    
    public int find (int searchKey){
        int lower = 0;
        int upper = nElems - 1;
        int curIn;
        
        while (true){
            curIn = (lower+upper)/2;
            
            if (lower > upper )
                return -1;
            if (a[curIn]==searchKey)
                return curIn;
            else if (searchKey > a[curIn]){
                lower = curIn + 1;
            }
            else
                upper = curIn - 1;
            }
        }
    
    public boolean insert (int value){
        
        if (nElems == a.length) return false;
        
        int i;
        for (i = 0 ; i < nElems ; i++){
            if (a[i]> value ) break;
        }
        
        nElems++;
        
        for (int j = nElems - 1 ; j > i ; j--){
            a[j] = a[j-1];
        }
        
        a[i] = value;
        return true;
    }
    
    public boolean delete(int value){
        int j = find(value);
        
        if (j == -1) return false;
        
        else{
            for (int i = j ; i< nElems - 1; i++){
                a[i] = a[i+1];
            }
            nElems--;
            return true;
        }
    }
     
    public void display (){
        System.out.print("Items: ");
        for (int i = 0 ; i< nElems;i++){
        System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    
    }
    

