package e04ResponsiveUI;

import java.util.ArrayList;
import java.util.List;

/**
 * used to keep a record as to which tasks have finished and to print a report
 * of this.
 *
 */
public class TaskReport {
	private List<Integer> FinishedTask;

	TaskReport() {
		FinishedTask = new ArrayList<Integer>();
	}

	/**
	 * Record that a task has finished
	 * 
	 * synchronized to avoid conflicts between tasks finishing simultaneously
	 * 
	 * @param taskNumber
	 *            the identity number for the task
	 */
	public synchronized void recordFinished(int taskNumber) {
		FinishedTask.add(taskNumber);
	}

	/**
	 * Used to produce a report of the jobs completed since last call
	 * 
	 * synchronized to avoid conflicts
	 * 
	 * @return a string of finished job numbers like "2, 1, 3, 4" or "" if
	 *         there are none
	 */
	@Override
	public synchronized String toString() {
		String list = "";
		if (FinishedTask.size() != 0) {
			String separator = "";
			for (Integer itTaskNo : FinishedTask) {
				list += separator + itTaskNo;
				separator = ", ";
			}
			FinishedTask.clear(); // clear record
		}
		return list;
	}

}
