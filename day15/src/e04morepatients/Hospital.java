package e04morepatients;

import java.util.List;
import java.util.ArrayList;

/**
 * PiJ day 15 Exception handling
 * 
 * Exercise 1 4 More patients
 * 
 * task:
 * 
 * Write a class that asks for data (name and year of birth) about new patients
 * in a hospital and keeps them in a list of Patient. The constructor of Patient
 * must throw an IllegalArgumentException if the age of the patient is negative
 * or greater than 130.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 26 Jan 2015
 */
public class Hospital {
	private List<Patient> patientList;

	Hospital() {
		patientList = new ArrayList<Patient>();
	}

	public int numberOfPatients() {
		return patientList.size();
	}

	/**
	 * Little script to prompt for patient info and check that valid reply made.
	 * 
	 * @param Args
	 */
	public static void main(String Args[]) {
		Hospital hospital = new Hospital();
		boolean finished = false;
		while (!finished) {
			System.out.print("Enter name of new patient (ctrl-D to finish): ");
			String name = System.console().readLine();
			if (name == null) {
				finished = true;
			} else {
				System.out.print("Enter year of birth for patient " + name
						+ " (or ctrl-D to abort add): ");
				String inYear = System.console().readLine();
				if (inYear == null) // abort this input
					continue;
			}

		}
	}
}
