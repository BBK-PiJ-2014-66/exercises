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


