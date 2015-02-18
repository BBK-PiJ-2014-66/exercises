package basics;

/**
 * Implement MyIF
 * 
 * @author PiJ sheet "Interfaces revisited (Java 8)" page 3
 *
 */
public class MyIFImpl implements MyIF {

	// Only getNumber() defined by MyIF needs to be implemented.
	// getString can be allowed to default;
	@Override
	public int getNumber() {
		return 100;
	}

}
