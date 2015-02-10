package e04ResponsiveUI;

import java.util.Scanner;

/**
 * PiJ day 17 Concurrent Programming
 * 
 * Exercise 4 Responsive UI
 * 
 * task:
 * 
 * Write a program that asks from the user the length in milliseconds of ten
 * tasks. As the user enters the length, the tasks start running in the
 * background while the user enters the length of the other tasks. When the
 * tasks end, the program must register it and say it unless it is waiting for
 * the user to enter data. See this sample output: ....
 * 
 * Note that several tasks may end in between two user inputs.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 10 Feb 2015
 *
 */
public class ResponsiveUI {
	private final static int NTASKS = 10;

	/**
	 * The main script - user I/O is done here
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TaskReport taskReport = new TaskReport();
		Scanner keyboard = new Scanner(System.in);
		for (int tc = 0; tc < NTASKS; tc++) {
			System.out.print("Enter the duration (in ms) of task " + tc + ": ");
			int delay = Integer.parseInt(keyboard.nextLine());
			// start each task in a separate thread
			Runnable task = new TaskSleep(tc, delay, taskReport);
			Thread taskThread = new Thread(task);
			taskThread.start();
			String finishedList = taskReport.toString();
			if (finishedList != null)
				System.out.println("Finished tasks: " + finishedList);			
		}
		keyboard.close();

	}

}
