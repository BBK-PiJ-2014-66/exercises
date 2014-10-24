/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 4 Exercise 6 More on points
 *	This is a separate testing program for Point.java (to try out separation)
 *
 *  @author Oliver S. Smart
 *
 */ 
class E06TestPoint{
	public static void main(String[] args) {
                System.out.println("E06TestPoint run some tests on Point class");
		Point myPoint = new Point(3.,4.);
                System.out.println("Have defined myPoint= " + myPoint.coordsStrng());
                System.out.println("myPoint.distanceToOrigin()=" + myPoint.distanceToOrigin() + "  (expect 5.0)");
		
	}
}
