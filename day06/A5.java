class A5 {
	private static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			for (int j = 0; j < 10; j++) {
				if (j > 5)
					break;
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
