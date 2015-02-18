package basics;

/**
 * 
 * @author PiJ sheet "Interfaces revisited (Java 8)" page 2
 *
 */
public interface MyIF {
	// This is a normal interface method declaration.
	// It does not define a default implementation.
	int getNumber();
	
	// This is a default method (Java 8)
	default String getString() {
		return "Default String";
	}
	
	// Static method on page 7
	static int getDefaultNumber() {
		return 345;
	}
}
