package library2;

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
public class BookImpl implements Book {

	private String author;
	private String title;
	private User borrower;
	
	/**
	 * the one constructor
	 */
	BookImpl( String author, String title) {
		this.author = author;
		this.title = title;
		this.borrower = null;
	}
	
	/**
	 * For printing
	 * 
	 * @return single line string with book details
	 */
	@Override
	public String toString() {
		String retStr;
		retStr = "author: \"" + author +"\" title: \"" + title + "\"";
		if (borrower==null) {
			retStr += ", in library.";			
		} else {
			retStr += ", lent to \"" + borrower.getUserName() + "\"";
		}
 		return retStr;
	}
	
	
	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public String getTitle() {
		return title;
	}


	@Override
	public User getBorrower() {
		return this.borrower;
	}


	@Override
	public void setBorrower(User user) {
		this.borrower = user;
	}
	

}
