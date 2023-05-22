class D 
{
	byte b = 127;
	int i = 1;
	char c = 'A';
	float f = 1.11111111111111111111111111111111f;
	double d = 2.22222222222222222222222222222222;
	void m1(){
		//byte r = (byte)(b + i); //개발자의 잘못된 판단 
		int r = b + i; //자동형변환 
		System.out.println("r: " + r);
	}
	void m2(){
		System.out.println("c: " + (int)c);
	}
	void m3(){
		double r = f + d;
		System.out.println("r: " + r);
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		//d.m2();
		d.m3();
	}
}
