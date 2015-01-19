# Exercises, day 14

## The exercise sheet [exercises_d14.pdf](exercises_d14.pdf) 

# 1 Practicing TDD:

The library exercise: Do everything in a `library` Package.

# 2 Anagrams
* This is a case where it is easier to do by recursive method.
* First hack out an iterative solution
* Then use TDD for recursive approach: write test [RecursiveTest](src/e02anagrams/RecursiveTest.java)
  [RecursiveTest](src/e02anagrams/Recursive.java) to pass it.
  * Note my recursive approach is to split the string into first character and the rest. 
    So *ABCD* is split into *A* and *BCD* then find the anagrams of *BCD*. Once this is done
    add *A* at the start, in between each letter and at end of each of the *BCD* anagrams. This
    means that there is a 6 character string will produce 6 recursive calls to the method.
  * An alternative approach as implemented at top of [?](link) is to split *ABCD* 
   into *A* plus *BCD*, then *B* plus *ACD*, then *C* plus *ABD*, then *D* plus *ABC*. The
   anagrams of each of the triplets are found and the missing letter added at the start
   of each of them. This produces a factorial explosion of recursions as the string gets longer.
   It would be possible to use memoisation to save some time but it this adds complexity.
   OK provided small strings used.
* My iterative solution is build up a 
  
* Another thing to worry about is repeated letters. For instances there are three anagrams of *AAB*:  *AAB*,
  *ABA* and *BAA*. Should get rid of the degenerate solutions.
