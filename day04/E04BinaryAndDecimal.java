/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 4 Exercise 4 Binary and decimal
 *
 * task set:
 *	Create a program in which you define the following methods:
 *
 *	binary2decimal(String): takes from the user a binary number (with digits 0 and
 *	1) and returns the corresponding number in decimal (base-10, with digits
 *	between 0 and 9). 
 *
 *	decimal2binary(int): the opposite of the previous one: takes a decimal number
 *	and returns the corresponding binary number. 
 *
 *	The program must offer a menu to the user with two options. The first one takes 
 *	binary number from the user and
 *	returns the corresponding decimal number. The second one does the opposite:
 *	takes a decimal number and returns a binary number. The program should use the
 *	methods defined.
 *	
 *
 *  @author Oliver S. Smart
 *
 * Initial thoughts
 * 	What kind of error checking? Lets do a method isBinary( string) and return false
 *	if it has something other than 0 and 1.
 *
 *	User menu required but first write a -test 
 */
public class E04BinaryAndDecimal {
	public static boolean isBinary( String inStr) {
		for ( int cc = inStr.length()-1; cc >= 0; cc--) {
			char myChr = inStr.charAt(cc);
			if (myChr=='1' || myChr=='0') 
				; 
			else if ( (cc==0) & (myChr=='-') ) 
				; 
			else
				return false;
			
		}
		return true;
	}
	public static int binary2decimal( String inStr) {
		int powerOfTwo=1;
		int answer=0;
		for ( int cc = inStr.length()-1; cc >= 0; cc--) {
			char myChr = inStr.charAt(cc);
			if (myChr=='1') {
				answer += powerOfTwo;
			}
			else if ( (cc==0) & (myChr=='-') ) { // initial negative
				answer *= -1;
			}
			//System.out.println("debug cc=" + cc + " character =\"" + myChr +"\"" + 
		 	//	" answer=" + answer + " powerOfTwo= " + powerOfTwo);
			powerOfTwo *= 2;
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("E04BinaryAndDecimal");
                if (args.length==1 && args[0].equals("-test"))  {
			System.out.println("-test procedure: ");
			System.out.println("binary2decimal(\"10011101\") = " + binary2decimal("10011101"));
			System.out.println("binary2decimal(\"-101\") = " + binary2decimal("-101"));
			System.out.println("binary2decimal(\"0\") = " + binary2decimal("0"));
			System.out.println("isBinary(\"10011101\") = " + isBinary("-10011101"));
			System.out.println("isBinary(\"123\") = " + isBinary("123"));
		}
	}
}


