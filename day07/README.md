**Table of Contents**  *generated with [DocToc](http://doctoc.herokuapp.com/)*

- [Exercises, day 07](#user-content-exercises-day-07)
	- [The exercise sheet exercises_d7.pdf](#user-content-the-exercise-sheet-exercises_d7pdf)
- [1 Instance counter](#user-content-1-instance-counter)
- [2 do {practice} while {!understood}](#user-content-2-do-practice-while-understood)
- [3 Singly-linked lists and 4 Queue length](#user-content-3-singly-linked-lists-and-4-queue-length)
- [5 Doubly-linked lists](#user-content-5-doubly-linked-lists)
- [6 Circular list](#user-content-6-circular-list)
- [7 Queues (*)](#user-content-7-queues-)
- [8 Stacks (*)](#user-content-8-stacks-)
- [9 From array to list](#user-content-9-from-array-to-list)
- [10 A sorted list](#user-content-10-a-sorted-list)
- [11 Bubble sort (*)](#user-content-11-bubble-sort-)
- [12 Cocktail sort (*)](#user-content-12-cocktail-sort-)
- [13 QuickSort (**)](#user-content-13-quicksort-)

---------------------

# Exercises, day 07

## The exercise sheet [exercises_d7.pdf](exercises_d7.pdf) 

# 1 Instance counter

[Spy.java](Spy.java) works but the number of spys is not correctly decremented if a spy goes out
of context - not sure whether it is possible or wanted? May be should reimplement using linked lists?


#2 do {practice} while {!understood}

[E02DoWhile.java](E02DoWhile.java) written with *do while* but refactored to *while (true)*
and a break. For test output see last commit message.

#3 Singly-linked lists and 4 Queue length

Work in [Patient.java](Patient.java) and  [HospitalManager.java](HospitalManager.java) written.
(The output is contained in last git commit message for either). 

Seems a bit of a mess. Mixing patients with how to store a list? Surely in OO coding we should
design a nice interface that hides how a patient list is stored but provides easily understood
methods? 

#5 Doubly-linked lists

[E05DoublyLinkedLists.java](E05DoublyLinkedLists.java) works (output contained in
last commit) but the different treatment of the first patient shows approach is in a mess!

#6 Circular list

[E06CircularList.java](E06CircularList.java) finished and works (program output contained
in last git commit message).

#7 Queues (*)

[E07Queue.java](E07Queue.java) implemented using the shared class [ListUtilities.java](ListUtilities.java),
works fine - for program output set git commit message.

#8 Stacks (*)

[E08Stack.java](E08Stack.java) implemented using the shared class [ListUtilities.java](ListUtilities.java),
altered so pop and push from the right hand (aka "end") of the stack, as this is normal for instance
in perl and [Wikipedia Stack article](http://en.wikipedia.org/wiki/Stack_%28abstract_data_type%29)

#9 From array to list

Task *Create a static method that takes an array of integers and returns a linked list of integers in the same order as
the original array* . [E09ArrayToList.java](E09ArrayToList.java) used method **arrayToLinkedList** from
[ListUtilities.java](ListUtilities.java). Finished program output contained in last git commit.

#10 A sorted list

Task *Create a linked list of integers that is sorted on input* [E10SortedList.java](E10SortedList.java) 
using [ListUtilities.java](ListUtilities.java), works use a recursive method to insert in between
values in place *(found it important to use less than and equal to avoid infinite loop!).* 
Program output contained in last git commit message.

#11 Bubble sort (*)

*not attempted (yet)*

#12 Cocktail sort (*)

*not attempted (yet)*

#13 QuickSort (**)

*not attempted (yet)*

