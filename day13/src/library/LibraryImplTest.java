package library;

import static org.junit.Assert.*;
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
	 * Initial version use MockLibrary to develop against rather LibraryImpl
	 */
	@Before
	public void initialize() {
		testLibrary = new MockLibrary(TESTNAME);
	}

	@Test
	public void testGetBackConstructorName() {
		assertEquals("get back initial library name", TESTNAME, testLibrary.getLibrary());
	}


}
