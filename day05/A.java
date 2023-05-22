class A 
{
	void m1(){
		int i = 1;
		if(i<2){
			System.out.println("수행(0)");
		}
		System.out.println("if문을 나옴(0)");
	}
	void m2(){
		int i = 0; 
		if(i<0){
			System.out.println("i는 음수");
		}else if(i>0){
			System.out.println("i는 양수");
		}else{
			System.out.println("i는 0");
		}
		System.out.println("if문을 나옴(1)");
	}
	void m3(){
		int i = 0; 
		if(i != 0);

		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		A a = new A();
		//a.m1();
		//a.m2();
		a.m3();
	}
}
