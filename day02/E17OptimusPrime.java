/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 2 Exercise 17 Optimus Prime (**)
 * task set:
 * Write a program that reads an integer number from the user, and 
 * then outputs the closest prime number. If there are two prime 
 * numbers at the same distance, it should output both. For instance, 
 * if the user enters 5116, the output should be 5113 and 5119.
 *
 * not told to prompt for number so take as a command line argument
 * adapt code from E12NumberPiramids.java 
 *
 *  @author Oliver S. Smart
 */

public class E17OptimusPrime {


        public static boolean isPrime(int itest) {
                // returns true if itest is prime
                // according to wikipedia http://en.wikipedia.org/wiki/Prime_number
                // Prime numbers have to be greater than one
                if (itest < 2) {
                        return false; //
                }
                for (int iodd = 1; iodd < itest / 2; iodd = iodd + 2) {
                        int icheck = iodd;
                        // but do not check 1 instead check 2, 3, 5, 7, 9
                        if (iodd == 1)
                                icheck = 2;
                        if (itest % icheck == 0)
                                return false; // not a prime as icheck a divisor
                }
                return true;
        }

	public static void main(String[] args) {
		int userNumb = 0; // user input number 

		// parse command lines to get userNumb
		String useMessage = "Finds the nearest prime number to given number. Run \n\n"
				+ "    java E17OptimusPrime NINPUT\n\n"
				+ "where NINPUT is an integer\n";
		if (args.length == 1) {
			try {
				userNumb = Integer.parseInt(args[0]);
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

                System.out.print(" Nearest prime to " + userNumb + " is ");
		if (isPrime(userNumb)) {
			System.out.println(userNumb); // userNumb is a prime
		}
                else {
			Integer LowerNumb=userNumb,  UpperNumb=userNumb;
			Boolean FoundPrime=false;
                        while (!FoundPrime) {
				LowerNumb--; // count down from userNumb
				UpperNumb++; // count up 
                                if (isPrime(LowerNumb)) {
					FoundPrime = true;
					System.out.print(LowerNumb); //  is a prime
 				}

	                        if (isPrime(UpperNumb)) {
					if (FoundPrime)
						System.out.print(" and ");
					FoundPrime = true;
					System.out.print(UpperNumb); //  is a prime
 				}
			}
			System.out.println(); // finish output line
		}

	}
}
