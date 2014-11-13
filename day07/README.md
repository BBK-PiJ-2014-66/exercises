**Table of Contents**  *generated with [DocToc](http://doctoc.herokuapp.com/)*


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


#8 Stacks (*)
[E08Stack.java](E08Stack.java) implemented using the shared class [ListUtilities.java](ListUtilities.java),
altered so pop and push from the right hand (aka "end") of the stack, as this is normal for instance
in perl and http://en.wikipedia.org/wiki/Stack_%28abstract_data_type%29 
