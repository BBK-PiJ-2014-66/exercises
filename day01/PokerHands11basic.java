// Oliver Smart Birbeck MSc Computer Science PiJ coursework From September 2014
// 
// Week 1 Exercise 11 Poker hands (harder) task:
// Read five cards from the user. For each card, read the rank (1,2,3,4,5,6,7,8,9,
// 10,J,Q,K) and the suit ("spades", "hearts", "diamonds", "clubs"). Each of the
// five cards must be valid before accepting the next one. Once the program has
// the five cards, it should tell the user what is the best hand she has got, as per
// the following list (from best to worst):
// Straigh flush: all cards are of the same suite and their ranks are consecutive.
// Note that they are probably not ordered as they were entered.
// Poker:
// four of the five cards have the same rank.
// Full House: three of a kind plus two of a kind.
// Flush:
// all cards share the same suit, but are not consecutive.
// Straight:
// all cards are consecutive, but not of the same suit.
// Three of a kind:
// Two pairs:
// three of the five cards have the same rank.
// two pairs (see below).
// Pair: two of the five cards have the same rank.
// Nothing: any other situation.
// If you ever launch an online poker business, this could be one (very small)
// piece of it.
//
// 2nd attempt no arrays, no methods, no sort
//
// observation normally 1 is A (ace) and can act either high or low in flushes:
//
// we will represent card as an integer value
// first one or two digits are the rank 1 for Ace
//                                      2 for two
//                                    .....
//                                     10 for ten
//                                     11 for Jack
//                                     12 for queen
//                                     13 for king
// final digit encodes the suit: 1 means spades
//                               2 means hearts
//				 3 means diamonds
//				 4 means clubs
//
// So 14 means ace of clubs, 91 means nine of spades, 123 means queen of diamonds.
// idea is that use integer divide by 10 to extract the rank, and modulu by 10 to get the suit
// can also use integer rather than string comparison easier to code
public class PokerHands11basic {
	public static void main(String[] args) {
		// store the cards as 5 seperate integers (arrays not allowed)
                int carda=0, cardb=0, cardc=0, cardd=0, carde=0;

                int nread=0; // number of cards read
                while (nread < 5) {
			nread++; // read next card
                        int irank=0, isuit=0;
			while (true) { // infinite loop jump out on valid input
				System.out.print("Enter rank of number "+ nread +" card (1 or 2 or ... 10 or J or Q or K): ");
                		String strrank = System.console().readLine();
 				if (strrank.equals("1")) irank = 1;
 				if (strrank.equals("2")) irank = 2;
 				if (strrank.equals("3")) irank = 3;
 				if (strrank.equals("4")) irank = 4;
 				if (strrank.equals("5")) irank = 5;
 				if (strrank.equals("6")) irank = 6;
 				if (strrank.equals("7")) irank = 7;
 				if (strrank.equals("8")) irank = 8;
 				if (strrank.equals("9")) irank = 9;
 				if (strrank.equals("10")) irank = 10;
 				if (strrank.equals("J")) irank = 11;
 				if (strrank.equals("Q")) irank = 12;
 				if (strrank.equals("K")) irank = 13;
                                if (irank != 0) break;
                        	System.out.println("ERROR invalid input try again");
                	}
			while (true) { // infinite loop jump out on valid input
				System.out.print("Enter suite of number "+ nread +" card (\"spades\" or \"hearts\" or \"diamonds\" or \"clubs\": ");
                		String strsuit = System.console().readLine();
 				if (strsuit.equals("spades")) isuit = 1;
 				if (strsuit.equals("hearts")) isuit = 2;
 				if (strsuit.equals("diamonds")) isuit = 3;
 				if (strsuit.equals("clubs"))  isuit = 4;
                                if (isuit !=0) break; 
                        	System.out.println("ERROR invalid input try again");
                	}
                        if (nread==1) {
				carda = 10*irank + isuit;
                        }
			else if (nread==2) {
				cardb = 10*irank + isuit;
                                if (cardb == carda) {
                        		System.out.println("ERROR same card input twice. Try again");
					nread--;
                                }
                        }
			else if (nread==3) {
				cardc = 10*irank + isuit;
                                if ( (cardc == carda) || (cardc == carda)) {
                        		System.out.println("ERROR same card input twice. Try again");
					nread--;
                                }
                        }
                        else if (nread==4) {
                                cardd = 10*irank + isuit;
                                if ( (cardd == carda) || (cardd == carda) ||  (cardd == cardc)) {
                                        System.out.println("ERROR same card input twice. Try again");
                                        nread--;
                                }
                        }
                        else if (nread==5) {
                                carde = 10*irank + isuit;
                                if ( (carde == carda) || (carde == carda) ||  (carde == cardc) || (carde == cardd)) {
                                        System.out.println("ERROR same card input twice. Try again");
                                        nread--;
                                }
                        }

 		}
		System.out.println("debug cards read in and stored as " + carda + " " + cardb + " " + cardc + " " + cardd + " " + carde);

		// now have valid input

                // lets sort the cards as it makes life easier 
		while (true) {
			int iswap;
			boolean lswaped = false;
                        if (cardb < carda) {
				lswaped = true;
				iswap = carda;
				carda = cardb;
				cardb = iswap;
                        }
	                if (cardc < cardb) {
				lswaped = true;
				iswap = cardb;
				cardb = cardc;
				cardc = iswap;
                        }
                        if (cardd < cardc) {
                                lswaped = true;
                                iswap = cardc;
                                cardc = cardd;
                                cardd = iswap;
                        }
                        if (carde < cardd) {
                                lswaped = true;
                                iswap = cardd;
                                cardd = carde;
                                carde = iswap;
                        }
			if (!lswaped) break; // cards in order
		}
                System.out.println("debug after sorting cards=        " + carda + " " + cardb + " " + cardc + " " + cardd + " " + carde);


                // test whether they are all the same suit, N.B. get suit by remainer of 10
		boolean lsamesuit = true;
		if ( (carda%10) != (cardb%10) ) lsamesuit = false;
		if ( (carda%10) != (cardc%10) ) lsamesuit = false;
		if ( (carda%10) != (cardd%10) ) lsamesuit = false;
		if ( (carda%10) != (carde%10) ) lsamesuit = false;
                System.out.println("debug lsamesuit=        " + lsamesuit);

                // test whether they are consequetive
                // n.b. get rank by integer divide by 10
                boolean  lconsec = true;
                if ( (carda/10)+1 != (cardb/10) ) lconsec = false;
                if ( (cardb/10)+1 != (cardc/10) ) lconsec = false;
                if ( (cardc/10)+1 != (cardd/10) ) lconsec = false;
                if ( (cardd/10)+1 != (carde/10) ) lconsec = false;
                System.out.println("debug lconsec=        " + lconsec);
		
		
	}
}
