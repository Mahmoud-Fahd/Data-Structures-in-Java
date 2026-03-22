package singlelinkedlist;

// class node:
class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

// class linked list:
class SlinkedList{
    Node Head;
    
    // insert in the first of linked list:
    public void insertFirst(int item){
        Node newNode = new Node(item);
        
        newNode.next = Head;
        Head = newNode;
    }
    
    // insert in the end of linked list:
    public void append(int item){
        Node newNode = new Node(item);
        
        if(Head == null){
            Head = newNode;
        }
        else{
            Node current = Head;
            
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    // insert specific position in linked list:
    public void insertAtPosition(int item, int position){
        Node newNode = new Node (item);
        
        if (position == 0){
            insertFirst(item);
            return;
        }
        
        Node current = Head;
        int index = 0;
        
        while (current != null && index < position - 1){
            current = current.next;
            index++;
        }
        
        if (current == null){
            System.out.println("Position out of bounds!");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        
    }
    
    // display the item of linked list:
    public void traverse(){
        Node current = Head;
        
        while (current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // delete from linked list:
    public void delete(int item){
        if (Head == null){
            return;
        }
        
        if (Head.data == item){
            Head = Head.next;
            return;
        }
        
        Node current = Head;
        while (current.next != null){
            if (current.next.data == item){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    // combine two linked list:
    public void merge(SlinkedList list2){
        if (Head == null){
            Head = list2.Head;
            return;
        }
        
        Node current = Head;
        while (current.next != null){
            current = current.next;
        }
        current.next = list2.Head;
    }
}

// class main:
public class SingleLinkedList {

    public static void main(String[] args) {
        SlinkedList Slist = new SlinkedList();
        
        Slist.append(10);
        Slist.append(20);
        Slist.append(30);
        Slist.traverse();
        
//        Slist.traverse();
//        
//        Slist.insertFirst(5);
//        
//        Slist.traverse();
//        
//        Slist.insertFirst(1);
//        
//        Slist.traverse();

//        Slist.insertAtPosition(5, 0);
//        Slist.traverse();
//        Slist.insertAtPosition(25, 3);
//        Slist.traverse();
//        Slist.insertAtPosition(100, 8);
//        Slist.traverse();
//        
//        Slist.delete(5);
//        Slist.traverse();
//        Slist.delete(25);
//        Slist.traverse();

        SlinkedList l2 = new SlinkedList();
        l2.append(40);
        l2.append(50);
        l2.append(60);
        l2.traverse();
        
        Slist.merge(l2);
        Slist.traverse();
    }
    
}
