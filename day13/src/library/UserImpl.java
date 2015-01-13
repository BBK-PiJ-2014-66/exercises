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
public class UserImpl implements User {
	private String name;
	private int libID;

	/**
	 * the single constructor  
	 * @param the user's name
	 */
	UserImpl( String name) {
		this.name = name;
		libID = Integer.MIN_VALUE; // invalid initial value
	}
	
	/**
	 * Set the library ID
	 * @param the library ID 
	 */
	@Override
	public void setLibraryID(int libID) {
		this.libID = libID;
	}

	/**
	 * Getter for library ID	 
	 * @return the library ID number
	 */
	@Override
	public int getLibraryID() {
		return libID;
	}

	/** 
	 * Getter for user's name
	 * @return the user's name
	 */
	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void register(Library library) {
		// stub method
		System.out.println("debug have not yet written .register() method!");
	}

	@Override
	public String getLibrary() {
		// stub method
		System.out.println("debug have not yet written .getLibrary() method!");
		return null;
	}

}
