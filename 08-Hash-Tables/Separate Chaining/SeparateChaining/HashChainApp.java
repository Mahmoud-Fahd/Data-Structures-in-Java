package SeparateChaining;

public class HashChainApp {
    public static void main(String[] args) {
        HashTable hash = new HashTable(10);
        
        hash.insert(new Link(33));
        hash.insert(new Link(22));
        hash.insert(new Link(11));
        
        hash.insert(new Link(14));
        hash.insert(new Link(28));
        hash.insert(new Link(13));
        hash.insert(new Link(4));
        
        System.out.println("--- After insertion ---");
        hash.display();
        
        System.out.println("--- Searching ---");
        Link found = hash.find(33);
        if(found != null){
            System.out.println(found.iData + " Key founded");
        }
        else{
            System.out.println("Key not founded");
        }
        
        System.out.println("--- Deletion ---");
        hash.delete(22);
        hash.display();
        
    }
}
