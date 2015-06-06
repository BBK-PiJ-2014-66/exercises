import java.util.Scanner;
public class DemoScanner {
	public static void main(String... args) {
		try (Scanner keyboard = new Scanner(System.in)) { // try-with-resources
			while (true)  {
				System.out.print("Enter text (or \"q\" to exit): ");
				String inStr = keyboard.nextLine();
				if (inStr.equals("q")) break;
				System.out.println("read in '" + inStr + "'");
			} 
		}
	}

}
