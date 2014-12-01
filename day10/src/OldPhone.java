/** 
 * Old Phone
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class OldPhone implements Phone {

	private String brand = null;

	/**
	 * Default constructor unbranded phone
	 */
	public OldPhone() {
		brand = null;
	}

	/**
	 * branded phone constructor
	 * @param brand the phone's brand
	 */
	public OldPhone(String brand) {
		this.brand = brand;
	}

	/**
	 * gives the phone's brand
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Just print on the screen "Calling <number> ...".
	 *
	 * @param number phone number to call
	 */
	public void call( String number) {
		System.out.println("Calling <" + number + ">");
	}
}
