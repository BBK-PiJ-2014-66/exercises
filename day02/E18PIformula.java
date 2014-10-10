/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 2 Exercise 1 Pi (**)
 * task set:
 * Pi, the ratio of a circle’s circumference to its diameter. can be 
 * computed by adding the following terms: (formula)
 * 
 * (4/1) -(4/3) +(4/5) -(4/7) +(4/9) -(4/11)
 *
 * Create a program that asks the user for a number n and then 
 * calculates n of this infinite sum. How many terms
 * do you need to get the first three digits right (3.14)? 
 * How many for the first 10 digits (3.14159265358. . . ...)?
 *
 * In practice many terms are needed. So instead of inputting n
 * lets worry about how many terms are need to get 
 * 1 digit "right"
 * 2 digits "right"
 * 3 digits "right" 
 * assume right means simple truncation.
 *
 *  @author Oliver S. Smart
 */

public class E18PIformula {
	public static int nDigitsAgree( double aNum, double bNum) {
		// coded to deal with numbers less than 10	
		if (Math.abs(aNum)>10. || Math.abs(bNum)>10.) {
			System.out.println("ERROR nDigitsAgree cannot cope with numbers >10");
			System.exit(1); // terminate program (should probably throw an exception)
		}
		int nagree=0;
		while (true) {
			if ((int)aNum != (int)bNum)
				break;
			aNum *= 10.;
			bNum *= 10.;
			nagree++;
		}
		return nagree;
	}
	public static void main(String[] args) {
		int numbTerms = 0; // user input number 

		// parse command lines to get numbTerms
		String useMessage = "Calculates PI from the series to given number. Run \n\n"
				+ "    java E18PIformula NTERMS\n\n"
				+ "where NINPUT is an non-negative integer\n";
		if (args.length == 1) {
			try {
				numbTerms = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("ERROR01 parsing integer from \"" + args[0]
						+ "\" N.B. the single argument must be an integer\n");
				System.out.print(useMessage);
				System.exit(1); // terminate program with ERROR status 1
			}
		} else {
			System.out.print(useMessage);
			System.exit(2); // terminate program with ERROR status 2
		}

                double numerator= -4.0;// choose so zeroth term is (4/1) as stated
                double denominator= -1.0;
		double piEstimate=0.;
		int currentDigitsAgree=0;
                int nDigitsAgree;
		double dNumbTerms=numbTerms;
		// use a double count as we get to such lage numbers where integer addition by one 
		for (double dc=0.0; dc < dNumbTerms+1.; dc += 1.0) { 
                        numerator = -numerator;
			denominator = denominator + 2.0;
			piEstimate += (numerator/denominator);
                        nDigitsAgree = nDigitsAgree( piEstimate, Math.PI);
			if ((nDigitsAgree > currentDigitsAgree) || (dc==numbTerms)) {
				currentDigitsAgree = nDigitsAgree;
				System.out.println("\t numTerm=" + dc + "\t piEst=" + piEstimate + "\t nDigitsAgree=" + nDigitsAgree );
			}
		}
	}
}
