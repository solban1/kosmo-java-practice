class B 
{
	static int i; //클래스 
	int j; //객체 
	static void m(){ //클래스 
		System.out.println("m()");
	}
	void incre(){ //객체 
		B.i++;
		j++;
	}
	public static void main(String[] args) 
	{
		//System.out.println("i: " + i); //접근 테스트 
		//m(); //접근 테스트 

		B b1 = new B();
		b1.incre();
		B b2 = new B();
		b2.incre();

		System.out.println("i: " + b2.i);
		System.out.println("j: " + b1.j);
		System.out.println("j: " + b2.j);
	}
}
/*class BUser
{
	public static void main(String[] args) 
	{
		System.out.println("B.i: " + B.i);
		B.m();
	}
}*/