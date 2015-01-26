# Exercises, day 15 Exception handling

## The exercise sheet [exercises_d15.pdf](exercises_d15.pdf) 

# 1 Code flow.
Look at code given on the exercise sheet and write the code flow expected for
* *userInput=0*. Method will run from 01 to 20, printing *2* at line 11, *3* at line 13, 
  *4* at line 15, *5* at 17 and *6* at 19.
  At line 21 there will be an IndexOutOfBoundsException that will cause execution to jump 
  to line 24, at line 25 the stack trace will be printed. Expect that it will be something like:

```
Exception in thread "main" java.lang.IndexOutOfBoundsException
  at CodeFlow.launch(CodeFlow.java:21)
  .....
```

* *userInput=2*. exception on line 17 after printing *4*, *5* and *6*
* *userInput=4*. Same will happen but on line 13 after printing *6*.
* *userInput=6*. Same will happen but on line 11 without printing anything


* Now implement it and check [CodeFlow](src/e01codeflow/CodeFlow.java)
  produces [output](CodeFlow_out.txt). /Read code wrong/ 


# 3 Error handling on user input
* [ErrorHandlingUser](src/e03ErrorHandlingUserInput/ErrorHandlingUser.java) produces output
[output](ErrorHandlingUserInput_output.txt) fufils the two requirements.



