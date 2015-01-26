package e01codeflow;

import java.util.ArrayList;
import java.util.List;

/**
 * PiJ day 15 Exception handling
 * 
 * Exercise 1 code flow.
 * 
 * code given in sheet
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 26 Jan 2015
 */
public class CodeFlow {

	public static void main(String[] args) {
		CodeFlow cf = new CodeFlow();
		cf.launch(0);
		cf.launch(2);
		cf.launch(4);
		cf.launch(6);

	}

	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}

}
