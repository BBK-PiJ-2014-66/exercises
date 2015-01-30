package e05primedivisorlist;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeDivisorListImplTest {

	PrimeDivisorList testPDL;

	@Before
	public void setUp() {
		testPDL = new PrimeDivisorListImpl();
	}

	@Test
	public void testAddValidPrime() {
		testPDL.addPrime(3);
		String expected = "[ 3 = 3 ]";
		String actual = testPDL.toString();
		assertThat("Adding a single prime 3 produces correct .toString()",
				actual, is(expected));
	}

	@Test
	public void testAddNonPrimeProducesException() {
		try {
			testPDL.addPrime(4);
			fail("Adding 4 as a prime failed to produce an IllegalArgumentException");
		} catch (IllegalArgumentException ex) {
			assertThat("IllegalArgument exception .addPrime(4)",
					ex.getMessage(), is("4 is not a prime number"));
		}
	}

	@Test
	public void testSheetExample() {
		/*
		 * [ 2 * 3^2 * 7 = 126 ]
		 * 
		 * for a list containing one 2, two 3, and one 7.
		 */
		testPDL.addPrime(7);
		testPDL.addPrime(3);
		testPDL.addPrime(2);
		testPDL.addPrime(3);
		String expected = "[ 2 * 3^2 *7 = 126 ]";
		String actual = testPDL.toString();
		assertThat("Adding 7,3,2,3 produces correct .toString()", actual,
				is(expected));
	}

	@Test
	public void testOKRemove() {
		testPDL.addPrime(7);
		testPDL.addPrime(3);
		testPDL.addPrime(2);
		testPDL.addPrime(3);
		testPDL.remove(7);
		String expected = "[ 2 * 3^2 = 18 ]";
		String actual = testPDL.toString();
		assertThat(
				"Adding 7,3,2,3 and removing 7 produces correct .toString()",
				actual, is(expected));
	}
	
	@Test
	public void testBadRemove() {
		testPDL.addPrime(7);
		testPDL.addPrime(3);
		testPDL.addPrime(2);
		testPDL.addPrime(3);
		try {
			testPDL.remove(13);
			fail(".remove(13) from a list that does not contain 13 failed to produce an IllegalArgumentException");
		} catch (IllegalArgumentException ex) {
			assertThat("IllegalArgument exception .remove(13) from list without 13",
					ex.getMessage(), is("list does not contain 13"));
		}

	}

}
