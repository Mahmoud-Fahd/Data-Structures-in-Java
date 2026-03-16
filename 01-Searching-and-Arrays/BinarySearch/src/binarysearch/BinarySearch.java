package binarysearch;

import java.security.Key;

public class BinarySearch {

    public static void main(String[] args) {
        
        int[] Array = {0,1,2,3,4,5,6,7,8,9,10};
        int searchkey = 15;
        
        System.out.println(BinarySearch(Array, searchkey));
    }
    
    public static int BinarySearch( int[]arr,int searchKey ){
        
        int lowerBound = 0;
        int upperBound = arr.length - 1;
        
        int curIn;
        
        while (true){
            curIn = ( lowerBound + upperBound )/ 2;
            
            if (lowerBound > upperBound)
                return -1;
            
            if ( searchKey == arr[curIn])
                return curIn;
            
            else if (searchKey > arr[curIn]){
                lowerBound = curIn + 1;
            }
            else{
                upperBound = curIn - 1;
            }
        }
    }
}
