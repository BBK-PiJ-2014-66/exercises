package library2;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.3 The Mock Implementation of Library (needed for 1.4)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class MockLibrary implements Library {

	MockLibrary(String name) {
		System.out.println("MockLibrary constructor called "
				+ " with name= " + name + " but does nothing!");
	}

	@Override
	public String getLibrary() {
		return "Mock Library name";
	}

	@Override
	public int getID(String usersName) {
		return 13;
	}

	@Override
	public int getMaxBooksPerUser() {
		return 0; //default should three so return 0 to break test
	}

	@Override
	public void setMaxBooksPerUser(int maxBooksPerUser) {
		System.out.println("MockLibrary .setMaxBooksPerUser() does nothing!");
	}

}
