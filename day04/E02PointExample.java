class Point {
	int x;
	int y;
}

class E02PointExample {
	// This method increments the int by 1 and
	// moves the point to the right
	public static void increment(Point point, int n) {
		n = n + 1;
		point.x = point.x + 1;
		point = null;
		System.out.println(" At the end of the method...");
		System.out.println(" The integer is " + n);
		System.out.println(" The point is " + point);
	}

	public static void main(String[] args) {
		// Program execution starts here
		Point myPoint = new Point();
		myPoint.x = 0;
		myPoint.y = 0;
		int myInt = 0;
		System.out.println("The integer is now " + myInt);
		System.out.println("The point is now " + myPoint.x + "," + myPoint.y);
		System.out.println("Calling method increment(Point, int)...");
		increment(myPoint, myInt);
		System.out.println("The integer is now " + myInt);
		System.out.println("The point is now " + myPoint.x);
	}
}
