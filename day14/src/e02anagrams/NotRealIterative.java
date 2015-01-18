package e02anagrams;

import java.util.ArrayList;
import java.util.List;

public class NotRealIterative {
	public static void main(String[] args) {
		allNonRealAnagrams("abcde");
	}

	public static List<String> allNonRealAnagrams(String string) {

		// List<String> retList = new ArrayList<String>();
		System.out.println("input string= " + string);
		// convert to char array
		// char[] chrStr = string.toCharArray();
		// int nOut=0;
		/*
		 * // swap pairs of letters DOES NOT WORK for (int ic = 0; ic <
		 * chrStr.length; ic++) { for (int jc = 0; jc < chrStr.length; jc++) {
		 * if (ic != jc) { char temp = chrStr[ic]; chrStr[ic] = chrStr[jc];
		 * chrStr[jc] = temp; nOut++; System.out.println(nOut + " " +
		 * String.copyValueOf(chrStr)); } } }
		 */
		int nChars = string.length();
		System.out.println("size=" + nChars);
		// int[] indices = new int[size];

		// int position=size;
		// while (position>0){
		// System.out.println("position= "+ position);
		//
		//
		// }
		// int[] indices = new int[size];
		int[] indice = new int[nChars];
		for (int ic = 0; ic < nChars; ic++) {
			indice[ic] = -1; // not set
		}
		List<int[]> indices = new ArrayList<int[]>();
		indices.add(indice.clone());

		for (int cc = 0; cc < nChars; cc++) {
			List<int[]> tempIndices = new ArrayList<int[]>();
			System.out.println("deal with character" + cc);
			System.out.println("oldindices.size()= " + indices.size());
			// set position cc
			for (int ic = 0; ic < indices.size(); ic++) {
				// retrieve from the list
				indice = indices.get(ic);
				for (int jc = 0; jc < nChars; jc++) {
					boolean match = false;
					for (int yc = 0; yc < cc; yc++) {
						if (indice[yc] == jc)
							match = true;
					}
					if (!match) {
						indice[cc] = jc;
						tempIndices.add(indice.clone());
					}
				}
			}
			indices = tempIndices;
		}

		for (int ic = 0; ic < indices.size(); ic++) {
			indice = indices.get(ic);
			System.out.print(ic + "\t= (");
			for (int jc = 0; jc < nChars; jc++) {
				System.out.print("\t" + indice[jc]);
			}
			System.out.println("\t)");
		}

		return null;
	}
}
