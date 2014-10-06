// Oliver Smart Birbeck MSc Computer Science PiJ coursework From September 2014
// 
// Week 1 Exercise 5 Multiplication
// Write a program that requests two numbers from the user and then outputs its
// product. You cannot use the "*" operator.
//
// N.B. must assume number is an integer

public class Multiplication05 {
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

		int product = 0;
		boolean bpositive = true;
		if (numb < 0) {
			numb = -numb;
			bpositive = false;
		}
		// idea add together numa + numa + numa a total of numb times
		for (int ic = 0; ic < numb; ic++)
			product += numa;
		if (!bpositive) {
			numb = -numb;
			product = -product;
		}
		System.out.println(numa + " * " + numb + " = " + product);
	}
}
