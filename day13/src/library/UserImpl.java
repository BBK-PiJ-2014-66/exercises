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

	UserImpl( String name) {
		// minimal "stub" implementation to enable Test to run (but fail)
	}
	
	
	@Override
	public void setLibraryID(int libID) {
		// minimal "stub" implementation to enable Test to run (but fail)
	}

	@Override
	public int getLibraryID() {
		// minimal "stub" implementation to enable Test to run (but fail)
		return 0;
	}

	@Override
	public String getUserName() {
		// minimal "stub" implementation to enable Test to run (but fail)
		return "a name";
	}

}
