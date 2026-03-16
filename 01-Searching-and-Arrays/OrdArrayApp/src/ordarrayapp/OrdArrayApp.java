package ordarrayapp;

public class OrdArrayApp {

    public static void main(String[] args) {
        
        OrdArray oa = new OrdArray(5);
        
        oa.insert(5);
        oa.insert(4);
        oa.insert(3);
        oa.insert(2);
        oa.insert(1);
        
        oa.display();
        
        int v = oa.find(3);
        System.out.println(v);
        
        oa.delete(4);
        oa.delete(3);
        
        oa.display();
        
    }
    
}
