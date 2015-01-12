/**
 * PiJ day 13 Test Driven Development 
 * 
 * 1.1 "Create a class for books. Books have authors and titles.
 * The class should implement getters for both author name and title, but these
 * must be set at construction time and never be modified afterwards"
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
	
}
