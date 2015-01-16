package library2;

import java.util.ArrayList;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.4... Implementation of the Library interface
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class LibraryImpl implements Library {

	private String name;
	private int maxBooksPerUser = 3;
	// store Library users as Users
	private ArrayList<User> users;
	private ArrayList<Book> books;

	/**
	 * The sole Constructor: "Libraries have a name, set at construction time."
	 * 
	 * @param name
	 *            The library's name
	 */
	LibraryImpl(String name) {
		this.name = name;
		users = new ArrayList<User>();
		books = new ArrayList<Book>();
	}

	/**
	 * Getter for the library name
	 * 
	 * @return The library's name
	 */
	@Override
	public String getLibrary() {
		return name;
	}

	/**
	 * getter for the maximum number of books that a user can borrow at a time
	 * 
	 * @return the maximum number of books allowed for a user
	 */
	@Override
	public int getMaxBooksPerUser() {
		return maxBooksPerUser;
	}

	/**
	 * setter for the maximum number of books that a user can borrow at a time
	 * 
	 * @param maxBooksPerUser
	 *            the new maximum number of books allowed for a user
	 */
	@Override
	public void setMaxBooksPerUser(int maxBooksPerUser) {
		this.maxBooksPerUser = maxBooksPerUser;
	}

	@Override
	public int register(User aUser) {
		// check whether user with same name is already registered as this is
		// not allowed
		for (User itUser : users) {
			if (itUser.getUserName().equals(aUser.getUserName()))
				return -1;
		}
		// add the user
		users.add(aUser);
		int libID = users.size(); // user array position as ID
		aUser.setLibraryID(libID);
		return libID;
	}

	/**
	 * adds new book to the list of books in the library
	 * 
	 * @param title
	 * @param author
	 */
	@Override
	public void addBook(String title, String author) {
		books.add(new BookImpl(title, author));
	}

	/**
	 * @return the number of books in this library
	 */
	@Override
	public int getBookCount() {
		return books.size();
	}

	/**
	 * Borrow a book
	 * 
	 * @param title
	 *            title of the book to borrow
	 * @param user
	 *            the user who wants to borrow
	 * @return the result an enum @see BorrowResult
	 */
	@Override
	public BorrowResult borrow(String Title, User user) {
		// is the title in the library?
		if (!this.inLibrary(Title))
			return BorrowResult.TITLE_NOT_FOUND;

		// is the user registered?
		if (!users.contains(user))
			return BorrowResult.USER_NOT_REGISTERED;

		// has the user reached their limit?
		// to be coded

		// is a copy of the book available to be borrowed?
		Book copy = this.availableToBorrow(Title);
		if (copy == null)
			return BorrowResult.TITLE_BORROWED;
		
		// record that the copy of the book has been borrowed
        copy.setBorrower(user);   
        
        // and record that the user has borrowed the copy of the book
        
		return BorrowResult.SUCCESS;
	}

	/**
	 * finds whether a title is in the library or null if there is no matching
	 * copy N.B.
	 * 
	 * @param Title
	 *            book's title
	 * @return Book with matching title (first in library)
	 */
	private boolean inLibrary(String Title) {
		for (Book itBook : books) {
			if (itBook.getTitle().equalsIgnoreCase(Title))
				return true;
		}
		return false;
	}

	/**
	 * finds first available title that has not been borrowed. If title not not
	 * in library or all copies are borrowed returns null.
	 * 
	 * @param Title
	 * @return Book available to borrow with correct Title or null if there are
	 *         none
	 */
	private Book availableToBorrow(String Title) {
		for (Book itBook : books) {
			if (itBook.getTitle().equalsIgnoreCase(Title)) {
				// Title matches
				if (itBook.getBorrower() == null)
					return itBook; // and the Book is not borrowed already
			}
		}

		return null;
	}

}
