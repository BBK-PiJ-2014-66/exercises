package mock.q7;

public class GetVals extends Thread {
	private Queue theQ;

	public GetVals(Queue theQ) {
		this.theQ = theQ;
	}

	@Override
	public void run() {
		while (true) {
			int anInt = (Integer) theQ.dequeue();
			if (anInt == -1)
				break;
			System.out.println(anInt);
					}
	}
}
