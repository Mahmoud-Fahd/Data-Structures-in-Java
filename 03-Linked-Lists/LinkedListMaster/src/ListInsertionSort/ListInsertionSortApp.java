package ListInsertionSort;

public class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;
        // create array of links
        Link[] arr = new Link[size];
        
        // fill array with links
        for(int i = 0 ; i < size ; i++){
            int n = (int) (java.lang.Math.random()*99);
            Link newLink = new Link(n);
            arr[i] = newLink;
        }
        
        // display unsorted array 
        System.out.print("Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].data+" ");
        }
        System.out.println("");
        
        // create new sorted list to fill by the array 
        SortedList2 theSortedList = new SortedList2(arr);
        // links from list to array
        for (int i = 0; i < size ; i++) {
            arr[i] = theSortedList.remove();
        }
        
        // display sorted array 
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i].data+" ");
        }
        System.out.println("");
    }
}
