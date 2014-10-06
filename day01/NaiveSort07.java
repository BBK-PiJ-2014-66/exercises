// Oliver Smart Birbeck MSc Computer Science PiJ coursework From September 2014
// 
// Week 1 Exercise 7 Naive sorting
// Write a program that reads three numbers and prints them in order,
// from lowest to highest
public class NaiveSort07 {
	public static int promptForInt(String prompt) {
		System.out.print(prompt);
		String str = System.console().readLine();
		// no error check on type conversion
		int thisint = Integer.parseInt(str);
		return thisint;
	}

	public static void main(String[] args) {
		int numa = promptForInt("Please enter the 1st integer number: ");
		int numb = promptForInt("Please enter the 2nd integer number: ");
		int numc = promptForInt("Please enter the 3rd integer number: ");
		int mymin, mymax, middle;
		// Use Math.min
		// http://docs.oracle.com/javase/6/docs/api/java/lang/Math.html#min%28int,%20int%29
		mymin = Math.min(numa, numb); // find smallest of first two numbers
		mymin = Math.min(mymin, numc); // then compare with thir
		// N.B. an alternative to Math.min would the ternary operator:
                //mymin = (numa < numb) ? numb : numa;
                //mymin = (numc < mymin) ? numc : mymin;
                // but I find this much less readable.

		mymax = Math.max(numa, numb);
		mymax = Math.max(mymax, numc);

		// middle value can be found the sum of all three minus the highest and
		// lowest
		middle = (numa + numb + numc) - (mymin + mymax);

		System.out.println("Numbers lowest to highest " + mymin + " " + middle
				+ " " + mymax);

	}
}
