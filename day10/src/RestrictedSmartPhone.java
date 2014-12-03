/** 
 * RestrictedSmartPhone a SmartPhone with games disabled 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class RestrictedSmartPhone extends SmartPhone {

	/**
	 * Default constructor unbranded phone
	 */
	RestrictedSmartPhone() {
		super();
	}

	/**
	 * branded phone constructor
	 * @param brand the phone's brand
	 */
	RestrictedSmartPhone( String brand) {
		super(brand + " (restricted)");
	}

	/**
	 * Disabled playGame cannot do it by making it private
         * instead simply print 
	 */
	public void playGame( String game) {
		System.out.println("Games are disabled on this phone!");
	}
}
