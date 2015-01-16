package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit Tests of LibraryImpl
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class LibraryImplTest {

	private static String TESTNAME = "Test Library Name";
	Library testLibrary;

	/**
	 * initialize testLibrary with a specific implementation in initial version
	 * use MockLibrary to develop against rather LibraryImpl
	 */
	@Before
	public void initialize() {
		testLibrary = new LibraryImpl(TESTNAME);
		//testLibrary = new MockLibrary(TESTNAME);
	}

	/**
	 * test that we get back the library name set in .initialize() method.
	 */
	@Test
	public void testGetBackConstructorName() {
		assertEquals("get back initial library name", TESTNAME,
				testLibrary.getLibrary());
	}

	/**
	 * The interface comment says default number of books should be 3 so test
	 * this
	 */
	@Test
	public void testExpectDefaultMaxBooksPerUserEquals3() {
		assertEquals("Default maxBooksPerUser should be three.", 3,
				testLibrary.getMaxBooksPerUser());
	}

	/**
	 * Use setMaxBooksPerUser and check that the number is recorded.
	 */
	@Test
	public void testSetMaxBooksPerUser() {
		testLibrary.setMaxBooksPerUser(5);
		assertEquals(
				"After .setMaxBooksPerUser(5) then .getMaxBooksPerUser() must return same value",
				5, testLibrary.getMaxBooksPerUser());
	}
	
	
	/**
	 * 
	 */
	@Test
	public void testgetID() {
		String descript;
		// libraryID must be unique
		int ida = testLibrary.getID("a");
		int idb = testLibrary.getID("b");
		// there is not assertNotEquals in the JUnit I am using!
		descript = "Library ids must be unique but I get getID(\"a\") same as getID(\"b\") = " + ida;
		assertTrue(descript,ida!=idb);
		int idc = testLibrary.getID("c");
		descript = "Library ids must be unique but I get getID(\"a\") same as getID(\"c\") = " + idc;
		assertTrue(descript,ida!=idc);
		
		// "Any subsequent calls to this method with the same name argument should return the same ID".
		
		assertEquals("2nd call to getID(\"b\") failed to get same value", idb,testLibrary.getID("b") );
		
		
		
	}

}
