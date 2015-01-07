package StringStack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;

/**
 * 
 * JUnit tests for ArrayStringStack Implementation of StringStack for PiJ
 * Exercises day 12, 4.1 Stack
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
	public void testEmptyStackIsEmpty() {
		String descript = "Empty stack must return .isEmpty() true";
		assertTrue(descript, testStack.isEmpty());
	}

	@Test
	public void testFilledStackIsNotEmpty() {
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
		String descript = "push then pop should not return null!";
		assertNotNull(descript, back);
		descript = "push then pop should get back original string!";
		assertEquals(descript, "in1", back);
		descript = "push then pop should empty the stack so .isEmpty() should be true";
		assertTrue(descript, testStack.isEmpty());
	}

	@Test
	public void testMultiplePushThenPop() {
		// idea is to push 100 strings 1, 2... 100
		int nTest = 100;
		String descript;
		for (int sc = 0; sc < nTest; sc++) {
			testStack.push("test " + (sc+1));
		}
		// now get them back
		for (int sc = 0; sc < nTest; sc++) {
			String back = testStack.pop();
			descript = "have put in "
					+ nTest
					+ " strings but get problem pop gets null back on pop number "
					+ (sc + 1);
			assertNotNull(descript, back);
			// N.B. get back strings in reversed order.
			String expect = "test " + (nTest-sc);
			descript = "have put in " + nTest
					+ " strings but problem on pop number " + (sc + 1);
			assertEquals(descript, expect, back);
		}
		descript = "push then pop should empty the stack so .isEmpty() should be true";
		assertTrue(descript, testStack.isEmpty());
	}

	@Test
	public void testEmptyStackPopAndPeek() {
		String descript = "Pop from Empty stack must return null";
		assertNull(descript, testStack.pop());
		descript = "peek on Empty stack must return null";
		assertNull(descript, testStack.peek());
	}

}
