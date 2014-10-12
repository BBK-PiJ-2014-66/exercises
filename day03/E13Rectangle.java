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
	double Perimeter() {
		double length = downRight.x - upLeft.x;
		double width = upLeft.y - downRight.y;
		return 4.*(length+width);
	}
	double Area() {
		double length = downRight.x - upLeft.x;
		double width = upLeft.y - downRight.y;
		return length*width;
	}
}
 
public class E13Rectangle {
	public static void main(String[] args) {
		System.out.println("E13Rectangle");
	}
}


