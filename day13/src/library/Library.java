package library;

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
	 * returns the libary ID of a person for a given user's name in this
	 * library. If the person does not have an ID yet, a new unique ID is
	 * created and returned. Any subsequent calls to this method with the same
	 * name argument should return the same ID.
	 * 
	 * @return the libraryID
	 */
	int getID(String usersName);
	
	/**
	 * getter for the maximum number of books that a user can borrow at a time 
	 * @return the maximum number of books allowed for a user
	 */
	int getMaxBooksPerUser();
	
	/**
	 * setter for the maximum number of books that a user can borrow at a time 
	 * @param maxBooksPerUser the new maximum number of books allowed for a user
	 */
	void setMaxBooksPerUser( int maxBooksPerUser);
}
