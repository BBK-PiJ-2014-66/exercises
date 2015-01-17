package library2;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.3/1.4 The Interface for the Library (needed for 1.3, implemented in 1.4)
 * 
 * 1.4: "Libraries have a name, set at construction time. They also have a
 * “maximum number of books borrowed by the same person” policy (e.g. max three
 * books per user), which can be updated at any time. Of course, they also have
 * a method to get the maximum number of books to be borrowed at any time (e.g.
 * getMaxBooksPerUser())."
 * 
 * So default MaxBooksPerUser must be 3.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public interface Library {

	/**
	 * Getter for the library name
	 * 
	 * @return the name of the Library
	 */
	String getLibrary();

	/**
	 * getter for the maximum number of books that a user can borrow at a time
	 * 
	 * @return the maximum number of books allowed for a user
	 */
	int getMaxBooksPerUser();

	/**
	 * setter for the maximum number of books that a user can borrow at a time
	 * 
	 * @param maxBooksPerUser
	 *            the new maximum number of books allowed for a user
	 */
	void setMaxBooksPerUser(int maxBooksPerUser);

	/**
	 * Registers a user with the library
	 * 
	 * @param aUser
	 *            the user to register
	 * @return the user's new library id if successully or -1 if there was a
	 *         problem registering the the user
	 */
	int register(User aUser);

	/**
	 * adds new book to the list of books in the library
	 * 
	 * @param title
	 * @param author
	 */
	void addBook(String title, String author);

	/**
	 * @return the number of users registered in the library
	 */
	int getReaderCount();

	/**
	 * @return the number of books in this library
	 */
	int getBookCount();

	/**
	 * @return the number of books currently borrowed from the library
	 */
	int getBookBorrowedCount();

	/**
	 * Borrow a book
	 * 
	 * @param title
	 *            title of the book to borrow
	 * @param user
	 *            the user who wants to borrow
	 * @return the result an enum @see BorrowResult
	 */
	BorrowResult borrow(String title, User user);

	/**
	 * Used when user hands in a book that has been borrowed. Does nothing if
	 * the book is not in library or has not been borrowed!
	 * 
	 * @param book
	 *            The book user hands in
	 */
	void returnBook(Book book);

	/**
	 * provides a list with all the users who are borrowing books at the moment
	 * 
	 * @return an array of User with the users who are borrowing books
	 */
	User[] arrayUsersBorrowingBooks();

	/**
	 * provides a list with all the users, borrowing or not
	 * 
	 * @return an array of User with the users who are borrowing books
	 */
	User[] arrayAllUsers();

	/**
	 * the name of the person borrowing a specific title if there is no book
	 * with that title in the library or no book with that title is being
	 * borrowed returns null
	 * 
	 * If there is more than one book with that title it will return the name of
	 * the person who is borrowing one of them.
	 * 
	 * @param title
	 *            the title of the book
	 * @return name of the user who is borrowing a book with the title or null
	 *         if there is no match
	 */
	String nameOfUserBorrowingBook(String title);
	
}
