# Exercises, day 12

## The exercise sheet [exercises_d12.pdf](exercises_d12.pdf) 

# 2 Testing mathematical functions

Write JUnit test [HashUtilitiesTest.java](src/HashUtilitiesTest.java) for day 08 
hash method *shortHash* [HashUtilities.java](src/HashUtilities.java). **done**


# 3 Practice "Find bugs once"

Added additional test to [PersonTest.java](src/PersonTest.java) to test for
multiple space bug in [Person.java](src/Person.java) as instructed.

# 4 Test implementations of a given interface

Tests of implementation of a class.

# 4.1 Stack

* Stack interface to be tested is [StringStack.java](src/StringStack/StringStack.java) 
  * Implementation of the inteface using arrays (given to us on day 8): 
   [ArrayStringStack.java](src/StringStack/ArrayStringStack.java). 
  * The actual JUnit tests are in Abstract class [StringStackTest.java](src/StringStack/StringStackTest.java)
  * These tests are run for Array-based implementation by [ArrayStringStackTest.java](src/StringStack/ArrayStringStackTest.java).
  * and for the Pointer-based by [PointerStringStackTest.java](src/StringStack/PointerStringStackTest.java).
* I think this provides a pretty good way to run the same tests for different implementations of the same interface. 
There are different opinions about this, for instance see:
[stackoverflow.com 16237135](http://stackoverflow.com/questions/16237135/junit-writing-a-single-unit-test-for-multiple-implementations-of-an-interface) and
[stackoverflow.com 6724401](http://stackoverflow.com/questions/6724401/how-to-write-junit-tests-for-interfaces). 




