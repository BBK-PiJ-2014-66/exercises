/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 2 Exercise 13 All the primes up to 1,000 (*)
 * task set:
 *
 * Write a program that prints all on screen all prime numbers up to 1,000.
 *
 * Although we are not used to use methods. Have already written  
 * ../day01/Prime04A.java and using the method isPrime means the code 
 * is so much clearer
 *
 * output checked against http://primes.utm.edu/lists/small/1000.txt
 * 
 *  @author Oliver S. Smart
 */

public class E13AllThePrimesUpTo1000 {

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
		for ( int numTest= 0; numTest < 1001; numTest++) {
			if (isPrime(numTest)) {
				// pretty output use tab and newline every fifth
				System.out.print("\t" + numTest);
				primesOutputCount++;
				if (primesOutputCount%5 == 0) 
					System.out.println();
			}
		}
		System.out.println(); // complete last line
	}
}
