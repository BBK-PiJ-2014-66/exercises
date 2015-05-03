package exam2014;

import java.util.Arrays;
import java.util.List;


/**
 * 2014 Q3
 *
 */
public class Q3oliver {

	public static void main(String... args) {
		List<String> test = Arrays.asList("TESTXYZAB".split(""));
		System.out.println("test = " + test);
		String maxele = maxEleInRange(test, 0, test.size());
		System.out.println("maxEle = " + maxele);

		String official = max(test, 0, test.size());
		System.out.println("official = " + official);
		// output:
		// test = [T, E, S, T, X, Y, Z, A, B]
		// maxEle = Z
		// official = Z
	}

	// Oliver's
	public static <T extends Comparable<T>> T maxEleInRange(List<T> list,
			int begin, int end) {
		T maxEle = list.get(begin);
		for (int ic = begin + 1; ic < end; ic++) {
			T ele = list.get(ic);
			if (ele.compareTo(maxEle) > 0) {
				maxEle = ele;
			}
		}

		return maxEle;
	}

	// official
	public static <T extends Object & Comparable<? super T>> T max(
			List<? extends T> list, int begin, int end) {
		T maxElem = list.get(begin);
		for (++begin; begin < end; ++begin)
			if (maxElem.compareTo(list.get(begin)) < 0)
				maxElem = list.get(begin);
		return maxElem;
	}
}
