package library2;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.11 The 2nd illustration script as instructed
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class LibraryDemoScript3 {

	public static void main(String[] args) {
		LibraryDemoScript3 launcher = new LibraryDemoScript3();
		launcher.init();
	}

	public void init() {
		Library testLib = new LibraryImpl("LibraryDemoScript Library");

		System.out
				.println("*** Demonstrate #3 \"Several users borrow books.\n"
						+ "    The library is then asked who has some specific title, if anyone.\" ***\n");
		System.out
				.println("Create library and add several users and some books:");
		User bloggs = new UserImpl("Joe Bloggs");
		testLib.register(bloggs);
		User doe = new UserImpl("Jane Doe");
		testLib.register(doe);
		User smith = new UserImpl("John Smith");
		testLib.register(smith);

		testLib.addBook("Leo Tolstoy", "War and Peace");
		testLib.addBook("Leo Tolstoy", "Anna Karenina");
		testLib.addBook("Leo Tolstoy", "Anna Karenina");
		testLib.addBook("Anton Chekhov", "The Cherry Orchard");
		testLib.addBook("Fyodor Dostoyevsky", "The Brothers Karamazov");
		testLib.addBook("Aleksandr Solzhenitsyn",
				"One Day in the Life of Ivan Denisovich");

		System.out.println("\nEach user borrows a book:");
		testLib.borrow("The Cherry Orchard", bloggs);
		testLib.borrow("The Brothers Karamazov", doe);
		testLib.borrow("Anna Karenina", smith);
		System.out.println("  Library report:\n" + testLib);

		String testTitle = "Anna Karenina";
		System.out.print("\nLibrary asked who has borrowed \"" + testTitle
				+ "\"");
		String borrowName = testLib.nameOfUserBorrowingBook(testTitle);
		System.out.println(" answer:"
				+ ((borrowName == null) ? "not in library or not on loan" : " loaned to " + borrowName));
		
		testTitle = "War and Peace";
		System.out.print("\nLibrary asked who has borrowed \"" + testTitle
				+ "\"");
		borrowName = testLib.nameOfUserBorrowingBook(testTitle);
		System.out.println(" answer:"
				+ ((borrowName == null) ? "not in library or not on loan" : " is loaned to " + borrowName));

		testTitle = "Guide to Russian Cheese";
		System.out.print("\nLibrary asked who has borrowed \"" + testTitle
				+ "\"");
		borrowName = testLib.nameOfUserBorrowingBook(testTitle);
		System.out.println(" answer: "
				+ ((borrowName == null) ? "not in library or not on loan" : " is loaned to " + borrowName));
		

	}
	

}
