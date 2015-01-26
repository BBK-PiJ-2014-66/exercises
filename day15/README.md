# Exercises, day 15

## The exercise sheet [exercises_d15.pdf](exercises_d15.pdf) 

# 1 Code flow.
Look at code given on the exercise sheet and write the code flow expected for
* *userInput=0*. Method will run from 01 to 20, printing *0* at lines 11, 13, 15, 17 and 19.
  At line 21 there will be an IndexOutOfBoundsException that will cause execution to jump 
  to line 24, at line 25 the stack trace will be printed. Expect that it will be something like:

```
Exception in thread "main" java.lang.IndexOutOfBoundsException
  at CodeFlow.launch(CodeFlow.java:21)
  .....
```

