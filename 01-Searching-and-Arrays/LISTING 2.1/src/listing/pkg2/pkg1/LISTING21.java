package listing.pkg2.pkg1;
import java.util.Scanner;

public class LISTING21 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            long[] Arr = new long [10];
            int nElemns = 0;
        
            for (int i = 0 ; i <Arr.length ; i++){
                System.out.println("Enter number "+(i+1));
                Arr[i] = input.nextLong();
                nElemns++;
            }
            
            System.out.println("Number you entered");
            
            for(int k = 0 ; k <nElemns ; k++){
                System.out.println(Arr[k]);
            }
            
            System.out.println("number you search about");
            
            long searchKey = 66;
            int j;
            for ( j = 0 ; j<nElemns ; j++){
                if (Arr[j] == searchKey){
                    break;
                }
            }
            
            if (j == nElemns){
                System.out.println("Can't find "+searchKey);
            }
            else 
                System.out.println("Found "+searchKey);
        
            long searchKey2 = 55;
            int i ;
            for ( i = 0 ; i < nElemns ; i++){
                if (Arr[i] == searchKey2)
                    break;
            }
            
            if (i ==nElemns){
                System.out.println("Can't find "+searchKey2 +" to delete it ");
            }
            else{
                for (int k = i ; k<nElemns -1 ; k++){
                 Arr[k] = Arr[k+1];
                }
                nElemns--;
                
                System.out.println("Deleted "+searchKey2);
            }
            System.out.println("display items after deletion");
            for (int n = 0 ; n <nElemns ; n++){
                System.out.println(Arr[n]);
            }
            
            input.close();
        
    }
    
}
