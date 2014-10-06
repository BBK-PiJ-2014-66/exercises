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

import java.util.Arrays;

public class PokerHands11 {
	public static int promptForCard(String nth) {
                int rank = 0;
                while (rank==0) {
			System.out.print("Enter rank of the " + nth + " card: ");
			String istr = System.console().readLine();
                        istr = istr.toUpperCase(); // uppercase
                        if (istr.charAt(0)=='A') { // Ace
				rank = 1;
			}
			else if (istr.charAt(0) == 'J') { // Jack
				rank = 11;
			}
			else if (istr.charAt(0) == 'Q') { // Queen
				rank = 12;
			}
			else if (istr.charAt(0) == 'K') { // King 
				rank = 13;
			}
                        else { // Should have supplied an integer
			       // but need to handle exception. Method from
                               // http://stackoverflow.com/questions/6456219/java-checking-if-parseint-throws-exception
				try{
					rank = Integer.parseInt(istr);
				}catch(NumberFormatException e){
                                        rank = 0;
				}
                                if ( (rank > 13) || (rank < 1)) // make sure rank is legal
                                	rank = 0; // reset if not
                        }
                        if (rank!=0) break;
			System.out.println("Error cannot understand that input!");
			System.out.println("You must Enter 1 or 2 or 3 or ... or 10 or J or Q or K or A");
			System.out.println("Try again");
 		}
                int suit = 0;
                while (true) {
			System.out.print("Enter suit of the " + nth + " card: ");
			String istr = System.console().readLine();
                        istr = istr.toUpperCase(); // uppercase
                        if (istr.charAt(0)=='S') { // Spades
				suit = 1;
			}
			else if (istr.charAt(0) == 'H') { // hearts
				suit = 2;
			}
			else if (istr.charAt(0) == 'D') { // Diamonds
				suit = 3;
			}
			else if (istr.charAt(0) == 'C') { // clubss
				suit = 4;
			}
                        if (suit!=0) break;
			System.out.println("Error cannot understand that input!");
			System.out.println("Enter S for spades or H for hearts or D for diamonds or C for clubs");
			System.out.println("Try again");
                }
               
                return (10*rank+suit); // for encoding see initial comment
	}
	public static String cardIntToString(int thiscard) { // converts an integer card to a string
                int rank = thiscard/10;
                int suit = thiscard%10;
                String sout;
                if ((rank<1) || (rank>13)) {
                    	return "Error "+ thiscard+ " has illegal rank!";
                }
                else if (rank==1) { 
                	sout = "Ace";
                }
                else if (rank == 11) {
                	sout = "Jack";
                }
                else if (rank == 12) {
                	sout = "Queen";
                }
                else if (rank == 13) {
                	sout = "King";
                }
                else {
                        sout = "" + rank;
                } 
		sout += " of ";

                if ((suit<1) || (suit>14)) {
                    	return "Error "+ thiscard+ " has illegal suit!";
                }
                else if (suit==1) {
			sout += "Spades";
                }
                else if (suit==2) {
			sout += "Hearts";
                }
                else if (suit==3) {
			sout += "Diamonds";
                }
                else if (suit==4) {
			sout += "Clubs";
                }


                return sout;
        }
	public static String printHand(int[] cards, int numcards) {
                String sout="";
                for ( int ic=0; ic< numcards; ic++) {
			sout += "    " + cardIntToString(cards[ic]);
		}
                return sout;
        }
	public static int illegalHand(int[] cards, int numcards) { 
		// cards already sorted 
                for (int ic=0; ic<numcards-1; ic++) {
 			if (cards[ic]==cards[ic+1]) return cards[ic];
                }
                return 0; // no card occurs twice
        }
        
	public static double scoreHand(int[] cards, int numcards) { // Scores a cards of 5 cards
		double score=10;

                System.out.println("Call to ScoreHand with hand:" + printHand( cards, numcards));

		// much easier to score sorted cards.
		// should I write my own sort?? 
		Arrays.sort(cards);
                System.out.println("         hand after sorting:" + printHand( cards, numcards));
                

                // score in this function for now

                // important to prevent illegal hand two cards the same
                int illegal = illegalHand( cards, numcards);
                if (illegal != 0) {
                        System.out.println(" illegal hand. Card " +  cardIntToString(illegal) + " occurs more than once");
			return -1.0;
                }
                // four of a kind means that middle 3 cards have to have same rank


                System.out.println("Scoring to be written");
                

		return score;
        }

	public static void main(String[] args) {
                // want five cards - store as array
                int numcards=5;
                int[] cards = new int[numcards];
                cards[0] = promptForCard("1st");
		cards[1] = promptForCard("2nd");
                cards[2] = promptForCard("3rd");
                cards[3] = promptForCard("4th");
                cards[4] = promptForCard("5th");
                double score= scoreHand(cards, numcards);
		System.out.println("Hand produces scored as " +  score + "");
                
	}
}
