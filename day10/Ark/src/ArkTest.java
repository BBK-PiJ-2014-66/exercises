import animal.*;

/**
 * Test individual animal classes, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 *  Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * 
 */
public class ArkTest {

	public static void main(String[] args) {
		testAnimal(new Bat());
		testAnimal(new Bear());
		testAnimal(new Beetle());
		testAnimal(new Dolphin());
		testAnimal(new Eagle());
	}

	/**
	 * Prints out test results for a given input animal
	 * @param inAnimal
	 */
	public static void testAnimal(Animal inAnimal) {
		System.out.println("Testing animal '" + inAnimal.species() + "'");
		System.out.print("\tCall it: ");
		inAnimal.call();
		System.out.print("\tmake sound: ");
		inAnimal.makeSound();
		System.out.print("\treproduce: ");
		inAnimal.reproduce();
		System.out.println();
	}

}
