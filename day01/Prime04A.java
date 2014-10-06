// Oliver Smart Birbeck MSc Computer Science PiJ coursework From September 2014
// Week 1 task 4 Prime numbers. Brief:
// Write a program that asks a number from the user, then says whether the
// number is prime or not. Remember that a number that is divisible by any
// number apart from 1 and itself is prime. You can use the modulo 
// operator (if // a % b // is zero, then a is divisible by b).

// This solution is nieve brute force
// here use separate methods for clarity and testing
public class Prime04A {
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

	public static int promptForInt(String prompt) {
		System.out.print(prompt);
		String str = System.console().readLine();
		// no error check on type conversion
		int thisint = Integer.parseInt(str);
		return thisint;
	}

	public static void main(String[] args) {
		System.out.println("Debug check routine works by"
				+ "finding prime numbers range 0 to 100:");
		System.out.print("Debug");
		for (int icheck = 0; icheck < 101; icheck++) {
			if (isPrime(icheck))
				System.out.print("  " + icheck);
		}
		System.out.println(""); //
		int numa = promptForInt("Please enter integer number: ");
		String notornull = "NOT ";
		if (isPrime(numa))
			notornull = "";
		System.out.println("Number " + numa + " is " + notornull + "prime.");
	}
}
