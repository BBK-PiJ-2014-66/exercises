package library2;

public enum BorrowResult {
	
	/**
	 * temporary!
	 */
	NOT_YET_IMPLEMENTED,
	
	/**
     * No error. 
     */
    SUCCESS,
   
    /**
     * User not registered
     */
    USER_NOT_REGISTERED,

    /**
     * User has too many books borrowed
     */
    USER_BORROW_LIMIT,
    
    /**
     * No book with that Title in library
     */
    TITLE_NOT_FOUND,
     
    /**
     * all copies of the title borrowed
     */
    TITLE_BORROWED;

}
