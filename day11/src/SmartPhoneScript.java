/**
 * PiJ day 11 exercise 2.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class SmartPhoneScript {

	/**
	 * script to test out SmartPhone and explore upcasting and downcasting N.B.
	 * relies on finding day10 classes:
	 * 
	 * MobilePhone Phone GPS3coords OldPhone SmartPhone
	 */
	public static void main(String[] args) {
		// 2.1 create SmartPhone Object
		SmartPhone myPhone = new SmartPhone();

		// test all methods of SmartPhone
		myPhone.call("+34 91 356 7777");
		System.out.println("phone's brand is " + myPhone.getBrand());
		myPhone.browseWeb("http://www.dcs.bbk.ac.uk");
		myPhone.playGame("snakes.class");
		myPhone.printLastNumbers();
		myPhone.ringAlarm("dongdong.mp3");
		System.out.println("\nThis phone has GPS:");
		GPS3coords where = myPhone.findPosition();
		System.out.println("I am at latitude " + where.latitude + " degrees, "
				+ " longitude " + where.longitude + " degrees");

	}

}
