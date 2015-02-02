# Exercises, day 11

## The exercise sheet [exercises_d11.pdf](exercises_d11.pdf) 

# 1 Don’t Repeat Yourself

Completed: [Comparator.java](src/comparator/Comparator.java) with a JUnit test 
[ComparatorTest.java](src/comparator/ComparatorTest.java) that works.

# 2 Upcasting, downcasting

## 2.1 Start

* Create a script that  builds a new `SmartPhone` as a `SmartPhone` object and tests all of its methods.  [SmartPhoneScript.java](src/[SmartPhoneScript.java).


## 2.2 Direct upcasting

*Change the script so that the SmartPhone is created with the line:*

````
Mobilephone myPhone = new Smartphone();

````

  * After change, script will not compile with error message:

````
$ javac SmartPhoneScript.java 
SmartPhoneScript.java:21: cannot find symbol
symbol  : method browseWeb(java.lang.String)
location: class MobilePhone
		myPhone.browseWeb("http://www.dcs.bbk.ac.uk");
		       ^
SmartPhoneScript.java:22: playGame(java.lang.String) has private access in MobilePhone
		myPhone.playGame("snakes.class");
		       ^
SmartPhoneScript.java:26: cannot find symbol
symbol  : method findPosition()
location: class MobilePhone
		GPS3coords where = myPhone.findPosition();
		                          ^
3 errors
````

  * problems happen because can no longer use methods in SmartPhone that are not in MobilePhone.
  * Solutions:
    * Alter creation line back to SmartPhone.
    * remove tests of SmartPhone methods
    * For SmartPhone-specific methods downcast the object to SmartPhone. 
  * do the first because we downcast in 2.4

## 2.3 Indirect upcasting when calling a method.

Pass this object to a method testPhone(Phone) that has only one parameter of type Phone. What methods can you call on the object inside the method?

Alter [SmartPhoneScript.java](src/SmartPhoneScript.java) can only test the call method as this is the only method in `Phone` interface.

## 2.4 Downcasting

*Inside the former method, downcast the object to Smartphone so that you can use all the public methods of
Smartphone.* Alter [SmartPhoneScript.java](src/SmartPhoneScript.java) downcast easy but dangerous...


## 2.5 Casting exception

*Create a MobilePhone object and then pass it to method testPhone(Phone). What happens?*

* runs but get exception:

````
Exception in thread "main" java.lang.ClassCastException: MobilePhone cannot be cast to SmartPhone
	at SmartPhoneScript.testPhone(SmartPhoneScript.java:57)
	at SmartPhoneScript.main(SmartPhoneScript.java:25)
````

casting is dangerous. Lets modify code to catch the error:  [SmartPhoneScript.java](src/SmartPhoneScript.java).

# 3 Generic list
*Modify the doubly-linked list that you have created in past weeks to make it generic, i.e. to allow it to have values
of its elements of any type.* The doubly-linked list was done in week 7 but [E05DoublyLinkedLists.java](../day07/E05DoublyLinkedLists.java)
is very wrapped up with patient stuff. So instead work from coursework3 in particular `LinkedList.java` 
