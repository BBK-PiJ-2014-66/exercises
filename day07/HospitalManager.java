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
	private void launch() {
		Patient firstPatient = new Patient("John",33,"Tuberculosis");
		patientListStart = firstPatient;
		Patient anotherPatient = new Patient("Mary",66,"Meningitis");
		patientListStart.addPatient(anotherPatient);
		patientListStart.addPatient("Harry",23,"Ebola");
		patientListStart.addPatient("Henry",7,"Measles");
		patientListStart.addPatient("Lucy",17,"Acne");
		patientListStart.addPatient("Larry",41,"HIV");
		patientListStart.addPatient("Henry",47,"Broken leg");
		patientListStart.addPatient("Kate",77,"Dementia");
		patientListStart.addPatient("Elizabeth",103,"Bone loss");
		patientListStart.addPatient("Nigel",20,"Diabetes");
		// recursive way of finding out how many patients and printing them:
		System.out.println("There are " + patientListStart.numberFollowing() + " patients:");
		patientListStart.printAll();
	}
}
