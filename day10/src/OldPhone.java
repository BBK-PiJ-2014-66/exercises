/** 
 * Old Phone
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class OldPhone implements Phone {
	/**
	 * Just print on the screen "Calling <number> ...".
	 *
	 * @param number phone number to call
	 */
	public void call( String number) {
		System.out.println("Calling <" + number + ">");
	}
}
