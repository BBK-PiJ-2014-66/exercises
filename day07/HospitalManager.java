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
		patientListStart.printAll();
	}
}
