/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 17 Nov 2014
 *  
 * Day 8 Exercise 1 Supermarket queue.
 *
 * Simple person (without any pointers).
 */
public class Person{
	private String name;
	private int age;
	Person() {
		name = "";
		age = -1; // invalid age (the "empty person")
	}
	Person( String inName, int inAge) {
		name = inName;
		age = inAge; 
	}
	public String name() {
		return name;
	}
	public int age() {
		return age;
	}
        @Override
        public String toString() {
                return name + " is " + age + " years old";
        }

}
