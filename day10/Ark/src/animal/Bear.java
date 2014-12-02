package animal;

/**
 * An individual animal class, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class Bear extends Animal {
	/**
	 * Constructs a bear.
	 */
	public Bear() {
		super("bear", Type.TERRESTRIAL, IsMammal.YES);
	}

	/**
	 * Method to make the sound of a bear.
	 */
	@Override
	public void makeSound() {
		System.out.println("growl");
	}

}
