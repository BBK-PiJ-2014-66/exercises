package likeunix;

import java.util.ArrayList;
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
		TemperatureAverages tavg = new TemperatureAverages();
		try {
			tavg.launch(args);
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
		int lineCount = 0;
		for (String itLine : lines) {
			lineCount++;
			if (itLine.charAt(0) != '#') {
				try {
					parseCSVLine2Double(itLine);
				} catch (RuntimeException ex) {
					throw new RuntimeException(ex.getMessage() + "\n"
							+ "ERROR found passing line number " + lineCount
							+ " '" + itLine + "'");
				}
			}
		}
		// 2nd pass to parse the line
		System.out
				.println("# average value for each line added as last column");
		List<Double> allValues = new ArrayList<Double>();
		for (String itLine : lines) {
			if (itLine.charAt(0) != '#') {
				List<Double> lineValues = parseCSVLine2Double(itLine);
				System.out.println(itLine + "," + Average(lineValues));
				allValues.addAll(lineValues);
			}
		}
		System.out.println("# average value for all data in file "
				+ Average(allValues));

	}

	/**
	 * Returns the mean (aka average) of a list of doubles N.B. returns NaN if
	 * size is zero or supplied with a null list;
	 * 
	 * @param values
	 * @return the mean
	 */
	private static double Average(List<Double> values) {
		if (values == null)
			return Double.NaN;
		double total = 0.;
		for (Double dIt : values) {
			total += dIt;
		}
		return total / ((double) values.size());
	}

	/**
	 * parses a simple comma separated list of numbers into a list of Doubles
	 * ignores white space
	 * 
	 * @param inLine
	 *            input line
	 * @return list of doubles
	 * @throws RuntimeException
	 *             if there was an error getting value from a line
	 */
	private List<Double> parseCSVLine2Double(String inLine) {
		String noSpace = inLine.replaceAll("\\s", ""); // get rid of any white
														// space
		// split the inLine into words
		String words[] = noSpace.split(",");
		List<Double> dList = new ArrayList<Double>();
		for (String itWord : words) {
			try {
				Double value = Double.parseDouble(itWord);
				dList.add(value);
			} catch (NumberFormatException ex) {
				throw new RuntimeException("ERROR '" + ex.getMessage()
						+ "' found passing numerical value from word '"
						+ itWord + "'");
			}
		}
		return dList;
	}

}