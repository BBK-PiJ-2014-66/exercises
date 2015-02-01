package likeunix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 8 Temperature averages
 * 
 * task:
 * 
 * Write a program that reads a file from disk in comma-separated format (CSV).
 * Every line must contain a list of number separated by commas. The program
 * must output the average for every line plus the average for the whole file.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 01 Feb 2015
 * 
 */
public class TemperatureAverages {
	public static void main(String args[]) {
		// use launch to have a single System.exit(1) for ERROR
		TemperatureAverages sorti = new TemperatureAverages();
		try {
			sorti.launch(args);
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage()); // print exception to STDERR
			System.exit(1); // set error indication
		}
	}

	public void launch(String args[]) {
		if (args.length != 1) {
			String msg = "You must specify a single input csv file.\n"
					+ "For example to use 'temperatures.csv`:\n\n"
					+ "\t\tjava -classpath .... TemperatureAverages temperatures.csv \n\n";
			throw new RuntimeException(msg);
		}

		// read file contents into a List of strings (throws runtime error on
		// any problem)
		List<String> lines = ReadFile2List.read(args[0]);

		// check that we can parse each line
		for (String itLine : lines) {
			if (itLine.charAt(0) != '#') {
				parseCSVLine2Double(itLine);
			}
			System.out.println(itLine);
		}

	}

	/**
	 * parses a simple comma separated list of numbers into a list of Doubles
	 * ignores white space
	 * 
	 * @param inLine
	 *            input line
	 * @return list of doubles
	 */
	private List<Double> parseCSVLine2Double(String inLine) {
		String noSpace = inLine.replaceAll("\\s", ""); // get rid of any white
														// space
		// split the inLine into words
		String words[] = noSpace.split(",");
		System.out.println("Debug split into " + words.length);
		List<Double> dList = new ArrayList<Double>();
		int lineCount = 0;
		for (String itWord : words) {
			lineCount++;
			
			try {
				Double value = Double.parseDouble(itWord);
				dList.add(value);
				System.out.println("Debug " + value);
			} catch (NumberFormatException ex) {
				throw new RuntimeException("ERROR " + ex
						+ " found passing numerical value from word " + itWord
						+ " found line number " + lineCount);
			}
		}
		return dList;
	}
}