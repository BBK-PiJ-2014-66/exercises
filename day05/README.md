Exercises, day 05
=================
* Exercise sheet [exercises_d5.pdf](exercises_d5.pdf) 


### 1 Recursive code, line by line

#### b)
Do you see anything wrong with the following code? How would you fix it?
```
	String buggyMethod(int n) {
		if (n == 0) {
			return "";
		}
		return n + " " + buggyMethod(n - 2);
	}
```
* The method will work provided it is called with zero or a positive even integer.
* But it will infinitely loop if called with an odd or negative integer. 
* Can be fixed by replacing the conditional with *n <= 0* (n less than or equal to zero).
* This is demonstrated by [E01buggyMethod.java](E01buggyMethod.java) that produces output:
```
$ java E01buggyMethod
buggyMethod(0)= 
buggyMethod(8)= 8 6 4 2 
buggyMethod(9)= 9 7 5 3 1 
```
