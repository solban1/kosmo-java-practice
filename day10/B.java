class B 
{
	static int i; //Ŭ���� 
	int j; //��ü 
	static void m(){ //Ŭ���� 
		System.out.println("m()");
	}
	void incre(){ //��ü 
		B.i++;
		j++;
	}
	public static void main(String[] args) 
	{
		//System.out.println("i: " + i); //���� �׽�Ʈ 
		//m(); //���� �׽�Ʈ 

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