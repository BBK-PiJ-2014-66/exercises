package library2;
/**
 * PiJ day 13 Test Driven Development 
 * 
 * 1.1 "Create a class for books. Books have authors and titles.
 * The class should implement getters for both author name and title, but these
 * must be set at construction time and never be modified afterwards"
 * 
 * So implementations of this class should have one constructor only 
 *  Book(author,title);
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 */
public interface Book {
		
	/**
	 *  getter for the author Name
	 * @return the author's Name
	 */
	String getAuthor();
	
	/**
	 *  getter for the book Title
	 * @return the book title
	 */
	String getTitle();
	
	/**
	 * getter for User who has borrowed book 
	 * @return the user or null if the book is available to borrow
	 */
	User getBorrower();
	
	/**
	 * Setter for the borrower
	 * @param user the user who has borrowed the book
	 */
	void setBorrower( User user);
	
	
}
