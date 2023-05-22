class B 
{
	void m1(){
		char c = 'A'; 
		switch(c){
			case 'A': System.out.println("A"); break;
			case 'B': System.out.println("B"); break;
			case 'C': System.out.println("C"); break;
			default: System.out.println("A나 B나 C는 아님");	 
		}//
		System.out.println("switch 밖");	
	}
	void m2(){
		String str = "갈비";
		switch(str){
			case "갈비": System.out.println("갈비"); break;
			case "김치": System.out.println("김치"); break;
		}
	}
	void m22(){
		String str = "갈비";
		if(str.equals("갈비")){
			System.out.println("갈비2");
		}else if(str.equals("김치")){
			System.out.println("김치2");
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
