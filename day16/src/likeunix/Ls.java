package likeunix;

import java.io.File;

/**
 * 
 * PiJ day 16 I/O
 * 
 * Exercise 1 ls
 * 
 * task:
 * 
 * Write a program that shows on screen the names of the files in the current
 * directory. (Hint: look at methods from class File).
 * 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 31 Jan 2015
 * 
 */
public class Ls {
	public static void main(String args[]) {
		File currentDir = new File(".");
		String list[] = currentDir.list();
		if (list == null) { // .list() returns null
							// "If this abstract pathname does not denote a directory"
			System.err.println("ERROR current directory not valid");
			System.exit(1);
		} else if (list.length == 0) {
			System.out.print("Current directory is empty");
		} else {
			for (int ic = 0; ic < list.length; ic++) {
				System.out.print(list[ic] + " ");
			}
		}
		System.out.println();
	}

}
