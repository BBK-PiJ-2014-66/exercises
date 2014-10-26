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


#### c)
Do you see anything wrong with the following code? How would you fix it?
```
	String doggyMethod(int n) {
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if (n <= 0) {
			return "";
		}
		return result;
	}
```
Initial visual inspection. 
* Worried about whether *doggyMethod(n-3) + n + doggyMethod(n-2)* will produce a String result
  the + will be addition not concatenation?
* The conditional and blank return should be moved up before the *String result* line or we will never
  terminate.

Lets code it up and see what happens. [E01doggyMethod.java](E01doggyMethod.java)
* As originally coded we get error:
```
	at E01doggyMethod.doggyMethod(E01doggyMethod.java:3)
	at E01doggyMethod.doggyMethod(E01doggyMethod.java:3)
	at E01doggyMethod.doggyMethod(E01doggyMethod.java:3)
```
* so it infinitely loops
* Moving the conditional fixes problem. 
* The + as addition rather than concatenation is no problem *but* I prefer making this clear

