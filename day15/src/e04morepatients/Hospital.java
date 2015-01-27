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
		while (true) {
			String name = PromptUtils
					.promptForString("Enter name of new patient (ctrl-D to finish): ");
			if (name == null) // ctrl-D EOF entered
				break;
			int year = PromptUtils
					.promptForInt("Enter year of birth for patient " + name
							+ " (or ctrl-D to abort add): ");
			Patient addPatient = new Patient(year, name);

		}
	}
}
