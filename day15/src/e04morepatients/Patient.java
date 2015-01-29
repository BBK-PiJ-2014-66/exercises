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

import java.util.Calendar;

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
					" YOB=" + yearOfBirth
							+ " gives illegal age=" + age
							+ ". Age must be in range 0 to " + AGEMAX + "!");
		}
	    if (name.length()<1) {
			throw new IllegalArgumentException(
					"blank patient names are not allowed.");
	    }
		this.yearOfBirth = yearOfBirth;
		this.name = name;
	}

	/**
	 * provides the current year.
	 * 
	 * @return the current year - for instance 2015
	 */
	public static int currentYear() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR); 
	}

}
