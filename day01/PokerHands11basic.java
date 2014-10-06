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
public class PokerHands11basic {
	public static void main(String[] args) {
		// simply store the rank of the cards in strings 
                String ranka="", rankb="", rankc="", rankd="", ranke="";
                String suita="", suitb="", suitc="", suitd="", suite="";

                int nread=0; // number of cards read
                while (nread < 5) {
			nread++; // read next card
                        String suitread, rankread;
			while (true) { // infinite loop jump out on valid input
				System.out.print("Enter rank of number "+ nread +" card (1 or 2 or ... 10 or J or Q or K): ");
                		rankread = System.console().readLine();
 				if (rankread.equals("1")) break;
 				if (rankread.equals("2")) break;
 				if (rankread.equals("3")) break;
 				if (rankread.equals("4")) break;
 				if (rankread.equals("5")) break;
 				if (rankread.equals("6")) break;
 				if (rankread.equals("7")) break;
 				if (rankread.equals("8")) break;
 				if (rankread.equals("9")) break;
 				if (rankread.equals("10")) break;
 				if (rankread.equals("J")) break;
 				if (rankread.equals("Q")) break;
 				if (rankread.equals("K")) break;
                        	System.out.println("ERROR invalid input try again");
                	}
			while (true) { // infinite loop jump out on valid input
				System.out.print("Enter suite of number "+ nread +" card (\"spades\" or \"hearts\" or \"diamonds\" or \"clubs\" ");
                		suitread = System.console().readLine();
 				if (suitread.equals("spades")) break;
 				if (suitread.equals("hearts")) break;
 				if (suitread.equals("diamonds")) break;
 				if (suitread.equals("clubs")) break;
                        	System.out.println("ERROR invalid input try again");
                	}
                        if (nread==1) {
				ranka = rankread;
				suita = suitread;
                        }
			else if (nread==2) {
				rankb = rankread;
				suitb = suitread;
                        }
 		}
		System.out.print("cards read in and stored as ");
		System.out.print( ranka + suita + "    ");
		System.out.print( rankb + suitb + "    ");
		System.out.println("");
		
		
	}
}
