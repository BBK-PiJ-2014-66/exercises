Exercises, day 05
=================
* Exercise sheet [exercises_d5.pdf](exercises_d5.pdf) 


### 1 Recursive code, line by line

#### a) 

What number*s* would the following method print on screen if you called **printNumbers(6)**?
```
01 	void printNumbers(int n) {
02		if (n <= 0) {
03			return;
04		}
05		printLine(n);
06		printNumbers(n-2);
07		printNumbers(n-3);
08		printLine(n);
09	}
```
Do this exercise on paper.
* invoke **printNumbers(6)**
* *A* **printNumbers(6)**, line 05 will print **6** newline
* *A* **printNumbers(6)**, line 06 will invoke **printNumbers(4)**
* *B* **printNumbers(4)**, line 05 will print **4** newline
* *B* **printNumbers(4)**, line 06 will invoke **printNumbers(2)**
* *C* **printNumbers(2)**, line 05 will print **2** newline
* *C* **printNumbers(2)**, line 06 will invoke **printNumbers(0)** (simply returns)
* *C* **printNumbers(2)**, line 07 will invoke **printNumbers(-1)** (simply returns)
* *C* **printNumbers(2)**, line 08 will print **2** newline
* *B* **printNumbers(4)**, line 07 will invoke **printNumbers(1)**



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
* As [originally coded] (https://github.com/BBK-PiJ-2014-66/pij/commit/27ead2a17e5781479f45a4e129e689943b1fce8e#diff-1e8d700b3a313bc5d8276e76d2a9b385) we get an error that indicates we never get past line 3:
```
	at E01doggyMethod.doggyMethod(E01doggyMethod.java:3)
	at E01doggyMethod.doggyMethod(E01doggyMethod.java:3)
	at E01doggyMethod.doggyMethod(E01doggyMethod.java:3)
```
* so it infinitely loops
*  [Moving the conditional](https://github.com/BBK-PiJ-2014-66/pij/commit/9ebc0e98b4c989208670760a82190e28b7bedb71#diff-1e8d700b3a313bc5d8276e76d2a9b385) fixes problem. 
* The + as addition rather than concatenation is no problem *but* I prefer making this clear [E01doggyMethod.java](E01doggyMethod.java)
* Output of program:
```
$ java E01doggyMethod 
doggyMethod(0)= 
doggyMethod(1)= 1
doggyMethod(2)= 2
doggyMethod(3)= 31
doggyMethod(4)= 142
doggyMethod(5)= 2531
doggyMethod(6)= 316142
doggyMethod(7)= 14272531
doggyMethod(8)= 25318316142
doggyMethod(9)= 316142914272531
doggyMethod(10)= 142725311025318316142
````

