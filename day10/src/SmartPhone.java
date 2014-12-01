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

}
