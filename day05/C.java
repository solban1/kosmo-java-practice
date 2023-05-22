class C 
{
	void m1(){ //while문 
		int i=0; //초기식 
		while(i<3){ //조건식 
			System.out.println("(1)i: " + i);
			i++; //증감식
		}
	}
	void m2(){ //dowhile문 
		int i=0; //초기식
		do{
			System.out.println("(2)i: " + i);
			i++; //증감식
		}while(i<3); //조건식 
	}
	void m3(){ //for문 
		for(int i=0; i<3; i++){
			System.out.println("(3)i: " + i);
		}
	}
	void m4(){
		//while(true){
		for(;;){
			System.out.println("액션");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		C c = new C();
		//c.m1();
		//System.out.println();
		//c.m2();
		//c.m3();
		c.m4();
	}
}
