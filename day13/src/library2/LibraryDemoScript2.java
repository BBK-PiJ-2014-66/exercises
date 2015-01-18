package library2;

import java.util.ArrayList;
import java.util.List;

/**
 * PiJ day 13 Test Driven Development
 * 
 * 1.11 The 2nd illustration script as instructed
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 * 
 */
public class LibraryDemoScript2 {

	public static void main(String[] args) {
		LibraryDemoScript2 launcher = new LibraryDemoScript2();
		launcher.init();
	}

	public void init() {
		Library testLib = new LibraryImpl("LibraryDemoScript Library");

		System.out
				.println("*** Demonstrate #2 \"A user trying to borrow more books than allowed.\n"
						+ "    And then returning one of the books they already have to borrow a new one.\" ***\n");
		System.out
				.println("Create library and add a single user and some books:");
		User testUser = new UserImpl("Joe Bloggs");
		testLib.register(testUser);

		/*
		 * Add a number of books. Thought of map but author can write more than
		 * one book and title can be used by another author. So use a little
		 * class for the pair of author and title and a list of these
		 */
		List<AuthorTitle> myBooks = new ArrayList<AuthorTitle>();
		myBooks.add(new AuthorTitle("Leo Tolstoy", "War and Peace"));
		myBooks.add(new AuthorTitle("Leo Tolstoy", "Anna Karenina"));
		myBooks.add(new AuthorTitle("Leo Tolstoy", "Anna Karenina")); // two
																		// copies
		myBooks.add(new AuthorTitle("Anton Chekhov", "The Cherry Orchard"));
		myBooks.add(new AuthorTitle("Fyodor Dostoyevsky",
				"The Brothers Karamazov"));
		myBooks.add(new AuthorTitle("Aleksandr Solzhenitsyn",
				"One Day in the Life of Ivan Denisovich"));
		for (AuthorTitle itAT : myBooks) {
			testLib.addBook(itAT.author, itAT.title);
		}

		System.out.println("  Library report:\n" + testLib);
		System.out
				.println("  Bloggs attempts to borrows all the books until no more allowed");

		for (AuthorTitle itAT : myBooks) {
			BorrowResult bresult = testLib.borrow(itAT.title, testUser);
			if (bresult == BorrowResult.SUCCESS) {
				System.out.println("\t" + testUser.getLastBookBorrowed());
			} else if (bresult == BorrowResult.USER_BORROW_LIMIT) {
				System.out
						.println("\treached borrowing limit not allowed to borrow \""
								+ itAT.title + "\"");
				break;
			}
		}

		System.out.println("\n  Bloggs returns last book borrowed");
		testLib.returnBook(testUser.getLastBookBorrowed());

		System.out
				.println("\n  Bloggs borrows another: \"The Brothers Karamazov\"");
		testLib.borrow("The Brothers Karamazov", testUser);

		System.out.println("  Final library report:\n" + testLib);

	}

	/**
	 * little Class for pair of author and title to make it easy to define books
	 * Following Day 6 "Moving onto java" states "if-and-only-if a class does
	 * not have any methods (not counting constructors) its fields must be
	 * public" We want such a class
	 */
	public class AuthorTitle {
		public String author;
		public String title;

		AuthorTitle(String author, String title) {
			this.author = author;
			this.title = title;
		}
	}

}
