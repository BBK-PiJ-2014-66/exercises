// Oliver Smart Birbeck MSc Computer Science PiJ coursework From September 2014
// 
// Week 1 Exercise 9
// Read an arbitrarily long sequence of positive numbers from the user, until -1
// is entered. At that point, print ”Yes” if the numbers were consecutive and
// increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,1,0,11,-1” 
//  should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1”
// should output ”No”
public class GoingUp09 {
	public static int promptForInt(String prompt) {
		System.out.print(prompt);
		String str = System.console().readLine();
		// no error check on type conversion
		int thisint = Integer.parseInt(str);
		return thisint;
	}

	public static void main(String[] args) {
		boolean consect = true;
		int numread = 0;
		int previousnum = -1;
		while (true) { // infinite loop
			int thisnum = promptForInt("Please enter a positive integer -1 to finish: ");
			if (thisnum == -1)
				break;
			numread++;
			if (numread == 1) { // ignore first number
			} else if (numread < 1) {
				System.out.println("Error you entered a non-positive integer");
				return;
			} else if (thisnum != previousnum + 1) {
				consect = false;
			}
			previousnum = thisnum;
		}
		if ((numread > 1) && consect) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
