package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Unit Tests of UserImpl
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
		assertEquals(".getName() should return supplied Name", origName, getName);
	}

	@Test
	public void testID() {
		User testUser = new UserImpl("Test User");
		int testLibraryID = 12345;
		testUser.setLibraryID(testLibraryID);
		int getID = testUser.getLibraryID();
		assertEquals(".getLibraryID() should return supplied ID", testLibraryID, getID);
	}

}
