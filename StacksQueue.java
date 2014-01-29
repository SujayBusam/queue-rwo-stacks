
/**
 * Implementation of a queue using two stacks
 * For CS-10 SA-6
 * 10/8/13
 *
 * @author Sujay Busam
 * 
 * @see CS10Queue
 */
public class StacksQueue<T> implements CS10Queue<T> {

	//Hold the queue in two stacks
	private ArrayListStack<T> inStack;
	private ArrayListStack<T> outStack; 

	/**
	 *  Creates an empty queue
	 */
	public StacksQueue()  {
		inStack = new ArrayListStack<T>();
		outStack = new ArrayListStack<T>();
	}

	/**
	 * Add item to rear of queue
	 * @param item item to be enqueued
	 */
	public void enqueue(T item) {
		inStack.push(item);
	}

	/**
	 * Remove item from front of queue
	 * @return the item removed from the front of the queue
	 */
	public T dequeue() {
		if (isEmpty())
			return null;
		else
		{
			// If the outStack contains items, remove from there
			if (!outStack.isEmpty()) {
				return outStack.pop();
			}

			else {
				// Otherwise, pop each item from inStack, push to outStack, and pop the top element
				// from outStack
				while (!inStack.isEmpty()) {
					outStack.push(inStack.pop());
				}
				return outStack.pop();
			}
		}
	}

	/**
	 * Return the item at the front of queue, but do not remove it
	 * @return the item at the front of the queue
	 */
	public T front() {
		if (isEmpty())
			return null;
		else
		{
			// If outStack contains items, front of queue is last element in outStack
			if (!outStack.isEmpty()) {
				return outStack.peek();
			}

			// Otherwise, move items to outStack and get last item
			else {
				while (!inStack.isEmpty()) {
					outStack.push(inStack.pop());
				}
				return outStack.peek();
			}
		}
	}

	/**
	 * Is the queue empty?
	 * @return true if queue is empty
	 */
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}

	/**
	 * A testing program
	 */
	public static void main (String [] args)  {

		CS10Queue<String> q = new StacksQueue<String>();
		System.out.println("Is it empty? : " + q.isEmpty());
		q.enqueue("cat");
		q.enqueue("dog");
		q.enqueue("bee");
		System.out.println("Is it empty? : " + q.isEmpty());
		System.out.println("Front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Is it empty? : " + q.isEmpty());
		q.enqueue("eagle");
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Is it empty? : " + q.isEmpty());
		System.out.println("dequeue of empty stack: " + q.dequeue());

		q.enqueue("bear");
		q.enqueue("beaver");
		System.out.println("front is: " + q.dequeue());
		q.enqueue("cat");
		q.enqueue("dog");
		q.enqueue("sheep");
		q.enqueue("cow");
		q.enqueue("eagle");
		q.enqueue("bee");
		q.enqueue("lion");
		q.enqueue("tiger");
		q.enqueue("zebra");
		q.enqueue("ant");

		System.out.println("Bigger example:");
		System.out.println("front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Next front is: " + q.dequeue());
		System.out.println("Is it empty? : " + q.isEmpty());
		System.out.println("Next front is: " + q.dequeue());
	}
}
