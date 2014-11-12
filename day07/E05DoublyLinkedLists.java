/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 11 Nov 2014
 *  
 * Day 7 Exercise 5 Doubly-linked lists
 *
 * start from the copies of HospitalManager and Patient classes as 
 * written in exercise 03 and 04  but contained within this java file
 * Take out the public to make the classes package-private
 * https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 */
public class E05DoublyLinkedLists {
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
	private void printPatientsIteratively() {
		Patient loopPatient = patientListStart;
		int countPatients = 0;
		String tableOfPatients="";
		while (loopPatient != null) {
			tableOfPatients += loopPatient.details() + "\n";
			countPatients++;
			loopPatient = loopPatient.getNextPatient();
		}
		System.out.println("There are " + countPatients + " patients:");
		System.out.println(tableOfPatients);
	}
	private void traverseListForwardsAndBackwards() {
		/* to fufil exercise sheet point 2. 
                   "Traverse it forwards and backwards printing the content of each element" */
		Patient loopPatient = patientListStart;
		int countPatients = 0;
		System.out.println("The list traversed forward is: ");
		while (loopPatient != null) {
                        countPatients++;
			System.out.println("\tPatient number " + countPatients +
                                           " details: " + loopPatient.details());
                        loopPatient = loopPatient.getNextPatient();
                }
		System.out.println("The list traversed backward is: ");
		loopPatient = patientListStart.lastPatient(); // need to start at the end
		while (true) {
			System.out.println("\tPatient number " + countPatients +
                                           " details: " + loopPatient.details());
                        loopPatient = loopPatient.getPreviousPatient();
			if (loopPatient == null) break; // no more patients
                        countPatients--;
		}


        }
	public void launch() {
		patientListStart =  new Patient("John",33,"Tuberculosis");
                patientListStart.addPatient("Mary",66,"Meningitis");
		patientListStart.addPatient("Harry",23,"Ebola");
		patientListStart.addPatient("Henry",7,"Measles");
		patientListStart.addPatient("Lucy",17,"Acne");
		patientListStart.addPatient("Larry",41,"HIV");
		patientListStart.addPatient("Henry",47,"Broken leg");
		patientListStart.addPatient("Kate",77,"Dementia");
		patientListStart.addPatient("Elizabeth",103,"Bone loss");
		patientListStart.addPatient("Nigel",20,"Diabetes");
		traverseListForwardsAndBackwards();
                System.out.println("Delete the 2nd older Henry returns " + patientListStart.deletePatient( new Patient("Henry",47,"Broken leg")));
		// now want to remove the first patient
                System.out.println("Remove the first patient John");
		patientListStart = patientListStart.getNextPatient();
                // doubly linked list so need to tidy 
		patientListStart.makeThisPatientFirst();
			
		traverseListForwardsAndBackwards();
	}
}
class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;

	public Patient( String name, int age, String illness) { // from lecture notes
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}
	public void addPatient( Patient newPatient) { // from lecture notes
		if (this.nextPatient == null) {
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
                        newPatient.previousPatient = this;
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
			// and need to link back
			nextPatient.previousPatient = this;
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
	public Patient getPreviousPatient() {
		return previousPatient;
	}
        public Patient lastPatient() { 
                if (nextPatient == null) {
                        return this;
                } else {
                        return nextPatient.lastPatient();
		}
        }
	public void makeThisPatientFirst() {
		previousPatient = null;
	}

}
