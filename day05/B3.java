class B3 {
	void m1() {
		char c = 'a';
		switch (c) {
			case 'a':
				System.out.println("a");
				break;
			case 'b':
				System.out.println("b");
				break;
			default:
				System.out.println("default");
				break;
		}
	}
	
	public static void main(String[] args) {
		B3 b = new B3();
		b.m1();
	}
}