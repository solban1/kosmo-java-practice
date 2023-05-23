class A4  {
	private static final int MAX = 1000000000;

	private static void m() {
		long sum1 = 0;
		long startTime1 = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			sum1 += i;
		}
		System.out.println(System.nanoTime() - startTime1);

		long sum2 = 0;
		long startTime2 = System.nanoTime();
		for (int i = MAX; i > 0; i--) {
			sum2 += i;
		}
		System.out.println(System.nanoTime() - startTime2);
		
		long sum3 = 0;
		long startTime3 = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			sum3 += i;
		}
		System.out.println(System.nanoTime() - startTime3);

		long sum4 = 0;
		long startTime4 = System.nanoTime();
		for (int i = MAX; i > 0; i--) {
			sum4 += i;
		}
		System.out.println(System.nanoTime() - startTime4);
	}

	public static void main(String[] args) {
		m();
	}
}
