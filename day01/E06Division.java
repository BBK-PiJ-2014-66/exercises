/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Week 1 Exercise 6 Division
 * Write a program that requests two numbers from the user and then outputs the
 * quotient and the remainder, e.g. if the user enters 7 and 3, your program should
 * output something like “7 divided by 3 is 2, remainder 1”. You cannot use the
 * “/” or “%” operators.
 * 
 *  @author Oliver S. Smart
 */

public class E06Division {
	public static void main(String[] args) {
                // lets be good no methods do all in main
                System.out.print("Please enter the 1st integer number: ");
                int numa =  Integer.parseInt(System.console().readLine());
                System.out.print("Please enter the 2nd integer number: ");
                int numb =  Integer.parseInt(System.console().readLine());

                boolean lSignsDiffer=false; // set true if numa and numb have difference signs
                if (numa < 0) lSignsDiffer = (!lSignsDiffer);
                if (numb < 0) lSignsDiffer = (!lSignsDiffer);
             

                // method is to start at numa and subtract numb repeatedly until the
                // the working number is less than numb.
                int workingNum = (numa<0) ? -numa : numa;
                int absnumb = (numb < 0) ? -numb : numb; // absolute value
                int numberOfSubtracts=0;
                while( workingNum > absnumb) {
			workingNum -= absnumb;
			numberOfSubtracts++;
		}
                if (lSignsDiffer) 
			numberOfSubtracts = -numberOfSubtracts;
		if (numa<0)
                        workingNum = -workingNum;
		System.out.println(numa + " divided by " + numb + " is " + 
                                   numberOfSubtracts + ", remainder " + workingNum);

		System.out.println("debug to check numa/numb= " + numa/numb + " numa%numb= " + numa%numb);
	}
}
