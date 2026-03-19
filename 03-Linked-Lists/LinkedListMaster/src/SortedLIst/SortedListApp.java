package SortedLIst;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList theSortedList = new SortedList();
        
        System.out.println("Is empty? "+theSortedList.isEmpty());
        
        theSortedList.insert(20);
        theSortedList.insert(40);
        
        theSortedList.display();
        
        System.out.println("Is empty? "+theSortedList.isEmpty());
        
        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);
        
        theSortedList.display();
        
        System.out.println("Removed: "+theSortedList.remove());
        
        theSortedList.display();
        
    }
}
