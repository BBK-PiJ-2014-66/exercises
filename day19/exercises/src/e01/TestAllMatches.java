package e01;

import java.util.Arrays;
import java.util.List;

public class TestAllMatches {

	public static void main(String[] args) {
		List<String> testWords = Arrays.asList("The", "quick", "brown",
				"jumps", "over", "a", "lazy", "dog");
		System.out.println("Original list of words: " + testWords);

		List<String> shortWords = ElementUtils.allMatches(testWords,
				s -> s.length() < 4);
		System.out.println("words shorter than 4 letters: " + shortWords);

		List<String> wordsWithB = ElementUtils.allMatches(testWords,
				s -> s.contains("b"));
		System.out.println("words with 'b': " + wordsWithB);
		
		List<String> evenLengthWords = ElementUtils.allMatches(testWords,
				s -> s.length() % 2 == 0);
		System.out.println("words with an even length " + evenLengthWords);
	}
}
