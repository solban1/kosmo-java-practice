class C {
	C() {
		System.out.println("constructor");
	}

	C m() {
		System.out.println("m()");
		return this;
	}

	public static void main(String[] args) {
		System.out.println("main()");
		C c = new C();
		c.m().m();
	}
}
