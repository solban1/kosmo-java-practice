class E 
{
	void m1(){
		for(int j=0; j<4; j++){
			for(int i=0; i<4; i++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		E e = new E();
		e.m1();
	}
}

