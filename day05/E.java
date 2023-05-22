class E 
{
	void m1(){ //1~100 ÇÕ
		int sum = 0;
		for(int i=0; i<=100; i++){
			//System.out.println(i);
			sum += i;
		}
		System.out.println("ÀüÃ¼ÇÕ: " +sum);
	}
	void m2(){ //ÇÕ(ÀüÃ¼, Â¦, È¦) 
		int jjsum = 0;
		int holsum = 0;
		for(int i=0; i<=100; i++){
			if(i%2 == 0){
				jjsum += i;
			}else{
				holsum += i;
			}
		}
		System.out.println(
			"Â¦¼öÇÕ: " +jjsum + ", È¦¼öÇÕ: "+ holsum + ", ÃÑÇÕ: " + (jjsum+holsum));
	}
	public static void main(String[] args) 
	{
		E e = new E();
		//e.m1();
		e.m2();
	}
}
