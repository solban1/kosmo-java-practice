class B {
	int i=1; //인스턴스(동적) 
	static int j=2; //클래스(정적)

	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println("i: " + b.i);
		System.out.println("j: " + B.j);
	}
}
