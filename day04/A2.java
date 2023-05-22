class A2 {
	static int s = 2;
	//int d = 3;
	static void m1() {
		s = 5;
	}
	void m2() {
		s = 8;
	}
	public static void main(String[] args) {
		//static int a = 1;	// error: illegal start of expression
		System.out.println(s);		// 2
		m1();
		System.out.println(s);		// 5
		A2 a = new A2();
		System.out.println(a.s);	// 5
		a.m2();
		System.out.println(a.s);	// 8
		System.out.println(s);		// 8
	}
}
