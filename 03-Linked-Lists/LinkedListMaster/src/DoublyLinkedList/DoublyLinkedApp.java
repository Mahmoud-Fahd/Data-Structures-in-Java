package DoublyLinkedList;

public class DoublyLinkedApp {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        
        theList.displayforward();
        theList.dispalayBackward();
        
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteakey(11);
        
        theList.displayforward();
        
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        
        theList.displayforward();
    }
}
