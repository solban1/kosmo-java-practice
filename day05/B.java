class B 
{
	void m1(){
		char c = 'A'; 
		switch(c){
			case 'A': System.out.println("A"); break;
			case 'B': System.out.println("B"); break;
			case 'C': System.out.println("C"); break;
			default: System.out.println("A�� B�� C�� �ƴ�");	 
		}//
		System.out.println("switch ��");	
	}
	void m2(){
		String str = "����";
		switch(str){
			case "����": System.out.println("����"); break;
			case "��ġ": System.out.println("��ġ"); break;
		}
	}
	void m22(){
		String str = "����";
		if(str.equals("����")){
			System.out.println("����2");
		}else if(str.equals("��ġ")){
			System.out.println("��ġ2");
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.m1();
		//b.m2();
		b.m22();
	}
}
