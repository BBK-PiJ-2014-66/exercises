/** 
 * testing script for SmartPhone
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class PhoneLauncher {
	public static void main( String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		System.out.println("Now upgraded to a SmartPhone!");
		SmartPhone myPhone = new SmartPhone();

		System.out.println("Test call a couple of numbers: (2nd is international)");
		myPhone.call("020 7631 6000"); // Birkbeck
		myPhone.call("+1 202 456 1111"); // The White House

		System.out.println("\nThis phone stores the last " + myPhone.MAX_NUMBERS_STORED + " numbers that have been called");
		System.out.println("test print of the last number store:");
		myPhone.printLastNumbers();

		System.out.println("\nTest call 10 more numbers:");
		for (int tc= 0; tc<10; tc++)
			myPhone.call("020 7631 680"+tc); 
		System.out.println("Print of the last number store again:");
		myPhone.printLastNumbers();

		System.out.println("\nThis phone has an Alarm:");
		myPhone.ringAlarm("annoying.mp3");

		System.out.println("\nThis phone can play games:");
		myPhone.playGame("Poker.class");

		System.out.println("\nThis phone can browse the web:");
		myPhone.browseWeb("http://moodle.bbk.ac.uk/");

		System.out.println("\nThis phone has GPS:");
		GPS3coords where = myPhone.findPosition();	
		System.out.println("I am at latitude " + where.latitude + " degrees, " + 
				" longitude " + where.longitude + " degrees"); 


		System.out.println("\nNow lets call the Kremlin to test internet call to 00 number");
		myPhone.call("00 7 495 695 37 76"); // Birkbeck
  
		System.out.println("\nTest UK call with +44 should not be internet routed!");
		myPhone.call("+44 20 7631 6000"); // Birkbeck


	}
}
