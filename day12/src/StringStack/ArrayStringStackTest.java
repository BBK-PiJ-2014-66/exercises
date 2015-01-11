package StringStack;
/**
 * 
 * JUnit tests for ArrayStringStack Implementation of StringStack for PiJ
 * Exercises day 12, 4.1 Stack
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class ArrayStringStackTest extends StringStackTest {

	/**
	 * initialize is called before each test is run
	 * just initialize the StringStack testStack as an ArrayStringStack
	 * All the tests are then run by the parent class 
	 */
	public void initialize() {
		testStack = new ArrayStringStack();
	}


}
