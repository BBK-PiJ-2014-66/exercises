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
		// check whether user with same name is already registered as this is not allowed
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
	 * @param title
	 * @param author
	 */
	@Override
	public void addBook(String title, String author) {
		books.add(new BookImpl( title, author));
	}

	/**
	 * @return the number of books in this library
	 */
	@Override
	public int getBookCount() {
		return books.size();
	}
	
	

}
