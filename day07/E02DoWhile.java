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
	public static String singOrPlur(String strSingle, String strPlural, int inNum) {
		if (inNum==1) return strSingle;
		return strPlural;	
	}
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
			if (inputMark == -1) {
				; // do not count this one
			} else if (70 <= inputMark && inputMark <= 100) {
				numberStudents++;
				numberDistinctions++;
			} else if (50 <= inputMark && inputMark <= 69 ) {
				numberStudents++;
				numberPasses++;
			} else if (0 <= inputMark && inputMark <= 49 ) {
				numberStudents++;
				numberFails++;
			} else {
				numberInvalids++;
			}
		} while( inputMark != -1);
		// rather than having loads of variables make up an output string
		String outStr = "There " + singOrPlur("is ","are ",numberStudents); 
		outStr +=  numberStudents + " student" +  singOrPlur("","s",numberStudents);
                outStr += ": ";
		outStr += numberDistinctions + " distinction" + singOrPlur("","s",numberDistinctions);
		outStr += ", " + numberPasses + " pass" + singOrPlur("","es", numberPasses);
		outStr += ", " + numberFails + " fail" + singOrPlur("","s",numberFails);
		if (numberInvalids !=0 ) {
			outStr +=  " (plus " + numberInvalids;
			outStr +=   " invalid" + singOrPlur("","s",numberInvalids) + ")";
		}
		System.out.println(outStr);
	}
}
