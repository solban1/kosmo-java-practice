class B {
	int i=1; //�ν��Ͻ�(����) 
	static int j=2; //Ŭ����(����)

	public static void main(String[] args) 
	{
		B b = new B();
		System.out.println("i: " + b.i);
		System.out.println("j: " + B.j);
	}
}
