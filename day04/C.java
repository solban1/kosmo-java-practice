class C {
	final int i = 1; //상수
	
	public static void main(String[] args) {
		C c = new C();
		//c.i = 2; //불가!
		System.out.println("i: " + c.i);
	}
}
