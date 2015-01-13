package library;

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

}
