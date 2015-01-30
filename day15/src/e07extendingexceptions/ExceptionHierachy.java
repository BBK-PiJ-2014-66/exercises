package e07extendingexceptions;

/**
 * 
 * PiJ day 15 Exception handling
 * 
 * Exercise 7 Hierarchies of classes, hierarchies of exceptions
 * 
 * task:
 * 
 * (Borrowed from Bruce Eckel.) Create a three-level hierarchy of exceptions
 * (i.e. an exception extends some exceptions that extends some exception). Now
 * create a base-class A with a method that throws an exception at the base of
 * your hierarchy. Inherit B from A and override the method so it throws an
 * exception at level two of your hierarchy. Repeat by inheriting class C from
 * B. In the launch() method of another class, create a C and upcast it to A,
 * then call the method.
 * 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 30 Jan 2015
 * 
 */
public class ExceptionHierachy {

	/*
	 * Create a three-level hierarchy of exceptions (i.e. an exception extends
	 * some exceptions that extends some exception).
	 */
	@SuppressWarnings("serial")
	class ExceptionA extends RuntimeException {
	}

	@SuppressWarnings("serial")
	class ExceptionB extends ExceptionA {
	}

	@SuppressWarnings("serial")
	class ExceptionC extends ExceptionB {
	}

	/*
	 * Now create a base-class A with a method that throws an exception at the
	 * base of your hierarchy.
	 */
	class BaseA {
		public void throwException() {
			throw new ExceptionA();
		}
	}

	/*
	 * Inherit B from A and override the method so it throws an exception at
	 * level two of your hierarchy.
	 */
	class DaughterB extends BaseA {
		@Override
		public void throwException() {
			throw new ExceptionB();
		}
	}

	/*
	 * Repeat by inheriting class C from B.
	 */
	class DaughterC extends DaughterB {
		@Override
		public void throwException() {
			throw new ExceptionC();
		}
	}

	/*
	 * In the launch() method of another class, create a C and upcast it to A,
	 * then call the method.
	 */
	public static void main( String args[]) {
		ExceptionHierachy eh = new ExceptionHierachy();
		eh.launch();
	}

	/*
	 * In the launch() method of another class, create a C and upcast it to A,
	 * then call the method.
	 */
	public void launch() {
		DaughterC test = new DaughterC();
		BaseA upcast = test; // upcast
		upcast.throwException();
		
	}
}
