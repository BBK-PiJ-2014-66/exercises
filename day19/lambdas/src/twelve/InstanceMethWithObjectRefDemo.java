package twelve;

public class InstanceMethWithObjectRefDemo {

	static <T> int counter(T[] vals, MyFunct<T> f, T v) {
		int count = 0;
		for (T itT : vals) { // use new form of fior
			if (f.funct(itT, v))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// Create array of HighTemp objects
		HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82),
				new HighTemp(90), new HighTemp(89), new HighTemp(89),
				new HighTemp(91), new HighTemp(84), new HighTemp(83) };
		
		int count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		System.out.println("Number of days with a high of 89 is " + count);
		
		count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(90));
		System.out.println("Number of days with a high less than 90 is " + count);
	}

}
