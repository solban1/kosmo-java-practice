class A4  {
	void m1() {
		int i = 1;
		if (i < 2) {
			System.out.println("수행");
		}
		System.out.println("나옴");
	}

	void m2() {
		int i = 0;
		if (i < 0) {
			System.out.println("음수");
		} else if (i > 0) {
			System.out.println("i는 양수");
		} else {
			System.out.println("0");
		}
	}

	void m3() {
		int i = 0;
		if (i == 0) System.out.println("zero");
		if (i != 0) System.out.println("not zero");
		System.out.println("out");
	}

	public static void main(String[] args) {
		A4 a = new A4();
		a.m1();
		a.m2();
		a.m3();
	}
}
