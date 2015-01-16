package library2;

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
	 * Test registering a single user 
	 */
	@Test
	public void testRegisterAUser() {
		User testUser = new UserImpl("Joe Bloggs");
		int ireg = testLibrary.register(testUser);
		assertTrue(".register() had problem registering it first user and returned -1", ireg != -1);
		
		// but should not be able register the user a second time because names must be unique
		ireg = testLibrary.register(testUser);
		assertEquals("2nd registration of same user failed to return -1", -1, ireg);
	}
	
	/**
	 * add a few books to the library.
	 */
	@Test
	public void testAddBookGetBookCount() {
		testLibrary.addBook("War and Peace", "Leo Tolstoy");		
		testLibrary.addBook("War and Peace", "Leo Tolstoy"); // two copies bought
		testLibrary.addBook("The Catcher in the Rye", "J.D Salinger");
		assertEquals("have added 3 books", 3, testLibrary.getBookCount());
	}
}
