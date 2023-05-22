class E {
	byte b = 100;
	short s = 200;
	void m1(){
		int r = b + s;
		System.out.println("r: " + r);
	}
	public static void main(String[] args) 
	{
		E e = new E();
		e.m1();
	}
}
