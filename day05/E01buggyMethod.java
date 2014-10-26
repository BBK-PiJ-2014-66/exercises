class E01buggyMethod{
	public static String buggyMethod(int n) {
		if (n <= 0) { // fix from n==0
			return "";
		}
		return n + " " + buggyMethod(n - 2);
	}

	public static void main(String[] args) {
		System.out.println("buggyMethod(0)= " + buggyMethod(0));
		System.out.println("buggyMethod(8)= " + buggyMethod(8));
		System.out.println("buggyMethod(9)= " + buggyMethod(9));
		System.out.println("buggyMethod(-100)= " + buggyMethod(-100));
	}
}
