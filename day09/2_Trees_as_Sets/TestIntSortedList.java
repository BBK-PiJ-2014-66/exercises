/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 3 Trees as (sorted) lists
 *
 * Runs test on IntSortedList implementations.. like in exercise 2.
 */
public class TestIntSortedList{
	public static void main( String args[]) {

		System.out.println("Run tests on TreeIntSortedList:");
		IntSortedList  testTree = new TreeIntSortedList();
		runTests(testTree);

	}
	public static void runTests( IntSortedList testList ) {
		System.out.println("add 7 to the list");
		testList.add(7);
		System.out.println("add 9 to the list");
		testList.add(9);
		System.out.println("add 7 to the list again!");
		testList.add(7);
		System.out.println("print the list contents in order: " + testList);
		System.out.println("verbose test whether list contains 9: ");
		System.out.println("\tResult list does "+ (testList.contains(9) ? "" : "not ") + "contain 9");
		int someInts[] = {  3, 13, 45, 13, 34, 23, 37, 34, 27, 43, 22, 8, 50, 1, 39, 18 };
		for (int i= 0; i < someInts.length; i++) {
			int anInt = someInts[i];
			testList.add(anInt);
			testList.add(50-(17*anInt)%50);
		}
		System.out.println("extend list and print in order " + testList);
		System.out.println("verbose test whether list contains 19: ");
		System.out.println("\tResult list does "+ (testList.contains(19) ? "" : "not ") + "contain 19");
		System.out.println("verbose test whether list contains 28: ");
		System.out.println("\tResult list does "+ (testList.contains(28) ? "" : "not ") + "contain 28");


	
	}

}
