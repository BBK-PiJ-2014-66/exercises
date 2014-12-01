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
		MobilePhone myPhone = new MobilePhone();

		System.out.println("Test call a couple of numbers:");
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


	}
}
