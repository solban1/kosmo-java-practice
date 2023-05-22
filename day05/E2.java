class E2 {
	void m1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	void m2() {
		int sum0 = 0, sum1 = 0, sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			switch (i % 3) {
				case 0:
					sum0 += i;
					break;
				case 1:
					sum1 += i;
					break;
				case 2:
					sum2 += i;
					break;
			}
		}

		System.out.printf("0: %d, 1: %d, 2: %d, total: %d\n", sum0, sum1, sum2, sum0 + sum1 + sum2);
	}

	public static void main(String[] args) {
		// new E2().m1();
		new E2().m2();
	}
}
