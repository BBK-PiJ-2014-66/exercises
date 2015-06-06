package mock.q7;

import java.util.List;
import java.util.ArrayList;

public class Queue {
	private List<Object> aQ;

	public Queue() {
		aQ = new ArrayList<Object>();
	}
	
	public synchronized void enqueue( Object ob) {
		aQ.add(ob);
		notifyAll();
	}

	public synchronized Object dequeue() {
		while (aQ.size() == 0) {
			// Queue is empty wit
			try {
				this.wait();
			} catch (InterruptedException ignore) {
				// do nothing - just ignore
			}
		}
		Object element = aQ.get(0);
		aQ.remove(0);
		return element;
	}
}
