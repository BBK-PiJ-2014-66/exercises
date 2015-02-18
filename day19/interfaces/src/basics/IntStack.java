package basics;

/**
 * 
 * Example of how to a method to an existing interface so as not to break
 * existing code
 * 
 * @author PiJ sheet "Interfaces revisited (Java 8)" page 4
 *
 */
public interface IntStack {
	void push(int item); // store an item

	int pop(); // retrieve an item

	// Because clear() has a default, it need not be implemented by an existing
	// class that implements IntStack
	default void clear() {
		throw new UnsupportedOperationException("clear() not implemented.");
	}
}
