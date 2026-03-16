/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lowarrayapp;

/**
 *
 * @author Mahmoud Fahd
 */
public class LowArray {
    
    private long []a;
    
    public LowArray (int size){
        a = new long[size];
    }
    
    public void setElem(int indx , long value){
        a[indx] = value;
    }
    
    public long getElem(int indx){
        return a[indx];
    }
    
    
}
