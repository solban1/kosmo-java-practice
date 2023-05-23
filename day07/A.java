class A
{
	//String strs[]; //(1)선언
	String strs[] = new String[4]; //선언 및 초기화 
	
	A(){
		//strs = new String[4]; //(2)생성 
	}
	void in(){
		strs[0] = "봄"; strs[1] = "여름"; strs[2] = "가을"; strs[3] = "겨울"; //(3)초기화
	}
	void out(){
		for(int i=0; i<strs.length; i++){
			System.out.println("strs["+i+"]: " + strs[i]);
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.in();
		a.out();
	}
}
