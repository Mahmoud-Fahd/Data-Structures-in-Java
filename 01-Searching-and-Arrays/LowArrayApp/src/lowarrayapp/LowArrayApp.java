package lowarrayapp;
import java.util.Scanner;

public class LowArrayApp {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        LowArray Arr = new LowArray (100);
        
        int nElems = 0;
        
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Enter value of element no "+(i+1));
            long value = input.nextLong();
            
            Arr.setElem(i, value);
            nElems++;
        }
        
        System.out.println("---display items---");
        
        for(int i = 0 ; i < nElems ; i++){
            System.out.println(Arr.getElem(i));
        }
        System.out.println("");
        
        int searchKey = 66;
        int j ;
        for ( j = 0 ; j < nElems; j++){
            if (Arr.getElem(j)==searchKey) break;
        }
        
        if (j == nElems)
            System.out.println("Can't find "+searchKey);
        else
            System.out.println("Found "+ searchKey);
        System.out.println("");
        
        int k;
        for ( k = 0 ; k < nElems ; k++){
            if (Arr.getElem(k)== 24) break;
        }
        
        if (k == nElems )System.out.println("Can't find "+24+" to delete it ");
        else {
            for (int i = k ; i<nElems-1; i++){
                Arr.setElem(i, Arr.getElem(i+1));
            }
            nElems--;
            System.out.println("24 is deleted");
            System.out.println("");
        }
        
        System.out.println("---display item after deleted---");
        for (int i = 0 ; i < nElems ; i++){
            System.out.println(Arr.getElem(i));
        }
    }
     
    
}
