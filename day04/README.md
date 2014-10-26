Exercises, day 04
=================
* Exercise sheet [00_exercises_d4.pdf](00_exercises_d4.pdf) 


### 1 Scope
Written exercise [answer](E01_Scope.asciidoc).

### 2 Pointer, arrows. . .

+2.1 a)+ is covered in detail in http://moodle.bbk.ac.uk/pluginfile.php/335447/mod_resource/content/2/example%20of%20memory%20structures.pdf

but I think there is a little mistake on page 21 *Third, note that the fields do not
have any value in them (until they are initialised)* surely as the Point class includes
no explicit constructor the default constructor would be used and both the integer fields would be initialized
to zero?  Lets test by trying to print them before any user initialization.

[E02PointExample.java](E02PointExample.java) is java version with a print. The output is 
```
$ java E02PointExample 
Before any user initialization point is 0,0
The integer is now 0
The point is now 0,0
Calling method increment(Point, int)...
 At the end of the method...
 The integer is 1
 The point is null
The integer is now 0
The point is now 1
```
Think this shows that the fields are initialized by the default constructor. Maybe
we are not meant to know about the default constructor yet? If so apologies for being ahead of the game.

### 3 A bit more practice with doubles
This confuses me 100% not the java bit but what is this mortgage.
In particular the question 
*The number of years before the interest is paid and only the initial capital remains*
suggests that this is some kind of mortgage where you pay off all the interest before
repaying any capital. Could implement http://en.wikipedia.org/wiki/Fixed-rate_mortgage
but should check the specification the "customer" has set before implementing the wrong
thing.


### 4 Binary and decimal
[E04BinaryAndDecimal.java](E04BinaryAndDecimal.java) finished produces [output](E04BinaryAndDecimal_output.asciidoc)

### 5 Binary and hexadecimal (*)
*to be done*

### 6 More on points
Wrote required class/methods as [Point.java](Point.java).  This is tested by [E06TestPoint.java](E06TestPoint.java)
producing  [output](E06_output.asciidoc).

### 7 Integer
class [Integer2.java](Integer2.java) test program [E07TestInteger2.java](E07TestInteger2.java) producing [output](E07_output.asciidoc)
*(work in progress)*

## Coursework
* java versions of the examples [C01CarDealing.java](C01CarDealing.java), 
[C02FilmRating.java](C02FilmRating.java) and  [C04TCard.java](C04TCard.java)
* powerpoint of the course work
 [CourseworkOne_revised_password.pptx](CourseworkOne_revised_password.pptx)
*this is password protected*
