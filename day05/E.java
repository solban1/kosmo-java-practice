class E 
{
	void m1(){ //1~100 ��
		int sum = 0;
		for(int i=0; i<=100; i++){
			//System.out.println(i);
			sum += i;
		}
		System.out.println("��ü��: " +sum);
	}
	void m2(){ //��(��ü, ¦, Ȧ) 
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
			"¦����: " +jjsum + ", Ȧ����: "+ holsum + ", ����: " + (jjsum+holsum));
	}
	public static void main(String[] args) 
	{
		E e = new E();
		//e.m1();
		e.m2();
	}
}
