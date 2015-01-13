package library;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.3  The Mock Implementation of Library (needed for 1.4) 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 *
 */
public class MockLibrary implements Library {

	@Override
	public String getLibrary() {
		return "Mock Library name";
	}

	@Override
	public int getID(String usersName) {
		return 13;
	}

}
