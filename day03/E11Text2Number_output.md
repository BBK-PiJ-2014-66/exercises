E11Text2Number example output
==============================
Text capture of output for the -test procedure
```
$ java E11Text2Number -test
-test procedure for Text2Number method: 
	test Text2Number("-230,419.340") results in -230419.34
	test Text2Number("23,419.34") results in 23419.34
	test Text2Number("10") results in 10.0
	test Text2Number("-10.000,000,99") results in -10.00000099
	test Text2Number("0") results in 0.0
	test Text2Number("1E06") results in (should throw exception)
Exception in thread "main" java.lang.IllegalArgumentException: Text2Number cannot handle numbers containing "E"
	at E11Text2Number.Text2Number(E11Text2Number.java:74)
	at E11Text2Number.main(E11Text2Number.java:96)

```


Text capture for normal user use:

```
$ java E11Text2Number 
Please enter a number with commas and a decimal dot: 1,000,567.123
Half your number is 500283.5615
```

Text capture for user entering number two decimal points:

```
$ java E11Text2Number 
Please enter a number with commas and a decimal dot: 1..01
Exception in thread "main" java.lang.IllegalArgumentException: Text2Number cannot handle numbers with more than one decimal point
	at E11Text2Number.Text2Number(E11Text2Number.java:63)
	at E11Text2Number.main(E11Text2Number.java:100)
```

Happy with behaviour
