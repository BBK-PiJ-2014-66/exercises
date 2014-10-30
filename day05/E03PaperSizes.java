/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 27 Sept 2014
 *  
 * Day 5 Exercise 3 Paper sizes (*)
 *
 * task set:
 * 
 *	A Din-A0 sheet of paper is 841mm × 1189mm (its surface is one
 *	square meter). Successive measurements of paper are defined
 *	recursively as "half" or "double" the preceding size. Therefore,
 *	a Din-A1 sheet of paper is half of Din-A0, or 594mm × 841mm;
 *	while a Din-A00 is double of Din-A0, or 1189mm× 1682mm.  Create
 *	a method that takes a String parameter representing a size (e.g.
 *	"A4", "A00000") and prints on screen the size of the
 *	corresponding sheet of paper. For simplicity, you can ignore
 *	rounding errors when calculating smaller sizes.
 *	
 *	Hint: note that two consecutive sizes always share one side and
 *	only the other one is multiplied or divided by two, e.g. the
 *	short side of Din-A2 is as long as the long side of Din-A3,
 *	while the long side of Din-A2 is twice as long as the short side
 *	of Din-A3.
 *
 * Initial thoughts
 *
 */
class PaperDinA {
	private int mmSizeSmall;
	private int mmSizeLarge;
	/*    intSize 	PaperSize
		-2	   A000
		-1	   A00
		 0   	   A0 
		 1	   A1
		 4 	   A4 */
	private int intSize; 
	private static int mmSizeSmallA0 = 841;
	private static int mmSizeLargeA0 = 1189;
	public PaperDinA() { // default constructor to A0
		mmSizeSmall = mmSizeSmallA0;
		mmSizeLarge = mmSizeLargeA0;
		intSize = 0;
	}
	public PaperDinA( int userSize) { // construct given the size
		// this is really ugly? Can it be done better?
		PaperDinA temp = ASize(userSize);
		mmSizeSmall = temp.mmSizeSmall;
		mmSizeLarge = temp.mmSizeLarge;
		intSize = userSize;
	}
        public PaperDinA( String UserString) {
		this(UserStringToIntSize(UserString));
	}
	@Override
    	public String toString() {
        	return "" + mmSizeSmall + " mm x " + mmSizeLarge + " mm";
   	}
	public PaperDinA halfSize() { 
		// returns a new PaperDinA half the size of the original
		PaperDinA returnPaperDinA = new PaperDinA();
		returnPaperDinA.intSize = intSize - 1;
		returnPaperDinA.mmSizeLarge = mmSizeSmall;
		returnPaperDinA.mmSizeSmall = mmSizeLarge/2;
		return returnPaperDinA;
	}
	public PaperDinA doubleSize() {
		PaperDinA returnPaperDinA = new PaperDinA();
		returnPaperDinA.intSize = intSize + 1;
		returnPaperDinA.mmSizeLarge = mmSizeSmall*2;
		returnPaperDinA.mmSizeSmall = mmSizeLarge;
		return returnPaperDinA;
	}
	public String name() { // returns "A4" or "AOOO"
		String name="A"; 
		if (intSize>0) {
			name += intSize;
		} else {
			name += "0";
			// for sizes bigger than A0 go A00, A000 etc.
			for (int cc=0; cc< -intSize; cc++) 
				name += "0";
		}
		return name;
	}
	public static PaperDinA ASize( int userSize) { 
		// method returns a PaperDinA object of size userSize
		if (userSize == 0) {
			PaperDinA returnPaperDinA = new PaperDinA();
			return returnPaperDinA; // A0
		} else if (userSize>0) {
			return ASize(userSize-1).halfSize();
		} else {
			return ASize(userSize+1).doubleSize();
		}
	}
	public static int UserStringToIntSize( String UserString) {
		int result=0;
		if (!UserString.matches("^A[0-9]*$")) { // regular expression for a A followed by a digit 
			// throw an exception
			throw new IllegalArgumentException("String \"" + UserString + "\" not a valid DinA"+
				" must have A followed by one or more digits");
		} else {
			result = Integer.parseInt(UserString.substring(1));
		}
		if (result==0) { // how many zero's? find from length. A0 will be of length 2, 
			result = 2-UserString.length();
		}
		return result;
	}
	public static void printSizeToScreen( String UserString) { // required by the spec
                // will throw an exception if invalid UserString provided
		System.out.println("" + new PaperDinA(UserString));
	}

}
class E03PaperSizes{
	public static void main(String[] args) {
                if (args.length==1 && args[0].equals("-table")) {
			// write out a table
			for (int ic = -5; ic <11; ic++) {
				PaperDinA myPaper =new PaperDinA(ic);
				System.out.println( myPaper.name() + "\t" + myPaper);
			}
                } else if (args.length == 1) {
			PaperDinA.printSizeToScreen(args[0]);
		} else {
			System.out.println( "usage specify a paper size like \"A5\" and the size will be printed");
			System.out.println( "      or specify -table for a table of paper sizes");
		}
		

	}
}
