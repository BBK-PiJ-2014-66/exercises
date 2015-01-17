package library2;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.2 "Create a class for the users of the library. Users have a name and a
 * library-ID (an int), both of which must be unique in a library. The name is
 * set at construction time, but the library-ID is not. The class must implement
 * methods to get the name of the person and their ID, and to set the latter."
 * 
 * So should have one constructor User(name);
 *
 * OSS take2:
 * User should not have register(Library) or getLibrary() as User is 
 * manipulated by the Library itself
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 */
public interface User {

	/**
	 * Setter for the library ID number (unique in the library but this is
	 * sorted outside the class).
	 * 
	 * @param libID
	 *            The supplied library ID number
	 */
	void setLibraryID(int libID);

	/**
	 * getter for the library ID number
	 * 
	 * @return the library ID number
	 */
	int getLibraryID();

	/**
	 * getter for the user's Name
	 * 
	 * @return the user's name
	 */
	String getUserName();
	
	
    /**
     * records that a this User is currently borrowing a specific book
     * 
     * @param book the book borrowed
     */
	void recordBookBorrowed( Book book);
	
    /**
     * used to update records that a particular book has been returned
     * and user no longer has it. The relevant records in both User and Book
     * must updated in this method.
     * 
     * N.B. If the book does not exist in the library or the user has not borrowed it
     * does nothing.
     * 
     * @param book the book returned to library
     */
	void recordBookReturned( Book book);
	
	/**
	 * @return the number books borrowed
	 */
    int getNumberBooksBorrowed(); 
	
	/**
	 * @return an array of the titles of all the books borrowed (for 1.8)
	 */
	String[] getTitlesBooksBorrowed();
	
	/**
	 * 
	 * @return the last Book borrowed or null if there are not any
	 */
	Book getLastBookBorrowed();

}
