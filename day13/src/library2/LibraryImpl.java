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

	/**
	 * The sole Constructor: "Libraries have a name, set at construction time."
	 * 
	 * @param name
	 *            The library's name
	 */
	LibraryImpl(String name) {
		this.name = name;
		users = new ArrayList<User>();
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

	@Override
	public void addBook(String title, String author) {
		System.out.println("addBook not yet implemented");
	}

	@Override
	public int getBookCount() {
		System.out.println("getBookCount not yet implemented");
		return -1;
	}
	
	

}
