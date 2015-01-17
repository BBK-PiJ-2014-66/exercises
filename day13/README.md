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


## 1.4 Implement initial version of LibraryImpl
* [Library](src/library/Library.java) modified to have getMaxBooksPerUser and setMaxBooksPerUser as per instructions
* [MockLibrary](src/library/MockLibrary.java) modified accordingly
* [LibraryImplTest](src/library/LibraryImplTest.java) written to test new features, initially using [MockLibrary](src/library/MockLibrary.java).
* [LibraryImpl](src/library/LibraryImpl.java) actually implements new features


## 1.5 Implementation of getID() as instructed
* Have done it
* [LibraryImpl](src/library/LibraryImpl.java) has implementation
* [LibraryImplTest](src/library/LibraryImplTest.java) added a test `testgetID`

Problem is that I do not understand how `Library` is meant to use the `User` class. I would
seem to be a much better idea to store a list of User objects but the `getID()` instructions
to use the name really discourage this. Also do not understand how call to `getID()` from  [UserImpl](src/library/UserImpl.java)
`register()` method can ever catch trying to the same name twice in the library.

 
# My take
Decided to make a new package [library2](src/library2) - my take on library
ask but altering things that do not make sense to me:
* In new [User](src/library2/User.java) get rid of `register()` and `getLibrary`. Implementation
  [UserImpl](src/library2/UserImpl.java) and test with [UserImplTest](src/library2/UserImplTest.java)
*  Implement `.register( User)` method in new [Library](src/library2/Library.java), implemented in
  [LibraryImpl](src/library2/LibraryImpl.java) and tested in [LibraryImplTest](src/library2/LibraryImplTest.java)


# addBook( String title, String author)
* Sensible added to  [Library](src/library2/Library.java) and [LibraryImpl](src/library2/LibraryImpl.java).    
* To test implemented `getBookCount()` early test in [LibraryImplTest](src/library2/LibraryImplTest.java).


# Borrowing a Book 1.6 2nd part
* Instructed to write method `takeBook( String Title)` but need to record who has borrowed
  book. Also need to check whether a user already has the limit of books out 
* So implement a borrowBook( Title, User user). This will check for any book with Title
  in the library and find any that have not already been borrowed. Method returns an enum
  [BorrowResult](src/library2/BorrowResult.java) because there are many potential problems
  in a borrow!
* As part of this record the `User borrower` in new [BookImpl](src/library2/BookImpl.java),
  with methods `setBorrower` and `getBorrower` defined in the new interface  [Book](src/library2/Book.java)
  and tested in  [BookImplTest](src/library2/BookImplTest.java)
* Borrowing finished [LibraryImpl](src/library2/LibraryImpl.java) and  [LibraryImplTest](src/library2/LibraryImplTest.java)
  including recording that User has borrowed a book so not yet checking that user has not exceeeded number of books borrowed.
  

# Returning a Book
* To implement the functionality in  [Library](src/library2/Library.java) need some methods in [User](src/library2/User.java) so:
  * added methods `recordBookReturned` and `getLastBookBorrowed()` to [User](src/library2/User.java) and
  [UserImpl](src/library2/UserImpl.java) with tests in  [UserImplTest](src/library2/UserImplTest.java)
* Add method `returnBook( Book book)` to [Library](src/library2/Library.java), test in [LibraryImplTest](src/library2/LibraryImplTest.java) and
  implement in [LibraryImpl](src/library2/LibraryImpl.java).

# 1.7 methods getReaderCount() and getBookBorrowedCount()
* added to [Library](src/library2/Library.java), tested in   [UserImplTest](src/library2/UserImplTest.java) tests
`testGetReaderCount` and `testGetBookBorrowedCount`. Methods implemented in [LibraryImpl](src/library2/LibraryImpl.java)
to pass tests.

## 1.8 User method for array of the titles of all books borrowed.
* Already done because it was needed for proper testing. Method is
`String[] getTitlesBooksBorrowed()` in [User](src/library2/User.java)

# 1.9 Add methods to Library
* TTD for [Library](src/library2/Library.java), [LibraryImpl](src/library2/LibraryImpl.java)
with  [LibraryImplTest](src/library2/LibraryImplTest.java). As required implemented:
* `arrayUsersBorrowingBooks()`  returns an array User for the users who are borrowing a book
* `arrayAllUsers()` returns an array of User for all users
* `namePersonBorrowingTitle(String)`
