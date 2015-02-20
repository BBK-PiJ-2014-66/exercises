package six;

public class GenericFunctionalIntefaceDemo {
	public static void main(String args[]) {
		SomeFunc<String> reverse = (str) -> {
			String result = "";
			for (int sc = str.length(); sc > 0; sc--)
				result += str.charAt(sc-1);
			return result;
		};
		System.out.println("Lambda reversed is " + reverse.func("Lambda"));
		
		SomeFunc<Integer> cubed = (n) -> n*n*n;
		System.out.println("8 cubed = " + cubed.func(8));
	}
}
