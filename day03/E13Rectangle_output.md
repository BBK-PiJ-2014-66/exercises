E13Rectangle example outputs
============================
Running
```
java E13Rectangle -test
```
produces output:
```
E13Rectangle program reads in X and Y coordinates for two points and outputs
  the area and perimeter of a rectangle where both points are opposite corners.

	-test procedure, use hard coded points: 
	test#1 supply point (1,1) and (21,11) that is bottom left and top right
	test#1 expect that this will stored as (1,11) and (21,1).
	test#1 expect area = 200 units squared and perimeter 10 + 20 + 10 + 20 = 60 units.
	myRectangle.coordString()= "rectangle: upper left (1.0,11.0) to lower right (21.0,1.0)"
	myRectangle.Area()=200.0
	myRectangle.Perimeter()=60.0
```

Running
```
java E13Rectangle 0 1 0 2
```
produces sensible output:
```
osmart@fuji01vm:/mnt/hgfs/vmshare/msc/pij/pij/day03$ java E13Rectangle 0 1 1 2
E13Rectangle program reads in X and Y coordinates for two points and outputs
  the area and perimeter of a rectangle where both points are opposite corners.
 Your rectangle stored as "rectangle: upper left (0.0,2.0) to lower right (1.0,1.0)"
 Your rectangle's perimeter is 4.0 units
 Your rectangle's Area is 1.0 units squared
```

If the command is run with no input:
```
java E13Rectangle
```
A reasonable usage message is produced:
```
E13Rectangle program reads in X and Y coordinates for two points and outputs
  the area and perimeter of a rectangle where both points are opposite corners.

USAGE: please specify the X and Y coordinates for the two points on the command line:
	E13Rectangle XA YA XB YB
alternatively to run test
	E13Rectangle -test

```
* Have marked up the outputs for this file.
* I am happy with this all.
