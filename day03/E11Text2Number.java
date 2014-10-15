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
 * Initial thoughts
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
 *  when we get to . then answer = answer/(0.1*powerOfTen); powerOfTen=1.0
 *  so that 1345 becomes 0.1345 and we carry on adding 1's 10's
 *     
 *  should ignore commas throw an exceptions for any other character
 *  only accept - as the last character and this means answer *= -1.0
 *
 * test with:  
 * 23,419.34
 * 10
 * -10.000,000,99
 * 0
 */
public class E11Text2Number {
	public static double Text2Number( String inStr) {
		// method to return double number from a string like 23,419.34
		// exercise requires not to use Double.parsedouble()!
		// inStr not to be altered in method
		double answer = 0.0;
		System.out.println("debug Method Text2Number to be written");	
		return answer;
	}
	public static void main(String[] args) {
                if (args.length==1 && args[0].equals("-test")) {
			System.out.println("\n\t-test procedure, test Text2Number method: ");
			double testValue =  Text2Number("23,419.34");
			System.out.println("\ttest#1 Text2Number(\"23,419.34\") results in "+ testValue);
		}
	}
} 
