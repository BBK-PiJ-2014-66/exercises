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
	public static String decimal2binary(int inInt) {
		if (inInt==0) 
			return "0";
		boolean isNegative = false;
		if (inInt<0) {
			inInt *= -1;
			isNegative = true;
		}
		String binaryStr="";
		while( inInt>0) { // allowed to work on inInt it is passed by value;
			binaryStr = (inInt%2) + binaryStr; // keep remainder
			inInt = inInt/2;
		}
		if (isNegative) 
			binaryStr = '-' +  binaryStr; 
		return binaryStr;
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
			System.out.println("decimal2binary(9) = " + decimal2binary(9));
			System.out.println("decimal2binary(0) = " + decimal2binary(0));
			System.out.println("decimal2binary(1) = " + decimal2binary(1));
			System.out.println("decimal2binary(-1) = " + decimal2binary(-1));
			System.out.println("decimal2binary(-66) = " + decimal2binary(-66));
			return; // do not present menu if doing -test
		}
		System.out.print("Convert binary to decimal (Enter key) or decimal to binary (anything but Enter): ");
		String reply= System.console().readLine();
		if (reply.length()==0) {
			while (true) {
				System.out.print("Enter binary number: ");
				String inStr = System.console().readLine();
				if (isBinary(inStr)) {
					System.out.println(inStr + " in decimal is " +  binary2decimal(inStr));
					break;
				}
				System.out.println("ERROR that is not a binary number");
			}	
		}
		else {
			System.out.print("Enter decimal number: ");
			int decimal = Integer.parseInt(System.console().readLine());
			System.out.println(decimal + " in binary is " +  decimal2binary(decimal));
		}
	}
}


