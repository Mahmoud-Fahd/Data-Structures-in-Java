package advancedsorting;

public class ArrayShell {
    private int[] theArray;
    private int nElems;
    
    public ArrayShell(int max){
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
    
    public void shellSort(){
        int outer, inner;
        int temp;
        
        int h = 1;
        
        while(h <= nElems / 3){
            h = h * 3 + 1;
        }
        
        while(h > 0){
            
            for(outer = h; outer < nElems; outer++){
                temp = theArray[outer];
                inner = outer;
                
                while(inner > h - 1 && temp <= theArray[inner - h]){
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            
            h = (h - 1) / 3;
        }
        
        }
    }

class ShellSortApp{
    public static void main(String[] args) {
        int max = 10;
        
        ArrayShell arr = new ArrayShell(max);
        
        for(int i = 0 ; i < max ; i++){
            int n = (int) (java.lang.Math.random()*99);
            arr.insert(n);
        }
        
        System.out.print("Before shell sort: ");
        arr.display();
        
        arr.shellSort();
        
        System.out.print("After shell sort: ");
        arr.display();
    }
}



