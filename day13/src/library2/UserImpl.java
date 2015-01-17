package library2;

import java.util.ArrayList;

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
	private String name; // user's name e.g. "Joe Bloggs"
	private int libID; // library ID number
	private ArrayList<Book> borrowed; // list of books borrowed

	/**
	 * the single constructor
	 * 
	 * @param the
	 *            user's name
	 */
	UserImpl(String name) {
		this.name = name;
		libID = Integer.MIN_VALUE; // invalid initial value
		borrowed = new ArrayList<Book>(); //
	}

	/**
	 * Set the library ID
	 * 
	 * @param the
	 *            library ID
	 */
	@Override
	public void setLibraryID(int libID) {
		this.libID = libID;
	}

	/**
	 * Getter for library ID
	 * 
	 * @return the library ID number
	 */
	@Override
	public int getLibraryID() {
		return libID;
	}

	/**
	 * Getter for user's name
	 * 
	 * @return the user's name
	 */
	@Override
	public String getUserName() {
		return name;
	}

	@Override
	public void recordBookBorrowed(Book book) {
		borrowed.add(book);
	}

	@Override
	public void recordBookReturned(Book book) {
		// find book in borrowed
		int index = borrowed.indexOf(book);
		if (index != -1) {
			borrowed.remove(index);
			book.setBorrower(null);
		}
	}

	@Override
	public int getNumberBooksBorrowed() {
		// TODO Auto-generated method stub
		return borrowed.size();
	}

	@Override
	public String[] getTitlesBooksBorrowed() {
		int size = borrowed.size();
		String[] titleArray = new String[size];
		for (int bc = 0; bc < size; bc++) {
			titleArray[bc] = borrowed.get(bc).getTitle();
		}
		return titleArray;
	}

	@Override
	public Book getLastBookBorrowed() {
		// TODO Auto-generated method stub
		return null;
	}

}
