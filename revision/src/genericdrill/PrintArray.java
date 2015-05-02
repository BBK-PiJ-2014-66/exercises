package genericdrill;

/**
 * Keith Mannock "Generics Drill" in Revision Session 27th April 2015
 * 
 * 1st example a simple generic method and how type inference works
 *
 */
public class PrintArray {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		Character[] characterArray = { 'a', 'b', 'c'};
		
		// OSS note using "type inference"
		printArray(intArray);
		printArray(doubleArray);
		printArray(characterArray);
	}
	
	public static <T> void printArray( T[] someArray) {
		for (T ele : someArray) {
			System.out.print(" " + ele);
		}
		System.out.println();
		
	}
}
