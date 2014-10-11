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
}

public class E12DistancePointToPoint {
	public static void main(String[] args) {
		Point pointa = new Point();
		System.out.println("Print pointa (should be a memory address) \"" + pointa + "\"");
		System.out.println("Print field pointa.x=\"" + pointa.x + "\""); 
		System.out.println("Print field pointa.y=\"" + pointa.y + "\""); 
                // try setting some values here
                pointa.x = 10.0;
                pointa.y = -20.0;
		System.out.println("after assigning pointa x,y= (" + pointa.x + "," + pointa.y + ")");
	

	}
}
