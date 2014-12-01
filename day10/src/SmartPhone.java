/** 
 * SmartPhone like a mobile but can browse the web and has a GPS
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class SmartPhone extends MobilePhone {
	/**
	 * open a web page in the browser
	 * @param webURL url for the web page
 	 */
	public void browseWeb( String webURL ) {
		System.out.println("Open browser with page '" + webURL + "'");
	}

	/**
	 * get current position from the GPS device 
	 *
	 * @return current position  latitude, longitude and altitude 
	 */
	public GPS3coords findPosition() {
		// hard code Birkbeck from http://www.gps-coordinates.net/
		GPS3coords myPosition = new GPS3coords();
		myPosition.latitude = 51.5219508;
		myPosition.longitude = -0.13020370000003822;
		myPosition.altitude = 34.0;
		return myPosition;
		
	}

	/**
	 * calls a number, SmartPhone version routes internation calls through the internet.
	 *
	 * @param number phone number to call
	 */
	@Override
	public void call( String number) {
		if ( number.substring(0,2).equals("00") || // international calls start with 00
		     number.substring(0,1).equals("+") &&  // or + except if +44!
		     (!number.substring(0,3).equals("+44"))) { 
			System.out.println("Internet routed call to <" + number + ">");
		} else {
			super.call(number);
		}
	}


}
