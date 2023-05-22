class D2 {
	void m1() {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %2d\n", i, i * 2);
		}
	}

	void m2() {
		for	(int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//new D2().m1();
		new D2().m2();
	}
}
