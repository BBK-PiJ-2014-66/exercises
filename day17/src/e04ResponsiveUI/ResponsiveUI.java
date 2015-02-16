package e04ResponsiveUI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		TaskReport taskReport = new TaskReport();
		Thread[] taskThread = new Thread[10];

		Scanner keyboard = new Scanner(System.in);
		for (int tc = 0; tc < NTASKS; tc++) {
			System.out.print("Enter the duration (in ms) of task " + tc + ": ");
			int delay = Integer.parseInt(keyboard.nextLine());
			// start each task in a separate thread
			Runnable task = new TaskSleep(tc, delay, taskReport);
			taskThread[tc] = new Thread(task);
			taskThread[tc].start();
			printFinishedTasks(taskReport);
		}
		keyboard.close();

		// wait for all the jobs to finish before exiting
		boolean allFinished = false;
		while (!allFinished) {
			// "poll" threads to see whether they any is alive
			allFinished = true;
			for (int tc = 0; tc < NTASKS; tc++) {
				if (taskThread[tc].isAlive())
					allFinished = false;
			}
			printFinishedTasks(taskReport);
			// wait 0.2 seconds before the next check
			if (!allFinished)
				TimeUnit.MILLISECONDS.sleep(200); 
		}

	}

	public static void printFinishedTasks(TaskReport taskReport) {
		String finishedList = taskReport.toString();
		if (!finishedList.equals(""))
			System.out.println("Finished tasks: " + finishedList);
	}

}
