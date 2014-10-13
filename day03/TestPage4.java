/* Find working example of java double rounding error

   For "Day 3: Simple and complex data types" lecture notes
   page 4 example.

$ cp TestPage4.java TestPage4.groovy
$ groovy TestPage4.groovy 

Can we find an example that produces a rounding error in both java abnd groovy?


*/
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
		// works as intended in groovy but not in java

		// change #1  add .0 after all the numbers
		// result rounding error in groovy but not in java
		d1 = 2.0/3.0;
		d2 = 2.0* 1000.0/9000.0*3.0;
		if (d1 == d2) 
			System.out.println("After change#1: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#1: They are the same (right comparison)");
		System.out.println("After change#1: d1=" +  d1 + " d2= " + d2);

		// try a sqrt
		// result rounding error in groovy but not in java
		d2 = 2.0/Math.sqrt(9.0);
		if (d1 == d2) 
			System.out.println("After change#2: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#2: They are the same (right comparison)");
		System.out.println("After change#2: d1=" +  d1 + " d2= " + d2);

		// google for an example http://introcs.cs.princeton.edu/java/91float/
		// this one gives rounding error for java but not groovy
		d1 = 0.1 + 0.1 + 0.1;
		d2 = 0.3;
		if (d1 == d2) 
			System.out.println("After change#3: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#3: They are the same (right comparison)");
		System.out.println("After change#3: d1=" +  d1 + " d2= " + d2);

                // change #4 this gives rounding error both in  groovy and in java
		d1 = (0.1+0.1)/0.3;
		d2 = 2.0* 1000.0/9000.0*3.0;
		if (d1 == d2) 
			System.out.println("After change#4: They are the same (wrong comparison)");
		if (Math.abs(d1-d2) < 10E-6) 
			System.out.println("After change#4: They are the same (right comparison)");
		System.out.println("After change#4: d1=" +  d1 + " d2= " + d2);


	}
}


