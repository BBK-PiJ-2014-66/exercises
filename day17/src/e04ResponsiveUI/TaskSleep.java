package e04ResponsiveUI;

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
				+ sleepMilliSecs + " 'run' (aka sleep) ");
		try {
			Thread.sleep(sleepMilliSecs);
		} catch (InterruptedException ex) {
			// just sleep less
		}
		System.out.println("debug task " + taskNumber + " ended");
	}

}
