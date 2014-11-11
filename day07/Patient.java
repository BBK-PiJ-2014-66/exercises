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
	// another addPatient that is easier to use 
	public void addPatient(String name, int age, String illness) {
 		Patient newPatient = new Patient( name, age, illness);
		addPatient( newPatient);
	}
	public void printAll() {
		System.out.print(" Patient \"" + name + "\" is " + age);
		System.out.println(" years and suffers from \"" +  illness + "\"");
		if (this.nextPatient == null) {
			return;
		} else {
			this.nextPatient.printAll();
		}
	}
        public int numberFollowing() { // number of patients that follow this one
		if (nextPatient == null) {
			return 1;
		} else {
			return 1 + nextPatient.numberFollowing();
		}
	}
}