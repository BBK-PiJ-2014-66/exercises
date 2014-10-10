/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 2 Exercise 14 Up to 1,000 primes (*)
 * task set:
 *
 * Modify the program that you wrote for the former exercise so that 
 * it writes on screen the first 1,000 primes.
 * 
 *  @author Oliver S. Smart
 */

public class E14First1000Primes {

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
		int primesOutputCount=0;
                int numTest=1;
                int numberPrimesToOutput = 1000;
                while (primesOutputCount < numberPrimesToOutput) {
                        numTest++;
			if (isPrime(numTest)) {
				// pretty output use tab and newline every fifth
				System.out.print("\t" + numTest);
				primesOutputCount++;
				if (primesOutputCount%5 == 0) 
					System.out.println();
			}
		}
		if (primesOutputCount%5 != 0)
			System.out.println(); // complete last line
	}
}
