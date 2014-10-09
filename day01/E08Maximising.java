/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Week 1 Exercise 8 Maximising
 * task set:
 * Write a program that read a (arbitrarily long) sequence of positive numbers.
 * The sequence is ended when the users enters "-1". At that point, the program
 * must output the highest number in the sequence.
 * 
 * Questions/Assumptions (Specification rather loose)
 * (a) is a "number" an integer or a float? 
 *     Assume integer.
 * (b) what should the program do if supplied with a negative number or zero?
 *     Assume it should say not recognized and reprompt:
 * (c) what if the user enters something like "fred"
 *     Assume it should say not recognized and reprompt:
 * (d) what if the user just hits Enter
 *     Take this as a (better) alternative to -1 to finish.
 * 
 *  @author Oliver S. Smart
 */

public class E08Maximising {
	public static void main(String[] args) {
		// lets be good no methods do all in main
		System.out.print("Please a positive integer number: ");
		int numa = Integer.parseInt(System.console().readLine());
	}
}
