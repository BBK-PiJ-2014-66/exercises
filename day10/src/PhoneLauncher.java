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
		Phone myPhone = new OldPhone();
		// call a couple of numbers
		myPhone.call("020 7631 6000"); // Birkbeck
		myPhone.call("+1 202 456 1111"); // The White House	
		// call 10 more
		for (int tc= 0; tc<10; tc++)
			myPhone.call("020 7631 680"+tc); 
	}
}
