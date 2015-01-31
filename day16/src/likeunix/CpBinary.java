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
 * Exercise 4 b) cp multifile
 * 
 * 
 * Modify the program so that it takes many file names at the command line. When
 * this happens, the last name must be a directory (otherwise, your program
 * should complain). If it is a directory, your program has to copy all files
 * (i.e. the other arguments) into that directory.
 * 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 31 Jan 2015
 * 
 */
public class CpMultiFile {
	public static void main(String args[]) {
		// use launch to have a single System.exit(1) for ERROR
		CpMultiFile cpi = new CpMultiFile();
		try {
			cpi.launch(args);
		} catch (RuntimeException ex) {
			System.exit(1); // set error indication
		}
	}

	public void launch(String args[]) {
		if (args.length < 2) {
			System.err
					.println("You must specify the source and destination files");
			System.err
					.println("for example to copy 'source.txt' to 'dest.txt'");
			System.err
					.println("\tjava -classpath .... CpMultiFile source.txt dest.txt\n");
			throw new RuntimeException(
					"Error has not specified two command line arguments");
		}

		// if the last file specified a directory
		String lastFileName = args[args.length - 1];
		File lastFile = new File(lastFileName);
		if (lastFile.isDirectory()) {
			for (int fc=0; fc < args.length - 1; fc ++) {
				// copy this file into the destination directory
				// n.b. two slashes do not matter in linux
				String dest = lastFileName + "/" + args[fc];
				cp(args[fc], dest);
			}
		} else if (args.length == 2) {
			// simple copy one file to another
			cp(args[0], args[1]);
		} else {
			// give the same error as linux cp does in this situation
			String msg = "cp: target `" + lastFileName + "' is not a directory";
			System.err.println(msg);
			throw new RuntimeException(msg);
		}
	}

	/**
	 * copies a single file from source to dest
	 * 
	 * @param sourceName
	 *            a filename must exist
	 * @param destName
	 *            a destination filename cannot be a directory
	 * @throws RuntimeException
	 *             on any error
	 */
	private void cp(String sourceName, String destName) {
		File source = new File(sourceName);
		if (!source.exists()) {
			System.err.println("ERROR source file " + sourceName
					+ " does not exist");
			throw new RuntimeException("source file does not exist");
		}

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
