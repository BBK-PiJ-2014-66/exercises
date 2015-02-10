# Exercises, day 17 Concurrent Programming

## The exercise sheet [exercises_d17.pdf](exercises_d17.pdf) 

# 1 Text loops
* Code on sheet [TextLoop](src/e01TextLoops/TextLoop.java)
* Output in mode `0` unthreaded is always ordered 

```
$ java -cp bin e01TextLoops/TextLoop 0 
Loop:Thread 0, iteration:0.
Loop:Thread 0, iteration:1.
Loop:Thread 0, iteration:2.
...

```

* But in mode `1` with threads running order varies always starts 0 0, normally finishes 9 9 but can vary:

```
$ java -cp bin e01TextLoops/TextLoop 1 | tail -3
Loop:Thread 9, iteration:7.
Loop:Thread 9, iteration:8.
Loop:Thread 9, iteration:9.
$ java -cp bin e01TextLoops/TextLoop 1 | tail -3
Loop:Thread 7, iteration:7.
Loop:Thread 7, iteration:8.
Loop:Thread 7, iteration:9.
$ java -cp bin e01TextLoops/TextLoop 1 | tail -3
Loop:Thread 3, iteration:7.
Loop:Thread 3, iteration:8.
Loop:Thread 3, iteration:9.
```

# 2 Counting

* Given code [Increaser](src/e02counter/Increaser.java) and [Counter](src/e02counter/Counter.java). Get varying final amounts. This because `n++` is not atomic in java. Making method `Count.increase()` *synchronized* fixes the problem.

# 3 Bank account

* Given bank account class [BankAccount](src/e03bankaccount/BankAccount.java) adding two `synchronized` statements can fix the class to allow multiple threads to access. But it is interesting to note that results may still be non-deterministic. If there are rapid deposits and withdrawls then results will vary as the order of operations matters! This has to be sorted outside the class.

