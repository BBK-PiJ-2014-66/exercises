/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 5.1 Integer Binary Tree
 *
 * Script to test things out.
 */
public class TestIntegerTreeNode{
	public static void main( String args[]) {
		launch();
	}
	public static void launch() {
		System.out.println("Create a tree like in exercise sheet Figure 1 with 6, 9, 5, 3, 11, 12, 8");
		IntegerList testIntTree = new IntegerTreeNode(6);
		System.out.println("Note toString now simplified");
		System.out.println("Point (a) have started with 6 as head. toString gives: " + testIntTree);
		testIntTree.add(9);
		System.out.println("Point (b) after 6, 9. toString gives: " + testIntTree);
		testIntTree.add(5);
		testIntTree.add(3);
		System.out.println("Point (c) after 6, 9, 5, 3 toString gives: " + testIntTree);
		testIntTree.add(11);
		testIntTree.add(12);
		testIntTree.add(8);
		System.out.println("Point (d) after 6, 9, 5, 3, 11, 12, 8 toString gives: " + testIntTree);
		System.out.println("check whether tree contains 11 (it does) gives: " + testIntTree.contains(11));
		System.out.println("check whether tree contains 10 (it does not) gives: " + testIntTree.contains(10));
		System.out.println("The maximum value in the tree is 12, getMax gives: " + testIntTree.getMax());
		System.out.println("The maximum value in the tree is 3, getMin gives: " + testIntTree.getMin());
 
		
	}
}
