package trace;

//
// Q2 from tracing outputs:
// 
// A
// BDX
public class Q2 {

	public static void main(String[] args) {
		Q2 q2 = new Q2();
		q2.launch();
	}

	private void launch() {
		Base b = new Derived();
		b.methodOne(0);
	}

	class Base {
		void methodOne() {
			System.out.println("A");
			methodTwo();
		}

		void methodOne(int a) {
			System.out.println("W");
			methodTwo();
		}

		void methodTwo() {
			System.out.print("B");
		}
	}

	class Derived extends Base {
		void methodOne(int a) {
			super.methodOne();
			System.out.print("X");
		}

		void methodOne(Integer a) {
			super.methodOne();
			System.out.print("C");
		}

		void methodTwo() {
			super.methodTwo();
			System.out.print("D");
		}

	}

}
