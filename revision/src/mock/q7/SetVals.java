package mock.q7;

import java.util.Scanner;

public class SetVals extends Thread {
	private Queue theQ;

	SetVals(Queue theQ) {
		this.theQ = theQ;
	}

	@Override
	public void run() {
		try (Scanner keyboard = new Scanner(System.in);) {
			while (true) {
				System.out.print("Enter and Integer" + " (-1 to finish):");
				Integer anInt = keyboard.nextInt();
				theQ.enqueue(anInt);
				if (anInt == -1)
					break;
			}
		}
	}
}
