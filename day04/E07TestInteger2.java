/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 26 Sept 2014
 *  
 * Day 4 Exercise 7 Integer
 *
 * task set:
 * 	Create your own version of boxed int! Create a class Integer2 
 *	(see Integer2.java)
 * 
 * test code given:
	Integer2 i2 = new Integer2();
	print "Enter a number: ";
	String str = System.console().readLine();
	int i = Integer.parseInt(str);
	i2.setValue(i);
	print "The number you entered is "
	if (i2.isEven()) {
		println "even.";
	} else if (i2.isOdd()) {
		println "odd.";
	} else {
		println "undefined!! Your code is buggy!";
	}
	int parsedInt = Integer.parseInt(i2.toString());
	if (parsedInt == i2.getValue()) {
		println("Your toString() method seems to work fine.");
	}
 *
 * Initial thoughts
 *
 *	test code given is interactive (not my favourite).
 *	to translate javadecaf to java should be easy.
 *	prettyPrint method not tested
 */
class E07TestInteger2 {
	public static void main( String[] args) {
		Integer2 i2 = new Integer2();
		System.out.print("Enter a number: ");
		String str = System.console().readLine();
		int i = Integer.parseInt(str);
		i2.setValue(i);		
		System.out.print("Test of prettyPrint method with i2.prettyPrint() produces \"");
		i2.prettyPrint();
		System.out.println("\"");
		        System.out.print("The number you entered is ");
        	if (i2.isEven()) {
                	System.out.println("even.");
        	} else if (i2.isOdd()) {
                	System.out.println("odd.");
        	} else {
                	System.out.println("undefined!! Your code is buggy!");
        	}
		System.out.println("Test the toString method by direct invocation with \" + i2 \" produces \"" + i2 + "\"");
		
		int parsedInt = Integer.parseInt(i2.toString());
		if (parsedInt == i2.getValue()) {
			System.out.println("Your toString() method seems to work fine.");
		}

	}
}
