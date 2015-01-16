package library2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;
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

	@Test
	public void testRecordingBookBorrowed() {
		User testUser = new UserImpl("Test User");
		testUser.recordBookBorrowed(new BookImpl("Karl Marx", "Das Kapital"));
		testUser.recordBookBorrowed(new BookImpl("Lewis Carroll",
				"Alice in Wonderland"));
		assertEquals(
				"Borrowed two books so .getNumberBooksBorrowed() should be two",
				2, testUser.getNumberBooksBorrowed());
		String[] expectTitles = { "Das Kapital", "Alice in Wonderland" };
		String[] getTitles = testUser.getTitlesBooksBorrowed();
		assertNotNull("borrowed two books should no get null titles array",getTitles);
		assertArrayEquals("get titles of two books borrowed", expectTitles,
				getTitles);
	}
}
