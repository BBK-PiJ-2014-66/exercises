/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 12 Distance point–to–point
 * task set:
 *    Write a program that reads the X and Y coordinates of three 
 *    points and then outputs which of the three are closer.
 *    Use the following class to store the data for the points:
 *	class Point {
 *	   double x;
 *         double y;
 *	}
 *
 *  @author Oliver S. Smart
 */

class Point {
   	double x;
       	double y;
	String coordString() { // method to return string like "(5.0,3.0)"
		return "(" + x + "," + y + ")";
	}
	void storexy( double xnew, double ynew) {
		x = xnew;
		y = ynew;
	}
	double distanceTo( Point otherPoint) {
		double dist;
		dist = (x-otherPoint.x)*(x-otherPoint.x);
		dist += (y-otherPoint.y)*(y-otherPoint.y);
		dist = Math.sqrt(dist);
		return  dist;
	}
}

public class E12DistancePointToPoint {
	public static void main(String[] args) {
		System.out.println("E12DistancePointToPoint");
		System.out.println("program reads in X and Y coordinates for three points");
		System.out.println("and outputs which of the three are close");
		String usageMessage= "\n" +
			"USAGE: please specify the X and Y coordinates for the three points" +
			" on the command line:\n" +
			"\tE12DistancePointToPoint XA YA XB YB XC YC\n" +	
			"alternatively to run tests\n" +
			"\tE12DistancePointToPoint -test\n";	

		Point pointA = new Point(); 
		Point pointB = new Point(); 
		Point pointC = new Point(); 

		// we will read from the command line because I prefer it.
		// also code a -test option to run tests on methods
                if (args.length==1 && args[0].equals("-test"))  {
			System.out.println("-test procedure, use hard coded points: ");
			// leave A at (0,0) default constructor
			pointB.storexy(3.,4.); // B is (3,4) 
			pointC.storexy(1.,1.); // C is (1,1) 
			System.out.println("\tstored A as (0,0) B as (3,4) and C as (1,1)");
			System.out.println("\tso by hand distAB=5"); 
			System.out.println("\t           distAC=sqrt(2)=1.41421");
			System.out.println("\t           distBC=sqrt(13)=3.60555");
			System.out.println("\tSo closest points should be A and C");
                }
		else if (args.length!=6) {
			 System.out.print(usageMessage);
			 System.exit(0); // terminate program with no error 
		}
		else {
			 System.out.println("need to code argument passing");
			 System.exit(0); // terminate program with no error 
		}
		
		// first echo back information to user - have the understood input order
		System.out.print("pointA stored as " + pointA.coordString() );
		System.out.print("   pointB stored as " + pointB.coordString() );
		System.out.println("   pointC stored as " + pointC.coordString() );
		double distAB = pointA.distanceTo(pointB);
		double distAC = pointA.distanceTo(pointC);
		double distBC = pointB.distanceTo(pointC);
		System.out.println("Calculate distances: AB=" + distAB + " AC= " + distAC + "  BC= " + distBC);
 
		System.out.print("Closest points are ");
		if ( (distAB<distAC) && (distAB < distBC) ) {
			System.out.println("A and B");
		}
		else if ( (distAC<distAB) && (distAC<distBC) ) {
			System.out.println("A and C");
		}
		else {
			System.out.println("B and C");
		}
	}
}
