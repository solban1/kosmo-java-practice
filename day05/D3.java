class D3 {
	public static void main(String[] args) {

		for (int i = 2; /*i <= 9999*/; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				try {
				} catch(Exception e) {}
			}
		}
	}
}
