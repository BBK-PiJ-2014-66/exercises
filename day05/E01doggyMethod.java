class E01doggyMethod{
	public static String doggyMethod(int n) {
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if (n <= 0) {
			return "";
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("doggyMethod(0)= " + doggyMethod(0));
	}
}
