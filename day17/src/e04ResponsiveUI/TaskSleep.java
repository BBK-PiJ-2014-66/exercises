package e04ResponsiveUI;
/**
 * PiJ day 17 Concurrent Programming
 * 
 * Exercise 4 Responsive UI
 *
 * Simple task. Just sleep for the appropriate number of milliseconds
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 10 Feb 2015
 *
 */
public class TaskSleep implements Runnable {
	private int taskNumber;
	private int sleepMilliSecs;

	public TaskSleep(int taskNumber, int sleepMilliSecs) {
		this.taskNumber = taskNumber;
		this.sleepMilliSecs = sleepMilliSecs;
	}

	@Override
	public void run() {
		System.out.println("debug task " + taskNumber + " beginning a "
				+ sleepMilliSecs + " millisecs 'run' (aka sleep) ");
		try {
			Thread.sleep(sleepMilliSecs);
		} catch (InterruptedException ex) {
			// just sleep less
		}
		System.out.println("debug task " + taskNumber + " ended");
	}

}
