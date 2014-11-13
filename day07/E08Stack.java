/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date from 12 Nov 2014
 *  
 * Day 7 Exercises 8
 * Task set:

A stack is a dynamic structure that implements these methods:
	push(...) inserts an element at the beginning of the stack.
	pop(...) remove an element from the beginning of the stack.
	empty(...) returns true if there are no elements on the stack, false otherwise.

Stacks are heavily used in computing. The method call stack that stores the variables for each method in a
program is just one well-known example.

Implement a stack of integers. This could represent requests to a hard drive to read from different sectors.

Implement the three methods listed above.

Then write another class that creates a stack, and makes several push(), and pop() calls. Make sure you check
the size of the stack before popping elements out. Check that the values you get are consistent. The output of the
program could look like this:
	Pushing 5...
	Pushing 8...
	Pushing 12...
	Popping... it’s a 12
	Pushing 13...
	Popping... it’s a 13
	Popping... it’s a 8
	Popping... it’s a 5
	Stack is empty

 *
 */
public class E08Stack{
	private static void printStackEmptyOrNot( ListUtilities inStack) {
		String blankOrNot = inStack.empty() ? "" : "not ";
		System.out.println("Stack is " + blankOrNot + "empty");
	}
	public static void main( String[] args) {
		ListUtilities Stack = new ListUtilities();
		printStackEmptyOrNot(Stack);
		Stack.printList();
		Stack.push(5);
		printStackEmptyOrNot(Stack);
		Stack.printList();
		Stack.push(8);
		Stack.printList();
		Stack.push(12);
		Stack.printList();
		System.out.println("Popping ... it’s a " + Stack.pop());
		Stack.printList();
		Stack.push(13);
		Stack.printList();
		System.out.println("Popping ... it’s a " + Stack.pop());
		Stack.printList();
		System.out.println("Popping ... it’s a " + Stack.pop());
		Stack.printList();
		System.out.println("Popping ... it’s a " + Stack.pop());
		Stack.printList();
		printStackEmptyOrNot(Stack);
	}
}
