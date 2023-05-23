class D2 {
	private static void m1() {
		String a = new String("a");
		System.out.println(a instanceof String);
		String b = "b";
		System.out.println(b instanceof String);
	}

	public static void main(String[] args) {
		m1();
	}
}
