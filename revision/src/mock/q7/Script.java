package mock.q7;

public class Script {

	public static void main(String...args) {
		Queue theQ = new Queue();
		Thread setVals = new SetVals(theQ);
		Thread getVals = new GetVals(theQ);
		setVals.run();
		getVals.run();
	}

}
