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

		String[] testTitles = { "Anna Karenina", "War and Peace",
				"Guide to Russian Cheese", "The Brothers Karamazov"};
		for (String testTitle : testTitles) {
			System.out.print("Who has borrowed \"" + testTitle + "\"? ");
			System.out.println(" answer: "
					+ prettyBorrowString(testLib, testTitle));
		}


	}

	private static String prettyBorrowString(Library library, String title) {
		String resStr = "";
		String borrowName = library.nameOfUserBorrowingBook(title);
		if (borrowName == null) {
			resStr = "is not in the library or not out on loan.";
		} else {
			resStr = "is loaned to \"" + borrowName + "\"";
		}
		return resStr;
	}

}
