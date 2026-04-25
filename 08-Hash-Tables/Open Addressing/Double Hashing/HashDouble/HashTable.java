package HashDouble;

public class HashTable {
    private DataItem[] hashArray; // hash table
    private int arraySize;
    private DataItem nonItem; // Deleted Item
    
    public HashTable(int size){
        this.arraySize = PrimeUtils.getPrime(size);
        this.hashArray = new DataItem[arraySize];
        this.nonItem = new DataItem(-1);
    }
    
    // Hash Function2 (module)
    public int hashFunc1(int key){
        return key % arraySize;
    }
    
    // Hash Function2 = constant - (key % constant)
    public int hashFunc2(int key){
        return 5 - (key % 5);
    }
    
    // Method to display HashTable
    public void displayTable(){
        System.out.println("Table Size: " + arraySize);
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
        int hashVal = hashFunc1(key);
        int stepSize = hashFunc2(key);
        
        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
            hashVal += stepSize; // double hashing
            hashVal %= arraySize; // update index
        }
        
        hashArray[hashVal] = item; 
    }
    
    // Method to find key
    public DataItem find(int key){
        int hashval = hashFunc1(key);
        int stepSize = hashFunc2(key);
        
        while(hashArray[hashval] != null){
            if(hashArray[hashval].getKey() == key){
                return hashArray[hashval]; // found it
            }
            
            hashval += stepSize; // double hashing
            hashval %= arraySize; // wrap around
        }
        
        return null; // key not found
    }
    
    // Method to delete DataItem from hashTable
    public DataItem delete(int key){
        int hashval = hashFunc1(key);
        int stepSize = hashFunc2(key);
        
        while(hashArray[hashval] != null){
            if(hashArray[hashval].getKey() == key){
                DataItem removed = hashArray[hashval];
                hashArray[hashval] = nonItem;
                return removed;
            }
            
            hashval += stepSize; // double hashing
            hashval %= arraySize; // wraped around
        }
        
        return null; // key not found
    }
}
