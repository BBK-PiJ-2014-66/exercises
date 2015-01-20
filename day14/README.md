# Exercises, day 14

## The exercise sheet [exercises_d14.pdf](exercises_d14.pdf) 

# 1 Memoized Fibonacci
* Did a Memoized Fibonacii on [day05](../day05#user-content-22-fibonacci)

# 2 Anagrams
* This is a case where it is easier to do by recursive method.
* First hack out an iterative solution
* Then use TDD for recursive approach: write tests [RecursiveTest](src/e02anagrams/RecursiveTest.java)
  first then implement [Recursive](src/e02anagrams/Recursive.java) to pass it.
  * Note my recursive approach is to split the string into first character and the rest. 
    So *ABCD* is split into *A* and *BCD* then find the anagrams of *BCD*. Once this is done
    add *A* at the start, in between each letter and at end of each of the *BCD* anagrams. This
    means that there is a 6 character string will produce 6 recursive calls to the method.
  * An alternative approach as implemented at top of 
   [stackoverflow link](http://stackoverflow.com/questions/20906214/permutation-algorithm-for-array-of-integers-in-java)
   is to split *ABCD* 
   into *A* plus *BCD*, then *B* plus *ACD*, then *C* plus *ABD*, then *D* plus *ABC*. The
   anagrams of each of the triplets are found and the missing letter added at the start
   of each of them. This produces a factorial explosion of recursions as the string gets longer.
   It would be possible to use memoisation to save some time but it this adds complexity.
   OK provided small strings used.
* My iterative solution [Iterative](src/e02anagrams/Iterative.java) is build up a 
  permutation table listing every way to permute a list of *numItems*. 
  This is found for *numItems*=1, then 2, then 3
  until the requires number is found. So in many respects takes the same approach
  as the recursive but in the other direction. **Needs more work**
* Another thing to worry about is repeated letters. For instances there are three anagrams of *AAB*:  *AAB*,
  *ABA* and *BAA*. Should get rid of the degenerate solutions. Fix by altering method to use a
  *TreeSet* internally (also ensures result is sorted).


#  3 Hailstone numbers

* implemented [Hailstone](src/hailstone/Hailstone.java)
  tested by [HailstoneTest](src/hailstone/HailstoneTest.java). Conclusion memoisation
  is a pain to implement for the iterative version but really easy for recursive.
  Would be nice to do some performance tests (cpu time for the first 10000 numbers?) but
  need to move on.


