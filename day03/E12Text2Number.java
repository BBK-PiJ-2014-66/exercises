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
 *  for characters that are digits Character.isDigit(strChr) read the 
 *     integer value from the char rather nice C-like method from
 *     http://stackoverflow.com/questions/4968323/java-parse-int-value-from-a-char 
 *     int chrInt=strChr-'0';
 *     answer += chrInt*powerOfTen
 *     powerOfTen *= 10.0
 *  when we get to . then answer = answer/(0.1*powerOfTen); powerOfTen=1.0
 *  so that 1345 becomes 0.1345 and we carry on
 *     
 *  should ignore commas throw an exceptions for any other character
 *  only accept - as the last character and this means answer *= -1.0
 *
 * test with:  
 * 23,419.34
 * 10
 * -10.000,000,99
 */
