package likeunix;

import java.io.File;


/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 4 a) cp
 * 
 * Write a program that takes two names from the user at the command line. If a
 * file with the first name exists, the program must copy it into a file with
 * the second name. If the first file does not exist, the program must say so.
 * If the second file does exists, the program must ask the user whether to
 * overwrite it or not, and act accordingly.
 * 
 * So it is like cp -i
 * 
 * Assume we are mean to read the File line by line and write it a new one In
 * practice it would be much more sensible to use Files.copy() method!
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 31 Jan 2015
 * 
 */
public class CpMinusI {
	public static void main(String args[]) {
		// use launch to have a single System.exit(1) for ERROR
		CpMinusI cpi = new CpMinusI();
		try {
		cpi.launch( args);
		} catch (RuntimeException ex) {
			System.exit(1); // set error indication 
		}		
	}
	
	public void launch( String args[] ) {
		if (args.length != 2) {
			System.err
					.println("You must specify the source and destination files");
			System.err
					.println("for example to copy 'source.txt' to 'dest.txt'");
			System.err.println("\tjava -classpath .... CpMinusI source.txt dest.txt\n");
			throw new RuntimeException("Error has not specified two command line arguments");
		}
		
		/*
		String sourceName = args[0];
		File source = new File(sourceName);
		if (!source.exists()) {
			System.out.println("ERROR source file " + sourceName + " does not exist");
			
		}
		*/
	}

}
