package StringStack;
/**
 * 
 * JUnit tests for PointerStringStack Implementation of StringStack for PiJ
 * Exercises day 12, 4.1 Stack
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class PointerStringStackTest extends StringStackTest {

	/**
	 * initialize is called before each test is run
	 * just initialize the StringStack testStack as an PointerStringStack
	 * All the tests are then run by the parent class 
	 */
	public void initialize() {
		testStack = new PointerStringStack();
	}


}
