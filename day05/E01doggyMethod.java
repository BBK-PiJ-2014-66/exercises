class E01doggyMethod{
	public static String doggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		return result;
	}
	public static void main(String[] args) {
		for (int i=0; i<11; i++)
			System.out.println("doggyMethod(" + i + ")= " + doggyMethod(i));
	}
}
