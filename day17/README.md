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

# 4 Responsive UI	
* Task is *Write a program that asks from the user the length in milliseconds of ten tasks. As the user enters the length, the tasks start running in the background while the user enters the length of the other tasks. When the tasks end, the program must register it and say it unless it is waiting for the user to enter data.*
* [ResponsiveUI](src/e04ResponsiveUI/ResponsiveUI.java) the main script
* [TaskSleep](src/e04ResponsiveUI/TaskSleep.java) the task
* [TaskReport](src/e04ResponsiveUI/TaskReport.java) to record when a task has finished so it can be reported at a later stage.
* N.B. A problem with the original implementation is 
  that the  main scripted exited before all tasks finished. 
  So modified so that after the input prompt for times loop has 
  completed start a new loop that polls to see whether any of the 
  threads are still alive and only exit when they have all finished.

# 5 Parallel computation
* Given [Computation](src/e05ParallelComputation/Computation.java) and 
[ComputationLauncher](src/e05ParallelComputation/ComputationLauncher.java)
* My notes different sets of random numbers are produced in `ComputationLauncher.createArray()` but the a seed is used to ensure that same random numbers are produced in `Computation.run()`.  So the threaded and unthreaded versions produce an identical result but rerunning the program produces a slightly different result because a different set of numbers is used.
* Do not understand the comment **A new Random is created here because Math.random() is  synchronised, which leads to no improvement being seen**?
* We are told to modify the program for 4 processors. Instead modify to allow it to default to run on as many threads as `availableProcessors()` and for the user to be able to specify try out on a 24 processor machine.
* try out for a simple 2 processor and a 12 core (each is hyperthreaded) machine:

![cpu vs number of processors](e05parallelcomputation.png)

* interesting get plateau at 12 threads - is this because this is the actual number of cores or some other reason?

# 6 Immutability (*)
**Look at the attached program `ImmutableExample`. Read it carefully. Do you see any flaws? If yes, what would you change to make the program work without problems? What whould you change to make the IDCard class immutable?**
* The program [ImmutableExample](src/e06immutability/ImmutableExample.java) runs but the print out of the `Citizen` varies run to run sometimes printing *John ... 1971* and sometime Mary ... 1985 (but if one was really unlucky the two could be mixed). This showsthat supplying the same `MutableIDCard` object to the two threads means they can interfer. As this  is presumably not wanted have altered `Citizen`to keep a defensive copy of the supplied `id` rather than the original. With this can program always prints  *John ... 1971*.
* Wrote an immutable version of IDCard following this week's sheet recommendations [ImmutableIDCard](src/e06immutability/ImmutableIDCard.java)

