public class TestPage4 {
	public static void main(String[] args) {
		// Original from notes (with semicolons added)
		double d1 = 2/3;
		double d2 = 2* 1000/9000 *3;
		// WRONG!
		if (d1 == d2) {
			// this is not printed due due to rounding errors
			System.out.println("They are the same (wrong comparison)");
		}
		// RIGHT!
		if (Math.abs(d1-d2) < 10E-6) {
			System.out.println("They are the same (right comparison)");
		}
		// in java both statements printed because d1 and d2 are 0.0 due to 
		// integer divide of literals
		System.out.println("original d1=" +  d1 + " d2= " + d2);

		// change #1  add .0 after all the numbers
		d1 = 2.0/3.0;
		d2 = 2.0* 1000.0/9000.0*3.0;
		if (d1 == d2) 
			System.out.println("After change#1: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#1: They are the same (right comparison)");
		System.out.println("After change#1: d1=" +  d1 + " d2= " + d2);
		// still get both!

		// try a sqrt
		d2 = 2.0/Math.sqrt(9.0);
		if (d1 == d2) 
			System.out.println("After change#2: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#2: They are the same (right comparison)");
		System.out.println("After change#2: d1=" +  d1 + " d2= " + d2);
		// still get both

		// google for an example http://introcs.cs.princeton.edu/java/91float/
		d1 = 0.1 + 0.1 + 0.1;
		d2 = 0.3;
		if (d1 == d2) 
			System.out.println("After change#3: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#3: They are the same (right comparison)");
		System.out.println("d1=" +  d1 + " d2= " + d2);
		System.out.println("After change#3: d1=" +  d1 + " d2= " + d2);
		// this one works
/* on ubuntu linux get output

*/
	

	}
}


