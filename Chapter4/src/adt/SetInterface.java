/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;
import java.util.Iterator;
/**
 *
 * @author TARUC
 */
public interface SetInterface<T> {
 
    boolean add(SetInterface newELement);
    boolean remove(SetInterface anElement);
    boolean checkSubnet(SetInterface anotherSet);
    void union(SetInterface anotherSet);
    SetInterface interaction(SetInterface anotherSet);
    boolean isEmpty();
        
}
