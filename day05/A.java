class A 
{
	void m1(){
		int i = 1;
		if(i<2){
			System.out.println("����(0)");
		}
		System.out.println("if���� ����(0)");
	}
	void m2(){
		int i = 0; 
		if(i<0){
			System.out.println("i�� ����");
		}else if(i>0){
			System.out.println("i�� ���");
		}else{
			System.out.println("i�� 0");
		}
		System.out.println("if���� ����(1)");
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
