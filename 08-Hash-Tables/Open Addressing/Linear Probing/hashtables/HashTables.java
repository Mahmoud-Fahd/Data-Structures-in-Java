package hashtables;

public class HashTables {

    public static void main(String[] args) {
        HashTable hash1 = new HashTable(10);
        
        hash1.insert(new DataItem(15));
        hash1.insert(new DataItem(25));
        hash1.insert(new DataItem(17));
        hash1.insert(new DataItem(27));
        
        hash1.insert(new DataItem(19));
        hash1.insert(new DataItem(29));
        
        hash1.displayTable();
        
        System.out.println("--------------------------");
        
        DataItem found = hash1.find(18);
        if(found != null){
            System.out.println(18 +" founded");
        }
        else{
            System.out.println(18 +" not founded");
        }
        
        System.out.println("--------------------------");
        
        hash1.delete(19);
        System.out.println("After deleting");
        hash1.displayTable();
        
        System.out.println("--------------------------");
        
        DataItem found2 = hash1.find(29);
        if(found2 != null){
            System.out.println(29 +" founded");
        }
        else{
            System.out.println(29 +" not founded");
        }
    }
    
}
