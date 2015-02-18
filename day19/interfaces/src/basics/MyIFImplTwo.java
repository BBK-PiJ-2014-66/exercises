package basics;

/**
 * Implement MyIF
 * 
 * @author PiJ sheet "Interfaces revisited (Java 8)" page 3
 *
 */
public class MyIFImplTwo implements MyIF {

	// define both getNumber() and getString
	@Override
	public int getNumber() {
		return 123;
	}

	@Override
	public String getString() {
		return "This is another string";
	}
	
}
