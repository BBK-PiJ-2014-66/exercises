/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 13 Rectangle
 * task set:
 *    Write a program that reads the X and Y coordinates of two 
 *    points and then outputs the area of a rectangle where
 *    both points are opposite corners. Use the following 
 *    class to store the data for the points:
 *	class Rectangle {
 *          Point upLeft;
 *          Point downRight;
 *	}
 *    Your program should calculate (and write on the screen) 
 *    the perimeter and area of the rectangle.
 *
 * Initial ideas:
 * (a) use the class Point from E12.
 * (b) because the class definition specifies the Point's in Rectangle 
 *     are "upLeft" and "downRight" will have to order input data.
 *     So have storeX1Y1X2Y2 method that takes 4 doubles (we do not know
 *     about constructors yet)
 * (c) Implement the perimeter and area as class methods (probably
 *     not meant to but it is crazy not to?)
 * (d) take the input and -test stuff from my E12 solution.
 *
 *  @author Oliver S. Smart
 */
