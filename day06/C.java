class C 
{
	C(){
		System.out.println("C()");
	}
	int m1(){
		System.out.println("m1()");
		return -1;
	}
	void m2(){
		for(int i=0; i<5; i++){
			if(i==2) return;
			System.out.println("i: " + i);
		}
		System.out.println("loop¹Û");
	}
	public static void main(String[] args) 
	{
		C c= new C();
		//c.m1();
		//int r = c.m1();
		//System.out.println("r: " + r);
		c.m2();
		System.out.println("mainÀÇ ³¡");
	}
}
