

import java.util.ArrayList;

/**
 * An ArrayList implementation of the CS10Stack interface.

 */

public class ArrayListStack<T> implements CS10Stack<T> {

	private ArrayList<T> stack;    // Holds the stack
	
	/**
	 *  Construct an empty stack
	 */
	public ArrayListStack() {
		stack = new ArrayList<T>();
	}
	
	/**
	 * <p>{@inheritDoc}
	 */
	public boolean isEmpty() {
		return stack.size() == 0;
	}
  
	/**
	 * <p>{@inheritDoc}
	 */
	public T peek() {
		if (isEmpty())
		  return null;
		else
		  return stack.get(stack.size()-1);
	}

	/**
	 * <p>{@inheritDoc}
	 */
	public T pop() {
		if (isEmpty())
		  return null;
		else
		  return stack.remove(stack.size()-1);
	}

	/**
	 * <p>{@inheritDoc}
	 */
	public void push(T element) {
		stack.add(element);
	}
	
	/**
	 * Test program
	 */
//  public static void main (String [] args)  {
//  	ArrayListStack<String> stack = new ArrayListStack<String>();
//  	stack.push("cat");
//  	stack.push("dog");
//  	stack.push("bee");
//  	System.out.println("Top is: " + stack.peek());
//  	System.out.println("Top again: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Is it empty? : " + stack.isEmpty());
//  	stack.push("eagle");
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Is it empty? : " + stack.isEmpty());
//  	System.out.println("peek of empty stack: " + stack.peek());
//  	System.out.println("pop of empty stack: " + stack.pop());
//  	stack.push("bear");
//  	System.out.println("top is: " + stack.peek());
//  	System.out.println("top again: " + stack.pop());
//  	stack.push("cat");
//  	stack.push("dog");
//  	stack.push("sheep");
//  	stack.push("cow");
//  	stack.push("eagle");
//  	stack.push("bee");
//  	stack.push("lion");
//  	stack.push("tiger");
//  	stack.push("zebra");
//  	stack.push("ant");
//  	System.out.println("Bigger example:");
//  	System.out.println("top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  	System.out.println("Next top is: " + stack.pop());
//  }

}
