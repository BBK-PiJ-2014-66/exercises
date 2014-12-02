package animal;

/**
 * Animal abstract class, for PiJ Day 10 exercise 8 Noah's Ark (*)
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public abstract class Animal {

	private String species;
	private Type type;
	private IsMammal isMammal;

	/**
	 * Constructor
	 * 
	 * @param species
	 *            for instance "dolphin"
	 * @param type
	 *            an enum AQUATIC...
	 * @param isMammal
	 *            an enum YES or NO
	 */
	Animal(String species, Type type, IsMammal isMammal) {
		this.species = species;
		this.type = type;
		this.isMammal = isMammal;
	}

	/**
	 * call the animal to come to the Ark.
	 */
	public void call() {
		System.out.print(species);
		if (type == Type.AQUATIC) {
			System.out.println(" will not come...");
		} else if (type == Type.FLYING) {
			System.out.println(" now flying, will come later when tired...");
		} else {
			System.out.println(" coming...");
		}
	}

	/**
	 * make the animal reproduce.
	 */
	public void reproduce() {
		if (isMammal == IsMammal.YES) {
			giveBirth();
		} else {
			layEggs();
		}
	}

	/**
	 * get the species of the animal.
	 * 
	 * @return the species of the animal, normally this is a lower case version
	 *         of the Class name
	 */
	public String species() {
		return species;
	}

	/**
	 * Make a sound. As per instruction, this is done by individual methods
	 * implemented in each of descendent classes for a particular species.
	 */
	public abstract void makeSound();

	/**
	 * everything but mammals lay eggs to reproduce
	 */
	private void layEggs() {
		System.out.print("lay Egg");
	}

	/**
	 * mammals give birth to reproduce.
	 */
	private void giveBirth() {
		System.out.print("give Birth");
	}

}
