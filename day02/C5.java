class C5 {
	C5() {
		System.out.println("constructor");
	}

	C5(int a) {
		System.out.println("constructor w/ parameters");
	}

	/*
	~C5() { // No destructor in Java, and has garbage collection instead
		System.out.println("destructor");
	}
	*/

	void m() {
		System.out.println("m()");
	}

	public static void main(String[] args) {
		System.out.println("main()");
		C5 c = new C5();
		C5 cc = new C5(1);

		c.m();
		cc.m();
	}
}
