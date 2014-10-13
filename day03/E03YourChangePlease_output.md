E03YourChangePlease example output
==================================
Prompt and response program. Screen capture of output for tests:
```
$ java E03YourChangePlease 
Please enter cost of purchase: 100
Please enter amount paid: 20 
You have not paid enough please pay £80.0 more

$ java E03YourChangePlease 
Please enter cost of purchase: 0.13
Please enter amount paid: 1.00
Your change is £0.87
Your change is: 
	1 * fifty pence coin
	1 * twenty pence coin
	1 * ten pence coin
	1 * five pence coin
	1 * two pence coin

$ java E03YourChangePlease 
Please enter cost of purchase: 0.01
Please enter amount paid: 50.00
Your change is £49.99
Your change is: 
	2 * twenty pound notes
	1 * five pound notes
	2 * two pound coin
	1 * fifty pence coin
	2 * twenty pence coin
	1 * five pence coin
	2 * two pence coin

$ java E03YourChangePlease 
Please enter cost of purchase: 0.01
Please enter amount paid: 0.02
Your change is £0.01
Your change is: 
	1 * one pence coin
```
There is a bug in the change output of last example! 
Have to fix
