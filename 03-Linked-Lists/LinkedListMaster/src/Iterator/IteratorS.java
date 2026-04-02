package Iterator;

class Link{
    int data;
    Link next;
    
    
    public Link(int data){
        this.data = data;
        
        this.next = null;
    }
    
    public void displayLink(){
        System.out.print(data+" ");
    }
}

class LinkList {
    private Link head;
    
    public LinkList(){
        head = null;
    }
    
    public Link getFirst(){
        return head;
    }
    
    public void setFirst(Link first){
        head = first;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void insertFirst(int id ){
        Link newLink = new Link(id);
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
    
    public ListIterator getIterator(){
        return new ListIterator(this);
    }
}

class ListIterator{
    private Link current;
    private Link previous;
    private LinkList ourList;
    
    public ListIterator(LinkList list){
        this.ourList = list;
        reset();
    }
    
    public void reset(){
        current = ourList.getFirst();
        previous = null;
    }
    
    public boolean atEnd(){
        return (current.next == null);
    }
    
    public void nextLink(){
        previous = current;
        current = current.next;
    }
    
    public Link getCurrent(){
        return current;
    }
    
    public void insertAfter(int data){
        Link newLink = new Link(data);
        
        if(ourList.isEmpty()){
            ourList.setFirst(newLink);
            current = newLink;
        }
        else{
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }
    
    public int deleteCurrent(){
        int value = current.data;
        
        if(previous == null){
            ourList.setFirst(current.next);
            reset();
        }
        else{
            previous.next = current.next;
            if(atEnd()){
                reset();
            }
            else{
                current = current.next;
            }
        }
        return value;
    }
}

public class IteratorS {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        ListIterator iter = list.getIterator();
        
        iter.insertAfter(20);
        iter.insertAfter(40);
        iter.insertAfter(80);
        
        iter.reset();
        iter.nextLink();
        iter.deleteCurrent();
        
        list.displayLinkList();
        
        iter.insertAfter(90);
        
        list.displayLinkList();
    }
}
