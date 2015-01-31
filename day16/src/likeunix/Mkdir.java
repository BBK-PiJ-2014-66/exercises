package likeunix;

import java.io.File;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 2 mkdir
 * 
 * task:
 * 
 * Write a program that takes a name from the user at the command line and
 * creates a directory with that name. Remember that the only argument of method
 * main is an array of Strings, each of them an argument written after the name
 * of the class. For example, if you write java myClass this That 0, the
 * elements in args will be three strings of values “this”, “That”, and “0”.
 * 
 * But if user wants a directory with a space then they can use single quotes!
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 31 Jan 2015
 * 
 */
public class Mkdir {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.err
					.println("You must specify the directory you want as a single argument,");
			System.err.println("for example:\n");
			System.err.println("\tjava -classpath .... Mkdir newdir\n");
			System.err
					.println("For a directory name with spaces in it use single quotes");
			System.err.println("for example:\n");
			System.err
					.println("\tjava -classpath .... Mkdir 'folder with spaces in the name'\n");
			System.exit(1);
		}
		String name = args[0];
		File newdir = new File(name);
		if (newdir.exists()) {
			System.err.println("ERROR cannot mkdir " + name + " as a directory/file of that name already exists.");
			System.exit(1);

		} else {
			try {
				boolean mkdir = newdir.mkdir();
				if (!mkdir) {
					System.err.println("ERROR failed to mkdir " + name);
					System.exit(1);
				}
			} catch (SecurityException ex) {
				System.err.println("ERROR failed to mkdir " + name
						+ " because " + ex.getMessage());
				System.exit(1);
			}
		}
	}

}
