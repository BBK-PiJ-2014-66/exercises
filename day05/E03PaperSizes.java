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
	@Override
    	public String toString() {
        	return "" + mmSizeSmall + " mm x " + mmSizeLarge + " mm";
   	}
	public PaperDinA halfSize() {
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
}
class E03PaperSizes{
	public static void main(String[] args) {
		PaperDinA A0 = new PaperDinA();
		System.out.println("test A0 = " + A0);
		PaperDinA A1 =  A0.halfSize();
		System.out.println("test A1 = A0.halfSize() =   " + A1);
		PaperDinA A00 =  A0.doubleSize();
		System.out.println("test A00 = A0.doubleSize() =   " + A00);
	}
}
