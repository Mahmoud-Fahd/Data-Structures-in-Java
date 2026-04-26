package SeparateChaining;

public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;
    
    public HashTable(int size){
        this.arraySize = PrimeUtils.getPrime(size);
        hashArray = new SortedList[arraySize];
        
        // لازم كل اندكس في المصفوفة بتعمل فيه نود عشان نعرف نعمل سلاسل منفصلة 
        for(int i = 0 ; i < arraySize ; i++){
            hashArray[i] = new SortedList();
        }
    }
    
    // Hash Func 
    public int hashFunc(int key){
        return key % arraySize;
    }
    
    // Insert Link
    public void insert(Link theLink){
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        
        hashArray[hashVal].insert(theLink);
    }
    
    // Delete Key
    public void delete(int key){
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }
    
    // Find key
    public Link find(int key){
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
    
    // Display
    public void display(){
        System.out.println("Table Size: " + arraySize);
        for(int i = 0 ; i < arraySize ; i++){
            System.out.print("Index " + i + ": ");
            hashArray[i].display();
        }
    }
}
