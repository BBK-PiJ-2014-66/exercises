class E01printNumbers {
	public static void printNumbers(int n) {
		if (n <= 0) {
			return;
		}
		System.out.print(n + " ");
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.print(n + " ");
	}
	public static void main(String[] args) {
		printNumbers(6);
		System.out.println();
	}
}
