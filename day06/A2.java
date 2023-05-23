class A2 {
	private static void m1() {
		while(true) {
			//break;	// error: unreachable statement
			System.out.println("test");
			break;
		}
	}

	private static void m2() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				{
					if (j == 5) break;
				}
				System.out.println("" + i + j);
			}
			System.out.println("out1");
		}
		System.out.println("out2");
	}

	public static void main(String[] args) {
		//m1();
		m2();
	}
}
