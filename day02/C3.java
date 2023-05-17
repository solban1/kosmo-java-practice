class C3 {
	public static void main(String[] args) {
		System.out.println("main()");
		C3 c = new C3();
		c.m();
	}

	void m() { // position doesn't matter
		System.out.println("m()");
	}

}
