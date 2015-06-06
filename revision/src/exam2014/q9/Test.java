package exam2014.q9;

public class Test {
	public static void main(String... Args) {
		MultiSet test = new MultiSetMap();
		System.out.println("New Multiset map has size() " + test.size());
		test.add("hello");
		test.add("zoo");
		test.add("word");
		test.add("hello");
		System.out.println("Add elements to map: " + test);
		System.out.println("map has size() " + test.size());
		System.out.println("map.contains(\"zoo\") is " + test.contains("zoo"));
		System.out.println("map.contains(\"zebra\") is "
				+ test.contains("zebra"));
		test.remove("hello");
		System.out.println("remove a 'hello' map now: " + test);
		test.remove("hello");
		System.out.println("remove a 'hello' map now: " + test);
	}
}
