package library;
/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.3/1.4  The Interface for the Library (needed for 1.4) 
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
}
