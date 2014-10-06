// Oliver Smart Birbeck MSc Computer Science PiJ coursework From September 2014
// Week 1 task 4 Prime numbers. Brief:
// Write a program that asks a number from the user, then says whether the
// number is prime or not. Remember that a number that is divisible by any
// number apart from 1 and itself is prime. You can use the modulo 
// operator (if // a % b // is zero, then a is divisible by b).

// This solution is nieve brute force
public class Prime04 {
	public static void main(String[] args) {
		System.out.print("Please enter integer number: ");
		String str = System.console().readLine();
		int numa = Integer.parseInt(str);

		// according to wikipedia http://en.wikipedia.org/wiki/Prime_number
		// Prime numbers have to be greater than one
		if (numa > 1) {
			int isprime = 1;
			// go thru the odd numbers up to half the size of the input
			for (int iodd = 1; iodd < numa / 2; iodd = iodd + 2) {
				int icheck = iodd;
				// but do not check 1 instead check 2, 3, 5, 7, 9
				if (iodd == 1)
					icheck = 2;
				if (numa % icheck == 0) {
					System.out.println("Number " + numa
							+ " is not prime as it is divisible by " + icheck);
					isprime = 0;
					break;
				}
			}
			if (isprime == 1)
				System.out.println("Number " + numa + " is prime.");

		} else {
			System.out.println("Number " + numa
					+ " is not prime because it is not greater than one.");
		}

	}
}
