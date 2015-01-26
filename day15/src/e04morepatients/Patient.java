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
	
	/**
	 * Constructor
	 * 
	 * @param yearOfBirth
	 * @param name
	 */
	Patient( int yearOfBirth, String name) {
		this.yearOfBirth = yearOfBirth;
		// should validate yOB here
		this.name = name;
	}

}
