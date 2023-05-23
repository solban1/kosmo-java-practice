class A3 {
	private static void m1() {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("i: " + i);
		}

		System.out.println("out");
	}

	private static void m2() {
		aa:
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					break aa;
				}
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("out1");
		}
		System.out.println("out2");
	}

	private static void m3() {
		String lunch = "짬뽕";
		char c = 'B';
		switch (lunch) {
			case "짜장면":
				System.out.println("짜장면");
				break;
			
			case "짬뽕":
				System.out.println("짬뽕");
				switch (c) {
					case 'A':
						System.out.println("A");
						break;
					
					case 'B':
						System.out.println("B");
						break;
				
					default:
						System.out.println("Not A or B");
						break;
				}
				System.out.println("out1");
				break;

			default:
				System.out.println("other");
				break;
		}
		System.out.println("out2");
	}

	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}
}
