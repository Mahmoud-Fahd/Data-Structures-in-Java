package hashtables;

public class HashTable {
    private DataItem[] hashArray; // hash table
    private int arraySize;
    private DataItem nonItem; // Deleted Item
    
    public HashTable(int size){
        this.arraySize = size;
        this.hashArray = new DataItem[arraySize];
        this.nonItem = new DataItem(-1);
    }
    
    // Hash Function (module)
    public int hashFunc(int key){
        return key % arraySize;
    }
    
    // Method to display HashTable
    public void displayTable(){
        System.out.println("Table: ");
        for(int i = 0 ; i < arraySize ; i++){
            if(hashArray[i] != null){
            System.out.println("Index: "+ i + ": "+hashArray[i].getKey()+" ");
            }
            else{
                System.out.println("Index: "+ i + " Empty");
            }
        }
    }
    
    // Mehtod to insert dataItem by linear probing 
    public void insert(DataItem item){
        int key = item.getKey();
        int hashVal = hashFunc(key);
        
        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
            ++hashVal; // linear probing
            hashVal %= arraySize; // update index
        }
        
        hashArray[hashVal] = item; 
    }
    
    // Method to find key
    public DataItem find(int key){
        int hashval = hashFunc(key);
        
        while(hashArray[hashval] != null){
            if(hashArray[hashval].getKey() == key){
                return hashArray[hashval]; // found it
            }
            
            ++hashval; // linear probing
            hashval %= arraySize; // wrap around
        }
        
        return null; // key not found
    }
    
    // Method to delete DataItem from hashTable
    public DataItem delete(int key){
        int hashval = hashFunc(key);
        
        while(hashArray[hashval] != null){
            if(hashArray[hashval].getKey() == key){
                DataItem removed = hashArray[hashval];
                hashArray[hashval] = nonItem;
                return removed;
            }
            
            ++hashval; // linear probing
            hashval %= arraySize; // wraped around
        }
        
        return null; // key not found
    }
}
