/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 11 Nov 2014
 *  
 * Day 7 Exercise 3 Singly-linked lists
 *
 * Patient class from the notes
 */
public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient( String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	public void addPatient( Patient newPatient) {
		if (this.nextPatient == null) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
}
