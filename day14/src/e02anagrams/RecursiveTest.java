package e02anagrams;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

/**
 * PiJ day 14 Recusion II
 * 
 * 2 Anagrams
 * 
 * Tests for recursive version.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 */
public class RecursiveTest {

	/**
	 * Wrapper for function
	 */
	public List<String> anagramWrapper(String string) {
		return Recursive.allNonRealAnagrams(string);
	}

	/**
	 * test a single letter input "A"
	 */
	@Test
	public void testSingleLetterA() {
		String input = "A";
		String[] expect = { input };
		List<String> getList = anagramWrapper(input);
		assertNotNull("got null list for input string '"+ input+"'", getList);
		// convert to list using method from
		// http://stackoverflow.com/questions/4042434/convert-arraylist-containing-strings-to-an-array-of-strings-in-java
		String[] getArray = getList.toArray(new String[getList.size()]);
		assertArrayEquals("input string '"+ input+"'", expect, getArray);
	}

	/**
	 * test "AB"
	 */
	@Test
	public void testAB() {
		String input = "AB";
		String[] expect = { input, "BA" };
		List<String> getList = anagramWrapper(input);
		assertNotNull("got null list for input string '"+ input+"'", getList);
		// convert to list using method from
		// http://stackoverflow.com/questions/4042434/convert-arraylist-containing-strings-to-an-array-of-strings-in-java
		String[] getArray = getList.toArray(new String[getList.size()]);
		assertArrayEquals("input string '"+ input+"'", expect, getArray);
	}
	
	/**
	 * test "ABC"
	 */
	@Test
	public void testABC() {
		String input = "ABC";
		String[] expect = { input, "ACB", "BAC", "BCA", "CAB", "CBA" };
		List<String> getList = anagramWrapper(input);
		assertNotNull("got null list for input string '"+ input+"'", getList);
		// convert to list using method from
		// http://stackoverflow.com/questions/4042434/convert-arraylist-containing-strings-to-an-array-of-strings-in-java
		String[] getArray = getList.toArray(new String[getList.size()]);
		assertArrayEquals("input string '"+ input+"'", expect, getArray);
	}
	

}
