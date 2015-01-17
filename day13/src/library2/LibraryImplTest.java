package library2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
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
		// testLibrary = new MockLibrary(TESTNAME);
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
		assertTrue(
				".register() had problem registering it first user and returned -1",
				ireg != -1);

		// but should not be able register the user a second time because names
		// must be unique
		ireg = testLibrary.register(testUser);
		assertEquals("2nd registration of same user failed to return -1", -1,
				ireg);
	}

	/**
	 * test getReaderCount successfully returns the number of readers
	 */
	@Test
	public void testGetReaderCount() {
		assertEquals("initially have zero readers", 0,
				testLibrary.getReaderCount());
		testLibrary.register(new UserImpl("aaa aaa"));
		assertEquals("added one user .getReaderCount() should return 1", 1,
				testLibrary.getReaderCount());
		testLibrary.register(new UserImpl("bbb bbb"));
		assertEquals("added two users .getReaderCount() should return 2", 2,
				testLibrary.getReaderCount());
	}

	/**
	 * add a few books to the library to test GetBookCount
	 */
	@Test
	public void testAddBookGetBookCount() {
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		testLibrary.addBook("Leo Tolstoy", "War and Peace"); // two copies
																// bought
		testLibrary.addBook("J.D Salinger", "The Catcher in the Rye");
		assertEquals("have added 3 books", 3, testLibrary.getBookCount());
	}

	/**
	 * test getBookBorrowedCount - works giving total number of borrowed books
	 */
	@Test
	public void testGetBookBorrowedCount() {
		assertEquals("initially have no books, so total borrowed is zero", 0,
				testLibrary.getBookBorrowedCount());
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		testLibrary.addBook("J.D Salinger", "The Catcher in the Rye");
		assertEquals(
				"have added two books but they are not yet borrowed, so total borrowed is zero",
				0, testLibrary.getBookBorrowedCount());

		User testUserA = new UserImpl("Joe Bloggs");
		testLibrary.register(testUserA);
		testLibrary.borrow("War and Peace", testUserA);
		assertEquals("have added two books, one has been borrowed", 1,
				testLibrary.getBookBorrowedCount());

		User testUserB = new UserImpl("Jane Doe");
		testLibrary.register(testUserB);
		testLibrary.borrow("The Catcher in the Rye", testUserB);
		assertEquals("have added two books, both borrowed", 2,
				testLibrary.getBookBorrowedCount());

		testLibrary.returnBook(testUserA.getLastBookBorrowed());
		testLibrary.returnBook(testUserB.getLastBookBorrowed());
		assertEquals(
				"have added two books both borrowed and then returned, so total borrowed is zero",
				0, testLibrary.getBookBorrowedCount());
	}

	/**
	 * borrowing a book successfully
	 */
	@Test
	public void testSimpleBorrow() {
		User testUser = new UserImpl("Joe Bloggs");
		testLibrary.register(testUser);
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		BorrowResult borrow = testLibrary.borrow("War and Peace", testUser);
		assertEquals(
				"Should be able to borrow title in library. User is registered",
				BorrowResult.SUCCESS, borrow);
	}

	/**
	 * try to borrow a book not in library
	 */
	@Test
	public void testBorrowNotInLibrary() {
		User testUser = new UserImpl("Joe Bloggs");
		testLibrary.register(testUser);
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		BorrowResult borrow = testLibrary.borrow("Henry V", testUser);
		assertEquals("Trying to borrow title not in library",
				BorrowResult.TITLE_NOT_FOUND, borrow);
	}

	/**
	 * borrowing a book - user not registered
	 */
	@Test
	public void testBorrowByNoRegisteredUser() {
		User testUser = new UserImpl("Joe Bloggs");
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		BorrowResult borrow = testLibrary.borrow("War and Peace", testUser);
		assertEquals("Try to borrow by non-registered user.",
				BorrowResult.USER_NOT_REGISTERED, borrow);
	}

	/**
	 * borrow a book that has already been borrowed
	 */
	@Test
	public void testBorrowBookAlreadyOut() {
		User testUser = new UserImpl("Joe Bloggs");
		testLibrary.register(testUser);
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		testLibrary.borrow("War and Peace", testUser);
		User testUser2 = new UserImpl("Jane Doe");
		testLibrary.register(testUser2);
		BorrowResult borrow = testLibrary.borrow("War and Peace", testUser2);
		assertEquals("book has been borrowed", BorrowResult.TITLE_BORROWED,
				borrow);
	}

	/**
	 * borrow a book when user reached;
	 */
	@Test
	public void testBorrowWhenMaxBooksExceeded() {
		User testUser = new UserImpl("Joe Bloggs");
		testLibrary.register(testUser);
		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		testLibrary.setMaxBooksPerUser(0);
		BorrowResult borrow = testLibrary.borrow("War and Peace", testUser);
		assertEquals(
				"Should not be able to borrow. MaxBooksPerUser set to zero",
				BorrowResult.USER_BORROW_LIMIT, borrow);

		testLibrary.setMaxBooksPerUser(2); // put to 2
		borrow = testLibrary.borrow("War and Peace", testUser);
		assertEquals("Should be able to borrow, limit increased ",
				BorrowResult.SUCCESS, borrow);
		assertEquals("Borrowed one book this should be recorded in user", 1,
				testUser.getNumberBooksBorrowed());

		testLibrary.addBook("Leo Tolstoy", "War and Peace"); // 2nd copy
		borrow = testLibrary.borrow("War and Peace", testUser);
		assertEquals("Should be able to borrow (2nd copy) ",
				BorrowResult.SUCCESS, borrow);

		testLibrary.addBook("J.D Salinger", "The Catcher in the Rye");
		borrow = testLibrary.borrow("The Catcher in the Rye", testUser);
		assertEquals("Should not be able to borrow third with max 2 ",
				BorrowResult.USER_BORROW_LIMIT, borrow);

	}

	/**
	 * test returning book, using returnBook( Book) method (checking that all
	 * relevant records in Book and User are correctly updated)
	 */
	@Test
	public void testBookReturn() {
		User testUser = new UserImpl("Joe Bloggs");
		testLibrary.register(testUser);

		String titlea = "Das Kapital";
		testLibrary.addBook("Karl Marx", titlea);
		testLibrary.borrow(titlea, testUser);

		String titleb = "War and Peace";
		testLibrary.addBook("Leo Tolstoy", titleb);
		testLibrary.borrow(titleb, testUser);

		assertEquals("user has borrowed two books ", 2,
				testUser.getNumberBooksBorrowed());

		Book lastBook = testUser.getLastBookBorrowed();
		assertNotNull("Have borrowed books, so lastBook cannot be null",
				lastBook);
		assertEquals("Check book has correct borrower set", testUser,
				lastBook.getBorrower());

		testLibrary.returnBook(lastBook);
		assertEquals("After returning one book, user has one borrowed", 1,
				testUser.getNumberBooksBorrowed());
		assertNull("Check returned book has null borrower field",
				lastBook.getBorrower());

		lastBook = testUser.getLastBookBorrowed();
		testLibrary.returnBook(lastBook);
		assertEquals("After returning two books, user has zero borrowed", 0,
				testUser.getNumberBooksBorrowed());
		assertNull("Check returned book has null borrower field",
				lastBook.getBorrower());

		lastBook = testUser.getLastBookBorrowed();
		assertNull(
				"after returning all books .getLastBookBorrowed() must return null",
				lastBook);
	}

	/**
	 * tests for arrayUsersBorrowingBooks() and arrayAllUsers() methods
	 */
	@Test
	public void TestArrayUsersMethods() {

		User[] getArray;
		User[] expectArray;

		expectArray = new User[] {};
		getArray = testLibrary.arrayAllUsers();
		assertArrayEquals(
				"Initially have no users, arrayAllUsers should empty",
				expectArray, getArray);

		testLibrary.addBook("Leo Tolstoy", "War and Peace");
		testLibrary.addBook("J.D Salinger", "The Catcher in the Rye");

		String nameA = "Joe Bloggs";
		User testUserA = new UserImpl(nameA);
		testLibrary.register(testUserA);
		String nameB = "Jane Doe";
		User testUserB = new UserImpl(nameB);
		testLibrary.register(testUserB);

		expectArray = new User[] { testUserA, testUserB };
		getArray = testLibrary.arrayAllUsers();
		assertArrayEquals("two users added", expectArray, getArray);

		expectArray = new User[] {};
		getArray = testLibrary.arrayUsersBorrowingBooks();
		assertArrayEquals(
				"Have two users but they have not borrowed, arrayUsersBorrowingBooks should empty",
				expectArray, getArray);

		testLibrary.borrow("The Catcher in the Rye", testUserB);

		expectArray = new User[] { testUserB };
		getArray = testLibrary.arrayUsersBorrowingBooks();
		assertArrayEquals("testUserB borrowed a book.", expectArray, getArray);

		testLibrary.borrow("War and Peace", testUserA);

		expectArray = new User[] { testUserA,testUserB  };
		getArray = testLibrary.arrayUsersBorrowingBooks();
		assertArrayEquals("Both users borrowed", expectArray, getArray);

		testLibrary.returnBook(testUserA.getLastBookBorrowed());
		testLibrary.returnBook(testUserB.getLastBookBorrowed());
		
		expectArray = new User[] {};
		getArray = testLibrary.arrayUsersBorrowingBooks();
		assertArrayEquals("Both users returned", expectArray, getArray);
		
		

	}
}
