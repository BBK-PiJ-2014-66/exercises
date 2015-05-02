package genericdrill;

/**
 * Keith Mannock "Generics Drill" in Revision Session 27th April 2015
 * 
 * Generic Method to find the maximum of three inputs. Shows use of Bounded
 * Type.
 * 
 * Produces output: 
 * 		maxDob = 8.0 
 * 		maxInt = 10 
 * 		maxStr = pears
 *
 */
public class Maximum1 {

	public static void main(String[] args) {
		double maxDob = maximum(5.1, 8., 4.4);
		System.out.println("maxDob = " + maxDob);

		int maxInt = maximum(6, 4, 10);
		System.out.println("maxInt = " + maxInt);

		String maxStr = maximum("apples", "pears", "oranges");
		System.out.println("maxStr = " + maxStr);

	}

	private static <T extends Comparable<T>> T maximum(T i, T j, T k) {
		T max = i;
		if (j.compareTo(max) > 0)
			max = j;
		if (k.compareTo(max) > 0)
			max = k;
		return max;
	}

}
