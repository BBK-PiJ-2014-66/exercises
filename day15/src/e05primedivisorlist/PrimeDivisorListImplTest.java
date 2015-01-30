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
		String expected = "[ 2 * 3^2 * 7 = 126 ]";
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
		testPDL.remove(3);
		expected = "[ 2 * 3 = 6 ]";
		actual = testPDL.toString();
		assertThat(
				"Adding 7,3,2,3 and removing 7 then 3 produces correct .toString()",
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
			assertThat(
					"IllegalArgument exception .remove(13) from list without 13",
					ex.getMessage(), is("list does not contain 13"));
		}

	}

	@Test
	public void testIsPrime() {
		// from http://www.miniwebtool.com/list-of-prime-numbers/?to=100
		int primesTo100[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
				43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		for (int ic = 0; ic < primesTo100.length; ic++) {
			int num = primesTo100[ic];
			assertThat("isPrime(" + num + ") returns true",
					PrimeDivisorListImpl.isPrime(num), is(true));
		}

		// from http://www.mathatube.com/files/Composite_Numbers.pdf
		int compositeTo100[] = { 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21,
				22, 24, 25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42,
				44, 45, 46, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63,
				64, 65, 66, 68, 69, 70, 72, 74, 75, 76, 77, 78, 80, 81, 82, 84,
				85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 98, 99, 100 };
		for (int ic = 0; ic < compositeTo100.length; ic++) {
			int num = compositeTo100[ic];
			assertThat("isPrime(" + num + ") returns false",
					PrimeDivisorListImpl.isPrime(num), is(false));
		}

	}

}
