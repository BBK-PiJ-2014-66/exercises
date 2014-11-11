/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 11 Nov 2014
 *  
 * Day 7 Exercise 3 Singly-linked lists
 *
 * HospitalManager class from the notes
 */
public class HospitalManager{
	private Patient patientListStart = null;
	public static void main( String[] args) {
	 	HospitalManager hm = new HospitalManager();
		hm.launch();
	}
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
	private void launch() {
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
		printPatients();
                System.out.println("Delete the 2nd older Henry returns " + patientListStart.deletePatient( new Patient("Henry",47,"Broken leg")));
		printPatients();
		// now want to remove the first patient
		patientListStart = patientListStart.getNextPatient();
                System.out.println("Remove the first patient");
		printPatients();
		System.out.println("\n\nTest iterative print and find out number of patients: ");
		printPatientsIteratively();
	}
}
