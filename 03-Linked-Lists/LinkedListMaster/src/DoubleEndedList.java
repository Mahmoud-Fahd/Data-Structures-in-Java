public class DoubleEndedList {
    public static void main(String[] args) {
        
        FirstLastLink thelist = new FirstLastLink();
        
        thelist.insertFirst(5);
        thelist.insertFirst(10);
        thelist.insertFirst(15);
        thelist.insertFirst(20);
        thelist.insertFirst(25);
        thelist.insertFirst(30);
        
        thelist.displayLinkList();
        
        System.out.println("After delet first");
        
        thelist.deleteFirst();
        
        thelist.displayLinkList();
        
        System.out.println("After insert last");
        
        thelist.insertLast(50);
        thelist.insertLast(60);
        
        thelist.displayLinkList();
    }
}
