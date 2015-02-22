package twelve;

/**
 * A class that stores the temperature high for a day
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 2"
 *         page 3
 *
 */
public class HighTemp {
	private int hTemp;

	public HighTemp(int hTemp) {
		this.hTemp = hTemp;
	}

	/**
	 * Return true if the invoking HighTemp object has the same temperature as
	 * otherHT
	 * 
	 * @param otherHT
	 * @return true if the two temperatures are the same false otherwise.
	 */
	public boolean sameTemp(HighTemp otherHT) {
		return hTemp == otherHT.hTemp;
	}

	/**
	 * Return true if the invoking HighTemp object has a high temperature that
	 * is less than otherHT 
	 * 
	 * @param otherHT
	 * @return true if the temperature is less. false otherwise
	 */
	public boolean lessThanTemp(HighTemp otherHT) {
		return hTemp < otherHT.hTemp;
	}

}
