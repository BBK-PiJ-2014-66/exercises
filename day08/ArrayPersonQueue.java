/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 17 Nov 2014
 *  
 * Day 8 Exercise 1 Supermarket queue.
 *
 * Array-based version of the PersonQueue.
 *
 * based on the ArrayStringStack implementation given in example code
 *
 * N.B. only reuses memory for previously served people 
 *      when the array size is exceeded to avoid doing an array copy on 
 *      every retrieve.  This why there is a queueStart.
 */
public class ArrayPersonQueue implements PersonQueue {
	private Person[] personArray;
	private int numberInArray;
	private int queueStart; // where the queue starts 
	
	private static int INITIAL_ARRAY_SIZE = 5;

	public ArrayPersonQueue() {
		personArray = new Person[INITIAL_ARRAY_SIZE];
		numberInArray = 0;
		queueStart = 0; 
	}

	public void insert( Person inPerson) {
		ensureArrayIsBigEnough();
		personArray[numberInArray] = inPerson;
		numberInArray++;
	}

	public Person retrieve() {
		// returns null if there are no people in quue
		Person returnPerson = null; 
		if (queueStart < numberInArray) { 
			returnPerson = personArray[queueStart];
			queueStart++;
		}
		return returnPerson;
	}

	private void debugPrintQueue() {
		// debug type info
		System.out.println("debugPrintQueue   There are " + (numberInArray-queueStart) + " persons in the queue");
		for (int pc = queueStart; pc < numberInArray; pc++) {
			System.out.println("debugPrintQueue   " + (pc+1) + " " + personArray[pc]);
		}
	}

	private void ensureArrayIsBigEnough() {
		if (personArray.length == numberInArray) {
			//debugPrintQueue();
			// make a new array
			Person tempPersonArray[] = new Person[numberInArray*2];
			numberInArray = 0;
			// copy over only the Person s in the queue not old ones
			for (int pc = queueStart; pc < personArray.length; pc++) {
				tempPersonArray[numberInArray] = personArray[pc];
				numberInArray++;
			}
			queueStart = 0;
			personArray = tempPersonArray;
			//debugPrintQueue();
		}
	}

}
  
