E14InsideOrOutside example outputs
==================================
Running
```
java E14InsideOrOutside -test
```
produces satisifactory test output:
```
E14InsideOrOutside.java program reads in X and Y coordinates for two points defining a
 rectangle and then the coordinates of a third point.
 Then determines whether the point falls inside or outside the rectangle.

	-test procedure, use hard coded points: 
	test#1 supply point (1,1) and (21,11) that is bottom left and top right
	test#1 expect that this will stored as (1,11) and (21,1).
	myRectangle.coordString()= "rectangle: upper left (1.0,11.0) to lower right (21.0,1.0)"
	test#1 Supply test point (5,6) should be inside, so function ContainsPoint should return true
	testPoint.coordString()= "(5.0,6.0)"	myRectangle.ContainsPoint(testPoint)=true

	test#2 Supply test point (-1,6) should be outside, so function ContainsPoint should return false
	testPoint.coordString()= "(-1.0,6.0)"	myRectangle.ContainsPoint(testPoint)=false
```

Running
```
java E14InsideOrOutside  0 1 2 2 0.5 1.5
```
produces sensible output (the rectangle does contain the point).
```
java E14InsideOrOutside 0 0 1 2 0.5 1.5
E14InsideOrOutside.java program reads in X and Y coordinates for two points defining a
 rectangle and then the coordinates of a third point.
 Then determines whether the point falls inside or outside the rectangle.
 Your rectangle stored as "rectangle: upper left (0.0,2.0) to lower right (1.0,0.0)"
 Your point stored as "(0.5,1.5)"
 The rectangle contains the point.
```

Running
```
java E14InsideOrOutside 0 0 1 2 -0.5 1.5
E14InsideOrOutside.java program reads in X and Y coordinates for two points defining a
 rectangle and then the coordinates of a third point.
```
produces sensible output (the rectangle does not contain the point).
```
 Then determines whether the point falls inside or outside the rectangle.
 Your rectangle stored as "rectangle: upper left (0.0,2.0) to lower right (1.0,0.0)"
 Your point stored as "(-0.5,1.5)"
 The rectangle does not contain the point.
```

If the command is run with no input:
```
java E14InsideOrOutside
```
A reasonable usage message is produced:
```
E14InsideOrOutside.java program reads in X and Y coordinates for two points defining a
 rectangle and then the coordinates of a third point.
 Then determines whether the point falls inside or outside the rectangle.

USAGE: on the command line please specify the X and Y coordinates for the two points A & B that define the rectangle, followed by the X and Y coordinates for point C
	E14InsideOrOutside.java XA YA XB YB XC YC
alternatively to run test
	E14InsideOrOutside.java -test
```
* Have marked up the outputs for this file.
* I am happy with this all.
