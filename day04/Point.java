/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 4 Exercise 6 More on points
 *
 * task set:

 * 	Write a program in which you create and use a class called Point, 
 *	with two fields of type double (e.g. x, y) and the following methods:
 *	distanceTo(Point): calculates the distance to another point.
 *	distanceToOrigin(): calculates the distance to the origin. 
 *			    Implement it by calling the first method.
 *	moveTo(double x, double y): changes the coordinates of this point 
 *				    to be the given parameters x and y.
 *	moveTo(Point): changes the coordinates of this point to move 
 *		       where the given point is.
 *	clone(): returns a copy of the current point with the same coordinates.
 *	opposite(): returns a copy of the current point with the coordinates 
 *		    multiplied by −1.
 *
 *  @author Oliver S. Smart
 *
 * Initial thoughts
 *
 *	Implement in a separate Point.java (this file) and test with E06TestPoint.java
 */
class Point {
	double xcoord;
	double ycoord;
        Point() { // default constructor
		xcoord = 0.;
		ycoord = 0.;
	}
	Point( double xnew, double ynew) { // overload constructor with values
                xcoord = xnew;
                ycoord = ynew;
        }
	void moveTo( double xnew, double ynew) {
		xcoord = xnew;
		ycoord = ynew;
	}
	void moveTo( Point myPnt) {
		xcoord = myPnt.xcoord;
		ycoord = myPnt.ycoord;
	}
 	double distanceTo( Point myPnt) {
		double xDelta = xcoord-myPnt.xcoord;
		double yDelta = ycoord-myPnt.ycoord;
		double dist = xDelta*xDelta + yDelta*yDelta;
		dist = Math.sqrt(dist);
		return dist;
	}
   	double	distanceToOrigin() {
		Point origin = new Point();
		return distanceTo( origin);
	}
	String coordsStrng() {
		return "(" + xcoord + "," + ycoord + ")";
	}


}
