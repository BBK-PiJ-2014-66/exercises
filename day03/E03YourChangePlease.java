/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 3 Your change, please
 * task set:
 *   Write a program that reads the total cost of a purchase and an amount of
 *   money that is paid to buy it. Your program should output the correct 
 *   change specifying the amount of notes (50, 20, 10, 5) and 
 *   coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed.
 *
 *  @author Oliver S. Smart
 *
 * Thoughts
 *
 * try to give as 50 pounds notes as possible 
 *          then as many 20's, 10's etc.
 * arrays would be useful but they are verbotten
 * try to use for loop as it the pount of the we
 *
 * meant not to use methods, will not catch exceptions for instance 
 * entering non-number at number prompt
 *
 */
class E03YourChangePlease {
        public static void main(String[] args) {
		System.out.print("Please enter cost of purchase: ");	
		double costPounds = Double.parseDouble(System.console().readLine());
		System.out.print("Please enter amount paid: ");	
		double paidPounds = Double.parseDouble(System.console().readLine());
		double changePounds=paidPounds-costPounds;
		// decide to make life easier by internally using integer number of pennies
		// print with leading zero http://stackoverflow.com/questions/275711/add-leading-zeroes-to-number-in-java
		if (changePounds<0) {
			System.out.println("You have not paid enough please pay £" + -changePounds+ " more");
		}
		else {
			int costPennies = (int)(100.*costPounds);
			int paidPennies = (int)(100.*paidPounds);
			int changePennies =paidPennies-costPennies;

			System.out.println("Your change is £" + changePennies/100 + "." + String.format("%02d", Math.abs(changePennies%100)));
			System.out.println("Your change is: ");
			int noteOrCoinPennies=0;
			String noteOrCoinName="";
			for (int cc=0; cc<12; cc++) { // there are eleven currency types
				if (cc==0) {	
					noteOrCoinName = "fifty pound notes";
					noteOrCoinPennies = 5000; 
				}
				else if (cc==1) {
					noteOrCoinName = "twenty pound notes";
					noteOrCoinPennies = 2000; 
				}
				else if (cc==2) {
					noteOrCoinName = "ten pound notes";
					noteOrCoinPennies = 1000; 
				}
				else if (cc==3) {
					noteOrCoinName = "five pound notes";
					noteOrCoinPennies = 500; 
				}
				else if (cc==4) {
					noteOrCoinName = "two pound coin";
					noteOrCoinPennies = 200; 
				}
				else if (cc==5) {
					noteOrCoinName = "one pound coin";
					noteOrCoinPennies = 100; 
				}
				else if (cc==6) {
					noteOrCoinName = "fifty pence coin";
					noteOrCoinPennies = 50; 
				}
				else if (cc==7) {
					noteOrCoinName = "twenty pence coin";
					noteOrCoinPennies = 20; 
				}
				else if (cc==8) {
					noteOrCoinName = "ten pence coin";
					noteOrCoinPennies = 10; 
				}
				else if (cc==9) {
					noteOrCoinName = "five pence coin";
					noteOrCoinPennies = 5; 
				}
				else if (cc==10) {
					noteOrCoinName = "two pence coin";
					noteOrCoinPennies = 2; 
				}
				else {
					noteOrCoinName = "one pence coin";
					noteOrCoinPennies = 1; 
				}
				int noteOrCoinNum=changePennies/noteOrCoinPennies;
				if (noteOrCoinNum !=0) {
					changePennies -= noteOrCoinPennies*noteOrCoinNum;
					System.out.println( "\t" + noteOrCoinNum + " * " + noteOrCoinName);
				}
			}
			//System.out.println("debug final pennies " + changePennies);
		}

	}
}
