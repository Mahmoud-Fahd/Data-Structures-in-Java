package SLinkedList;

class Link{
    public int iData;
    public double dData;
    public Link next;
    
    public Link(int id ,double dd){
        this.iData = id;
        this.dData = dd;
        next = null;
    }
    
    public void displayLink(){
        System.out.print(" "+iData+", "+dData+" ");
    }
}

class LinkList{
    private Link head;
    
    public LinkList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void insertFirst(int id , double dd){
        Link newLink = new Link(id,dd);
        newLink.next = head;
        head = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = head;
        head = head.next;
        return temp;
    }
    
    public void displayLinkList(){
        Link current = head;
        while (current != null){
            current.displayLink();
            System.out.print("->");
            current = current.next;
        }
        System.out.println(" ");
    }
    
    public Link find(int key){
        Link current = head;
        while (current.iData != key){
            if(current.next == null){
                return null;
            }
            else {
                current = current.next;
            }
        }
        return current;
    }
    
    public Link deleteAtPosition(int key){
        Link current = head;
        Link previous = head;
        
        if(isEmpty()) return null;
        
        while(current.iData != key){
            if(current.next == null){
                return null;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        if(current == head){
            head = head.next;
        }
        else{
            previous.next = current.next;
        }
        
        return current;
    }
}

public class SLinkedList {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        
        list1.insertFirst(5, 2.5);
        list1.insertFirst(10, 3.5);
        list1.insertFirst(15, 4.5);
        list1.insertFirst(20, 5.5);
        list1.insertFirst(25, 6.5);
        
        System.out.println("Before deleting ");
        
        list1.displayLinkList();
        
        list1.deleteFirst();
        list1.deleteFirst();
        
        System.out.println("After deleting");
        
        list1.displayLinkList();
        
        System.out.println("Founded: "+list1.find(5).iData);
        
        System.out.println(list1.deleteAtPosition(15));
        System.out.println("Linked list after deleting 15");
        
        list1.displayLinkList();
    }
}
