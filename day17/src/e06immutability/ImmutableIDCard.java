package e06immutability;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Date;

/**
 * An immutable version of IDCard
 * 
 * PiJ day 17 Concurrent Programming
 * 
 * Exercise 6 Immutability
 * 
 * task: What would you change to make the IDCard class immutable?
 * 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 16 Feb 2015
 *
 */
public final class ImmutableIDCard {
	private final String name;
	private final Date dateOfBirth;
	private final BufferedImage photo;

	public ImmutableIDCard(String name, Date dateOfBirth, BufferedImage photo) {
		check(name, dateOfBirth, photo);
		this.name = name; // strings are immutable so no need for defensive copy
		this.dateOfBirth = new Date(dateOfBirth.getTime()); // a defensive copy
		this.photo = copyImage(photo);
	}

	public synchronized String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return new Date(dateOfBirth.getTime());
	}

	public BufferedImage getPhoto() {
		return copyImage(photo);
	}

	public void check(String name, Date dateOfBirth, BufferedImage photo) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException();
		}

		if (dateOfBirth == null) {
			throw new IllegalArgumentException();
		}

		long age = getAge(dateOfBirth);

		if (dateOfBirth == null || age <= 0) {
			throw new IllegalArgumentException();
		}

		if (photo == null) {
			throw new IllegalArgumentException();
		}
	}
	
    private static long getAge(Date dateOfBirth)
    {
        long now = new Date().getTime();
        long age = now - dateOfBirth.getTime();
        return age;
    }
    
    /**
     * Makes a copy of Buffered image 
     * From http://stackoverflow.com/questions/3514158/how-do-you-clone-a-bufferedimage
     * 
     * @author "APerson"
     * @param source
     * @return
     */
    public static BufferedImage copyImage(BufferedImage source){
        BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = b.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return b;
    }
}
