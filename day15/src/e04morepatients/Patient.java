/**
 * PiJ day 15 Exception handling
 * 
 * Exercise 1 4 More patients
 * 
 * task: 
 * 
 * Write a class that asks for data (name and year of birth) about new 
 * patients in a hospital and keeps them in a list of Patient. 
 * The constructor of Patient must throw an IllegalArgumentException 
 * if the age of the patient is negative or greater than 130.
 * 
 * This is the patient class
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 26 Jan 2015
 */

package e04morepatients;

public class Patient {
	public int yearOfBirth;
	public String name;
	private static int AGEMAX = 130;

	/**
	 * Constructor
	 * 
	 * @param yearOfBirth
	 * @param name
	 */
	Patient(int yearOfBirth, String name) {
		int age = currentYear() - yearOfBirth;
		if (age < 0 || age > AGEMAX) {
			throw new IllegalArgumentException(
					"tried to creat patient with YOB= " + yearOfBirth
							+ " so age= " + age
							+ " but age must be in range 0 to " + AGEMAX);
		}

		this.yearOfBirth = yearOfBirth;
		this.name = name;
	}

	/**
	 * provides the current year.
	 * 
	 * @return
	 */
	private int currentYear() {
		return 2015; // for now hard code
	}

}
