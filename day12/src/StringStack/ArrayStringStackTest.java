package StringStack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;

/**
 * 
 * JUnit tests for ArrayStringStack Implementation of StringStack
 * for PiJ Exercises day 12, 4.1 Stack
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class ArrayStringStackTest {

	private StringStack testStack;

	@Before
	public void initialize() {
		testStack = new ArrayStringStack();
	}

	@Test
	public void testEmptyStackIsEmpty(){
		String descript = "Empty stack must return .isEmpty() true";
		assertTrue(descript, testStack.isEmpty());
	}
	

	@Test
	public void testFilledStackIsNotEmpty(){
		String descript = "Stack with one element must return .isEmpty() false";
		testStack.push(""); // push null string to be sneeky
		assertFalse(descript, testStack.isEmpty());
	}
	
	@Test
	public void testSinglePushThenPop() {
		String in = "in1";
		testStack.push(in);
		in = ""; // clear the original string 
		String back = testStack.pop();
		String descript = "push then pop should get back original string!";
		assertEquals(descript, "in1", back);
		descript = "push then pop should empty the stack so .isEmpty() returns true";
		assertTrue(descript, testStack.isEmpty());
	}
	
	@Test
	public void testEmptyStackPopAndPeek(){
		String descript = "Pop from Empty stack must return null";
		assertNull(descript, testStack.pop());
		descript = "peek on Empty stack must return null";
		assertNull(descript, testStack.peek());
	}

}
