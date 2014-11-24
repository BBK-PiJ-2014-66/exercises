/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 2 Trees as sets
 *
 * Runs test on IntSet implementations
 */
public class TestIntSets{
	public static void main( String args[]) {
		IntSet testTree = new TreeIntSet();
		System.out.println("Run tests on TreeIntSet:");
		runTests(testTree);
	}
	public static void runTests( IntSet testIntSet ) {
		System.out.println("add 7 to the set");
		testIntSet.add(7);
		System.out.println("add 9 to the set");
		testIntSet.add(9);
		System.out.println("add 7 to the set again!");
		testIntSet.add(7);
		System.out.println("print the set contents: " + testIntSet);
		System.out.println("verbose test whether set contains 9: ");
		System.out.println("\tResult set does "+ (testIntSet.containsVerbose(9) ? "" : "not ") + "contain 9");
		System.out.println("verbose test whether set contains 19: ");
		System.out.println("\tResult set does "+ (testIntSet.containsVerbose(19) ? "" : "not ") + "contain 19");

	
	}

}
