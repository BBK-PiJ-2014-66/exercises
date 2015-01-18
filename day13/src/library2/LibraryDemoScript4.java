package library2;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.11 The 4thillustration script as instructed.
 * 
 * Base on 1.10 example as implemented in JUnit test testLowerMaxBooksPerUser in
 * LibraryImplTest
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class LibraryDemoScript4 {

	public static void main(String[] args) {
		LibraryDemoScript4 launcher = new LibraryDemoScript4();
		launcher.init();
	}

	public void init() {
		Library testLibrary = new LibraryImpl("Demo #4 Library");

		System.out
				.println("*** Demonstrate #4 \"The 'maximum books' is reduced to one,\n"
						+ "    then to zero, then it is increased to the original value\"\n"
						+ "    use the Marge, Lisa and Maggie example from 1.10***\n");
		System.out
				.println("Setup library so Marge, Lisa and Maggie have borrowed one, two and three books");

		User userMarge = new UserImpl("Marge");
		testLibrary.register(userMarge);
		User userLisa = new UserImpl("Lisa");
		testLibrary.register(userLisa);
		User userMaggie = new UserImpl("Maggie");
		testLibrary.register(userMaggie);
		String title = "The Simpsons Guide Book";
		testLibrary.addBook("The Simpson Family", title); // six copies
		testLibrary.addBook("The Simpson Family", title);
		testLibrary.addBook("The Simpson Family", title);
		testLibrary.addBook("The Simpson Family", title);
		testLibrary.addBook("The Simpson Family", title);
		testLibrary.addBook("The Simpson Family", title);
		testLibrary.borrow(title, userMarge); // Marge borrows one
		testLibrary.borrow(title, userLisa); // borrows two
		testLibrary.borrow(title, userLisa); // borrows two
		testLibrary.borrow(title, userMaggie); // borrows three
		testLibrary.borrow(title, userMaggie); // borrows three
		testLibrary.borrow(title, userMaggie); // borrows three

		System.out.println("  Library report:\n" + testLibrary);

	
		int[] testMaxBooks = { 1, 0, 3 };
		for (int itLimit : testMaxBooks) {
			System.out.print("Set 'maximum books' to: " + itLimit + ". ");
			User[] offenders = testLibrary.setMaxBooksPerUser(itLimit);
			System.out.println("Users who are borrowing more books than this: "
					+ prettyUsers2Str(offenders));
		}

	}

	private String prettyUsers2Str(User[] users) {
		String retStr = "none";
		if (users.length > 0) {
			retStr = "";
			for (User itUser : users) {
				retStr += "\"" + itUser.getUserName() + "\" ";
			}
		}
		return retStr;
	}
}
