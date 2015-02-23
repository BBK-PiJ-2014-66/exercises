package e01;

import java.util.Arrays;
import java.util.List;

public class TestTransformedList {
	public static void main( String args[]){
		List<String> testWords = Arrays.asList("The", "quick", "brown",
				"jumps", "over", "a", "lazy", "dog");
		System.out.println("Original list of words: " + testWords);
		
		List<String> excitingWords = StringUtils.transformedList(testWords, s -> s + "!");
		System.out.println("'exciting' words: " + excitingWords);
		List<String> eyeWords = StringUtils.transformedList(testWords, s -> s.replace("i","eye"));
		System.out.println("'eye' words: " + eyeWords);
		List<String> ucWords = StringUtils.transformedList(testWords, s -> s.toUpperCase());
		System.out.println("'uc' words: " + ucWords);
		
	}

}
