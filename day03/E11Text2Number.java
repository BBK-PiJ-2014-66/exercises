/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 11 Text2number
 * task set:
 * 	Write a program that reads a number with commas and decimal 
 *	dots (such as “23,419.34”) and then prints a number that 
 *	is half of it. Do not use Double.parseDouble().
 *
 *  @author Oliver S. Smart
 *
 * revised thoughts
 *  May as well use a method to facilitate test 
 *  Could take out all commas, then find whether there is a dot
 *  record where it is the string and then use Integer.parseInt() 
 *  to get the integer value but this seems against spirit of question
 *
 *  Instead start at the end of the string working character to character strChr
 *  to the beginning. Keep:
 *     double powerOfTen=1.0
 *     double answer=0.0
 *     get integer value from the char rather nice C-like method from
 *     http://stackoverflow.com/questions/4968323/java-parse-int-value-from-a-char 
 *     int chrInt=strChr-'0';
 *  chrInt will be between 0 and 9 for digits  will avoid using standard Character.isDigit(strChr) 
 *     for a digit
 *     answer += chrInt*powerOfTen
 *     powerOfTen *= 10.0
 *  when we get to . then answer = answer/powerOfTen and powerOfTen reset to 1.0
 *  so that 1345 becomes 0.1345 and we carry on adding 1's 10's
 *     
 *  should ignore commas throw an exceptions for any other character
 *  only accept - as the last character and this means answer *= -1.0
 *
 * test with:  
 * -230,419.340
 * 23,419.34
 * 10
 * -10.000,000,99
 * 0
 * 1E06 (should get exception)
 */
public class E11Text2Number {
	public static double Text2Number( String inStr) {
		// method to return double number from a string like 23,419.34
		// exercise requires not to use Double.parsedouble()!
		// inStr not to be altered in method
		//System.out.println("debug Method Text2Number:");	
		double answer = 0.0;
		double powerOfTen = 1.0;
		boolean gotDecimal=false;
		// go character by char backwards through inStr
		for (int cc = inStr.length()-1; cc>=0; cc--) { 
			char strChr = inStr.charAt(cc); // to make code more readable
			int  chrInt=strChr-'0'; //ascii value of the char minus that of 0 character
			//System.out.print("debug reversed inStr c by c \t" + strChr + "\t chrInt = " + chrInt);
			if ( chrInt>=0 && chrInt<10 ) { // it is a digit
				answer += powerOfTen*chrInt;
				powerOfTen *= 10.;
			}
			else if (strChr=='.') { // the decimal point
		        	if (gotDecimal) // big problem only allowed one	
					throw new IllegalArgumentException("Text2Number cannot handle numbers with more than one decimal point");
				gotDecimal = true;
				answer = answer/powerOfTen; // for 1345 becomes 0.1345 
				powerOfTen = 1.0;
			}
			else if (cc==0 && strChr=='-') { // initial negative sign
				answer *= -1; // change sign of answer
			}
			else if (strChr==',') { // ignore comma's
			}
			else { // illegal character
				throw new IllegalArgumentException("Text2Number cannot handle numbers containing \"" + strChr + "\"");
			}
			//System.out.println(" powerOfTen= " + powerOfTen + " answer = " + answer);
		}
		return answer;
	}
	public static void main(String[] args) {
                if (args.length==1 && args[0].equals("-test")) {
			System.out.println("-test procedure for Text2Number method: ");
			String testStr;
			testStr = "-230,419.340"; 
			System.out.println("\ttest Text2Number(\"" + testStr + "\") results in "+ Text2Number(testStr));
			testStr = "23,419.34";
			System.out.println("\ttest Text2Number(\"" + testStr + "\") results in "+ Text2Number(testStr));
			testStr = "10"; 
			System.out.println("\ttest Text2Number(\"" + testStr + "\") results in "+ Text2Number(testStr));
			testStr = "-10.000,000,99"; 
			System.out.println("\ttest Text2Number(\"" + testStr + "\") results in "+ Text2Number(testStr));
			testStr = "0"; 
			System.out.println("\ttest Text2Number(\"" + testStr + "\") results in "+ Text2Number(testStr));
			testStr = "1E06"; 
			System.out.println("\ttest Text2Number(\"" + testStr + "\") results in (should throw exception)");
			System.out.println(Text2Number(testStr));
		}
		else {
			System.out.print("Please enter a number with commas and a decimal dot: ");
			double readDble = Text2Number(System.console().readLine());
			System.out.println("Half your number is " +  0.5*readDble);
		}
	}
} 
