package ten;

import java.util.function.UnaryOperator;

public class MethodRefDemo {
	private static String stringOp(StringFunc fs, String s) {
		return fs.func(s);
	}

	public static void main(String args[]) {
		String inStr = "Lambdas add power to Java";
		String outStr = stringOp(MyStringOps::strReverse, inStr);
		System.out.println("String reversed: " + outStr);

		// use built-in
		UnaryOperator<String> reverse = MyStringOps::strReverse;
		System.out.println("String reversed UA: " + reverse.apply(inStr));
		
		// directly use
		System.out.println("String reversed direct " + MyStringOps.strReverse(inStr));
	}
}