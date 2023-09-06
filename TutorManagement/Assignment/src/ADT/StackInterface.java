
package ADT;

/**
 *
 * @author Tongkitming
 */

public interface StackInterface<T> {
    
    public void push(T newEntry);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public void clear();
    public int getNumOfEntry();
    
} 


