package likeunix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 3 cat
 * 
 * task:
 * 
 * a) Write a program that takes a name from the user at the command line. If a
 * file with that name exists, the program must show its contents on screen. If
 * it does not, the program must say so.
 * 
 * b) (*) Modify the program so that it takes many file names at the command
 * line, and then shows them all one after the other.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 31 Jan 2015
 * 
 */
public class Cat {
	public static void main(String args[]) {
		if (args.length == 0) {
			System.err
					.println("You must specify the file(s) you want to display as comand line argument(s),");
			System.err
					.println("for example to see the contents of 'foo.txt':\n");
			System.err.println("\tjava -classpath .... Cat foo.txt\n");
			System.err
					.println("or for 'foo.txt' then 'bar.txt' use command:\n");
			System.err.println("\tjava -classpath .... Cat foo.txt bar.txt\n");
			System.exit(1);
		}
		// first check whether there is any error by a silent pass through
		for (String itArg : args) {
			try {
				checkOrCat(itArg, Verbosity.SILENT);
			} catch (RuntimeException ex) {
				System.err.println(ex.getMessage());
				System.exit(1); // with error set
			}
		}

		// no error - repeat Verbose
		for (String itArg : args) {
			try {
				checkOrCat(itArg, Verbosity.NOT_SILENT);
			} catch (RuntimeException ex) {
				System.err.println("ERROR: unexpected error on checkOrCat 2nd pass?");
				System.err.println(ex);
				System.exit(1); // with error set
			}
		}

	}

	/**
	 * cat a single file, if silent is false.
	 * 
	 * @param fileName
	 *            to print to stderr
	 * @param silent
	 *            if set true produces no output just checks for errors
	 * @throws RuntimeException
	 *             on any error details returned in the message
	 */
	private static void checkOrCat(String fileName, Verbosity silent) {
		File file = new File(fileName);
		if (!file.exists()) {
			throw (new RuntimeException("ERROR file " + file + " does not exist"));
		}
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException ex) {
			// FileNotFoundException happens if the named file does not
			// exist, is a directory rather than a regular file, or for some
			// other reason cannot be opened for reading
			throw (new RuntimeException("ERROR opening " + ex.getMessage()));
		}
		// successfully opened file
		String line;
		try {
			while ((line = in.readLine()) != null) {
				if (silent == Verbosity.NOT_SILENT)
					System.out.println(line);
			}
		} catch (IOException ex) {
			throw (new RuntimeException("ERROR, ioerror reading file "
					+ fileName + "\n" + "ERROR, ioerror details "
					+ ex.getMessage()));
		}

	}

	enum Verbosity {
		SILENT, NOT_SILENT
	}
}
