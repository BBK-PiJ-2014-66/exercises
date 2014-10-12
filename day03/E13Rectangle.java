/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 13 Rectangle
 * task set:
 *    Write a program that reads the X and Y coordinates of two 
 *    points and then outputs the area of a rectangle where
 *    both points are opposite corners. Use the following 
 *    class to store the data for the points:
 *	class Rectangle {
 *          Point upLeft;
 *          Point downRight;
 *	}
 *    Your program should calculate (and write on the screen) 
 *    the perimeter and area of the rectangle.
 *
 * Initial ideas:
 * (a) use the class Point from E12.
 * (b) because the class definition specifies the Point's in Rectangle 
 *     are "upLeft" and "downRight" will have to order input data.
 *     So have storePoints method that takes 4 doubles (we do not know
 *     about constructors yet). In future could overload to take 
 *     two points instead. Or the upperLeft, a width and a height???
 * (c) Implement the perimeter and area as class methods (probably
 *     not meant to but it is crazy not to?)
 * (d) take the input and -test stuff from my E12 solution.
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
class Rectangle {
        // describes rectangle oriented along the X and Y axes 
	Point upLeft;
	Point downRight;
	Rectangle() { // constructor
		this.upLeft = new Point(); // create the upLeft object
		this.downRight = new Point(); // create the upLeft object
	}
	String coordString() { 
        	// method to return string like 
        	// "rectangle: upper left (0.0,10.0) to lower right (20.,0.)"
		String outStr="rectangle: upper left ";
		outStr += upLeft.coordString();
		outStr += " to ";
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
}
 
public class E13Rectangle {
	public static void main(String[] args) {
                String programName="E13Rectangle";
		System.out.print(programName);
		System.out.println(" program reads in X and Y coordinates for two points and outputs");
		System.out.println("  the area and perimeter of a rectangle where both points are opposite corners.");
		String usageMessage= "\n" +
			"USAGE: please specify the X and Y coordinates for the two points" +
			" on the command line:\n" +
			"\t" + programName + " XA YA XB YB\n" +	
			"alternatively to run tests\n" +
			"\t" + programName + " -test\n";	

		Rectangle myRectangle = new Rectangle(); // java does not use "my" as a special word unlike "this"!

                if (args.length==1 && args[0].equals("-test"))  {
			System.out.println("-test procedure, use hard coded points: ");
			myRectangle.storePoints( 1., 1., 21., 11.);
			System.out.println();
                        System.out.println("\ttest#1 supply point (1,1) and (21,11) that is bottom left and top right");
			System.out.println("\ttest#1 expect that this will stored as (1,11) and (21,1).");
			System.out.println("\ttest#1 expect area = 200 units squared and perimeter 10 + 20 + 10 + 20 = 60 units.");
			System.out.println("\tmyRectangle.coordString()=" +  myRectangle.coordString());
			System.out.println("\tmyRectangle.Area()=" +  myRectangle.Area());
			System.out.println("\tmyRectangle.Perimeter()=" +  myRectangle.Perimeter());


		}

	}
}


