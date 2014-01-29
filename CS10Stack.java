


/**
 * An interface for a Stack ADT. 
 *
 * The "CS10" is to avoid conflicting with the Stack class 
 * in the Java library.
 * 
 */
public interface CS10Stack<T> {
	
	/**
	 * Add an element onto the top of the stack
	 * @param element element to be pushed onto the stack
   */
  public void push(T element);
	
	/**
	 * Remove and return the top element
	 * @return an element from the top of the stack.
	 *  		Returns null if stack empty
	 */
  public T pop();
  
	/**
	 * Look at the top element without removing it
	 * @return the element on the top of the stack without changing it.
	 *   Returns null if stack empty
	 */
  public T peek();
  
	/**
	 * Is the stack empty?
	 * @return true iff stack is empty
	 */
  public boolean isEmpty();
}
