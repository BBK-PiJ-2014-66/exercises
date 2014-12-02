package animal;

/**
 * An individual animal class, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class Eagle extends Animal {
	/**
	 * Constructs an eagle.
	 */
	public Eagle() {
		super("eagle", Type.FLYING, IsMammal.NO);
	}

	/**
	 * Method to make the sound of an eagle.
	 */
	@Override
	public void makeSound() {
		System.out.println("squawk-squawk");
	}

}
