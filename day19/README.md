# Exercises, day 19 Java 8

## The exercise sheet [functions.pdf](functions.pdf) 

# 1 Sorting strings
* using lambda expressions [SortSomeStrings](exercises/src/e01/SortSomeStrings.java)

# 2 Use static method and reference in place of explicit lambda
* Method `eChecker` in [StringUtils](exercises/src/e01/StringUtils.java)
* use in  [SortSomeStrings](exercises/src/e01/SortSomeStrings.java)

#3 betterString
* `static` method `betterString` added to [StringUtils](exercises/src/e01/StringUtils.java)
* uses interface [TwoStringPredicate](exercises/src/e01/TwoStringPredicate.java) for its lambda
* Tested by [TestBetterString](exercises/src/e01/TestBetterString.java) that produces output:

```
1st test string: adam
2nd test string: Eve
The longer string: adam
The 2nd string: Eve
The 1st string alphabetically: Eve
The 1st string alphabetically ignoring case: adam
```

#4 Generic version of betterString
*  `static` method `betterElement` in [ElementUtils](exercises/src/e01/ElementUtils.java)
* Generic interface [TwoElementPredicate](exercises/src/e01/TwoElementPredicate.java)
* test [TestBetterElement](exercises/src/e01/TestBetterElement.java) produces exactly the same output as shown in previous section 

#5 allMatches 
* `allMatches` method applies a predicate to a list of strings in  [StringUtils](exercises/src/e01/StringUtils.java).
* test [TestAllMatches](exercises/src/e01/TestAllMatches.java) produces output

```
Original list of words: [The, quick, brown, jumps, over, a, lazy, dog]
words shorter than 4 letters: [The, a, dog]
words with 'b': [brown]
words with an even length [over, lazy]
```

#6 rewrite `allMatches` to be generic
* added generic version of `allMatches` to  [ElementUtils](exercises/src/e01/ElementUtils.java)
* altered test [TestAllMatches](exercises/src/e01/TestAllMatches.java) to use generic method. The output is unaltered.


