package DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;
    
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListMD {
    Node head;
    
    public DoublyLinkedListMD(){
        this.head = null;
    }
    
    // isEmpty: to check is empty or not
    public boolean isEmpty(){
        return (head == null);
    }
    
    // append : add element at the end 
    public void append(int data){
        Node newNode = new Node(data);
        
        if(isEmpty()){
            head = newNode;
            return;
        }
        
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    
    // Traverse the list forward
    public void traverseForward(){
        Node current = head;
        
        if(isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Traverse the list backward
    public void traverseBackward(){
        Node current = head;
        
        if(isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        // Go to the last Node
        while(current.next != null){
            current = current.next;
        }
        // Traverse backward
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    
    // Insert at specific position 
    public void insertAtPosition(int position , int data){
        Node newNode = new Node(data);
        
        if(position == 0){  // insert at head
            if(!isEmpty()){
                head.prev = newNode;
            }
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        int indx = 0; // counter
        
        while(current != null && indx < position - 1){
            current = current.next;
            indx++;
        }
        // check
        if(current == null){
            System.out.println("Position out of bounds");
            return;
        }
        
        newNode.next = current.next;
        newNode.prev = current;
        if(current.next != null){
            current.next.prev = newNode;
        }
        current.next = newNode;
    }
    
    // delete node 
    public void delete(int data){
        if(isEmpty()){
            System.out.println("The list is empty");
            return;
        }
        
        Node current = head;
        // when the node is the first
        if(current.data == data){
            if(current.next == null){
                head = null;
            }
            else{
                head = current.next;
                head.prev = null;
            }
            return;
        }
        
        // when node isn't first
        while(current != null){
            if(current.data == data){
                current.prev.next = current.next;
                if(current.next != null){
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        
        // when the value is not found
        System.out.println("Value "+ data + " not found.");
    }
}

class mainApp{
    public static void main(String[] args) {
        DoublyLinkedListMD list1 = new DoublyLinkedListMD();
        
        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.append(40);
        
        System.out.println("Doubly linked list 1:");
        list1.traverseForward();
        list1.traverseBackward();
        
        System.out.println("-------------");
        
        list1.insertAtPosition(0, 5);
        list1.insertAtPosition(3, 25);
        
        list1.traverseForward();
        
        System.out.println("-------------");
         
        list1.delete(20);
        list1.traverseForward();
        list1.delete(75);
    }
}
