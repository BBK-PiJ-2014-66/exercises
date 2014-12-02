package animal;

/**
 * An individual animal class, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class Dolphin extends Animal {
	/**
	 * Constructs a dolphin.
	 */
	public Dolphin() {
		super("dolphin", Type.AQUATIC, IsMammal.YES);
	}

	/**
	 * Method to make the sound of a dolphin.
	 */
	@Override
	public void makeSound() {
		System.out.println("click-click");
	}

}
