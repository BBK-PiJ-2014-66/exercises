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
	static void outputClosestOf3Points( Point pntA, Point pntB, Point pntC) { 
		// first echo back information to user - have the understood input order
		System.out.print("pntA stored as " + pntA.coordString() );
		System.out.print("   pntB stored as " + pntB.coordString() );
		System.out.println("   pntC stored as " + pntC.coordString() );
		double distAB = pntA.distanceTo(pntB);
		double distAC = pntA.distanceTo(pntC);
		double distBC = pntB.distanceTo(pntC);
		System.out.println("Calculate distances: AB=" + distAB + " AC= " + distAC + "  BC= " + distBC);
 
		System.out.print("Closest pair(s) of points are ");
		// must allow for two or three of the distances to be the same
		double minDist = Math.min(distAB,distAC);
	        minDist = Math.min(minDist,distBC);	
		if (Math.abs(distAB-minDist) < 1E-6) 
			System.out.print("AB  ");
		if (Math.abs(distAC-minDist) < 1E-6) 
			System.out.print("AC  ");
		if (Math.abs(distBC-minDist) < 1E-6) 
			System.out.print("BC  ");
		System.out.println();
	}
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
			System.out.println();
			System.out.println("\ttest#1 store A as (0,0) B as (3,4) and C as (1,1)");
			System.out.println("\ttest#1 so by hand distAB=5  distAC=sqrt(2)=1.41421 distBC=sqrt(13)=3.60555");
			System.out.println("\ttest#1 So closest pair of points should be AC");
			System.out.println("\ttest#1 function outputClosestOf3Points reports:");
	        	outputClosestOf3Points( pointA, pointB, pointC); 

			pointA.storexy(0.,1.); 
			pointB.storexy(2.,1.); 
			pointC.storexy(1.,0.); 
			System.out.println();
			System.out.println("\ttest#2 store A as (0,1) B as (2,1) and C as (1,0)");
			System.out.println("\ttest#2 distAC = distBC so should output two pairs AC and BC");
			System.out.println("\ttest#2 function outputClosestOf3Points reports:");
	        	outputClosestOf3Points( pointA, pointB, pointC); 

			pointA.storexy(0.,0.); 
			pointB.storexy(1.,0.); 
			pointC.storexy(0.5,Math.sqrt(0.75)); 
			System.out.println();
			System.out.println("\ttest#3 store A as (0,0) B as (1,0) and C as (0.5,sqrt{0.75})");
			System.out.println("\ttest#3 equilateral triangle should output all three pairs");
			System.out.println("\ttest#3 function outputClosestOf3Points reports:");
	        	outputClosestOf3Points( pointA, pointB, pointC); 

                }
		else if (args.length!=6) {
			System.out.print(usageMessage);
			System.exit(0); // terminate program with no error 
		}
		else {  // user supplied args
			double d0 = Double.parseDouble(args[0]);
			double d1 = Double.parseDouble(args[1]);
			double d2 = Double.parseDouble(args[2]);
			double d3 = Double.parseDouble(args[3]);
			double d4 = Double.parseDouble(args[4]);
			double d5 = Double.parseDouble(args[5]);
			pointA.storexy(d0,d1);
			pointB.storexy(d2,d3);
			pointC.storexy(d4,d5);
	        	outputClosestOf3Points( pointA, pointB, pointC); 
		}
		
                

	}
}
