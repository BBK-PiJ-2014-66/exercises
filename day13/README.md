# Exercises, day 13

## The exercise sheet [exercises_d13.pdf](exercises_d13.pdf) 

# 1 Practicing TDD:

The library exercise: Do everything in a `library` Package.

## 1.1 Create a class for books
* The interface [Book](src/library/Book.java)
* JUnit test for an implementation of `Book` interface [BookImplTest](src/library/BookImplTest.java) written
  before the implementation
* The implementation [BookImpl](src/library/BookImpl.java) written and passes tests.


## 1.2 Create a class for the users of the library.
* The interface [User](src/library/User.java)
* JUnit test for an implementation of `User` interface [UserImplTest.java](src/library/UserImplTest.java) written
  before the implementation
* The implementation [UserImpl](src/library/UserImpl.java) written and passes test.

## 1.3 Expand the User class to allow users to register with a library.
* Interface [User](src/library/User.java) updated with two new methods
  two methods `register(Library)` and `getLibrary()`
* Junit test [UserImplTest](src/library/UserImplTest.java) extended to test the methods using...
* Mock Library class [MockLibrary](src/library/MockLibrary.java) that implements [Library](src/library/Library.java)
  inteface.
* The implementation [UserImpl](src/library/UserImpl.java) extended and passes test.



