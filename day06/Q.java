class Q {
	private static void m1() {
		for (int i = 2; i <= 9; i++) {
			if (i == 8) {
				continue;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		m1();
	}
}