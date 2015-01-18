package library2;

public class LibraryDemoScript1 {

	public static void main(String[] args) {
		Library testLib = new LibraryImpl("LibraryDemoScript Library");
	
		System.out.println("*** Demonstrate \"A user borrowing one book and returning it\" ***");
		System.out.println("Create library and add a single user and a single book:");
		User testUser = new UserImpl("Joe Bloggs");
		testLib.register(testUser);
		testLib.addBook("Leo Tolstoy", "War and Peace");
		System.out.println("  Library report:\n" + testLib);
		System.out.println("  Bloggs borrows the book");
		testLib.borrow("War and Peace", testUser);
		System.out.println("  Library report:\n" + testLib);
		System.out.println("  Bloggs returns the book");
		testLib.returnBook(testUser.getLastBookBorrowed());
		System.out.println("  Library report:\n" + testLib);
	
		
	}

}
