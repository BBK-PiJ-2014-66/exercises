class E01McCarthy91 {
	public static int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
	      	} else {
     			return mcCarthy91(mcCarthy91(n+11));
      		}
	}
	public static void main(String[] args) {
		System.out.println("mcCarthy91(95) = " + mcCarthy91(95));
		System.out.println("mcCarthy91(50) = " + mcCarthy91(50));
		System.out.println("mcCarthy91(73) = " + mcCarthy91(73));
	}
}
