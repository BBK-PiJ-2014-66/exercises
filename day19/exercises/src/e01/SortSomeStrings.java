package e01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * PiJ day 19 Work Sheet: Lambda Expressions
 * 
 * Exercise 1
 * 
 * task:
 * 
 * Create an array containing some Strings. Sort the array by
 * 
 * length (i.e., shortest to longest)
 * 
 * reverse length (i.e., longest to shortest)
 * 
 * first character
 * 
 * Strings that contain “e” first, everything else second.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 22 February 2015
 *
 */
public class SortSomeStrings {

	public static void main(String[] args) {
		String makes[] = { "Ford", "Fiat", "Rover", "Honda", "Toyota",
				"Renault", "Seat" };
		System.out.println("Example array of strings before any sorting: "
				+ Arrays.asList(makes));
		// Produces output:
		// Example array of strings before any sorting: [Ford, Fiat, Rover, Honda, Toyota, Renault, Seat]

		Arrays.sort(makes, (s1, s2) -> s1.length() - s2.length());
		System.out.println("Sorted by length shortest to longest: "
				+ Arrays.asList(makes));
		// Produces output:
		// Sorted by length shortest to longest: [Ford, Fiat, Seat, Rover, Honda, Toyota, Renault]
		
		Arrays.sort(makes, (s1, s2) -> s2.length() - s1.length());
		System.out.println("Sorted by length longest to shortest: "
				+ Arrays.asList(makes));
		// Produces output:
		// Sorted by length longest to shortest: [Renault, Toyota, Rover, Honda, Ford, Fiat, Seat]

		// first character - convert characters to ascii equivalent
		Arrays.sort(makes, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println("Sorted by first character ascii value: "
				+ Arrays.asList(makes));
		// Produces output:
		// Sorted by first character ascii value: [Ford, Fiat, Honda, Renault, Rover, Seat, Toyota]

		Comparator<String> eContainsFirst = (s1, s2) -> {
			boolean e1 = s1.contains("e");
			boolean e2 = s2.contains("e");
			if (e2 & !e1)
				return 1;
			if (e1 & !e2)
				return -1;
			return 0;
		};
		Arrays.sort(makes, eContainsFirst);
		System.out.println("String that contain 'e' first, "
				+ "everything else second: " + Arrays.asList(makes));
		// Produces output:
		// String that contain 'e' first, everything else second: [Renault, Rover, Seat, Ford, Fiat, Honda, Toyota]

	}


}
