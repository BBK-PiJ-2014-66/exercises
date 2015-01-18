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
						+ "And then returning one of the books they already have to borrow a new one.\" ***");
		System.out
				.println("Create library and add a single user and fours book:");
		User testUser = new UserImpl("Joe Bloggs");
		testLib.register(testUser);

		/*
		 * Add a number of books. Thought of map but author can write more than
		 * one book and title can be used by another author.
		 * So define a little pair class
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
			testLib.addBook(itAT.getAuthor(), itAT.getTitle());
		}

		System.out.println("  Library report:\n" + testLib);

		System.out.println("  Bloggs attempts to borrows all the books");

	}

	/**
	 * little Class for pair of author and title
	 * 
	 * @author osmart
	 * 
	 */
	public class AuthorTitle {
		private String author;
		private String title;

		AuthorTitle(String author, String title) {
			this.author = author;
			this.title = title;
		}

		String getAuthor() {
			return author;
		}

		String getTitle() {
			return title;
		}

	}

}
