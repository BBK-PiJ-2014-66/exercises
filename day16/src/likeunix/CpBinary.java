package likeunix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 9 b) Binary cp (**)
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
public class CpBinary {
	public static void main(String args[]) {
		// use launch to have a single System.exit(1) for ERROR
		CpBinary cpi = new CpBinary();
		try {
			cpi.launch(args);
		} catch (RuntimeException ex) {
			System.err.println(ex); // print exception to STDERR
			System.exit(1); // set error indication
		}
	}

	public void launch(String args[]) {
		if (args.length < 2) {
			String msg = "You must specify the source and destination files\n"
					+ "for example to copy 'source.txt' to 'dest.txt'\n\n"
					+ "\t\tjava -classpath .... CpBinary source.txt dest.txt\n\n"
					+ "alternatively you can specify one or more files to be copied to a directory:\n\n"
					+ "\tjava -classpath .... CpBinary file1 file2 destinationDirectory\n";
			throw new RuntimeException(msg);
		}

		// if the last file specified a directory
		String lastFileName = args[args.length - 1];
		File lastFile = new File(lastFileName);
		if (lastFile.isDirectory()) {
			for (int fc = 0; fc < args.length - 1; fc++) {
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
			throw new RuntimeException("ERROR source file " + sourceName
					+ " does not exist");
		}

		File dest = new File(destName);
		if (dest.isDirectory()) {
			throw new RuntimeException("ERROR destination file " + destName
					+ " is a directory Script cannot copy with this!");
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
		InputStream in = null;
		try {
			in = new FileInputStream(source);
		} catch (FileNotFoundException ex) {
			// FileNotFoundException happens if the named file does not
			// exist, is a directory rather than a regular file, or for some
			// other reason cannot be opened for reading
			throw (new RuntimeException("ERROR opening source file "
					+ ex.getMessage()));
		}
		// open dest as 'out'
		OutputStream out = null;
		try {
			out = new FileOutputStream(dest);
		} catch (FileNotFoundException ex) {
			// FileNotFoundException - If the given file object does not denote
			// an existing, writable regular file and a new regular file of that
			// name cannot be created, or if some other error occurs while
			// opening or creating the file
			throw (new RuntimeException("ERROR opening destination file "
					+ ex.getMessage()));
		}

		// have opened both input and output files
		int data; // to store
		try {
			while ((data = in.read()) != -1) {
				out.write(data);
			}
		} catch (IOException ex) {
			throw (new RuntimeException(
					"ERROR IO Exception reading from input file "
							+ ex.getMessage()));
		} finally {
			// close both input and output files
			try {
				in.close();
			} catch (IOException ex) {
				throw (new RuntimeException("ERROR closing source file "
						+ ex.getMessage()));
			}
			try {
				out.close();
			} catch (IOException ex) {
				throw (new RuntimeException("ERROR closing destination file "
						+ ex.getMessage()));
			}
		}

	}
}
