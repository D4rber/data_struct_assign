package ADT;

import java.util.function.Predicate;

/**
 *
 * @author Tongkitming
 */
public interface ListInterface<T> {
    
    boolean isEmpty();
    void clear();
    boolean add(T newEntry);
    boolean add(int newPosition, T newEntry);
    T remove(int givenPosition);
    T find(String tutorName);
    void listAll();
    void filter(String criteria);
    int getNumberOfEntries();
    public boolean contains(T anEntry);
    public boolean isFull();
    public boolean replace(int givenPosition, T newEntry);
    public T getEntry(int givenPosition);
    public T find(Predicate<T> predicate);
    public void filter(Predicate<T> predicate);
    
}

