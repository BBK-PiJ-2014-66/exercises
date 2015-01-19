package e02anagrams;

import java.util.ArrayList;
import java.util.List;

public class NotRealIterative {
	public static void main(String[] args) {
		allNonRealAnagrams("abcd");
	}

	public static List<String> allNonRealAnagrams(String string) {

		List<String> retList = new ArrayList<String>();
		System.out.println("input string= " + string);
		int nChars = string.length();
		System.out.println("size=" + nChars);
		List<int[]> permMat = permutationMatrix( nChars);
		for (int[] itRow: permMat) {
			String swappedStr="";
			for (int cc=0; cc<nChars; cc++) {
				swappedStr += string.charAt(itRow[cc]); 
			}
			System.out.println(swappedStr);
			retList.add(swappedStr);
		}
		return retList;
	}
	/**
	 * returns a permutationMatrix giving the number ways to rearrange a list
	 * of numItems elements. 
	 * 
	 * The matrix will have numItems factorial rows.
	 * 
	 * each row be an array of integers of length numItems
	 * containing the values 0, 1, 2, .. numItems-1 
	 * 
	 * @param numItems the number of dimensions
	 * @return a matrix as described above
	 */
	public static List<int []> permutationMatrix(int numItems) {
		System.out.println("call to permutationMatrix numItems " + numItems);
		int[] row = new int[numItems];
		for (int ic = 0; ic < numItems; ic++) {
			row[ic] = -1; // set to silly value
		}
		List<int[]> permMat = new ArrayList<int[]>();
		permMat.add(row.clone());
		for (int cc = 0; cc < numItems; cc++) {
			// set position cc
			List<int[]> tempMat = new ArrayList<int[]>();
			// go through each of the previously defined rows
			for (int ic = 0; ic < permMat.size(); ic++) {
				// retrieve this from the list
				row = permMat.get(ic);
				// this value can be 0, 1, 2, 3...
				for (int jc = 0; jc < numItems; jc++) {
					// but it can not be the same as a previous value
					boolean match = false;
					for (int yc = 0; yc < cc; yc++) {
						if (row[yc] == jc)
							match = true;
					}
					if (!match) {
						row[cc] = jc;
						tempMat.add(row.clone());
					}
				}
			}
			permMat = tempMat;
		}
		
		System.out.println("debug permMat has " + permMat.size() + " rows:");
		for ( int [] itRow : permMat) {
			for (int cc = 0; cc < itRow.length; cc++) {
				System.out.print("\t" + itRow[cc]);
			}
			System.out.println();
		}

		return permMat;
	}
}
