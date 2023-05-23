class E2 {
	private static void m1() {
		int rows = 4;
		int cols = 4;
		for (int i = 0; i < rows * cols; i++) {
			System.out.print("* ");
			if (i % 4 == cols - 1) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
