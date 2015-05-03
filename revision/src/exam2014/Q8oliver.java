package exam2014;

/**
 * Oliver's answer to 2014 Q8
 * 
 * produces output: 
 
   Dictionary stub for testing! All words are legitimate
   TEST -> BEST isValidPair= true
   TEST -> BEAST isValidPair= false
   TEST -> BUST isValidPair= false
   TEST -> null isValidPair= false

 */
public class Q8oliver {

	public static void main(String[] args) {
		Q8oliver q8 = new Q8oliver();
		q8.launch();
	}

	public void launch() {

		String prev = "TEST";
		String curr = "BEST";
		System.out.println(prev + " -> " + curr + " isValidPair= "
				+ isValidPair(prev, curr));
		curr = "BEAST";
		System.out.println(prev + " -> " + curr + " isValidPair= "
				+ isValidPair(prev, curr));
		curr = "BUST";
		System.out.println(prev + " -> " + curr + " isValidPair= "
				+ isValidPair(prev, curr));
		curr = null;
		System.out.println(prev + " -> " + curr + " isValidPair= "
				+ isValidPair(prev, curr));

	}

	/**
	 * instance variable dict - as thequestion states
	 */
	private Dictionary dict = new Dictionary("english");

	boolean isValidPair(String previousWord, String currentWord) {
		if (previousWord == null || currentWord == null) {
			// deal with null parameters
			return false;
		}

		if (previousWord.length() != currentWord.length()) {
			return false;
		}

		String previousUC = previousWord.toUpperCase();
		String currentUC = currentWord.toUpperCase();

		if (!dict.isWord(previousUC) || !dict.isWord(currentUC)) {
			return false;
		}

		if (numCharsDifferent(previousWord, currentWord) != 1) {
			return false;
		}

		return true;
	}

	public static int numCharsDifferent(String previous, String current) {
		if (previous == null || current == null) {
			return Integer.MAX_VALUE;
		}
		int length = previous.length();
		if (current.length() != length) {
			return Integer.MAX_VALUE;
		}
		int ndiff = 0;
		for (int cc = 0; cc < length; cc++) {
			if (previous.charAt(cc) != current.charAt(cc))
				ndiff++;
		}
		return ndiff;

	}

	/**
	 * Stub inner class Dictionary for testing
	 */
	class Dictionary {
		Dictionary(String filename) {
			System.out.print("Dictionary stub for testing! ");
			System.out.println("All words are legitimate");
		}

		boolean isWord(String aWord) {
			return true;
		}

	}
}