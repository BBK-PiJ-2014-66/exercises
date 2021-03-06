/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 14 Inside or outside
 * task set:
 *    Write a program that reads the coordinates of the two points 
 *    defining a rectangle and then the coordinates of a third 
 *    point. The program must then determine whether the point 
 *    falls inside or outside the rectangle.
 *
 * Initial ideas:
 *    A simple extension of Exercise 13. 
 *    May as well add explicit constructors for the Point class
 *    to end up with more elegant code.
 *
 *  @author Oliver S. Smart
 */
class Point {
   	double x;
       	double y;
        Point() { // default constructor
	}
	Point( double xnew, double ynew) { // overload constructor with values
		this.x = xnew;
		this.y = ynew;
	}
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
class Rectangle {
        // describes rectangle oriented along the X and Y axes 
	Point upLeft;
	Point downRight;
	Rectangle() { // constructor
		this.upLeft = new Point(); // create the upLeft object
		this.downRight = new Point(); // create the upLeft object
	}
        Rectangle( double x1, double y1, double x2, double y2) { // overload constructor
		this.upLeft = new Point(); // create the upLeft object
		this.downRight = new Point(); // create the upLeft object
		this.storePoints( x1, y1, x2, y2);
	}
	String coordString() { 
        	// method to return string like 
        	// "rectangle: upper left (0.0,10.0) to lower right (20.,0.)"
		String outStr="rectangle: upper left ";
		outStr += upLeft.coordString();
		outStr += " to lower right ";
		outStr += downRight.coordString();
		return outStr;
	}
	void storePoints( double x1, double y1, double x2, double y2) {
		// upper left has minimum x but maximum y
		// computer science screen coordinates?
		upLeft.storexy( Math.min(x1,x2), Math.max(y1,y2));
		// down Right is the other one
		downRight.storexy( Math.max(x1,x2), Math.min(y1,y2));
	}
	double Perimeter() { // of a rectangle is twice (length plus width)
		double length = downRight.x - upLeft.x;
		double width = upLeft.y - downRight.y;
		return 2.*(length+width);
	}
	double Area() { // of a rectangle is length times width
		double length = downRight.x - upLeft.x;
		double width = upLeft.y - downRight.y;
		return length*width;
	}
	boolean ContainsPoint( Point testPoint) {
		if (testPoint.x > this.downRight.x)
			return false;
		if (testPoint.x < this.upLeft.x)
			return false;
		if (testPoint.y > this.upLeft.y)
			return false;
		if (testPoint.y < this.downRight.y)
			return false;
		return true;
	}
}
 
public class E14InsideOrOutside {
	public static void main(String[] args) {
                String programName="E14InsideOrOutside.java";
		System.out.print(programName);
		System.out.println(" program reads in X and Y coordinates for two points defining a");
		System.out.println(" rectangle and then the coordinates of a third point.");
		System.out.println(" Then determines whether the point falls inside or outside the rectangle.");
		String usageMessage= "\n" +
			"USAGE: on the command line please specify the X and Y coordinates for the two points A & B" +
			" that define the rectangle, followed by the X and Y coordinates for point C\n" +
			"\t" + programName + " XA YA XB YB XC YC\n" +	
			"alternatively to run test\n" +
			"\t" + programName + " -test\n";	

                if (args.length==1 && args[0].equals("-test"))  {
			System.out.println("\n\t-test procedure, use hard coded points: ");
                        System.out.println("\ttest#1 supply point (1,1) and (21,11) that is bottom left and top right");
			System.out.println("\ttest#1 expect that this will stored as (1,11) and (21,1).");

		        // use overloaded constructor to make the object in a single line	
			Rectangle myRectangle = new Rectangle( 1., 1., 21., 11.); // java does not use "my" as a special word unlike "this"!
			System.out.println("\tmyRectangle.coordString()= \"" +  myRectangle.coordString()+"\"");
			System.out.println("\ttest#1 Supply test point (5,6) should be inside, so function ContainsPoint should return true");
			Point testPoint = new Point( 5., 6.);
			System.out.print("\ttestPoint.coordString()= \"" +  testPoint.coordString()+"\"");
			System.out.println("\tmyRectangle.ContainsPoint(testPoint)=" + myRectangle.ContainsPoint(testPoint));

			
			System.out.println("\n\ttest#2 Supply test point (-1,6) should be outside, so function ContainsPoint should return false");
                        testPoint.storexy( -1., 6.);
			System.out.print("\ttestPoint.coordString()= \"" +  testPoint.coordString()+"\"");
			System.out.println("\tmyRectangle.ContainsPoint(testPoint)=" + myRectangle.ContainsPoint(testPoint));


		}
		else if (args.length!=6) { // no args supplied
			System.out.print(usageMessage);
		}
		else {  // user supplied args
			double d0 = Double.parseDouble(args[0]);
			double d1 = Double.parseDouble(args[1]);
			double d2 = Double.parseDouble(args[2]);
			double d3 = Double.parseDouble(args[3]);
			Rectangle myRectangle = new Rectangle( d0, d1, d2, d3); 
			System.out.println(" Your rectangle stored as \"" +  myRectangle.coordString()+"\"");
			double d4 = Double.parseDouble(args[4]);
			double d5 = Double.parseDouble(args[5]);
			Point testPoint = new Point( d4, d5);
			System.out.println(" Your point stored as \"" +  testPoint.coordString()+"\"");
			if (myRectangle.ContainsPoint(testPoint)) 
				System.out.println(" The rectangle contains the point.");
			else
				System.out.println(" The rectangle does not contain the point.");
		}
	

	}
}

