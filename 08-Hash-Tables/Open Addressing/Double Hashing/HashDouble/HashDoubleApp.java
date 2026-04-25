package HashDouble;

public class HashDoubleApp {
    public static void main(String[] args) {
        HashTable hash1 = new HashTable(10);
        
        hash1.insert(new DataItem(15));
        hash1.insert(new DataItem(25));
        hash1.insert(new DataItem(12));
        hash1.insert(new DataItem(22));
        hash1.insert(new DataItem(8));
        hash1.insert(new DataItem(4));
        hash1.insert(new DataItem(14));
        
        hash1.displayTable();
        
        System.out.println("--------------------");
        
        DataItem found = hash1.find(22);
        if(found != null){
            System.out.println(found.getKey() + " is founded");
        }
        else{
            System.out.println("is not founded");
        }
        
        DataItem found2 = hash1.find(10);
        if(found2 != null){
            System.out.println(found2.getKey() + " is founded");
        }
        else{
            System.out.println("is not founded");
        }
        
        System.out.println("--------------------");
        
        hash1.delete(15);
        hash1.delete(8);
        
        System.out.println("After deleting");
        
        hash1.displayTable();
    }
}
