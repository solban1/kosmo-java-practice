class C2 {
	public static void main(String[] args) {
		System.out.println("main()");
		m(); // error: non-static method m() cannot be referenced from a static context
	}

	void m() {
		System.out.println("m()");
	}
}
