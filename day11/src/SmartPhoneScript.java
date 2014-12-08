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
		testSmartPhone( myPhone);

		// 2.3 Indirect upcasting when calling a method
		testPhone( myPhone);
		
		MobilePhone myMobile = new MobilePhone();
		testPhone( myMobile);
	}

	/**
	 * Tests a smartPhone
	 * 
	 * @param smartPhone the phone to test
	 */
	private static void testSmartPhone(SmartPhone smartPhone) {
		// 2.1
		smartPhone.call("+34 91 356 7777");
		System.out.println("phone's brand is " + smartPhone.getBrand());
		smartPhone.browseWeb("http://www.dcs.bbk.ac.uk");
		smartPhone.playGame("snakes.class");
		smartPhone.printLastNumbers();
		smartPhone.ringAlarm("dongdong.mp3");
		System.out.println("\nThis phone has GPS:");
		GPS3coords where = smartPhone.findPosition();
		System.out.println("I am at latitude " + where.latitude + " degrees, "
				+ " longitude " + where.longitude + " degrees");
	}

	/**
	 * Test a Phone phone
	 * @param aPhone the phone to test
	 */
	private static void testPhone(Phone aPhone) {
		System.out.println("\n\ntestPhone method:");
		// the only method in Phone is call so we can only test this
		aPhone.call("00 1 234 56789");
		// 2.4 downcast to test as a SmartPhone
		System.out.println("Now test as a SmartPhone:");
		try {
			testSmartPhone( (SmartPhone) aPhone);
		} catch (ClassCastException e){
			System.out.println("this phone is NOT a SmartPhone");		
		}
	}
	
	

}
