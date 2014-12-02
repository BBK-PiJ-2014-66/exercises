package animal;

/**
 * An individual animal class, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class Beetle extends Animal {
	/**
	 * Constructs a beetle.
	 */
	public Beetle() {
		super("beetle", Type.TERRESTRIAL, IsMammal.NO);
	}

	/**
	 * Method to make the sound of a beetle.
	 */
	@Override
	public void makeSound() {
		System.out.println("scuttle-scuttle");
	}

}
