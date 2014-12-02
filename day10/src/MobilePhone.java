/** 
 * Mobile Phone
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class MobilePhone extends OldPhone {
	// although we are told to store ten numbers do not hard code this
	public static int MAX_NUMBERS_STORED=10;
	private int numInLastNumberStore;
	private String[] lastNumberStore;

	/**
	 * Default constructor: initializes lastNumbersStore
	 */
	MobilePhone() {
		super();
		numInLastNumberStore = 0;
		lastNumberStore = new String[MAX_NUMBERS_STORED];
	}

	/**
	 * branded phone constructor
	 * @param brand the phone's brand
	 */
	MobilePhone(String brand) {
		super(brand);
		numInLastNumberStore = 0;
		lastNumberStore = new String[MAX_NUMBERS_STORED];
	}



	/**
	 * print on the screen "Calling <number> ..." and store the number
	 *
	 * @param number phone number to call
	 */
	@Override
	public void call( String number) {
		super.call(number);
		store(number);
	}
	/**
	 * rings a particular Alarm.
	 *
	 * @param alarm to ring (well print) 
	 */
	public void ringAlarm( String alarm) {
		System.out.println("Ringing alarm '" + alarm + "'");
	}

	/**
	 * plays a game
	 *
	 * @param game the game to play (filename?)
	 */
	private void playGame( String game) {
		System.out.println("Play game '" + game + "'");
	}

	/**
	 * prints the last MAX_NUMBERS_STORED numbers rung
	 *
	 */
	public void printLastNumbers() {
		System.out.println("The last " + numInLastNumberStore + " numbers rung: ");
		for (int nc =numInLastNumberStore-1; nc >=0 ; nc--) {
			System.out.println("\t" + lastNumberStore[nc]);
		}
	}

	/**
	 *
	 * stores the phone number 
         * @param number phone number to store 
         */ 
	private void store( String number) {
		if (numInLastNumberStore < MAX_NUMBERS_STORED) {
			lastNumberStore[numInLastNumberStore] = number;
			numInLastNumberStore++;
		} else { // already filled store shuffle numbers down overwriting oldest
			for (int nc = 0; nc< MAX_NUMBERS_STORED-1; nc++) {
				lastNumberStore[nc] = lastNumberStore[nc+1];
			}
			lastNumberStore[numInLastNumberStore-1] = number;
		}
	}


}
