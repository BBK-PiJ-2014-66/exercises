package e01;

public class StringUtils {

	private StringUtils() {
		throw new UnsupportedOperationException("Uninstantiable class");
	}

	public static int eChecker(String s1, String s2) {
		boolean e1 = s1.contains("e");
		boolean e2 = s2.contains("e");
		if (e2 & !e1)
			return 1;
		if (e1 & !e2)
			return -1;
		return 0;
	}

}
