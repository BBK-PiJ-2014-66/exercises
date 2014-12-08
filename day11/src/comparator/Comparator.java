package comparator;

/**
 * PiJ exercises day 11
 * 
 * Exercise 1 Don't Repeat Yourself
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * 
 */
public class Comparator {

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public int getMax(int n, int m) {
		return (int) getMax((double) n, (double) m);
	}

	/**
	 * 
	 * method extended to check validity
	 * 
	 * @param number1
	 *            that should contain a valid integer number
	 * @param number2
	 *            that should contain a valid integer number
	 * @return string with the large integer number or null if either string is
	 *         invalid
	 */
	public String getMax(String number1, String number2) {
		try {
			int n1 = Integer.parseInt(number1);
			int n2 = Integer.parseInt(number2);
			int nMax = getMax(n1, n2);
			return Integer.toString(nMax);
		} catch (NumberFormatException e) {
			// one of them not an integer!
			return null;
		}
	}
}
