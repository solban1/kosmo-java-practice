class B
{
	String strs[] = {"봄", "여름", "가을", "겨울"}; //선언 및 생성 및 초기화 

	/* 안됨!! 
	String strs[];//선언 
	void in(){
		 strs = {"봄", "여름", "가을", "겨울"}; //생성 및 초기화 
	}*/
	void out(){
		for(int i=0; i<strs.length; i++){
			System.out.println("strs["+i+"]: " + strs[i]);
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.in();
		b.out();
	}
}
