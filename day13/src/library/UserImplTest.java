package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Unit Tests of UserImpl
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class UserImplTest {

	@Test
	public void testName() {
		String origName = "Joan Smith";
		User testUser = new UserImpl(origName);
		String getName = testUser.getUserName();
		assertNotNull(".getName() should not return null", getName);
		assertEquals(".getName() should return supplied Name", origName,
				getName);
	}

	@Test
	public void testID() {
		User testUser = new UserImpl("Test User");
		int testLibraryID = 12345;
		testUser.setLibraryID(testLibraryID);
		int getID = testUser.getLibraryID();
		assertEquals(".getLibraryID() should return supplied ID",
				testLibraryID, getID);
	}

	/**
	 * register the user with a mock library
	 */
	@Test
	public void testRegisterWithMockLibrary() {
		Library mockLibrary = new MockLibrary();
		User testUser = new UserImpl("Test User");
		testUser.register(mockLibrary);
		String getLibraryName = testUser.getLibrary();
		assertNotNull(".getLibrary() should not be null after .register()",
				getLibraryName);
		int getID = testUser.getLibraryID();
		assertEquals("Mock library should have assigned library id 13", 13,
				getID);
	}

}
