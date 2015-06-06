package mock.q7;

public class SetVals extends Thread {
	private Queue theQ;

	SetVals(Queue theQ) {
		this.theQ = theQ;
	}

	@Override
	public void run() {
		while (true) {
			String str;
			System.out.print("Enter and Integer" + " (-1 to finish):");
			str = System.console().readLine();
			Integer anInt = Integer.parseInt(str);
			theQ.enqueue(anInt);
			if (anInt == -1)
				break;
		}
	}

}
