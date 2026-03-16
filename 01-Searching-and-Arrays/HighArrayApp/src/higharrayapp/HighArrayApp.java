package higharrayapp;
import java.util.Scanner;

public class HighArrayApp {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        HighArray arr = new HighArray(100);
        
        arr.insert(12);
        arr.insert(23);
        arr.insert(34);
        arr.insert(45);
        arr.insert(56);
        arr.insert(67);
        arr.insert(78);
        arr.insert(89);
        arr.insert(90);
        arr.insert(66);
        arr.insert(55);
        
        System.out.println("---display items---");
        arr.display();
        
        System.out.println("");
        
        long searchKey = 56;
        if (arr.find(searchKey)){
            System.out.println("Found "+searchKey);
        }
        else 
            System.out.println("Can't find "+searchKey);
        
        System.out.println("");
        
        
        arr.delete(66);
        arr.delete(55);
        arr.delete(90);
        arr.delete(0);
        
        System.out.println("---display items after delete");
        
        arr.display();
        
        long max = arr.getMax();
        
        System.out.println("Max Value = "+max);
        
        
        System.out.println(arr.isEmpty());
    }
    
}
