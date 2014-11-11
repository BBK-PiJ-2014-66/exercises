/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 10 Nov 2014
 *  
 * Day 7 Exercise 2 do {practice} while (!understood);

 * task set:

Make a class that implements a method that reads a list of marks between 0 and
100 from the user, one per line, and stops when the user introduces a -1. The
program should output at the end (and only at the end) how many marks there
were in total, how many were distinctions (70–100), how many were passes
(50–69), how many failed (0–49), and how many were invalid (e.g. 150 or -3).
Use readLine() exactly once. The output may look similar to this example:

	Input a mark: 13
	Input a mark: 45
	Input a mark: 63
	Input a mark: 73
	Input a mark: 101
	Input a mark: 45
	Input a mark: 18
	Input a mark: 92
	Input a mark: -1
	There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).
 *
 * Thoughts:
 * The example says "students" and "fails" as there are more that one but 
 * use singular "fail" and "invalid". The plural of "pass" is "passes".
 * 0 is plural!
 *
 */
class E02DoWhile {
	public static void main( String args[]) {
		int numberStudents = 0;
		int numberDistinctions = 0;
		int numberPasses = 0;
		int numberFails = 0;
		int numberInvalids = 0;
		int inputMark=0;
		do {
			System.out.print("Input a mark: ");
			String inputStr = System.console().readLine();
			inputMark = Integer.parseInt(inputStr); // no error check
			if (inputMark != -1) {
				numberStudents++;
			}
		} while( inputMark != -1);
		// need to do singular vs plural use ternary operator 
		String isOrAre = (numberStudents == 1 ) ? "is" : "are";
		System.out.print("There " + isOrAre + " " + numberStudents + " ");
		String studentOrStudents = (numberStudents == 1 ) ? "student" : "students";
		System.out.print(studentOrStudents + ": ");
		System.out.println();
	}
}
