/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 17 Nov 2014
 *  
 * Day 8 Exercise 5.1 Hash function. Testing program
 *
 */
public class TestHashUtilities{
	public static void main( String args[]) {
		System.out.println("Program to test out shortHash method, that for a");
		System.out.println("  hash integer returns a value between 0 and " 
			+ HashUtilities.SHORTHASHMAX + ",");
		System.out.println("  and can be used to produce shortened hash code for binning");
		System.out.println(" first a few tests for important values -1, 0, 999 and 1000");
		printReport(-1);
		printReport(0);
		printReport(999);
		printReport(1000);
		while(true) {
			System.out.print("Enter test string (or to stop EOF using ctrl-D or crtl-Z enter): ");
			String inStr = System.console().readLine();
			if (inStr == null) break;
			int hash = inStr.hashCode();
			printReport(hash);
		}
		System.out.println();
	}
	private static void printReport( int hash) {
			int smallHash = HashUtilities.shortHash(hash);
			String checksOut = " is in range";
			if ( smallHash<0 || smallHash> HashUtilities.SHORTHASHMAX) checksOut = " ERROR OUT OF RANGE";
			System.out.println(" hash = " + hash + " shortHash = " + smallHash +  " is in range"); 
	}
}
