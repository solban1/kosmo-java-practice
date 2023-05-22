class D 
{
	void m1(){
		System.out.println("2 * 1 =  2");
		System.out.println("2 * 2 =  4");
		System.out.println("2 * 3 =  6");
		System.out.println("2 * 4 =  8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		System.out.println("2 * 7 = 14");
		System.out.println("2 * 8 = 16");
		System.out.println("2 * 9 = 18");
	}
	void m2(){ //반복문 
		for(int i=1; i<=9; i++){
			System.out.println("2 * "+i+" =  "+2*i);
		}
	}
	void m3(){ //구구단 도전 
		for(int j=2; j<=9; j++)
			for(int i=1; i<=9; i++)
				System.out.println(j+" * "+i+" =  "+j*i);
	}
	void m4(){ //m3()를 while로 변경 
		int j=2;
		while(j<=9){
			int i=1; 
			while(i<=9){
				System.out.println(j+" x "+i+" =  "+j*i);
				i++;
			}
			j++;
		}
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		//d.m2();
		//d.m3();
		d.m4();
	}
}
