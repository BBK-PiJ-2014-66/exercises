package likeunix;

import java.util.Collections;
import java.util.List;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 6 sort (*)
 * 
 * task:
 * 
 * Write a program that takes a name from the user at the command line. If a
 * file with that name exists, the program must show its contents on screen, but
 * with the lines shown alphabetically. If the does not exist, the program must
 * say so.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 01 Feb 2015
 * 
 */
public class Sort {
	public static void main(String args[]) {
		// use launch to have a single System.exit(1) for ERROR
		Sort sorti = new Sort();
		try {
			sorti.launch(args);
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage()); // print exception to STDERR
			System.exit(1); // set error indication
		}
	}

	public void launch(String args[]) {
		if (args.length != 1) {
			String msg = "You must specify a single input file to be sorted.\n"
					+ "For example to sort 'file.txt`:\n\n"
					+ "\t\tjava -classpath .... Sort file.txt\n\n";
			throw new RuntimeException(msg);
		}

		// read file contents into a List of strings (throws runtime error on problem)
		List<String> lines = ReadFile2List.read( args[0]);
		
		// sort the list
		Collections.sort(lines);
		
		for (String itLine : lines) {
			System.out.println(itLine);
		}
		
	}


}