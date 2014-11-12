/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 11 Nov 2014
 *  
 * Day 7 Exercise 6 Circular lists
 *
 * Once again Start from the copies of HospitalManager and Patient classes as 
 * written in exercise 03 and 04  but contained within this java file
 */
public class E06CircularList {
	public static void main( String[] args) {
	 	HospitalManager hm = new HospitalManager();
		hm.launch();
	}
}
class HospitalManager{
	private Patient patientListStart = null;

	private void printPatients() {
		// recursive way of finding out how many patients and printing them:
		System.out.println("There are " + patientListStart.numberFollowing() + " patients:");
		patientListStart.printAll();
	}
	public void launch() {
		patientListStart =  new Patient("John",31,"Tuberculosis");
                patientListStart.addPatient("Mary",62,"Meningitis");
		patientListStart.addPatient("Harry",23,"Ebola");
		patientListStart.addPatient("Henry",4,"Measles");
		patientListStart.addPatient("Lucy",15,"Acne");
		patientListStart.addPatient("Larry",46,"HIV");
		patientListStart.addPatient("Henry",47,"Broken leg");
		patientListStart.addPatient("Kate",78,"Dementia");
		patientListStart.addPatient("Elizabeth",109,"Bone loss");
		patientListStart.addPatient("Nigel",10,"Diabetes");
		printPatients();
                System.out.println("Delete the 2nd older Henry returns " + patientListStart.deletePatient( new Patient("Henry",47,"Broken leg")));
		printPatients();
		// now want to remove the first patient
		patientListStart = patientListStart.getNextPatient();
                System.out.println("Remove the first patient");
		printPatients();
	}
}
class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private boolean last; // only true for the last element in the circular list

	public Patient( String name, int age, String illness) { 
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = this;
		this.last = true;
	}
	public void addPatient( Patient newPatient) { // from lecture notes
		if (this.last) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
			this.last = false;
                        newPatient.nextPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
        public boolean deletePatient(Patient patient) {  // from lecture notes
		if (nextPatient.last) { // not correct
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
		// to check everything is in order print the next patient as well
		String lineOut = this.details();
		if (lineOut.length()<56)
			lineOut +="\t";
	        lineOut +="\tis followed by" + nextPatient.details();
		System.out.println(lineOut);
		if (this.last) {
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
		if (last) {
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
