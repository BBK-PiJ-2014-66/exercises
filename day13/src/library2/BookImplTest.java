package library2;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit Tests of BookImpl
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 *
 */public class BookImplTest {

	@Test
	public void testCreateBookGetBacKAuthorTitle() {
		String origAuthor = "A. N. Author";
        String origTitle = "Title of the book";
		Book testBook = new BookImpl( origAuthor, origTitle );
		String getAuthor = testBook.getAuthor();
		assertNotNull(".getAuthor() should not return null", getAuthor);
		assertEquals(".getAuthor() should return supplied author", origAuthor, getAuthor);
		String getTitle = testBook.getTitle();
		assertNotNull(".getTitle() should not return null", getTitle);
		assertEquals(".getTitle() should return supplied title", origTitle, getTitle);		
	}
}
