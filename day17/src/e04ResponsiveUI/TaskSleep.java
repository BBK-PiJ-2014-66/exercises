package e04ResponsiveUI;

import java.util.concurrent.TimeUnit;

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
	private TaskReport taskReport;

	public TaskSleep(int taskNumber, int sleepMilliSecs, TaskReport taskReport) {
		this.taskNumber = taskNumber;
		this.sleepMilliSecs = sleepMilliSecs;
		this.taskReport = taskReport;
	}

	@Override
	public void run() {
		try {
			// old format Thread.sleep(sleepMilliSecs);
			TimeUnit.MILLISECONDS.sleep(sleepMilliSecs);
		} catch (InterruptedException ex) {
			// just sleep less
		}
		taskReport.recordFinished(taskNumber);
	}

}
