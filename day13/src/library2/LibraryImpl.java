package library;

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

	/* store an arrayList of the names of registered users
	 * - do not like this much. Would prefer to store arrayList of User objects
	 */
	private ArrayList<String> userNames;

	/**
	 * The sole Constructor: "Libraries have a name, set at construction time."
	 * 
	 * @param name
	 *            The library's name
	 */
	LibraryImpl(String name) {
		this.name = name;
		userNames = new ArrayList<String>();
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
	/**
	 * returns the libary ID of a person for a given user's name in this
	 * library. If the person does not have an ID yet, a new unique ID is
	 * created and returned. Any subsequent calls to this method with the same
	 * name argument should return the same ID.
	 * 
	 * In practice this means that call to getID with a new name registers the 
	 * users NAME with the library. This seems a BAD idea to me butt we have been
	 * told to do this!
	 * 
	 * @return the libraryID
	 */
	public int getID(String aName) {
		// is the user already registered?
		if (!userNames.contains(aName)) {
			// aName is not already registered so add to
			userNames.add(aName);
		}

		// use the index of the name as the id.
		return userNames.indexOf(aName);
	}

}
