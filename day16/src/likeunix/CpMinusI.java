package likeunix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 4 a) cp
 * 
 * Write a program that takes two names from the user at the command line. If a
 * file with the first name exists, the program must copy it into a file with
 * the second name. If the first file does not exist, the program must say so.
 * If the second file does exists, the program must ask the user whether to
 * overwrite it or not, and act accordingly.
 * 
 * So it is like cp -i
 * 
 * Assume we are mean to read the File line by line and write it a new one In
 * practice it would be much more sensible to use Files.copy() method!
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 31 Jan 2015
 * 
 */
public class CpMinusI {
	public static void main(String args[]) {
		// use launch to have a single System.exit(1) for ERROR
		CpMinusI cpi = new CpMinusI();
		try {
			cpi.launch(args);
		} catch (RuntimeException ex) {
			System.exit(1); // set error indication
		}
	}

	public void launch(String args[]) {
		if (args.length != 2) {
			System.err
					.println("You must specify the source and destination files");
			System.err
					.println("for example to copy 'source.txt' to 'dest.txt'");
			System.err
					.println("\tjava -classpath .... CpMinusI source.txt dest.txt\n");
			throw new RuntimeException(
					"Error has not specified two command line arguments");
		}

		String sourceName = args[0];
		File source = new File(sourceName);
		if (!source.exists()) {
			System.err.println("ERROR source file " + sourceName
					+ " does not exist");
			throw new RuntimeException("source file does not exist");
		}

		String destName = args[1];
		File dest = new File(destName);
		if (dest.isDirectory()) {
			System.err.println("ERROR destination file " + destName
					+ " is a directory" + "Script cannot copy with this!");
			throw new RuntimeException("destination is directory");
		} else if (dest.exists()) {
			// check interactively whether to clobber
			// use same message as linux cp -i
			System.out.print("cp: overwrite `" + dest + "'? ");
			Scanner input = new Scanner(System.in);
			String inLine = input.nextLine();
			input.close();
			// do not overwrite unless they have entered y
			if (inLine == null || inLine.length() < 1
					|| !inLine.substring(0, 1).equalsIgnoreCase("y"))
				return;
		}

		// open source as 'in'
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(source));
		} catch (FileNotFoundException ex) {
			// FileNotFoundException happens if the named file does not
			// exist, is a directory rather than a regular file, or for some
			// other reason cannot be opened for reading
			System.err.println("ERROR opening source file " + ex.getMessage());
			throw (new RuntimeException(ex));
		}
		// open dest as 'out'
		PrintWriter out = null;
		try {
			out = new PrintWriter(dest);
		} catch (FileNotFoundException ex) {
			// FileNotFoundException - If the given file object does not denote
			// an existing, writable regular file and a new regular file of that
			// name cannot be created, or if some other error occurs while
			// opening or creating the file
			System.err.println("ERROR opening destination file "
					+ ex.getMessage());
			throw (new RuntimeException(ex));
		}

		// have opened both input and output files
		String line;
		try {
			while ((line = in.readLine()) != null) {
				out.println(line);
			}
		} catch (IOException ex) {
			System.err.println("ERROR IO Exception reading from input file "
					+ ex.getMessage());
			throw (new RuntimeException(ex));
		} finally {
			// close both input and output files
			try {
				in.close();
			} catch (IOException ex) {
				System.err.println("ERROR closing source file "
						+ ex.getMessage());
				throw (new RuntimeException(ex));
			}
			out.close();
		}
	}
}
