/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 17 Nov 2014
 *  
 * Day 8 Exercise 1 Supermarket queue.
 *
 * uses ArrayPersonQueue of the PersonQueue interface
 * includes main method to 
 */
public class Supermarket {
	private PersonQueue superMarketQueue;
	Supermarket() {
		// change next line to test different PersonQueue Implementations
		superMarketQueue = new ArrayPersonQueue();
	}
	public void addPerson( Person person) {
		superMarketQueue.insert(person);
	}
	public Person servePerson() {
		return superMarketQueue.retrieve();
	}
	public static void main( String args[]) {
		testSupermarket();
	}
	private static void testSupermarket() {
		Supermarket testSM = new Supermarket();
		System.out.println("Testing SuperMarket, today people arrive at the till in alphabetical order!");	
		System.out.println("Add ten people to the queue: ");	
		String tenPeople[] = {"Adam Ant", "Bill Bailey", "Charlie Chalk", "Dan Dare",
			"Eddy Eagle", "Franky Fox", "Gary Glitter", "Henry Hippo", "Inky Ian", "Jane Jenkin"};
		int tenAges[] = { 44, 11, 13, 23, 87, 5, 63, 105, 88, 30 };
		for (int pc = 0; pc < tenPeople.length; pc++) {
			System.out.println("Adding " + tenPeople[pc] );	
			testSM.addPerson( new Person( tenPeople[pc], tenAges[pc]));
			
		}

                System.out.println("Now serve a single customer: " +  testSM.servePerson());
                System.out.println("Now serve another customer: " +  testSM.servePerson());


		System.out.println("Adding another customer Kevin");
		testSM.addPerson( new Person( "Kevin Keegan", 65));

		System.out.println("Serve the complete queue: ");	
		while (true) {
			Person beingServed = testSM.servePerson();
			if (beingServed==null) break;
			System.out.println("Serve person " + beingServed);
		}
	}
}
