class A2 {
	void m1() {
		if (true) {
			System.out.println("true");
		}

		if (false) {
			System.out.println("false");
		}

		if ("a" == "b") {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
	public static void main(String[] args) {
		new A2().m1();
	}
}
