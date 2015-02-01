package likeunix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Utility to read a file into a List of lines to save writing the same code
 * time and time again
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 01 Feb 2015
 * 
 */
public class ReadFile2List {

	/**
	 * Read a file into a List of lines
	 * 
	 * @param fileName
	 * @return the lines in the file as a List
	 * @throws RuntimeException
	 *             if the file is not found, cannot be read, there is an IOError
	 */
	public static List<String> read(String fileName) {
		File file = new File(fileName);
		if (!file.exists()) {
			throw (new RuntimeException("ERROR file " + file
					+ " does not exist"));
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
		List<String> lines = new ArrayList<String>();
		try {
			while ((line = in.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException ex) {
			throw (new RuntimeException("ERROR, ioerror reading file "
					+ fileName + "\n" + "ERROR, ioerror details "
					+ ex.getMessage()));
		}
		return null;
	}

}
