package basics;

/**
 * demonstrate use of default method
 * 
 * @author PiJ sheet "Interfaces revisited (Java 8)" page 3
 *
 */
public class DefaultMethodDemo {

	public static void main(String[] args) {
		// static method in interface
		int istatic = MyIF.getDefaultNumber();
		System.out.println("istatic = " + istatic);
		
		MyIF obj = new MyIFImpl();

		// Can call getNumber(), because it is explicitly
		// implemented by MyIFimpl:
		System.out.println(obj.getNumber());

		// Can also call default getString;
		System.out.println(obj.getString());

		obj = new MyIFImplTwo();
		System.out.println("MyIFImplTwo " + obj.getNumber() + " '"
				+ obj.getString() + "'");

	}
}
