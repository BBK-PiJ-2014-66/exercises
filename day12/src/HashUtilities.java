/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 17 Nov 2014
 *  
 * Day 8 Exercise 5.1 Hash function.     
 *
 */
public class HashUtilities{
	public static int SHORTHASHMAX = 999; // never hard code any constant!
        public static int shortHash( int hash) {
		/* returns a shortened version of the hash: 
		 * between 0 and SHORTHASHMAX
		 */
                return Math.abs(hash)%(SHORTHASHMAX+1);
        }

}
