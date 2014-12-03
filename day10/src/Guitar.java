/** 
 * Guitar class should use methods:
 *	play from MusicalInstrument and  
 *	burn from WoodenObject
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class Guitar extends MusicalInstrument implements  WoodenObjectInterface {

	private WoodenObjectInterface wooden = new WoodenObject();

      	/**
	 * burn method from WoodenObject
	 */
	public void burn() {
		this.wooden.burn();
	}

	/**
	 * Simple test script that Guitar has the two methods
	 */
	public static void main( String[] args) {
		Guitar myGuitar = new Guitar();
		myGuitar.play();
		myGuitar.burn();
	}
}
