package recursion;
import java.util.Scanner;

public class Anagram {
    static int size;
    static int count;
    static char[] arrChar;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter word: ");
        String word = input.nextLine();
        
        size = word.length();
        arrChar = new char[size];
        
        for(int i = 0 ; i < size ; i++){
            arrChar[i] = word.charAt(i);
        }
        
        doAnagram(size);
    }
    
    public static void doAnagram(int newSize){
        // Base case
        if(newSize == 1){
            return;
        }
        
        for(int i = 0 ; i < newSize ; i++){
            doAnagram(newSize - 1);
            
            
            if(newSize == 2){
                displayWord();
            }
        
            rotate(newSize);
        }
    }
    
    public static void rotate(int newSize){
        int j;
        
        int position = size - newSize;
        
        char temp = arrChar[position];
        
        for( j = position + 1; j < size ; j++){
            arrChar[j - 1] = arrChar[j];
        }
        
        arrChar[size - 1] = temp;
    }
    
    public static void displayWord(){
        System.out.print(++count + " ");
        
        for(int i = 0 ; i < size ; i++){
            System.out.print(arrChar[i]);
        }
        
        System.out.print("   ");
        
        if(count % 6 == 0){
            System.out.println("");
        }
    }
}
