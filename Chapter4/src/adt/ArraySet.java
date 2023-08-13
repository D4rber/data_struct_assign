/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;
import java.util.Iterator;
/**
 *
 * @author TARUC
 * @param <T>
 */
public class ArraySet<T> implements SetInterface<T> {
  private T[] SetArray;
  private int numberOfElements;
  private static final int DEFAULT_CAPACITY = 5;

  public ArraySet(){
    this(DEFAULT_CAPACITY);
  }

  public ArraySet(int initialCapacity) {
    numberOfElements = 0;
    SetArray = (T[]) new Object[initialCapacity];
  }
  
    public boolean add(T newElement) {
    
        if(isArrayFull()){
            doubleArray();
        }
      
        SetArray[numberOfElements] = newElement;
        numberOfElements++;
        return true;
    }
    
    public boolean remove(T anElement) {
        //loop
        
       //removeGap(i);
       //decrement elements
       //retur
       //end loop
       
       return false;
    }
    private void removeGap(int index){
        for(int i = index; i <numberOfElements -1; ++i){
            SetArray[i] = SetArray[i+1];
        }
    }
   
    public boolean checkSubnet(T anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void union(T anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public SetInterface interaction(T anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isArrayFull() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void doubleArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Iterator<T> getIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(SetInterface newELement) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remove(SetInterface anElement) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean checkSubnet(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void union(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SetInterface interaction(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}
