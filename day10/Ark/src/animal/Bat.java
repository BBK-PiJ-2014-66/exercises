package animal;

/**
 * An individual animal class, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class Bat extends Animal {
	/**
	 * Constructs a bat.
	 */
	public Bat() {
		super("bat", Type.FLYING, IsMammal.YES);
	}

	/**
	 * Method to make the sound of a bat.
	 */
	@Override
	public void makeSound() {
		System.out.println("ultrasonic tic-tic-tic");
	}

}
