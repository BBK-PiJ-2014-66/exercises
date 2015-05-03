package exam2014;

/**
 * 
 * Model answer to Q8 from
 * https://moodle.bbk.ac.uk/pluginfile.php/362082/mod_folder/content/0/PiJ-2014.pdf?forcedownload=1
 *
 */
public class Q8keith {

	public static void main(String[] args) {
		Q8keith q8 = new Q8keith();
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

	boolean isValidPair(String previousWord, String currentWord) {
		/*
		 * question says dictionary is an instance variable (not local)
		 */
		Dictionary dict = new Dictionary("english");
		if (!dict.isWord(currentWord))
			return false;
		if (previousWord == null)
			return true;

		/*
		 * length of a string is str.length not str.size
		 */
		// if (previousWord.size() != currentWord.size())
		// return false;
		return countCharacterDifferences(previousWord, currentWord) == 1;
	}

	int countCharacterDifferences(String s1, String s2) {
		int count = 0;
		/*
		 * some lambda expression ? does not compile! Are you allowed s1[i] for
		 * Java String type
		 */
		// (0..<s1.size()).each { i ->
		// if (s1[i] != s2[i]) {
		// count++
		// }
		// }
		return count;

	}

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