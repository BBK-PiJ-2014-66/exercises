E12DistancePointToPoint test output
===================================
Running
```
java E12DistancePointToPoint -test > E12DistancePointToPoint-test.md
```
produces output:
```
E12DistancePointToPoint
program reads in X and Y coordinates for three points
and outputs which of the three are close
-test procedure, use hard coded points: 

	test#1 store A as (0,0) B as (3,4) and C as (1,1)
	test#1 so by hand distAB=5  distAC=sqrt(2)=1.41421 distBC=sqrt(13)=3.60555
	test#1 So closest pair of points should be AC
	test#1 function outputClosestOf3Points reports:
pntA stored as (0.0,0.0)   pntB stored as (3.0,4.0)   pntC stored as (1.0,1.0)
Calculate distances: AB=5.0 AC= 1.4142135623730951  BC= 3.605551275463989
Closest pair(s) of points are AC  

	test#2 store A as (0,1) B as (2,1) and C as (1,0)
	test#2 distAC = distBC so should output two pairs AC and BC
	test#2 function outputClosestOf3Points reports:
pntA stored as (0.0,1.0)   pntB stored as (2.0,1.0)   pntC stored as (1.0,0.0)
Calculate distances: AB=2.0 AC= 1.4142135623730951  BC= 1.4142135623730951
Closest pair(s) of points are AC  BC  

	test#3 store A as (0,0) B as (1,0) and C as (0.5,sqrt{0.75})
	test#3 equilateral triangle should output all three pairs
	test#3 function outputClosestOf3Points reports:
pntA stored as (0.0,0.0)   pntB stored as (1.0,0.0)   pntC stored as (0.5,0.8660254037844386)
Calculate distances: AB=1.0 AC= 0.9999999999999999  BC= 0.9999999999999999
Closest pair(s) of points are AB  AC  BC  
```
I am happy with this.
