/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author yongj
 */
import java.io.Serializable;

public class ArrayList<T> implements ListInterface<T>, Serializable {

  private T[] array;
  private int numberOfEntries;
  private static final int DEFAULT_CAPACITY = 5;

  public ArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public ArrayList(int initialCapacity) {
    numberOfEntries = 0;
    array = (T[]) new Object[initialCapacity];//declare an array without data type
  }

  @Override
  public void add(T newEntry) {
      if(isFull())
          increaseArray();
    array[numberOfEntries] = newEntry;
    numberOfEntries++;
  }
  

  @Override
  public T remove(int givenPosition) {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      result = array[givenPosition - 1];

      if (givenPosition < numberOfEntries) {
        removeGap(givenPosition);
      }

      numberOfEntries--;
    }

    return result;
  }
  
//  @Override
//  public void clear() {
//    numberOfEntries = 0;
//  }

  @Override
  public boolean replace(int givenPosition, T newEntry) {
    boolean isSuccessful = true;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      array[givenPosition - 1] = newEntry;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }
  
  @Override
  public T getEntry(T obj) {
    T result = null;
    int i=0;
    for(i=0;i<numberOfEntries;i++){
        if(array[i].equals(obj)){
            result = array[i];
            break;
        }
    }

    return result;
  }
  
  @Override
  public T getEntry(int givenPosition) {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
      result = array[givenPosition - 1];
    }

    return result;
  }

//  @Override
//  public boolean contains(T anEntry) {
//    boolean found = false;
//    for (int index = 0; !found && (index < numberOfEntries); index++) {
//      if (anEntry.equals(array[index])) {
//        found = true;
//      }
//    }
//    return found;
//  }

  @Override
  public int getNumberOfEntries() {
    return numberOfEntries;
  }

  @Override
  public boolean isEmpty() {
    return numberOfEntries == 0;
  }

  @Override
  public boolean isFull() {
    return numberOfEntries == array.length;
  }

  @Override
  public String toString() {
    String outputStr = "";
    for (int index = 0; index < numberOfEntries; ++index) {
      outputStr += array[index];
    }
    outputStr += "\n";
    return outputStr;
  }

  /**
   * Task: Makes room for a new entry at newPosition. Precondition: 1 <=
   * newPosition <= numberOfEntries + 1; numberOfEntries is array's
 numberOfEntries before addition.
   */
  private void makeRoom(int newPosition) {
    int newIndex = newPosition - 1; //get the index for new position
    int lastIndex = numberOfEntries - 1;

    // move each entry to next higher index, starting at end of
    // array and continuing until the entry at newIndex is moved
    for (int index = lastIndex; index >= newIndex; index--) {//moving from last index
      array[index + 1] = array[index];
    }
  }

  /**
   * Task: Shifts entries that are beyond the entry to be removed to the next
   * lower position. Precondition: array is not empty; 1 <= givenPosition <
 numberOfEntries; numberOfEntries is array's numberOfEntries before removal.
   */
  private void removeGap(int givenPosition) {
    // move each entry to next lower position starting at entry after the
    // one removed and continuing until end of array
    int removedIndex = givenPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      array[index] = array[index + 1];
    }
  }
  
  //Utility method
  private void increaseArray(){
      //step 1: copy current array into temp array
      T[] temp = array;
      
      //step 2: assign new memory space to current array
      array = (T[]) new Object[array.length*2];
      
      //step 3: copy from temp to current array
      for(int idx = 0; idx < temp.length ; idx++){
          array[idx] = temp[idx];
      }
  }
}