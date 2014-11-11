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

	public Patient( String name, int age, String illness) { // from lecture notes
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	public void addPatient( Patient newPatient) { // from lecture notes
		if (this.nextPatient == null) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
        public boolean deletePatient(Patient patient) {  // from lecture notes
		if (nextPatient == null) {
			// patient to remove was not found
			return false;
		} else if (nextPatient.name.equals(patient.name) &&
                           nextPatient.age==patient.age &&
                           nextPatient.illness==patient.illness ) { // corrected
			// We found It is the next one!
			// Now link this patient to the one after the next
			nextPatient =  nextPatient.nextPatient;
			return true;
		} else {
			return nextPatient.deletePatient(patient);
		}

        }

	// another addPatient that is easier to use 
	public void addPatient(String name, int age, String illness) {
 		Patient newPatient = new Patient( name, age, illness);
		addPatient( newPatient);
	}
	public void printAll() {
		System.out.println(this.details());
		if (this.nextPatient == null) {
			return;
		} else {
			this.nextPatient.printAll();
		}
	}
	public String details() {
		return " Patient \"" + name + "\" is " + age + 
                       " years and suffers from \"" +  illness + "\"";
	}
        public int numberFollowing() { // number of patients that follow this one
		if (nextPatient == null) {
			return 1;
		} else {
			return 1 + nextPatient.numberFollowing();
		}
	}

	// return the nextPatient object to enable removal of the first element
	public Patient getNextPatient() {
		return nextPatient;
	}

}
